package com.armin.sap.ds.wizard;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.armin.sap.ds.support.ContributionXMLModel;
import com.armin.sap.ds.support.ContributionZTLModel;
import com.armin.sap.ds.support.DesignStudioProjectSupport;

public class DesignStudioNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private WizardNewProjectCreationPage _pageOne;
	private IWizardPage _pageTwo;
	private IWizardPage _pageThree;
	
	private String PAGE1_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE1_TITLE = "Project Name and Location";
	private String PAGE1_DESCRIPTION = "Generates boiler plate code for SAP Design Studio Extension";
	private String PAGE2_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE2_TITLE = "Contibution XML Details";
	private String PAGE2_DESCRIPTION = "Generates boiler plate code for SAP Design Studio Extension";	
	private String PAGE3_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE3_TITLE = "Contribution ZTL Details";
	private String PAGE3_DESCRIPTION = "Generates boiler plate code for SAP Design Studio Extension";
	private IConfigurationElement _configurationElement;
	
	private IWorkbench workbench;
	private IStructuredSelection selection;
	
	public DesignStudioNewProjectWizard() {
		setWindowTitle(PAGE1_TITLE);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		workbench = workbench;
		selection = selection;
	}

	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if(!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
		}
		
		ContributionXMLModel contribXMLDetails = ((ContributionFileDetailsPage)_pageTwo).getDetails();
		ContributionZTLModel contribZTLDetails = ((ZTLFileDetailsPage)_pageThree).getDetails();
		
		DesignStudioProjectSupport.createProject(name, location, contribXMLDetails, contribZTLDetails);
		
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		return true;
	}
	
	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new WizardNewProjectCreationPage(PAGE1_NAME);
		_pageOne.setTitle(PAGE1_TITLE);
		_pageOne.setDescription(PAGE1_DESCRIPTION);
		addPage(_pageOne);
		
		_pageTwo = new ContributionFileDetailsPage(PAGE2_NAME);
		_pageTwo.setTitle(PAGE2_TITLE);
		_pageTwo.setDescription(PAGE2_DESCRIPTION);
		addPage(_pageTwo);
		
		_pageThree = new ZTLFileDetailsPage(PAGE3_NAME);
		_pageThree.setTitle(PAGE3_TITLE);
		_pageThree.setDescription(PAGE3_DESCRIPTION);
		addPage(_pageThree);
		
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;
		
	}

}
