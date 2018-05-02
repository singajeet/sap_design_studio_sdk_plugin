package com.armin.sap.ds.wizard.pages.ztl;

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

public class ZTLNewFileCreationPage extends WizardNewFileCreationPage {

	private String packageName;
	private String className;
	private String description;
	
	public ZTLNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio ZTL File", selection);
		// TODO Auto-generated constructor stub
		
		setTitle("ZTL File Details");
		setDescription("Create a ztl file for SAP Design Studio Extension");
		setFileExtension("ztl");
	}
	
	public ZTLNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected InputStream getInitialContents() {
		
		String templateFilePath = "/templates/ztl-template.ztl";
        
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
            String contentString = String.format(templateString, packageName, className, description);
            
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
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setText("Package");
		Text txtPackage = new Text(container, SWT.BORDER);
		txtPackage.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				packageName = txtPackage.getText();
				setPageComplete(validatePage());
			}
		});
		//--- Second Row
		Label lblClass = new Label(container, SWT.NONE);
		lblClass.setText("Class");
		Text txtClass = new Text(container, SWT.BORDER);
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				className = txtClass.getText();
				setPageComplete(validatePage());
			}
		});
		//--- Third Row
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description");
		Text txtDescription = new Text(container, SWT.BORDER);
		txtDescription.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				description = txtDescription.getText();
				setPageComplete(validatePage());
			}
		});
	}

	@Override
	protected boolean validatePage() {
		// TODO Auto-generated method stub
		return super.validatePage() && !packageName.isEmpty() 
				&& !className.isEmpty() && !description.isEmpty();
	}


}
