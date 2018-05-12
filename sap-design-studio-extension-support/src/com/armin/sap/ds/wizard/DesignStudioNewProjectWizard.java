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

import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.data.shared.SharedData;
import com.armin.sap.ds.support.ComponentHelper;
import com.armin.sap.ds.support.DesignStudioProjectHelper;
import com.armin.sap.ds.support.ExtensionHelper;
import com.armin.sap.ds.wizard.pages.ComponentDetailsPage;
import com.armin.sap.ds.wizard.pages.ExtensionDetailsPage;

public class DesignStudioNewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private WizardNewProjectCreationPage _pageOne;
	private IWizardPage _pageTwo;
	private IWizardPage _pageThree;
	private ISharedData _data;
	
	private String PAGE1_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE1_TITLE = "Project Name and Location";
	private String PAGE1_DESCRIPTION = "Generates boiler plate code for SAP Design Studio Extension";
	
	private String PAGE2_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE2_TITLE = "Extension Details";
	private String PAGE2_DESCRIPTION = "Provide details about the SAP Design Studio extension";	
	
	private String PAGE3_NAME = "SAP Design Studio Extension Wizard";
	private String PAGE3_TITLE = "Component Details";
	private String PAGE3_DESCRIPTION = "Provide details about the default component for this extension";
	private IConfigurationElement _configurationElement;
	
	@SuppressWarnings("unused")
	private IWorkbench _workbench;
	@SuppressWarnings("unused")
	private IStructuredSelection _selection;
	
	public DesignStudioNewProjectWizard() {
		setWindowTitle(PAGE1_TITLE);
		_data = new SharedData();
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		_workbench = workbench;
		_selection = selection;
	}

	@Override
	public boolean performFinish() {
		String name = _pageOne.getProjectName();
		URI location = null;
		if(!_pageOne.useDefaults()) {
			location = _pageOne.getLocationURI();
		}
		
		ExtensionHelper extensionDetails = ((ExtensionDetailsPage)_pageTwo).getDetails();
		ComponentHelper componentDetails = ((ComponentDetailsPage)_pageThree).getDetails();
		
		DesignStudioProjectHelper.createProject(name, location, extensionDetails, componentDetails);
		
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
		
		_pageTwo = new ExtensionDetailsPage(PAGE2_NAME, _data);
		_pageTwo.setTitle(PAGE2_TITLE);
		_pageTwo.setDescription(PAGE2_DESCRIPTION);
		addPage(_pageTwo);
		
		_pageThree = new ComponentDetailsPage(PAGE3_NAME, _data);
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
