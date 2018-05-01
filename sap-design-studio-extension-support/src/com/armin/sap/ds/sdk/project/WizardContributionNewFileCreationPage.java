package com.armin.sap.ds.sdk.project;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import com.armin.sap.ds.ext.plugin.Activator;

public class WizardContributionNewFileCreationPage extends WizardNewFileCreationPage {

	public WizardContributionNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio Contribution File Wizard", selection);
		
		setTitle("Contribution File Wizard");
		setDescription("Create a contribution file for SAP Design Studio Extension");
		setFileExtension("xml");
	}
	
	public WizardContributionNewFileCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected InputStream getInitialContents() {
		
		String templateFilePath = "/templates/contribution-template.xml";
        InputStream inputStream = null;
        try {
            inputStream = Activator.getDefault().getBundle().getEntry(templateFilePath).openStream();
        } catch (IOException e) {
            // send back null
        }
        
		return inputStream;
	}
	

}
