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
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.ext.plugin.Activator;
import com.armin.sap.ds.wizard.IWizardDetailsPage;

public class ContributionZTLHelper {
	
	private String packageName;
	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}
	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	private String className;
	private String classToExtend;
	
	public String getClassToExtend() {
		return classToExtend;
	}
	public void setClassToExtend(String classToExtend) {
		this.classToExtend = classToExtend;
	}
	
	private String description;
			
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		//--- First Row
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setText("Package");
		Text txtPackage = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPackage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPackage.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				packageName = txtPackage.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Second Row
		Label lblClass = new Label(container, SWT.NONE);
		lblClass.setText("Class");
		Text txtClass = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtClass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				className = txtClass.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Third Row
		Label lblExtends = new Label(container, SWT.NONE);
		lblExtends.setText("Extends");
		Combo extendCombo = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		extendCombo.add("Component");
		extendCombo.add("SdkDataBuffer");
		extendCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		extendCombo.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int index = extendCombo.getSelectionIndex();
				classToExtend = extendCombo.getItem(index);
			}
		});
		//--- Fourth Row
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description");
		Text txtDescription = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		txtDescription.setLayoutData(gridData);
		txtDescription.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				description = txtDescription.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Separator
		Label line = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineGridData = new GridData(GridData.FILL_HORIZONTAL);
		lineGridData.horizontalSpan = 2;
		line.setLayoutData(lineGridData);

	}
	
	public InputStream getContent() {
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
            String contentString = String.format(templateString, getPackageName(), 
            		getClassName(), getDescription(), getClassToExtend());
            
            return new ByteArrayInputStream(contentString.getBytes());
            
        } catch (IOException e) {
            // send back null
        }
        
		return null;

	}
}
