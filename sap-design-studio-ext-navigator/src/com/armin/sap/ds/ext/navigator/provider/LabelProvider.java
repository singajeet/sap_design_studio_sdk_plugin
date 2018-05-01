package com.armin.sap.ds.ext.navigator.provider;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.ext.navigator.elements.IDesignStudioProjectElement;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		System.out.println("LabelProvider.getImage: " + element.getClass().getName());
        Image image = null;
 
        if (IDesignStudioProjectElement.class.isInstance(element)) {
            image = ((IDesignStudioProjectElement)element).getImage();
        }
        // else ignore the element
 
        return image;
	}

	@Override
	public String getText(Object element) {
		String text = "";
        if (IDesignStudioProjectElement.class.isInstance(element)) {
            text = ((IDesignStudioProjectElement)element).getText();
        }
 
        return text;
	}

}
