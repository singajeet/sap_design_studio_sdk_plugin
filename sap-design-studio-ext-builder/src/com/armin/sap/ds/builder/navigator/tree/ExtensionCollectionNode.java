package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.api.models.ResourceModel;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.service.IProjectFilesReaderService;
import com.armin.sap.ds.builder.service.ProjectFilesReaderService;

public class ExtensionCollectionNode extends ProjectItemNode {

	private static final String NAME = "Extensions";	
	private ArrayList<IResource> _extensionFolders;
	private IProjectFilesReaderService _service;
	
	public ExtensionCollectionNode(IProject project, ArrayList<IResource> extensionFolders, IProjectItemNode parent) {
		super(project, parent);
		_extensionFolders = extensionFolders;
		_service = PlatformUI.getWorkbench().getService(IProjectFilesReaderService.class);
		if(_service == null) {
			_service = new ProjectFilesReaderService();
		}
		_children = initializeChildren(_extensionFolders);        
		_item = new ResourceModel();
	}

	/************************** Required to be overridden ********************************/
	
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
				if(!exists(extension)) {
					_children.add(extension);
				}
			}			
		}
	}
	
	public void addExtension(Extension extension) {
		if(extension != null) {			
			if(!exists(extension)) {
				IProjectItemNode item = new ExtensionNode(super.getProject(), extension, this);
				_children.add(item);				
			}
		}
	}
	
	public void addExtension(IResource resource) {
		if(resource != null) {
			if(!exists(resource)) {
				Extension extension = _service.getExtensionModel(resource);
				IProjectItemNode extNode = new ExtensionNode(super.getProject(), extension, this);
				_children.add(extNode);
			}
		}
	}
	
	public void addExtension(ExtensionNode extension) {
		if(extension != null) {
			if(!exists(extension))
				_children.add(extension);
		}
	}
	
	public void removeExtension(String id) {
		if(id != null) {
			for(IProjectItemNode node : _children) {
				if(((ExtensionNode)node).getExtension().getId().equals(id)){
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
							.getId().equals(extensionId)) {
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
				if(ext.getId().equals(id))
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
	
//	public IProject getProject() {
//		return super.getProject();
//	}
	
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
	
	public IResource[] getExtensionsAsResources() throws CoreException {
		return (IResource[]) _extensionFolders.toArray();
	}
	
	/************************************************************************************/
	
	protected ArrayList<IProjectItemNode>  initializeChildren(ArrayList<IResource> extResources) {
    	try {
    		
    		_children = new ArrayList<IProjectItemNode>();
    		
    		for(IResource resource : extResources) {
    			if(resource.getType() == IResource.FOLDER) {
    				Extension extension = _service.getExtensionModel(resource);
    				IProjectItemNode extNode = new ExtensionNode(this.getProject(), extension, this);
    				_children.add(extNode);
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
	public ProjectItemType getType() {
		return ProjectItemType.EXTENSION_COLLECTION;
	}
}
