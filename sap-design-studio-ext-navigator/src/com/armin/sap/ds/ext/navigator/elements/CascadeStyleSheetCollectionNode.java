package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;
import com.armin.sap.ds.xml.Component;

public class CascadeStyleSheetCollectionNode extends GenericFileNode {
	
	private String _name = "Style Sheets (CSS)";	
	private List<String> _styleSheets;
	private IProjectItemNode[] _children;
	private IResource _extensionResource;
	private IProjectItemNode _parent;
	
	public CascadeStyleSheetCollectionNode(List<String> styleSheets, IResource extensionResource, IProjectItemNode parent) {
		_styleSheets = styleSheets;
		_extensionResource = extensionResource;
		_parent = parent;		
		_children = initializeChildren(extensionResource);
	}
	
	public CascadeStyleSheetCollectionNode(Component model, IResource resource, IProjectItemNode parent) {
		super(resource, parent);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.CASCADE_STYLE_SHEET_FILE;
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
		Image image = Activator.getImage("images/css_28x28.png");
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
						
			for(int i=0;i<_styleSheets.size(); i++) {
				IProjectItemNode sheet = new CascadeStyleSheetNode(_styleSheets.get(i), extensionResource, this);
				children.add(sheet);
			}
			
			if(children.size() <= 0) {
				return new IProjectItemNode[] { new ProjectItemNode("No style sheets found!", this) };
			}
			
			IProjectItemNode[] childrenArray = new IProjectItemNode[children.size()];
			children.toArray(childrenArray);
			return childrenArray;
		} catch (Exception e) {
			e.printStackTrace();
			return new IProjectItemNode[]{ new ProjectItemNode("Error while searching css: " + e.getMessage(), this) };
		}

	}

	
}
