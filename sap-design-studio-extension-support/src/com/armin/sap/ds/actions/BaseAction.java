package com.armin.sap.ds.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

public class BaseAction extends Action implements IWorkbenchAction {

	public BaseAction() {
		// TODO Auto-generated constructor stub
	}

	public BaseAction(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	public BaseAction(String text, ImageDescriptor image) {
		super(text, image);
		// TODO Auto-generated constructor stub
	}

	public BaseAction(String text, int style) {
		super(text, style);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
