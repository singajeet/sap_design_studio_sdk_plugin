package com.armin.sap.ds.builder;

import org.eclipse.jface.resource.ImageDescriptor;
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
