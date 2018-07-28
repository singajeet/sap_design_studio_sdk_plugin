package com.armin.sap.ds.builder.decorators;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.themes.IThemeManager;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.UI5Mode;
import com.armin.sap.ds.builder.navigator.tree.ComponentNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.GroupNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.navigator.tree.ProjectItemType;

public class DesignStudioLabelDecorator implements ILightweightLabelDecorator {

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
	public void decorate(Object element, IDecoration decoration) {
		IThemeManager theme = Activator.getDefault().getWorkbench().getThemeManager();
		Color color = null;
		if(theme != null)
			color = theme.getCurrentTheme().getColorRegistry().get("COLOR_DARK_YELLOW");
		
		if(element instanceof IProjectItemNode) {
			IProjectItemNode ele = (IProjectItemNode)element;
			
			if(color != null)
				decoration.setForegroundColor(color);
			
			if(ele.getType() == ProjectItemType.EXTENSION_COLLECTION) {
				ExtensionCollectionNode extensions = (ExtensionCollectionNode)ele;
				decoration.addSuffix(" [" + extensions.getExtensions().size() + " Extension(s)]");
			} else if(ele.getType() == ProjectItemType.EXTENSION) {
				ExtensionNode extension = (ExtensionNode)ele;
				decoration.addSuffix(" [" + extension.getGroups().size() + " Group(s)]");				
			} else if(ele.getType() == ProjectItemType.GROUP) {
				GroupNode groups = (GroupNode)ele;
				decoration.addSuffix(" [" + groups.getChildren(this).length + " Component(s)]");				
			} else if(ele.getType() == ProjectItemType.COMPONENT) {
				ComponentNode component = (ComponentNode)ele;
				
				String modes = "";
				for(UI5Mode mode : component.getComponent().getModes()) {
					if(modes.isEmpty()) {
						modes = mode.name();
					} else {
						modes = modes + "," + mode.name();
					}
				}			
				
				decoration.addSuffix(" [MODE:" + modes + " | HANDLER:" + component.getComponent().getHandlerType().name() + "| DATABOUND:" + component.getComponent().isDatabound() +"]");				
			}
			
			if(color != null)
				decoration.setForegroundColor(color);
		}
	}

}
