package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Resource;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.GenericFolderNodeProperties;

public class GenericFolderNode extends ProjectItemNode {

	@SuppressWarnings("unused")
	private String _folderName;
	private IResource _folder;
	
	public GenericFolderNode(IProject project, String folderName, IProjectItemNode parent) {
		super(project, parent);
		_folderName = folderName;
		IResource item = project.findMember(folderName);
		if(item != null) {
			_item = new Resource(item);
		}
	}
	
	public GenericFolderNode(IProject project, IResource folder, IProjectItemNode parent) {
		super(project, parent);
		_folder = folder;		
		_item = new Resource(folder);		
	}
	
	public GenericFolderNode(String name, IProjectItemNode parent) {
		super(name, parent);
		IResource item = parent.getProject().findMember(name);
		if(item != null)
			_item = new Resource(item);
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.GENERIC_FOLDER;
	}
	
	@Override
	public String getName() {
		return _folder.getName();
	}
	
	public String getFolderPath() {
		return this._folder.getProjectRelativePath().toOSString();
	}
	
	public String getAbsolutePath() {
		return this._folder.getRawLocation().toOSString();
	}
	
	public IFolder getAsFile() {
		return (IFolder)this._folder;
	}
	
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/folder_28x28.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		image.dispose();
		_image = new Image(Display.getCurrent(), imgData);
		return _image;
	}

//	@Override
//	public Object[] getElements(Object input) {
//		return getChildren(input);
//	}
//
//	@Override
//	public Object[] getChildren(Object parent) {
//		return _children.toArray();
//	}
//
//	@Override
//	public Object getParent(Object element) {
//		return super.getParent(element);
//	}
//
//	@Override
//	public boolean hasChildren(Object parent) {
//		return (_children.size() > 0);
//	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new GenericFolderNodeProperties(this));
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
