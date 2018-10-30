package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.projectitemnode.AdvancedPropertySheetNodeProperties;

public class AdvancedPropertySheetNode extends GenericFileNode {
	
	private static final String NAME = "Advanced Property Sheet";	
	private String _apsPath;	
	
	public AdvancedPropertySheetNode(IProject project, String apsPath, IProjectItemNode parent) {
		super(project, apsPath, parent);
		_apsPath = apsPath;		
		_children = initializeChildren(apsPath);
		
	}

	@Override
	public ProjectItemType getType() {
		return ProjectItemType.ADVANCED_PROPERTY_SHEET;
	}
	
	public String getPropertySheetPath() {
		return _apsPath;
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
		Image image = Activator.getImage("images/properties_16x16.png");
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
	
	private ArrayList<IProjectItemNode> initializeChildren(String apsPath) {
		
		 _children = new ArrayList<IProjectItemNode>();
		 String validPath = null;
		 String htmlPath = null;
		 String cssPath = null;
		 String jsPath = null;
		 
		 //apsPath points to an html file
		 if(apsPath.endsWith("html") || apsPath.endsWith("htm")) {
			 IPath path = new Path(apsPath);
			 String filename = path.removeFileExtension().lastSegment();
			 String extensionId = ((ExtensionNode)((IProjectItemNode)super.getParent(this))
					 					.getParent(this)).getExtension().getId();
			 validPath = extensionId + "/res/additional_properties_sheet/" + filename;
			 htmlPath = validPath + ".html";
			 cssPath = validPath + ".css";
			 jsPath = validPath + ".js";			 
			 
		 } else {
			 String extensionId = ((ExtensionNode)((IProjectItemNode)super.getParent(this))
	 					.getParent(this)).getExtension().getId();
			 validPath = extensionId + "/res/additional_properties_sheet/additional_properties_sheet";
			 htmlPath = validPath + ".html";
			 cssPath = validPath + ".css";
			 jsPath = validPath + ".js";
		 }
		 
		 IProjectItemNode html = new HTMLNode(super.getProject(), htmlPath, this);
		 _children.add(html);
		 IProjectItemNode css = new CascadeStyleSheetNode(super.getProject(), cssPath, this);
		 _children.add(css);
		 IProjectItemNode js = new JavaScriptNode(super.getProject(), jsPath, this);
		 _children.add(js);
		
		return _children;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		 if (adapter == IWorkbenchAdapter.class)
			 return (T)this;
	     if (adapter == IPropertySource.class)
	         return (T)(new AdvancedPropertySheetNodeProperties(this));
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
