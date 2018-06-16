package com.armin.sap.ds.ext.plugin.editors;

import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IReusableEditor;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.ResourceManager;

import com.armin.sap.ds.actions.CreateNewExtensionAction;
import com.armin.sap.ds.actions.DeleteExtensionAction;
import com.armin.sap.ds.actions.SaveExtensionAction;
import com.armin.sap.ds.xml.Extension;

public class ExtensionEditor extends AbstractBaseEditor implements IReusableEditor {
	
	private static class ExtensionsContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			return new Object[0];
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	
	public static final String ID = "com.armin.sap.ds.ext.plugin.editors.extension";
	private Text textProjectName;
	private Text textProjectLocation;
	private Text textProjectModificationDate;
	private Text textExtensionId;
	private Text textExtensionTitle;
	private Text textExtensionVersion;
	private Text textExtensionVendor;
	private StyledText licenseText;
	private IAction addNewExtension;
	private IAction saveExtension;
	private IAction deleteExtension;
	private ListViewer listViewerExtensions;
	
	
	private Object _package;
	private List listExtensions;

	
	@Override
	public void setInput(IEditorInput input) {
		super.setInput(input);
		firePropertyChange(IWorkbenchPartConstants.PROP_INPUT);
	}
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public ExtensionEditor(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public ExtensionEditor(FormEditor editor, String id, String title) {
		super(editor, "extension_editor_part", "");
		setTitleToolTip("Edit SAP Design Studio Extensions");
		setTitleImage(ResourceManager.getPluginImage("sap-design-studio-ext-navigator", "images/extension_28x28.png"));
		setPartName("SAP Design Studio Extensions");
		setActive(true);
	}
	
	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public ExtensionEditor(FormEditor editor, String id, String title, Object pkg) {
		super(editor, "extension_editor_part", "");
		setTitleToolTip("Edit SAP Design Studio Extensions");
		setTitleImage(ResourceManager.getPluginImage("sap-design-studio-ext-navigator", "images/extension_28x28.png"));
		setPartName("SAP Design Studio Extensions");
		_package = pkg;
		setActive(true);		
	}
	
	public void setPackage(Object pkg) {
		_package = pkg;		
	}	

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		FormToolkit toolkit = managedForm.getToolkit();
		ScrolledForm form = managedForm.getForm();
		form.setText("Extension Editor");
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(managedForm.getForm().getBody(), SWT.V_SCROLL);
		managedForm.getToolkit().adapt(composite);
		managedForm.getToolkit().paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));
		
		Group grpPackageDetails = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpPackageDetails.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpPackageDetails.setText("Extension Package Details");
		managedForm.getToolkit().adapt(grpPackageDetails);
		managedForm.getToolkit().paintBordersFor(grpPackageDetails);
		grpPackageDetails.setLayout(new GridLayout(3, false));
		
		Label lblPackageName = new Label(grpPackageDetails, SWT.NONE);
		lblPackageName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblPackageName, true, true);
		lblPackageName.setText("Extension Package Name:");
		
		textProjectName = new Text(grpPackageDetails, SWT.BORDER);
		textProjectName.setEditable(false);
		textProjectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textProjectName, true, true);
		new Label(grpPackageDetails, SWT.NONE);
		
		Label lblVersion = new Label(grpPackageDetails, SWT.NONE);
		lblVersion.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblVersion, true, true);
		lblVersion.setText("Version:");
		
		textProjectLocation = new Text(grpPackageDetails, SWT.BORDER);
		textProjectLocation.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textProjectLocation, true, true);
		new Label(grpPackageDetails, SWT.NONE);
		
		Label lblVendorURL = new Label(grpPackageDetails, SWT.NONE);
		lblVendorURL.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblVendorURL, true, true);
		lblVendorURL.setText("URL:");
		
		textProjectModificationDate = new Text(grpPackageDetails, SWT.BORDER);
		textProjectModificationDate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textProjectModificationDate, true, true);
		new Label(grpPackageDetails, SWT.NONE);
		
		Group groupExtensions = new Group(composite, SWT.NONE);
		groupExtensions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		managedForm.getToolkit().adapt(groupExtensions);
		managedForm.getToolkit().paintBordersFor(groupExtensions);
		groupExtensions.setLayout(new GridLayout(1, false));
		
		Form frmExtensions = managedForm.getToolkit().createForm(groupExtensions);
		frmExtensions.setImage(ResourceManager.getPluginImage("com.armin.sap.ds.ext.plugin", "images/extension_16x16.png"));
		frmExtensions.setMessage("");
		frmExtensions.setSeparatorVisible(true);
		frmExtensions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		managedForm.getToolkit().paintBordersFor(frmExtensions);
		frmExtensions.setText("Extensions");
		frmExtensions.getBody().setLayout(new GridLayout(3, false));
		
		IToolBarManager formToolBar = frmExtensions.getToolBarManager();
		
		addNewExtension = new CreateNewExtensionAction();
		addNewExtension.setImageDescriptor(ResourceManager.getPluginImageDescriptor("com.armin.sap.ds.ext.plugin", "images/new.png"));
		addNewExtension.setText("New");
		formToolBar.add(addNewExtension);
		
		saveExtension = new SaveExtensionAction();
		saveExtension.setImageDescriptor(ResourceManager.getPluginImageDescriptor("com.armin.sap.ds.ext.plugin", "images/save.png"));
		saveExtension.setText("Save");
		formToolBar.add(saveExtension);
		
		deleteExtension = new DeleteExtensionAction();
		deleteExtension.setImageDescriptor(ResourceManager.getPluginImageDescriptor("com.armin.sap.ds.ext.plugin", "images/candy_x_46x46.png"));
		deleteExtension.setText("Delete");
		formToolBar.add(deleteExtension);
		
		Group groupExtensionsList = new Group(frmExtensions.getBody(), SWT.SHADOW_ETCHED_IN);
		groupExtensionsList.setText("Extensions:");
		groupExtensionsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		managedForm.getToolkit().adapt(groupExtensionsList);
		managedForm.getToolkit().paintBordersFor(groupExtensionsList);
		groupExtensionsList.setLayout(new GridLayout(1, false));
		
		listViewerExtensions = new ListViewer(groupExtensionsList, SWT.BORDER | SWT.V_SCROLL);
		listExtensions = listViewerExtensions.getList();
		listExtensions.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Extension selectedExtension = (Extension)e.data;
				textExtensionId.setText(selectedExtension.getId());
				textExtensionTitle.setText(selectedExtension.getTitle());
				textExtensionVendor.setText(selectedExtension.getVendor());
				licenseText.setText(selectedExtension.getEula());
				
			}
		});
		listExtensions.setItems(new String[] {"ColoredBox", "TestExtension", "MyExtension"});
		listExtensions.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1));
		
		Group grpExtensionDetails = new Group(frmExtensions.getBody(), SWT.SHADOW_ETCHED_IN);
		grpExtensionDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		grpExtensionDetails.setText("Extension Details:");
		managedForm.getToolkit().adapt(grpExtensionDetails);
		managedForm.getToolkit().paintBordersFor(grpExtensionDetails);
		grpExtensionDetails.setLayout(new GridLayout(2, false));
		
		Label lblExtensionId = new Label(grpExtensionDetails, SWT.NONE);
		lblExtensionId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblExtensionId, true, true);
		lblExtensionId.setText("Extension Id:");
		
		textExtensionId = new Text(grpExtensionDetails, SWT.BORDER);
		textExtensionId.setEditable(false);
		textExtensionId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textExtensionId, true, true);
		
		Label lblExtensionTitle = new Label(grpExtensionDetails, SWT.NONE);
		lblExtensionTitle.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblExtensionTitle, true, true);
		lblExtensionTitle.setText("Extension Title:");
		
		textExtensionTitle = new Text(grpExtensionDetails, SWT.BORDER);
		textExtensionTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textExtensionTitle, true, true);
		
		Label lblVersion_1 = new Label(grpExtensionDetails, SWT.NONE);
		lblVersion_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblVersion_1, true, true);
		lblVersion_1.setText("Version:");
		
		textExtensionVersion = new Text(grpExtensionDetails, SWT.BORDER);
		textExtensionVersion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textExtensionVersion, true, true);
		
		Label lblVendorName = new Label(grpExtensionDetails, SWT.NONE);
		lblVendorName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblVendorName, true, true);
		lblVendorName.setText("Vendor Name:");
		
		textExtensionVendor = new Text(grpExtensionDetails, SWT.BORDER);
		textExtensionVendor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(textExtensionVendor, true, true);
		
		Label lblNewLabel = new Label(grpExtensionDetails, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Components:");
		
		Hyperlink hprlnkSeeAllComponents = managedForm.getToolkit().createHyperlink(grpExtensionDetails, "See All Components", SWT.NONE);
		managedForm.getToolkit().paintBordersFor(hprlnkSeeAllComponents);
		
		Composite composite_1 = new Composite(grpExtensionDetails, SWT.NONE);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		composite_1.setLayout(gl_composite_1);
		GridData composite_1_grid_data = new GridData(GridData.FILL_HORIZONTAL);
		composite_1_grid_data.horizontalSpan = 2;
		composite_1.setLayoutData(composite_1_grid_data);
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		
		ExpandableComposite xpndblcmpstEulaLicenseText = managedForm.getToolkit().createExpandableComposite(composite_1, ExpandableComposite.EXPANDED);
		xpndblcmpstEulaLicenseText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		managedForm.getToolkit().paintBordersFor(xpndblcmpstEulaLicenseText);
		xpndblcmpstEulaLicenseText.setText("Eula License Text:");
		licenseText = new StyledText(xpndblcmpstEulaLicenseText, SWT.WRAP | SWT.V_SCROLL);
		licenseText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		xpndblcmpstEulaLicenseText.setClient(licenseText);		
		new Label(frmExtensions.getBody(), SWT.NONE);
		new Label(frmExtensions.getBody(), SWT.NONE);
		new Label(frmExtensions.getBody(), SWT.NONE);
		new Label(frmExtensions.getBody(), SWT.NONE);
		listViewerExtensions.setContentProvider(new ExtensionsContentProvider());
		
		DirtyListenerImpl dirtyListener = new DirtyListenerImpl();
		DirtyUtils.registryDirty(dirtyListener, textExtensionTitle, textExtensionVendor,
												textExtensionVersion, licenseText, listExtensions);
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
				String projectName = textProjectName.getText();
				
				if(_package == null) {
//					_package = new ExtensionCollection();
//					_package.clear();					
				}				
				
				String projectLocation = textProjectLocation.getText();
				String projectModificationDate = textProjectModificationDate.getText();
				
				String extensionsId = textExtensionId.getText();
				String extensionTitle = textExtensionTitle.getText();
				String extensionVendor = textExtensionVendor.getText();
				String extensionVersion = textExtensionVersion.getText();
				String extensionEula = licenseText.getText();
				
				int selectionIndex = listExtensions.getSelectionIndex();
				if(selectionIndex >= 0) {
//					Extension selectedExtension = ((ExtensionNode)_package.getExtensions().get(selectionIndex)).getExtension();
//					if(selectedExtension.getId().equals(extensionsId)) {
//						selectedExtension.setTitle(extensionTitle);
//						selectedExtension.setVendor(extensionVendor);
//						selectedExtension.setVersion(extensionVersion);
//						selectedExtension.setEula(extensionEula);
//					}
				}
//				this.setInput(new ExtensionEditorInput(_package));
				this.setDirty(false);
				this.firePropertyChange(Editor.EDITOR_DATA_CHANGED);
			
		}catch(Exception e) {
			MessageDialog.openError(this.getSite().getShell(), 
					"Error", "Error while saving extension: " + e.getMessage());
		}
	}
	
