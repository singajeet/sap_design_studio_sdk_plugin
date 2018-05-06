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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.ext.plugin.Activator;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;

public class ComponentHelper implements IHelper {

	public String COMPONENT_PERSIST_FILE_NAME = "contribution.ztl";
	public boolean M_MODE = true;
	public boolean C_MODE = false;
	
	private String INIT_CLASS_TO_EXTEND = "Component";
	private String EXTENDS_KEYWORD = " extends ";
	
	
	/**
	 * Title for this component. It will also be used to derive hint for class name
	 */
	private String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		txtTitle.setText(title);
	}

	/**
	 * The package name of the component. It should follow the Java standards
	 */
	private String packageName;
	
	public String getPackageName() {
		return packageName;
	}
	
	public void setPackageName(String packageName) {
		this.packageName = packageName;
		txtPackage.setText(packageName);
	}
	
	/**
	 * The class name of the component. It should follow the Java standards
	 */
	private String className;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
		txtClass.setText(className);
	}
	
	/**
	 * The description of the component
	 */
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
		txtDescription.setText(description);
	}
	
	/**
	 * The class name from which this component should inherit	
	 */
	private String classToExtend = INIT_CLASS_TO_EXTEND;
	
	public String getClassToExtend() {
		return classToExtend;
	}
	
	public void setClassToExtend(String classToExtend) {
		this.classToExtend = classToExtend;
		int index = comboExtends.indexOf(classToExtend);
		if(index >= 0 && index < comboExtends.getItemCount()) {
			comboExtends.select(index);
		}
	}
	
	/**
	 * Tooltip for the current component which will be displayed in 
	 * component toolbox in design studio
	 */
	private String toolTip;
	
	public String getToolTip() {
		return toolTip;
	}
	
	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
		txtToolTip.setText(toolTip);
	}
	
	/**
	 * Mobile mode for rendering components
	 * Selected by default
	 */
	private boolean mMode = M_MODE;
	
	public boolean getMMode() {
		return mMode;
	}
	
	public void setMMode(boolean mode) {
		this.mMode = mode;
		checkModeMobile.setSelection(true);		
	}
	
	/**
	 * Commons mode for rendering
	 * 
	 */
	private boolean commonsMode = C_MODE;
	
	public boolean getCommonsMode() {
		return commonsMode;
	}
	
	public void setCommonsMode(boolean mode) {
		this.commonsMode = mode;
		checkModeCommon.setSelection(true);		
	}
	
	/**
	 * Sets whether a component file (.ztl) should be created or not.
	 * By default this is set to true and file will be created
	 */
	private boolean componentFileCreationEnabled = true;
			
	public boolean isComponentFileCreationEnabled() {
		return componentFileCreationEnabled;
	}
	
	public void setComponentFileCreationEnabled(boolean state) {
		this.componentFileCreationEnabled = state;
		checkCreateComponentFile.setSelection(state);
	}
	
	/**
	 * A private function to enable or disable wizard components based on the 
	 * parameter passed to this function.
	 * 
	 * @param state		<code>true</code> or <code>false</code> to enable or
	 * 					disable the components
	 */
	private void enableControls(boolean state) {
		//txtPackage.setEnabled(state);
		txtClass.setEnabled(state);
		txtDescription.setEnabled(state);
		comboExtends.setEnabled(state);
		setComponentFileCreationEnabled(state);
	}
	
	private boolean isClassNameModifiedManually = false;
	
	private Text txtTitle;
	private Text txtPackage;
	private Text txtClass;
	private Text txtDescription;
	private Combo comboExtends;
	private Text txtToolTip;
	private Group checkGroup;
	private Button checkModeCommon;
	private Button checkModeMobile;
	private Button checkCreateComponentFile;
	
	/**
	 * Creates a composite of controls to be displayed on the wizard page
	 * 
	 * @param page		Reference of the page on which the controls should be added
	 * 
	 */
	public void createControl(IWizardDetailsPage page) {
		Composite area = (Composite) page.getControl();
		
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);
		
		setComponentFileCreationEnabled(true);
		
		//--- Checkbox to ask if component file is required or not
		checkCreateComponentFile = new Button(container, SWT.CHECK);
		GridData checkBoxGridData = new GridData();
		checkBoxGridData.horizontalAlignment = GridData.FILL;
		checkBoxGridData.horizontalSpan = 2;
		checkCreateComponentFile.setLayoutData(checkBoxGridData);
		checkCreateComponentFile.setText("Create component contribution file (.ztl) for this extension");
		checkCreateComponentFile.setSelection(true);
		checkCreateComponentFile.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent event) {
				if(checkCreateComponentFile.getSelection()) {
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
		
		//--- Package Name Row
		Label lblPackage = new Label(container, SWT.NONE);
		lblPackage.setText("Component Package Name:");
		txtPackage = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtPackage.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtPackage.setEnabled(false); //This field will be populated from the ID of extension
		txtPackage.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				packageName = txtPackage.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Title Row
		Label lblTitle = new Label(container, SWT.NONE);
		lblTitle.setText("Component Title:");
		txtTitle = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtTitle.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtTitle.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				title = txtTitle.getText();
				if(!isClassNameModifiedManually) {
					String clsName = title.replace(" ", "");
					clsName = clsName.replace("-", "");
					clsName = clsName.replace("_", "");
					clsName = clsName.replace(".", "");
					txtClass.setText(clsName);
					setClassName(clsName);
				}
			}
		});
		//--- Class Name Row
		Label lblClass = new Label(container, SWT.NONE);
		lblClass.setText("Component Class Name:");
		txtClass = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtClass.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtClass.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if(!isClassNameModifiedManually) {
					isClassNameModifiedManually = true;
				}
				className = txtClass.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//--- Super Class Row
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
		//--- Description Row
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
		//--- Tooltip Row
		Label lblTooltip = new Label(container, SWT.NONE);
		lblTooltip.setText("Component Tooltip:");
		txtToolTip = new Text(container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtToolTip.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		txtToolTip.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {				
				toolTip = txtToolTip.getText();
				page.setPageComplete(page.validatePage());
			}
		});
		//-- chech mode row
		Label lblMode = new Label(container, SWT.NONE);
		lblMode.setText("Component Mode:");
		checkGroup = new Group(container, SWT.SHADOW_ETCHED_IN);
		checkGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		//--- Separator
		Label lineSeparator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData1 = new GridData(GridData.FILL_HORIZONTAL);
		lineSeparatorGridData1.horizontalSpan = 2;
		lineSeparator1.setLayoutData(lineSeparatorGridData1);

	}
	
	/**
	 * Provides the initial contents to be filled in the component (.ztl) file
	 * 
	 * @return		An instance of the <code>InputStream</code> class which provides
	 * 				the content to be filled in the component file. It reads the content
	 * 				from the template, fill in the place holders in templates and returns
	 * 				the parsed content to caller
	 * 
	 */
	public InputStream getInitialContent() {
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
