package com.armin.sap.ds.support;

import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.ext.plugin.controls.ExtensionControlFactory;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;
import com.armin.sap.ds.xml.Extension;

public class ExtensionHelper implements IHelper {
	
	public String EXTENSION_XML_FILE_NAME = "contribution.xml";
	private ISharedData _data;
	private Extension _extension;
	
	public ExtensionHelper() {
		
	}
	
	public ExtensionHelper(Extension extension) {
		_extension = extension;
	}
	
	public ExtensionHelper(ISharedData data) {
		_data = data;		
	}
	
	public ExtensionHelper(ISharedData data, Extension extension) {
		_data = data;
		_extension = extension;
	}
	
	public Extension getModel() {
		return _extension;
	}
	
	/**
	 * The unique id of the extension. 
	 * Also, this will be used as package title for a component.
	 */		
	public String getId() {
		return _extension.getId();
	}
	
	public void setId(String id) {
		_extension.setId(id);
	}
	
	/**
	 * Name or the title of the extension
	 */	
	public String getTitle() {
		return _extension.getTitle();
	}
	
	public void setTitle(String name) {
		_extension.setTitle(name);
	}
	
	/**
	 * Current version of the extension
	 */
	public String getVersion() {
		return _extension.getVersion();
	}
	
	public void setVersion(String version) {
		_extension.setVersion(version);
	}
	
	/**
	 * Name of the vendor building this extension
	 */
	public String getVendor() {
		return _extension.getVendor();
	}
	
	public void setVendor(String vendor) {
		_extension.setVendor(vendor);
	}
	
	/**
	 * Name of the vendor building this extension
	 */
	public String getEula() {
		return _extension.getEula();
	}
	
	public void setEula(String eula) {
		_extension.setEula(eula);
	}
	
	/**
	 * Creates a composite of controls to be displayed on the wizard page
	 * 
	 * @param page		Reference of the page on which the controls should be added
	 * 
	 */
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		if(_extension == null) {
			ExtensionControlFactory.getInstance().createControl("ExtensionHelper", area, _data, page);
			_extension = ExtensionControlFactory.getInstance().getModel("ExtensionHelper");
		} else {
			ExtensionControlFactory.getInstance().createControl("ExtensionHelper", area, _data, false, _extension, page);
		}
	}
}
