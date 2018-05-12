package com.armin.sap.ds.support;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

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
		
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));;
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		//--- First Row
		Label lblId = new Label(container, SWT.NONE);
		lblId.setText("Extension Id:");
		txtId = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtId.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				id = txtId.getText();
				_data.setData("packageName", id);
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Second Row
		Label lblTitle = new Label(container, SWT.NONE);
		lblTitle.setText("Extension Title:");
		txtTitle = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtTitle.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtTitle.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				title = txtTitle.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Third Row
		Label lblVersion = new Label(container, SWT.NONE);
		lblVersion.setText("Version:");
		txtVersion = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtVersion.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				version = txtVersion.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Fourth Row
		Label lblVendor = new Label(container, SWT.NONE);
		lblVendor.setText("Vendor Name:");
		txtVendor = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtVendor.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtVendor.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				vendor = txtVendor.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Separator
		Label lineSeparator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData1 = new GridData(GridData.FILL_HORIZONTAL);
		lineSeparatorGridData1.horizontalSpan = 2;
		lineSeparator1.setLayoutData(lineSeparatorGridData1);
		//--- Fifth Row
		Label lblEula = new Label(container, SWT.NONE);
		lblEula.setText("EULA (End User License Agreement):");
		GridData gridDataEulaLabel = new GridData(GridData.FILL_HORIZONTAL);
		gridDataEulaLabel.horizontalSpan = 2;
		lblEula.setLayoutData(gridDataEulaLabel);
		txtEula = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		GridData gridDataEulaText = new GridData();
		gridDataEulaText.horizontalSpan = 2;
		gridDataEulaText.horizontalAlignment = SWT.FILL;
		gridDataEulaText.grabExcessHorizontalSpace = true;
		gridDataEulaText.verticalAlignment = SWT.FILL;
		gridDataEulaText.grabExcessVerticalSpace = true;
		txtEula.setLayoutData(gridDataEulaText);
		txtEula.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				eula = txtEula.getText();
				page.setPageComplete(page.validatePage());
			}
		});
	}
}
