package com.armin.sap.ds.ext.decorators;

import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.elements.IProjectItemNode;
import com.armin.sap.ds.ext.navigator.elements.ProjectItemType;

public class DesignStudioLabelDecorator implements ILabelDecorator {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image decorateImage(Image image, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String decorateText(String text, Object element) {
		// TODO Auto-generated method stub
		IProjectItemNode ele = (IProjectItemNode)element;
		if(ele.getType() == ProjectItemType.EXTENSION_FILE) {
			return text + " [Extension]";
		}else if(ele.getType() == ProjectItemType.COMPONENT_FILE) {
			return text + " [Component]";
		}
		return null;
	}

}
