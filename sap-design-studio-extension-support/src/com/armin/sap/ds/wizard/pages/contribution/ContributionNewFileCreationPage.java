package com.armin.sap.ds.wizard.pages.contribution;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.ext.plugin.Activator;

public class ContributionNewFileCreationPage extends WizardNewFileCreationPage {

	private String id;
	private String name;
	private String version;
	private String vendor;
	
	public ContributionNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio Contribution File", selection);
		
		setTitle("Contribution File Details");
		setDescription("Create a contribution file for SAP Design Studio Extension");
		setFileExtension("xml");
	}
	
	public ContributionNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected InputStream getInitialContents() {
		
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
            String contentString = String.format(templateString, id, name, version, vendor);
            
            return new ByteArrayInputStream(contentString.getBytes());
            
        } catch (IOException e) {
            // send back null
        }
        
		return null;
	}

	@Override
	public void createControl(Composite parent) {
		
		super.createControl(parent);
		Composite area = (Composite) getControl();
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));;
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		//--- First Row
		Label lblId = new Label(container, SWT.NONE);
		lblId.setText("Id");
		Text txtId = new Text(container, SWT.SINGLE);
		txtId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				id = txtId.getText();
				setPageComplete(validatePage());
			}
		});
		//--- Second Row
		Label lblName = new Label(container, SWT.NONE);
		lblName.setText("Name");
		Text txtName = new Text(container, SWT.SINGLE);
		txtName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				name = txtName.getText();
				setPageComplete(validatePage());
			}
		});
		//--- Third Row
		Label lblVersion = new Label(container, SWT.NONE);
		lblVersion.setText("Version");
		Text txtVersion = new Text(container, SWT.SINGLE);
		txtVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				version = txtVersion.getText();
				setPageComplete(validatePage());
			}
		});
		//--- Fourth Row
		Label lblVendor = new Label(container, SWT.NONE);
		lblVendor.setText("Vendor");
		Text txtVendor = new Text(container, SWT.SINGLE);
		txtVendor.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				vendor = txtVendor.getText();
				setPageComplete(validatePage());
			}
		});
	}

	@Override
	protected boolean validatePage() {
		// TODO Auto-generated method stub
		if(id != null && name != null && vendor != null && version != null) {
		return super.validatePage() && !id.isEmpty() 
				&& !name.isEmpty() && !vendor.isEmpty()
				&& !version.isEmpty();
		} else {
			return false;
		}
	}
	

}
