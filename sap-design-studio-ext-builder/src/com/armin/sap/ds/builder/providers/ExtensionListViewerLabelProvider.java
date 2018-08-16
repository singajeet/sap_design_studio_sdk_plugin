package com.armin.sap.ds.builder.providers;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import com.armin.sap.ds.builder.api.models.Component;
import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

public class ExtensionListViewerLabelProvider extends LabelProvider {
	public Image getImage(Object element) {
		if(IProjectItemNode.class.isInstance(element)) {
			IProjectItemNode compNode = (IProjectItemNode)element;
			return compNode.getImage();
		}
		return super.getImage(element);
	}
	public String getText(Object element) {
		if(IProjectItemNode.class.isInstance(element)) {
			if(ExtensionCollectionNode.class.isInstance(element)) {
				return ((ExtensionCollectionNode)element).getName();
			} else if(ExtensionNode.class.isInstance(element)) {
				Extension item = (Extension)((ExtensionNode)element).getModel();
				return item.getId() + " [" + item.getTitle() + "]";
			} else if(ComponentNode.class.isInstance(element)) {
				Component item = (Component)((ComponentNode)element).getModel();
				return item.getId() + " [" + item.getTitle() + "]";
			}
		}
		
		return super.getText(element);
	}
}