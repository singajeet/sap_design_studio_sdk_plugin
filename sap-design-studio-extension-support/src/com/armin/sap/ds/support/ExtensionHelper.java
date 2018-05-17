package com.armin.sap.ds.support;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import com.armin.sap.ds.ext.plugin.controls.ExtensionControlFactory;
import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;

public class ExtensionHelper implements IHelper {
	
	public String EXTENSION_XML_FILE_NAME = "contribution.xml";
	private ISharedData _data;
	
	public ExtensionHelper() {
		
	}
	
	public ExtensionHelper(ISharedData data) {
		_data = data;
	}
	
	/**
	 * The unique id of the extension. 
	 * Also, this will be used as package title for a component.
	 */
	private String id;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
		txtId.setText(id);
	}
	
	/**
	 * Name or the title of the extension
	 */
	private String title;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String name) {
		this.title = name;
		txtTitle.setText(name);
	}
	
	/**
	 * Current version of the extension
	 */
	private String version;
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(String version) {
		this.version = version;
		txtVersion.setText(version);
	}
	
	/**
	 * Name of the vendor building this extension
	 */
	private String vendor;
	
	public String getVendor() {
		return vendor;
	}
	
	public void setVendor(String vendor) {
		this.vendor = vendor;
		txtVendor.setText(vendor);
	}
	
	/**
	 * Name of the vendor building this extension
	 */
	private String eula;
	
	public String getEula() {
		return eula;
	}
	
	public void setEula(String eula) {
		this.eula = eula;
		txtEula.setText(eula);
	}
	
	private Text txtId;
	private Text txtTitle;
	private Text txtVersion;
	private Text txtVendor;
	private Text txtEula;
	
	/**
	 * Creates a composite of controls to be displayed on the wizard page
	 * 
	 * @param page		Reference of the page on which the controls should be added
	 * 
	 */
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		
		ExtensionControlFactory.getInstance().createControl("ExtensionHelper", area, _data);
	}
}
