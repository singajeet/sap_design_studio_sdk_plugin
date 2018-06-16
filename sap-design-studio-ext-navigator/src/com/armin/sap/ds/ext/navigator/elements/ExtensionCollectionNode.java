package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;

public class ExtensionCollectionNode extends GenericFolderNode {

	private List<IProjectItemNode> _extensions;	
	private IProject _project;	
	private IProjectItemNode _parent;
	
	public ExtensionCollectionNode() {
		// TODO Auto-generated constructor stub
	}

	public ExtensionCollectionNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
		_parent = parent;
		_project = resource.getProject();
		if (_extensions == null) {
            _extensions = initializeChildren(resource);
        }
	}
	
	public ExtensionCollectionNode(IProject project) {
		
	}

	/************************** Required to be overridden ********************************/
	
	public void clear() {
		if(_extensions != null)
			_extensions.clear();		
	}
	
	public void updateExtensions(List<IProjectItemNode> extensions, boolean merge) {
		if(!merge) {
			if(_extensions != null) {
				_extensions.clear();
			}
			_extensions.addAll(extensions);
		} else {
			for(IProjectItemNode extension : extensions) {
				if(!exists(extension)) {
					_extensions.add(extension);
				}
			}
		}
	}
	
	public void addExtension(ExtensionNode extension) {
		if(extension != null) {
			_extensions.add(extension);
		}
	}
	
	public void removeExtension(ExtensionNode extension) {
		if(extension != null && _extensions.contains(extension)) {
			_extensions.remove(extension);
		}
	}
	
	public boolean exists(IProjectItemNode p_extension) {
		for(IProjectItemNode extension : _extensions) {
			if(extension.getName().equals(p_extension.getName()))
				return true;
			else
				return false;
		}
		return false;
	}

	/**
	 * @return the _name
	 */
	@Override
	public String getName() {
		return super.getName();
	}
	
	public IProject getProject() {
		return _project;
	}
	
	public List<IProjectItemNode> getExtensions(){
		return _extensions;
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/extension_collection_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}
	
	@Override
	public Object[] getElements(Object input) {
		return getChildren(input);
	}
	
	@Override
	public Object[] getChildren(Object parent) {
		return _extensions.toArray();
	}
	
	@Override
	public Object getParent(Object element) {
		return _parent;
	}
	
	@Override
	public boolean hasChildren(Object parent) {				
		return (_extensions.size() > 0);
	}
	
	/************************************************************************************/
	
	protected List<IProjectItemNode> initializeChildren(IResource resource) {
    	try {
    		
    		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
    		IResource[] extensions = resource.getProject().members();
    		
    		for(int i=0;i<extensions.length;i++) {
    			if(extensions[i].getType() == IResource.FOLDER) {
    				IProjectItemNode extNode = new ExtensionNode(resource, this);
    				children.add(extNode);
    			}
    		}
    		    		
    		if(children.size() <= 0) {
				children.add(new ProjectItemNode("No extensions found!", this));
			}
    		    		
    		return children;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		List<IProjectItemNode> errorNode = new ArrayList<IProjectItemNode>();
    		errorNode.add(new ProjectItemNode("Error while searching images, css or APS nodes: " + e.getMessage(), this));
    		return errorNode;
    	}
        
    }	
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.PROJECT_PARENT;
	}
}
