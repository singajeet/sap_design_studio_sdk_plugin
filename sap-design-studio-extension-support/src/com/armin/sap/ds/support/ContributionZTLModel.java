package com.armin.sap.ds.support;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.wizard.IWizardDetailsPage;
import com.armin.sap.ds.wizard.ZTLFileDetailsPage;

public class ContributionZTLModel {
	
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
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				className = txtClass.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Third Row
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description");
		Text txtDescription = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtDescription.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				description = txtDescription.getText();
				page.setPageComplete(page.validatePage());
			}
		});

	}
}
