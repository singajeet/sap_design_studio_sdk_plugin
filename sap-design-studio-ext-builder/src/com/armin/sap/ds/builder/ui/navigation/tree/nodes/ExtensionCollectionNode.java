package com.armin.sap.ds.builder.ui.navigation.tree.nodes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.domain.Extension;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.tree.nodes.ExtensionCollectionNodeProperties;
import com.armin.sap.ds.builder.service.IProjectFilesReaderService;
import com.armin.sap.ds.builder.service.ProjectFilesReaderService;
import com.armin.sap.ds.builder.ui.navigation.tree.TreeNodeAccessMode;

public class ExtensionCollectionNode extends GenericFolderNode {

	private static final String NAME = "Extensions";	
	private ArrayList<IResource> _extensionFolders;
	private IProjectFilesReaderService _service;
	
	public ExtensionCollectionNode(IProject project, ArrayList<IResource> extensionFolders, IProjectItemNode parent) {
		super(project,project.getName(), parent);
		setAccessMode(TreeNodeAccessMode.READ_ONLY);
		_extensionFolders = extensionFolders;
		_service = PlatformUI.getWorkbench().getService(IProjectFilesReaderService.class);
		if(_service == null) {
			_service = new ProjectFilesReaderService();
		}
		_children = initializeChildren(_extensionFolders);
	}
	
	public ExtensionCollectionNode(IProject project, ArrayList<IResource> extensionFolders, IProjectItemNode parent, TreeNodeAccessMode mode) {
		this(project, extensionFolders, parent);
		setAccessMode(mode);	
	}

	/************************** Required to be overridden ********************************/
	
	@Override
	public IResource getAsResource() {		
		return this.getProject();
	}
	
	@Override
	public String getFolderPath() {
		return this.getProject().getFile(".project").getProjectRelativePath().toOSString();
	}
	
	public void clear() {
		if(_children != null)
			_children = initializeChildren(_extensionFolders);	
	}
	
	public void updateExtensionsListFromResource(ArrayList<IResource> extensionFolders, boolean merge) {
		if(!merge) {
			_extensionFolders = extensionFolders;
			_children = initializeChildren(extensionFolders);
		} else {
			for(IResource extension : extensionFolders) {
				if(!exists(extension)) {
					_extensionFolders.add(extension);
				}
			}
			_children = initializeChildren(extensionFolders);
		}
	}
	
	public void updateExtensionsList(ArrayList<IProjectItemNode> children, boolean merge) {
		if(!merge) {			
			_children = children;
		} else {
			for(IProjectItemNode extension : _children) {
				addExtension((Extension)extension);
			}			
		}
	}
	
	public void addExtension(Extension extension) {
		if(extension != null) {			
			if(!exists(extension)) {
				//First, Add extension to contribution.xml if required
				//This will be used by ExtensionNode class for creating TreeNode
				//as the ExtensionNode assumes that all folders required for extension
				//are already created
				
				//Sequence of next 2 lines should remain same
				if(getAccessMode() == TreeNodeAccessMode.EDIT) {
					addNewExtensionContribution(extension);
					ExtensionNode item = new ExtensionNode(super.getProject(), extension, this);
					this.addExtension(item);						
				} else {
					ExtensionNode item = new ExtensionNode(super.getProject(), extension, this);
					this.addExtension(item);
				}
			}
		}
	}
	
	public void addExtension(IResource resource) {
		if(resource != null) {
			if(!exists(resource)) {
				Extension extension = _service.getExtensionModel(resource);
				this.addExtension(extension);
			}
		}
	}
	
	public void addExtension(ExtensionNode extension) {
		if(extension != null) {
			if(!exists(extension)) {
				_children.add(extension);
			}
		}
	}
	
	private void addNewExtensionContribution(Extension extension) {
		
			try {
				this._projectService.addNewExtension(extension, _project);
			}catch(Exception e) {
				MessageDialog.openError(Activator.getDefault().getWorkbench().getDisplay().getActiveShell(), 
						"Extension Creation Failed", "Unable to create extension due to following error: " + e.getMessage());
				e.printStackTrace();
			}
		
	}
	
	public void removeExtension(String id) {
		if(id != null) {
			for(IProjectItemNode node : _children) {
				if(((ExtensionNode)node).getExtension().getId().toUpperCase().equals(id.toUpperCase())){
					_children.remove(node);
				}
			}
		}
	}
	
	public void removeExtension(IResource extension) {
		if(extension != null) {
			if(exists(extension))
				removeExtension(extension.getName());
		}
	}
	
	public void removeExtension(ExtensionNode extension) {
		if(extension != null && _children.contains(extension)) {
			_children.remove(extension);
		}
	}
	
	public void removeExtension(Extension extension) {
		if(extension != null) {
			if(exists(extension))
				removeExtension(extension.getId());
		}
	}
	
	public boolean exists(String extensionId) {
		for(IProjectItemNode extension : _children) {
			if(((ExtensionNode)extension).getExtension()
							.getId().toUpperCase().equals(extensionId.toUpperCase())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean exists(Extension extension) {
		return exists(extension.getId());
	}
	
	public boolean exists(IResource p_extension) {
		return exists(p_extension.getName());
	}
	
	public boolean exists(IProjectItemNode p_extension) {
		return exists(((ExtensionNode)p_extension).getExtension().getId());
	}
	
	public Extension getExtension(String id) {
		if(exists(id)) {
			for(IProjectItemNode node : _children) {
				Extension ext = ((ExtensionNode)node).getExtension();
				if(ext.getId().toUpperCase().equals(id.toUpperCase()))
					return ext;
			}
		}
		return null;
	}

	/**
	 * @return the _name
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	public List<IProjectItemNode> getExtensions(){
		return _children;
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/extension_collection_16x16.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}
	
	public IResource[] getExtensionsAsResources() throws CoreException {
		return (IResource[]) _extensionFolders.toArray();
	}
	
	/************************************************************************************/
	
	protected ArrayList<IProjectItemNode>  initializeChildren(ArrayList<IResource> extResources) {
    	try {
    		
    		_children = new ArrayList<IProjectItemNode>();
    		
    		for(IResource resource : extResources) {
    			if(resource.getType() == IResource.FOLDER) {
    				this.addExtension(resource);
    			}
    		}
    		    		
    		if(_children.size() <= 0) {
				_children.add(new InfoNode("No extensions found!", this));
			}
    	}catch(Exception e)
    	{
    		e.printStackTrace();    		
    		_children.add(new ErrorNode("Error while searching images, css or APS nodes: " + e.getMessage(), this));    		
    	}
    	return _children;
    }	
	
	@Override
	public ProjectItemNodeType getType() {
		return ProjectItemNodeType.EXTENSION_COLLECTION;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new ExtensionCollectionNodeProperties(this));
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
