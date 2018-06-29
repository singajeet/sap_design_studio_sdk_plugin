package com.armin.sap.ds.builder.decorators;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.themes.IThemeManager;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;

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
			decoration.addSuffix(" [" + ele.getType().name() + " ]");
			if(color != null)
				decoration.setForegroundColor(color);
			
//			if(ele.getType() == ProjectItemType.EXTENSION_FILE) {
//				decoration.addSuffix(" [Extension] ");	
//				if(color != null)
//					decoration.setForegroundColor(color);					
//
//			}else if(ele.getType() == ProjectItemType.COMPONENT_FILE) {
//				decoration.addSuffix(" [Component] ");
//				if(color != null)
//					decoration.setForegroundColor(color);
//				
//			} else if(ele.getType() == ProjectItemType.GROUP_NODE) {
//				decoration.addSuffix(" [Group]");
//				if(color != null)
//					decoration.setForegroundColor(color);
//			}
		}
	}

}
