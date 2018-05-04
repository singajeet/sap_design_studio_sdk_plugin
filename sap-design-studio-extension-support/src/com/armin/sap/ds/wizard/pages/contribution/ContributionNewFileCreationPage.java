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
import com.armin.sap.ds.support.ContributionXMLModel;
import com.armin.sap.ds.wizard.IWizardDetailsPage;

public class ContributionNewFileCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	private ContributionXMLModel _model;
	
	public ContributionNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio Contribution File", selection);
		
		setTitle("Contribution File Details");
		setDescription("Create a contribution file for SAP Design Studio Extension");
		setFileName("contribution");
		setFileExtension("xml");
		
		setAllowExistingResources(false);
		
		_model = new ContributionXMLModel();
		
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
            String contentString = String.format(templateString, _model.getId(), 
            		_model.getName(), _model.getVersion(), _model.getVendor());
            
            return new ByteArrayInputStream(contentString.getBytes());
            
        } catch (IOException e) {
            // send back null
        }
        
		return null;
	}

	@Override
	public void createControl(Composite parent) {
		
		super.createControl(parent);
		
	}

	@Override
	public boolean validatePage() {
		// TODO Auto-generated method stub
		if(_model.getId() != null && _model.getName() != null && 
				_model.getVendor() != null && _model.getVersion() != null) {
		return super.validatePage() && !_model.getId().isEmpty() 
				&& !_model.getName().isEmpty() && !_model.getVendor().isEmpty()
				&& !_model.getVersion().isEmpty();
		} else {
			return false;
		}
	}
	

}
