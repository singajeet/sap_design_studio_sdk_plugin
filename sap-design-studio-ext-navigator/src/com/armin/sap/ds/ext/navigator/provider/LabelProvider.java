package com.armin.sap.ds.ext.navigator.provider;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.elements.IProjectItemNode;

public class LabelProvider implements ILabelProvider {

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
//		if (IProjectItemNode.class.isInstance(element)) {
//			return true;
//		}
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		//Logger.debug("LabelProvider.getImage: " + element.getClass().getName());
        Image image = null;
 
        if (IProjectItemNode.class.isInstance(element)) {
            image = ((IProjectItemNode)element).getImage();
        }
        // else ignore the element
 
        return image;
	}

	@Override
	public String getText(Object element) {
		String text = "";
        if (IProjectItemNode.class.isInstance(element)) {
            text = ((IProjectItemNode)element).getName();
        }
 
        return text;
	}

}
