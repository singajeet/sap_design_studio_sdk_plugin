package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.common.DesignStudioProjectHelper;
import com.armin.sap.ds.builder.preferences.Settings;

public class ImagesFolderNode extends GenericFolderNode {

	private static final String PATH = DesignStudioProjectHelper.get().getCurrentExtensionHelper().getId() + "/res/images/";
	private static final String NAME = "Images";
	
	public ImagesFolderNode(IProject project, String imagesFolder, IProjectItemNode parent) {
		super(project, imagesFolder, parent);
		if(imagesFolder != null) {
			_children = initializeChildren(imagesFolder);
		} else {
			_children = initializeChildren(PATH);
		}
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
		return NAME;
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
		return _children.toArray();
	}

	@Override
	public Object getParent(Object element) {
		return super.getParent(element);
	}

	@Override
	public boolean hasChildren(Object parent) {
		return (_children.size() > 0);
	}
	
	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(String path) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
		try {			
			
			IProject project = this.getProject();
			IFolder imageFolder = project.getFolder(PATH);
			
			IResource[] imageFiles = imageFolder.members();
			
			for(int i=0;i<imageFiles.length; i++) {				
				IProjectItemNode image = new ImageNode(super.getProject(), path, imageFiles[i].getName(), this);
				children.add(image);
			}
			
			if(children.size() <= 0) {
				children.add(new ProjectItemNode("No images found!", this));
			}
		} catch (Exception e) {
			e.printStackTrace();
			children.add(new ProjectItemNode("Error while searching images: " + e.getMessage(), this));
		}
		return children;

	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		for(int i=0;i<_children.size();i++) {
			_children.get(i).getImage().dispose();			
		}
		_children.clear();
		_children = null;
	}

}
