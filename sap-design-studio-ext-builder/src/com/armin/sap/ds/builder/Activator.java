package com.armin.sap.ds.builder;

import java.util.ArrayList;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.armin.sap.ds.builder.context.Context;
import com.armin.sap.ds.builder.context.ContextManager;

public class Activator extends AbstractUIPlugin {


	// The plug-in ID
	public static final String PLUGIN_ID = "com.armin.sap.ds.builder"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	private ContextManager _ctxManager;
	private Context _extensionsContext;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		_ctxManager = ContextManager.get();
	}
	
	public Context createProjectContext(String projectName) {
		_extensionsContext = _ctxManager.createForExtensions(projectName);
		return _extensionsContext;
	}

	public Context getProjectContext(String projectName) {
		if(_extensionsContext != null) {
			return _extensionsContext;
		} else {
			return createProjectContext(projectName);
		}
	}
	
	public void registerViewer(Viewer viewer) {
		Context viewersCtx = _ctxManager.getContext("VIEWERS");
		if(viewersCtx == null) {
			viewersCtx = _ctxManager.create("VIEWERS", new ArrayList<Viewer>(), this);
		}
		@SuppressWarnings("unchecked")
		ArrayList<Viewer> viewerList = (ArrayList<Viewer>) viewersCtx.getValue();
		if(!viewerList.contains(viewer)) {
			viewerList.add(viewer);
		}
	}
	
	public void refreshViewers() {
		Context viewersCtx = _ctxManager.getContext("VIEWERS");
		if(viewersCtx != null) {
			@SuppressWarnings("unchecked")
			ArrayList<Viewer> viewerList = (ArrayList<Viewer>) viewersCtx.getValue();
			for(Viewer viewer : viewerList){
				if(!viewer.getControl().isDisposed())
					viewer.refresh();
			}
		}
		
		Context formsCtx = _ctxManager.getContext("REFRESHFORMS");
		if(formsCtx != null) {
			@SuppressWarnings("unchecked")
			ArrayList<IRefreshForm> formsList = (ArrayList<IRefreshForm>) formsCtx.getValue();
			for(IRefreshForm form : formsList){
				form.refreshForm();
			}
		}
	}
	
	public void registerFormForRefresh(IRefreshForm callback) {
		Context callbackCtx = _ctxManager.getContext("REFRESHFORMS");
		if(callbackCtx == null) {
			callbackCtx = _ctxManager.create("REFRESHFORMS", new ArrayList<IRefreshForm>(), this);
		}
		@SuppressWarnings("unchecked")
		ArrayList<IRefreshForm> callbackList = (ArrayList<IRefreshForm>) callbackCtx.getValue();
		if(!callbackList.contains(callback)) {
			callbackList.add(callback);
		}
	}
	
	public static Image getImage(String imagePath) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, imagePath);
        Image image = imageDescriptor.createImage();
 
        return image;
    }
	
	
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}	
	
}
