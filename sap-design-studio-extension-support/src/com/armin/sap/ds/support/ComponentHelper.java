package com.armin.sap.ds.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.ext.plugin.Activator;
import com.armin.sap.ds.wizard.IWizardDetailsPage;

public class ComponentHelper {

	public String COMPONENT_PERSIST_FILE_NAME = "contribution.ztl";
	private String EXTENDS_KEYWORD = " extends ";
	
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
	private boolean createZTLFile;
			
	public boolean isCreateZTLFile() {
		return createZTLFile;
	}
	
	public void setCreateComponentFile(boolean createZTLFile) {
		this.createZTLFile = createZTLFile;
	}
	
	private void enableControls(boolean state) {
		txtPackage.setEnabled(state);
		txtClass.setEnabled(state);
		txtDescription.setEnabled(state);
		comboExtends.setEnabled(state);
		setCreateComponentFile(state);
	}
	
	private Text txtPackage;
	private Text txtClass;
	private Text txtDescription;
	private Combo comboExtends;
	
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		setCreateComponentFile(true);
		
		//--- Checkbox to ask if component file is required or not
		Button checkCreateZTLFile = new Button(container, SWT.CHECK);
		checkCreateZTLFile.setText("Create component contribution file (ztl) for this extension");
		checkCreateZTLFile.setSelection(true);
		checkCreateZTLFile.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				if(checkCreateZTLFile.getSelection()) {
					enableControls(true);
				} else {
					enableControls(false);
				}
			}
			
			public void widgetDefaultSelected(SelectionEvent event) {
				
			}
		});
		
		//--- Separator
		Label lineSeparator2 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData2 = new GridData(GridData.FILL_HORIZONTAL);
		lineSeparatorGridData2.horizontalSpan = 2;
		lineSeparator2.setLayoutData(lineSeparatorGridData2);
				
		//--- First Row
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setText("Component Package Name:");
		txtPackage = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPackage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPackage.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				packageName = txtPackage.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Second Row
		Label lblClass = new Label(container, SWT.NONE);
		lblClass.setText("Component Class Name:");
		txtClass = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtClass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				className = txtClass.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Third Row
		Label lblExtends = new Label(container, SWT.NONE);
		lblExtends.setText("Component Inherit From:");
		comboExtends = new Combo(container, SWT.READ_ONLY | SWT.BORDER);
		comboExtends.add("-- None --");
		comboExtends.add("Component");
		comboExtends.add("SdkDataBuffer");
		comboExtends.select(1); //Select component by default
		comboExtends.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		comboExtends.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				int index = comboExtends.getSelectionIndex();
				classToExtend = comboExtends.getItem(index);
			}
		});
		//--- Fourth Row
		Label lblDescription = new Label(container, SWT.NONE);
		lblDescription.setText("Description");
		txtDescription = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP);
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
		Label lineSeparator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData1 = new GridData(GridData.FILL_HORIZONTAL);
		lineSeparatorGridData1.horizontalSpan = 2;
		lineSeparator1.setLayoutData(lineSeparatorGridData1);

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
            String contentString = null;
            
            if(classToExtend.equalsIgnoreCase("-- None --")) {
            	contentString = String.format(templateString, getDescription(),
                		new Date(), "<<author name>>", getPackageName(), 
                		getClassName(), "", "");
            } else {
            	contentString = String.format(templateString, getDescription(),
            		new Date(), "<<author name>>", getPackageName(), 
            		getClassName(), EXTENDS_KEYWORD, getClassToExtend());
            }
            
            return new ByteArrayInputStream(contentString.getBytes());
            
        } catch (IOException e) {
            // send back null
        }
        
		return null;

	}
}
