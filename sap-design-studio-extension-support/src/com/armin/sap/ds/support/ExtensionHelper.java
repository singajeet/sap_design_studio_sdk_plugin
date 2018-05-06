package com.armin.sap.ds.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.ext.plugin.Activator;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;

public class ExtensionHelper implements IHelper {
	
	public String EXTENSION_PERSIST_FILE_NAME = "contribution.xml";
	
	private String id;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}
	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}
	/**
	 * @return the vendor
	 */
	public String getVendor() {
		return vendor;
	}
	/**
	 * @param vendor the vendor to set
	 */
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	private String name;
	private String version;
	private String vendor;
	
	public InputStream getInitialContent() {
		String templateFilePath = "/templates/contribution-template.xml";
        
        try {
            InputStream inputStream = Activator.getDefault().getBundle().getEntry(templateFilePath).openStream();
            BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            
            String line = buf.readLine();
            while(line != null) {
            	sb.append(line).append("\n");
            	line = buf.readLine();
            }
        
            String templateString = sb.toString();
            String contentString = String.format(templateString, getId(), 
            		getName(), getVersion(), getVendor());
            
            return new ByteArrayInputStream(contentString.getBytes());
            
        } catch (IOException e) {
            // send back null
        }
        
		return null;

	}
	
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));;
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		//--- First Row
		Label lblId = new Label(container, SWT.NONE);
		lblId.setText("Extension Id:");
		Text txtId = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtId.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				id = txtId.getText();
				IWizardDetailsPage nextPage = (IWizardDetailsPage)page.getNextPage();
				ComponentHelper compHelper = (ComponentHelper)nextPage.getDetails();
				compHelper.setPackageName(id);
				
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Second Row
		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Extension Name:");
		Text txtName = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				name = txtName.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Third Row
		Label lblVersion = new Label(container, SWT.NONE);
		lblVersion.setText("Version:");
		Text txtVersion = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
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
		Text txtVendor = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
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
	}
}
