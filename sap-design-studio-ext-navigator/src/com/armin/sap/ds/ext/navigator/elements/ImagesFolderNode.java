package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class ImagesFolderNode extends GenericFolderNode {

	private static final String PATH ="res/images/";
	private Component _model;
	private static final String _name = "Images";
	private IProjectItemNode _parent;
	private IProjectItemNode[] _children;
	
	public ImagesFolderNode() {
		// TODO Auto-generated constructor stub
	}
	
	public ImagesFolderNode(IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	public ImagesFolderNode(Component model, IResource resource, IProjectItemNode parent) {
		super(resource, parent);
		_model = model;
		_parent = parent;
		_children = initializeChildren(resource);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.IMAGES_FOLDER;
	}
	
	/**************************
	 * Required to be overridden
	 ********************************/

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/images_28x28.png");
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
		return _children;
	}

	@Override
	public Object getParent(Object element) {
		return _parent;
	}

	@Override
	public boolean hasChildren(Object parent) {
		return (_children.length > 0);
	}
	
	/************************************************************************************/

	protected IProjectItemNode[] initializeChildren(IResource extensionResource) {
		try {
			ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
			
			IProject project = extensionResource.getProject();
			IFolder imageFolder = project.getFolder(PATH);
			
			IResource[] imageFiles = imageFolder.members();
			
			for(int i=0;i<imageFiles.length; i++) {				
				IProjectItemNode image = new ImageNode(imageFiles[i], extensionResource, this);
				children.add(image);
			}
			
			if(children.size() <= 0) {
				return new IProjectItemNode[]{ new ProjectItemNode("No images found!", this) };
			}
			
			IProjectItemNode[] childrenArray = new IProjectItemNode[children.size()];
			children.toArray(childrenArray);
			return childrenArray;
		} catch (Exception e) {
			e.printStackTrace();
			return new IProjectItemNode[]{ new ProjectItemNode("Error while searching images: " + e.getMessage(), this) };
		}

	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		for(int i=0;i<_children.length;i++) {
			_children[i].getImage().dispose();
			_children[i] = null;
		}
	}

}
