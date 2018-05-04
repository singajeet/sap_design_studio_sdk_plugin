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
import com.armin.sap.ds.support.ContributionZTLModel;
import com.armin.sap.ds.wizard.IWizardDetailsPage;

public class ZTLNewFileCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	private ContributionZTLModel _model;
	
	public ZTLNewFileCreationPage(IStructuredSelection selection) {
		super("SAP Design Studio ZTL File", selection);
		// TODO Auto-generated constructor stub
		
		setTitle("ZTL File Details");
		setDescription("Create a ztl file for SAP Design Studio Extension");
		setFileName("contribution");
		setFileExtension("ztl");
		
		setAllowExistingResources(false);
		_model = new ContributionZTLModel();
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
            String contentString = String.format(templateString, _model.getPackageName(), 
            		_model.getClassName(), _model.getDescription());
            
            return new ByteArrayInputStream(contentString.getBytes());
            
        } catch (IOException e) {
            // send back null
        }
        
		return null;
	}

	@Override
	public void createControl(Composite parent) {
		
		super.createControl(parent);
		_model.createControl(this);
	}

	@Override
	public boolean validatePage() {
		if(_model.getPackageName() != null && _model.getClassName() != null 
				&& _model.getDescription() != null) {
			return super.validatePage() && !_model.getPackageName().isEmpty() 
					&& !_model.getClassName().isEmpty() && !_model.getDescription().isEmpty();
		} else {
			return false;
		}
	}


}
