package com.armin.sap.ds.builder.navigator.tree;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.preferences.Settings;

public class CascadeStyleSheetCollectionNode extends ProjectItemNode {
	
	private static final String NAME = "Style Sheets (CSS)";	
	private List<String> _styleSheets;	
	
	public CascadeStyleSheetCollectionNode(IProject project, List<String> styleSheets, IProjectItemNode parent) {
		super(project, parent);
		_styleSheets = styleSheets;		
		_children = initializeChildren(styleSheets);
	}
	
	@Override
	public ProjectItemType getType() {
		return ProjectItemType.CASCADE_STYLE_SHEET_FILE;
	}
	
	public List<String> getStyleSheets(){
		return _styleSheets;
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
	
	public void addItem(String styleSheetPath) {
		if(styleSheetPath != null) {
			if(!exists(styleSheetPath)) {
				IProjectItemNode sheet = new CascadeStyleSheetNode(this.getProject(), styleSheetPath, this);
				_children.add(sheet);
			}
		}
	}
	
	public void removeItem(String styleSheetPath) {
		if(styleSheetPath != null) {
			if(exists(styleSheetPath)) {
				for(IProjectItemNode node : _children) {
					String path = ((CascadeStyleSheetNode)node).getCSSPath();
					if(path.toUpperCase().equals(styleSheetPath.toUpperCase())) {
						_children.remove(node);
					}
				}
			}
		}
	}
	
	public boolean exists(String styleSheetPath) {
		if(styleSheetPath != null) {
			for(IProjectItemNode node : _children) {
				String path = ((CascadeStyleSheetNode)node).getCSSPath();
				if(path.toUpperCase().equals(styleSheetPath.toUpperCase())) {
					return true;
				}
			}
		}
		return false;
	}

	/************************************************************************************/

	protected ArrayList<IProjectItemNode> initializeChildren(List<String> styleSheets) {
		ArrayList<IProjectItemNode> children = new ArrayList<IProjectItemNode>();
		try {			
			for(int i=0;i<styleSheets.size(); i++) {
				IProjectItemNode sheet = new CascadeStyleSheetNode(this.getProject(), styleSheets.get(i), this);
				children.add(sheet);
			}
			
			if(children.size() <= 0) {
				IProjectItemNode node = new ProjectItemNode("No style sheets found!", this);
				children.add(node);
			}					
			
		} catch (Exception e) {
			e.printStackTrace();
			IProjectItemNode node = new ProjectItemNode("Error while searching css: " + e.getMessage(), this);
			children.add(node);
		}
		
		return children;
	}

	
}