//	protected DataBindingContext initDataBindings() {
//		DataBindingContext bindingContext = new DataBindingContext();
//		//
//		IObservableValue observeTextTextProjectNameObserveWidget = WidgetProperties.text(SWT.NONE).observe(textProjectName);
//		IObservableValue name_projectObserveValue = PojoProperties.value("name").observe(_package);
//		bindingContext.bindValue(observeTextTextProjectNameObserveWidget, name_projectObserveValue, null, null);
//		//
//		IObservableValue observeTextTextProjectLocationObserveWidget = WidgetProperties.text(SWT.Modify).observe(textProjectLocation);
//		IObservableValue version_packageObserveValue = PojoProperties.value("version").observe(_package);
//		bindingContext.bindValue(observeTextTextProjectLocationObserveWidget, version_packageObserveValue, null, null);
//		//
//		IObservableValue observeTextTextPackageURLObserveWidget = WidgetProperties.text(SWT.Modify).observe(textProjectModificationDate);
//		IObservableValue url_packageObserveValue = PojoProperties.value("url").observe(_package);
//		bindingContext.bindValue(observeTextTextPackageURLObserveWidget, url_packageObserveValue, null, null);
//		//
//		IObservableList itemsListExtensionsObserveWidget = WidgetProperties.items().observe(listExtensions);
//		IObservableList extensions_packageObserveList = PojoProperties.list("extensions").observe(_package);
//		bindingContext.bindList(itemsListExtensionsObserveWidget, extensions_packageObserveList, null, null);
//		//
//		return bindingContext;
//	}

	@Override
	protected void createPartControl2(Composite composite) {		
		this.createFormContent(this.getManagedForm());		
	}

	@Override
	protected Control[] registryDirtyControls() {
		return new Control[] {textProjectName, textProjectLocation, textProjectModificationDate,
			 	textExtensionId, textExtensionTitle, textExtensionVendor,
				textExtensionVersion, licenseText, listExtensions};
	}
	
	@Override
	public void showData() {
		ExtensionEditorInput ip = (ExtensionEditorInput)this.getEditorInput();
//		_package = ip.getExtensions();
//		
//		textProjectName.setText(_package.getProject().getName());
//		textProjectLocation.setText(_package.getProject().getLocation().toString());
//		textProjectModificationDate.setText(new Date(_package.getProject().getModificationStamp()).toLocaleString());
//		
//		Extension ext = (Extension)_package.getExtensions().get(0);
//		textExtensionId.setText(ext.getId());
//		textExtensionTitle.setText(ext.getTitle());
//		textExtensionVendor.setText(ext.getVendor());
//		textExtensionVersion.setText(ext.getVersion());
//		licenseText.setText(ext.getEula());
		
		this.setDirty(false);
	}
	
	public String getExtensionInfo() {
		ExtensionEditorInput ip = (ExtensionEditorInput)this.getEditorInput();
//		ExtensionCollection pkg = ip.getExtensions();
		
//		if(pkg == null)
//			return "";
//		
//		String info = pkg.getProjectName() + " - " + pkg.getExtensions().size() + " (Extensions)";
//		return info;
		return "";
	}
}







