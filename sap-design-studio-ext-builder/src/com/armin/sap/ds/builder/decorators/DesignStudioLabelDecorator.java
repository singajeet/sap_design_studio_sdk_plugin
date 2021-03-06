package com.armin.sap.ds.builder.decorators;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.themes.IThemeManager;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.models.domain.UI5Mode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentExtendedNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionCollectionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GroupNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ProjectItemNodeType;

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
			
			if(ele.getType() == ProjectItemNodeType.EXTENSION_COLLECTION) {
				ExtensionCollectionNode extensions = (ExtensionCollectionNode)ele;
				decoration.addSuffix(" [" + extensions.getExtensions().size() + " Extension(s)]");
				
			} else if(ele.getType() == ProjectItemNodeType.EXTENSION) {
				ExtensionNode extension = (ExtensionNode)ele;
				int extensionChildCount = 0;
				for(Object item : extension.getChildren(this)) {
					IProjectItemNode itemNode = (IProjectItemNode)item;
					if(itemNode.getType() == ProjectItemNodeType.GROUP) {
						extensionChildCount++;
					}
				}
				decoration.addSuffix(" [" + extensionChildCount + " Group(s)]");				
			} else if(ele.getType() == ProjectItemNodeType.GROUP) {
				int groupChildCount = 0;
				GroupNode groups = (GroupNode)ele;
				for(Object item : groups.getChildren(this)) {
					IProjectItemNode itemNode = (IProjectItemNode)item;
					if(itemNode.getType() == ProjectItemNodeType.COMPONENT) {
						groupChildCount++;
					}
				}
				decoration.addSuffix(" [" + groupChildCount + " Component(s)]");				
			} else if(ele.getType() == ProjectItemNodeType.COMPONENT) {
				ComponentExtendedNode component = (ComponentExtendedNode)ele;
				
				String modes = "";
				for(UI5Mode mode : component.getComponent().getModes()) {
					if(modes.isEmpty()) {
						modes = mode.name();
					} else {
						modes = modes + "," + mode.name();
					}
				}			
				
				decoration.addSuffix(" [MODE-" + modes + " | HANDLER-" 
								+ component.getComponent().getHandlerType().name() 
								+ "| DATABOUND-" + component.getComponent().isDatabound() +"]");				
			}
			
			if(color != null)
				decoration.setForegroundColor(color);
		}
	}

}
