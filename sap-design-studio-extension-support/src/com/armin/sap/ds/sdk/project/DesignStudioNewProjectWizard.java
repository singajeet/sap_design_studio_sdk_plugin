package com.armin.sap.ds.sdk.project;

import java.net.URI;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import com.armin.sap.ds.support.DesignStudioProjectSupport;

public class DesignStudioNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private WizardNewProjectCreationPage _pageOne;
	private String PAGE_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE_TITLE = "SAP Design Studio Extension";
	private String PAGE_DESCRIPTION = "Generates boiler plate code for SAP Design Studio Extension";
	private IConfigurationElement _configurationElement;
	
	public DesignStudioNewProjectWizard() {
		setWindowTitle(PAGE_TITLE);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if(!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
		}
		
		DesignStudioProjectSupport.createProject(name, location);
		
		BasicNewProjectResourceWizard.updatePerspective(_configurationElement);
		return true;
	}
	
	@Override
	public void addPages() {
		super.addPages();
		
		_pageOne = new WizardNewProjectCreationPage(PAGE_NAME);
		_pageOne.setTitle(PAGE_TITLE);
		_pageOne.setDescription(PAGE_DESCRIPTION);
		
		addPage(_pageOne);
		
	}

	@Override
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
			throws CoreException {
		_configurationElement = config;
		
	}

}
