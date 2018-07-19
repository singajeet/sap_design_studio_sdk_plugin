package com.armin.sap.ds.builder.decorators;

import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.themes.IThemeManager;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.navigator.tree.ExtensionCollectionNode;
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
				decoration.addSuffix(" [ " + extensions.getExtensions().size() + " Extension(s) ]");	
				if(color != null)
					decoration.setForegroundColor(color);					
			} else {
				decoration.addSuffix(" [" + ele.getType().name() + " ]");
			}
		}
	}

}
