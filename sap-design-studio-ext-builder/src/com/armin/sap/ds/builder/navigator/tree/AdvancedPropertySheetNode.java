package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.model.IWorkbenchAdapter;
import org.eclipse.ui.views.properties.IPropertySource;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;
import com.armin.sap.ds.builder.properties.AdvancedPropertySheetNodeProperties;

public class AdvancedPropertySheetNode extends GenericFolderNode {
	
	private static final String NAME = "Advanced Property Sheet";	
	private String _apsPath;	
	
	public AdvancedPropertySheetNode(IProject project, String apsPath, IProjectItemNode parent) {
		super(project, project.getFile(apsPath), parent);
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
	
	@Override
	public String getFolderPath() {
		return this.getPropertySheetPath();
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
		Image image = Activator.getImage("images/Properties_16x16.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		image.dispose();
		_image = new Image(Display.getCurrent(), imgData);
		return _image;
	}
	
	private ArrayList<IProjectItemNode> initializeChildren(String apsPath) {
		
		 _children = new ArrayList<IProjectItemNode>();
		 String validPath = null;
		 String htmlPath = null;
		 String cssPath = null;
		 String jsPath = null;
		 
		 ComponentNode cmp = (ComponentNode)this.getParent(null);
		 GroupNode grp = (GroupNode)cmp.getParent(null);
		 ExtensionNode ext = (ExtensionNode)grp.getParent(null);
		 String extensionId = ext.getExtension().getId();
		 String componentId = cmp.getComponent().getId();
		 
		 validPath = extensionId + "/" + componentId + "/res/additional_properties_sheet/" + componentId;
		 htmlPath = validPath + "_aps.html";
		 cssPath = validPath + "_aps.css";
		 jsPath = validPath + "_aps.js";			 
		 
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
