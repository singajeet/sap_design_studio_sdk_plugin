package com.armin.sap.ds.ext.navigator.elements;

import java.util.ArrayList;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.pde.core.build.IBuildEntry;
import org.eclipse.pde.core.build.IBuildModel;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.ext.navigator.Activator;
import com.armin.sap.ds.ext.plugin.preferences.Settings;

public class PropertyNode extends ProjectItemNode {

	private String _name;
	private IResource _extensionResource;
	private IProjectItemNode _parent;
	private IBuildEntry _entry;
	private IProjectItemNode[] _children;
	
	public PropertyNode() {
		// TODO Auto-generated constructor stub
	}

	public PropertyNode(IBuildEntry entry, IResource extensionResource, IProjectItemNode parent) {
		_entry = entry;
		_extensionResource = extensionResource;
		_parent = parent;
		_name = entry.getName();
		_children = initializeChildren(extensionResource);
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
		Image image = Activator.getImage("images/property_28x28.png");
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
			
			String[] valueTokens = _entry.getTokens();			
			for(int i=0;i<valueTokens.length;i++) {
				IProjectItemNode token = new PropertyValueNode(valueTokens[i], extensionResource, this);
				children.add(token);
			}
			
			IProjectItemNode[] childrenArray = new IProjectItemNode[children.size()];
			children.toArray(childrenArray);
			return childrenArray;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}

}
