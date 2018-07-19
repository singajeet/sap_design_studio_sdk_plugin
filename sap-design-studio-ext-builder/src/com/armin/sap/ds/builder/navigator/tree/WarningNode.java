package com.armin.sap.ds.builder.navigator.tree;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.Warning;
import com.armin.sap.ds.builder.preferences.Settings;

public class WarningNode extends ProjectItemNode {

	public WarningNode(IProject project, Warning item, IProjectItemNode parent) {
		super(project, item, parent);		
	}

	public WarningNode(IProject project, IProjectItemNode parent) {
		super(project, parent);		
	}

	public WarningNode(IProject project) {
		super(project);		
	}

	public WarningNode(String msg, IProjectItemNode parent) {
		super(msg, parent);
		_item = new Warning(msg);
	}
	
	@Override
	public String getName() {
		return this._item.getId();
	}
	
	@Override
	public Image getImage() {
		Image image = Activator.getImage("images/alert_16x16.png");
		int size = Integer.parseInt(Settings.store().get(Settings.FOR.ICON_SIZE));
		ImageData imgData = image.getImageData().scaledTo(size, size);
		_image = new Image(Display.getCurrent(), imgData);
		image.dispose();
		return _image;
	}

}
