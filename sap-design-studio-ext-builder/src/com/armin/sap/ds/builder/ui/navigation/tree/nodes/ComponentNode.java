package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.models.domain.Component;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.ComponentNodeProperties;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;

public class ComponentNode extends GenericFileNode {

	private URI _diagramURI;
	private IResource _file;
	
	public ComponentNode(IProject project, Component component, IProjectItemNode parent) {
		super(project, component, parent);		
		_children = initializeChildren(component);
		_file = project.getFile(this.getFilePath());
		loadDiagramUri();
	}
	
	public ComponentNode(IProject project, Component component, IProjectItemNode parent, TreeNodeAccessMode mode) {
		this(project, component, parent);
		setAccessMode(mode);
		_file = project.getFile(this.getFilePath());
		loadDiagramUri();
	}
	
	private void loadDiagramUri() {
		if(this._parent != null) {
			ExtensionNode ext = (ExtensionNode)this._parent.getParent(null);
			String diagramPath = ext.getExtension().getId() + "/" + this.getId() + "/res/diagrams/" + this.getId() + ".diagram";
			IFile diagramFile = this.getProject().getFile(diagramPath);
			_diagramURI = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		}
	}
	
	@Override
	public IResource getAsResource() {		
		return this._file;
	}

	@Override
	public ProjectItemNodeType getType() {
		return ProjectItemNodeType.COMPONENT;
	}
	
	public Component getComponent() {
		return (Component)_item;
	}
	
	public String getId() {
		return _item.getId();
	}
	
	@Override
	public String getFilePath() {
		if(this._parent != null) {
			ExtensionNode ext = (ExtensionNode)this._parent.getParent(null);
			return ext.getExtension().getId() + "/" + this.getId() + "/contribution.ztl";
		}
		return null;
	}

	
	
	/**
	 * @return the _diagramURI
	 */
	public URI getDiagramURI() {
		return _diagramURI;
	}

	/**
	 * @param _diagramURI the _diagramURI to set
	 */
//	public void setDiagramURI(URI _diagramURI) {
//		this._diagramURI = _diagramURI;
//	}

	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		return ((Component)_item).getTitle();
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/component_16x16.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}

	public void addAdvancedPropertySheet(String path) {
		if(path != null && !getComponent().getPropertySheetPath().equalsIgnoreCase(path)) {
			getComponent().setPropertySheetPath(path);
			for(int i=0; i< _children.size(); i++) {
				IProjectItemNode node = _children.get(i);
				if(node instanceof AdvancedPropertySheetNode) {
					_children.remove(i);
					AdvancedPropertySheetNode newPathNode = new AdvancedPropertySheetNode(this.getProject(), path, this);
					_children.add(newPathNode);
					
				}
			}
		}
	}
	
//	@Override
//	public Object[] getElements(Object input) {
//		return getChildren(input);
//	}

//	@Override
//	public Object[] getChildren(Object parent) {
//		return _children.toArray();
//	}

//	@Override
//	public Object getParent(Object element) {
//		return super.getParent(element);
//	}
//
//	@Override
//	public boolean hasChildren(Object parent) {		
//		return (_children.size() > 0);
//	}

	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(Component component) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
		try {			
			
			String aps = component.getPropertySheetPath();
			if(aps != null && !aps.isEmpty()) {								
				IProjectItemNode apsNode = new AdvancedPropertySheetNode(this.getProject(), aps, this);
				children.add(apsNode);
			}
			
			IProjectItemNode css = new CascadeStyleSheetCollectionNode(this.getProject(), component.getCssInclude(), this);
			children.add(css);
			
			GroupNode groupNode = (GroupNode)this.getParent(this);
			ExtensionNode extensionNode = (ExtensionNode)groupNode.getParent(groupNode);
			
			IProjectItemNode images = new ImagesFolderNode(this.getProject(), extensionNode.getExtension().getId(), this);
			children.add(images);
			
			//Sub folders under this "res" folder
			String resPath = extensionNode.getExtension().getId() + "/" + component.getId() + "/res";
			IFolder resFolder = this.getProject().getFolder(resPath);
			if(resFolder.exists()) {
				for(IResource folder : resFolder.members()) {
					if(folder.getType() == IResource.FOLDER) {
						if(!folder.getName().toUpperCase().equals("CSS") && 
								!folder.getName().toUpperCase().equals("JS") &&
								!folder.getName().toUpperCase().equals("IMAGES") &&
								!folder.getName().toUpperCase().equals("ADDITIONAL_PROPERTIES_SHEET")
								) {
							IProjectItemNode subFolder = new GenericFolderNode(this.getProject(), folder, this);
							children.add(subFolder);
						}
					}
				}
			}			
			
			return children;
		} catch (Exception e) {
			e.printStackTrace();
			children.add(new ErrorNode("Error while searching images, css or APS nodes: " + e.getMessage(), this));
			return children;
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ComponentNodeProperties(this));
		return null;
	}

	@Override
	public ImageDescriptor getImageDescriptor(Object object) {		
		return ImageDescriptor.createFromImage(getImage());
	}

	@Override
	public String getLabel(Object o) {		
		return this.getName();
	}


}
