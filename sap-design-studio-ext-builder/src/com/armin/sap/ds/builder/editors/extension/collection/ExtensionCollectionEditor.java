package com.armin.sap.ds.builder.editors.extension.collection;

import java.util.Date;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.ExpandableComposite;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.domain.Extension;
import com.armin.sap.ds.builder.commands.handlers.file.OpenExtensionHandler;
import com.armin.sap.ds.builder.editors.AbstractBaseEditorPart;
import com.armin.sap.ds.builder.editors.IReusableDSEditorPart;
import com.armin.sap.ds.builder.providers.ExtensionCollectionEditorContentProvider;
import com.armin.sap.ds.builder.providers.ExtensionCollectionEditorLabelProvider;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.ui.IRefreshForm;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionCollectionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;

public class ExtensionCollectionEditor extends AbstractBaseEditorPart implements IReusableDSEditorPart 
{
	public static final String ID = "com.armin.sap.ds.builder.editors.extension_collection_editor";
	
	private Text textProjectName;
	private Text textProjectLocation;
	private Text textProjectModificationDate;
	private Text textExtensionId;
	private Text textExtensionTitle;
	private Text textExtensionVersion;
	private Text textExtensionVendor;
	private StyledText licenseText;	
	
	private IProject _projectInput;
	private ExtensionCollectionEditorInput _input;
	private ExtensionCollectionNode _extensionCollection;
	private IProjectService _projectService;
	private Extension _currentSelectedExtension;
	private ExtensionNode _currentSelectedExtensionNode;
	private ListViewer extensionsList;
	private ExtensionCollectionEditorContentProvider _contentProvider;
	private ExtensionCollectionEditorLabelProvider _labelProvider;
	private IStructuredSelection _currentSelection;
	
	@Override
	public void setInput(IEditorInput input) {
		super.setInput(input);
		this._input = (ExtensionCollectionEditorInput)input;
		this._extensionCollection = (ExtensionCollectionNode) _input.getTreeNode();
				
		if(this._extensionCollection != null && this._extensionCollection.getExtensions().size() > 0) {
			
			if(extensionsList != null) {
				_contentProvider = new ExtensionCollectionEditorContentProvider(this._extensionCollection);			
				extensionsList.setContentProvider(_contentProvider);
			
				_labelProvider = new ExtensionCollectionEditorLabelProvider();
				extensionsList.setLabelProvider(_labelProvider);
							
				extensionsList.setInput(this._extensionCollection);
			}
		}
		
		firePropertyChange(IWorkbenchPartConstants.PROP_INPUT);
	}
	
	/**
	 * Create the form page.
	 * @wbp.parser.constructor
	 */
	public ExtensionCollectionEditor() {
		super(ID, "Extension Collection Editor");
		setTitleToolTip("Edit SAP Design Studio Extensions");		
		ImageDescriptor imageDesc = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/extension_28x28.png");
		setTitleImage(imageDesc.createImage());
		setPartName("SAP Design Studio Extensions");
		setActive(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}				
	}
	
	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public ExtensionCollectionEditor(String id, String title) {
		super(id, title);
		setTitleToolTip("Edit SAP Design Studio Extensions");		
		ImageDescriptor imageDesc = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/extension_28x28.png");
		setTitleImage(imageDesc.createImage());
		setPartName("SAP Design Studio Extensions");
		setActive(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}				
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 */
	public ExtensionCollectionEditor(FormEditor editor, String id, String title) {
		super(editor, "extension_editor_part", "");
		setTitleToolTip("Edit SAP Design Studio Extensions");		
		ImageDescriptor imageDesc = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/extension_28x28.png");
		setTitleImage(imageDesc.createImage());
		setPartName("SAP Design Studio Extensions");
		setActive(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}				
	}
	
	public void setProject(IProject project) {
		_projectInput = project;		
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
		Image imgForm = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/extension_16x16.png").createImage();
		frmExtensions.setImage(imgForm);
		frmExtensions.setMessage("");
		frmExtensions.setSeparatorVisible(true);
		frmExtensions.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		managedForm.getToolkit().paintBordersFor(frmExtensions);
		frmExtensions.setText("Extensions");
		frmExtensions.getBody().setLayout(new GridLayout(3, false));
		
		IToolBarManager formToolBar = frmExtensions.getToolBarManager();
		formToolBar.add(new Action() {

			
			/* (non-Javadoc)
			 * @see org.eclipse.jface.action.Action#getImageDescriptor()
			 */
			@Override
			public ImageDescriptor getImageDescriptor() {				
				return AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "images/openFolder_16x16.gif");
			}
			
			/* (non-Javadoc)
			 * @see org.eclipse.jface.action.Action#runWithEvent(org.eclipse.swt.widgets.Event)
			 */
			@Override
			public void runWithEvent(Event event) {				
				super.runWithEvent(event);
				IHandler openHandler = new OpenExtensionHandler(_currentSelectedExtensionNode);
				ExecutionEvent exEvent = new ExecutionEvent();				
				
				try {
					openHandler.execute(exEvent);
				} catch (ExecutionException e) {			
					e.printStackTrace();
				}
			}
			
		});
		
		CommandContributionItemParameter paramSave = new CommandContributionItemParameter(
																	this.getSite(), 
																	null, 
																	"org.eclipse.ui.file.save",
																	CommandContributionItem.STYLE_PUSH);
		IContributionItem contribSave = new CommandContributionItem(paramSave);
		
		formToolBar.add(contribSave);
		formToolBar.update(true);
		frmExtensions.updateToolBar();
		frmExtensions.getHead().setSize(frmExtensions.getHead().getSize().x, 200);
		
		
		Group groupExtensionsList = new Group(frmExtensions.getBody(), SWT.SHADOW_ETCHED_IN);
		groupExtensionsList.setText("Extensions:");
		groupExtensionsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		managedForm.getToolkit().adapt(groupExtensionsList);
		managedForm.getToolkit().paintBordersFor(groupExtensionsList);
		groupExtensionsList.setLayout(new GridLayout(1, false));
		
		extensionsList = new ListViewer(groupExtensionsList); 
		if(this._extensionCollection != null && this._extensionCollection.getExtensions().size() > 0) {
			_contentProvider = new ExtensionCollectionEditorContentProvider(this._extensionCollection);
			extensionsList.setContentProvider(_contentProvider);
			extensionsList.setInput(this._extensionCollection);
			_labelProvider = new ExtensionCollectionEditorLabelProvider();
			extensionsList.setLabelProvider(_labelProvider);
		}	
		
		extensionsList.getList().setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, true, 1, 1));
		extensionsList.addSelectionChangedListener(new ISelectionChangedListener() {


			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				
				if(_currentSelectedExtension != null && _currentSelectedExtensionNode != null) {
					updateExtensionFromUI();					
				}
				
				if(event.getSelection() != null && !event.getSelection().isEmpty()) {
					_currentSelection = (IStructuredSelection)event.getSelection();
					
					if(_currentSelection.size() > 0) {						
						ExtensionNode selectedExtensionNode = (ExtensionNode)_currentSelection.getFirstElement();
						
						if(selectedExtensionNode != null) {
							Extension selectedExtension = selectedExtensionNode.getExtension();
							textExtensionId.setText(selectedExtension.getId());
							textExtensionTitle.setText(selectedExtension.getTitle());
							textExtensionVendor.setText(selectedExtension.getVendor());
							textExtensionVersion.setText(selectedExtension.getVersion());
							licenseText.setText(selectedExtension.getEula());
							
							_currentSelectedExtension = selectedExtension;
							_currentSelectedExtensionNode = selectedExtensionNode;
						} else {
							MessageDialog.openWarning(Activator.getDefault().getWorkbench().getDisplay().getActiveShell(), "Extension details not found", 
																	"Unable to locate details of current selected extension in the list, "
																	+ "kindly close and reopen the extension editor");
						}
					}
				}
			
			}
			
		});
		
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
		textExtensionId.setBackground(new org.eclipse.swt.graphics.Color(Display.getDefault(), 168, 165, 165));
		textExtensionId.setEnabled(false);
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
		
		Composite composite_1 = new Composite(grpExtensionDetails, SWT.NONE);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		composite_1.setLayout(gl_composite_1);
		GridData composite_1_grid_data = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		composite_1_grid_data.horizontalSpan = 2;		
		composite_1.setLayoutData(composite_1_grid_data);
		managedForm.getToolkit().adapt(composite_1);
		managedForm.getToolkit().paintBordersFor(composite_1);
		
		ExpandableComposite xpndblcmpstEulaLicenseText = new ExpandableComposite(composite_1, SWT.BORDER ,ExpandableComposite.EXPANDED | ExpandableComposite.TWISTIE); //managedForm.getToolkit().createExpandableComposite(composite_1, ExpandableComposite.EXPANDED);
		GridData xpndLayoutData = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);		
		xpndLayoutData.minimumHeight = 85;		
		GridLayout eulaxpndblLayout = new GridLayout(1, false);
		
		xpndblcmpstEulaLicenseText.setLayout(eulaxpndblLayout);
		xpndblcmpstEulaLicenseText.setLayoutData(xpndLayoutData);
				
		managedForm.getToolkit().paintBordersFor(xpndblcmpstEulaLicenseText);
		xpndblcmpstEulaLicenseText.setText("Eula License");
		licenseText = new StyledText(xpndblcmpstEulaLicenseText, SWT.WRAP | SWT.V_SCROLL);
		GridData licenseLayoutData = new GridData(SWT.FILL, SWT.FILL, true, true);
		
		licenseLayoutData.minimumHeight = 80;
		licenseText.setLayout(new GridLayout(1, false));
		licenseText.setLayoutData(licenseLayoutData);
		
		xpndblcmpstEulaLicenseText.setClient(licenseText);		
		
		Activator.getDefault().registerViewer(extensionsList);
		Activator.getDefault().registerFormForRefresh(new IRefreshForm() {

			@Override
			public void refreshForm() {
				showData();
			}
			
		});

	}
	
	private void updateExtensionFromUI() {
		if(_currentSelectedExtension.getId().toUpperCase().equals(textExtensionId.getText().toUpperCase())){
			_currentSelectedExtension.setTitle(textExtensionTitle.getText());
			_currentSelectedExtension.setName(textExtensionId.getText() + "." + textExtensionTitle.getText());
			_currentSelectedExtension.setVersion(textExtensionVersion.getText());
			_currentSelectedExtension.setVendor(textExtensionVendor.getText());
			_currentSelectedExtension.setEula(licenseText.getText());
			
			_currentSelectedExtensionNode.setExtension(_currentSelectedExtension);						
	
		}
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		try {
				//textProjectName.getText();
				if(_currentSelectedExtensionNode != null && _currentSelectedExtension != null) {
					updateExtensionFromUI();
				
					_projectInput = _input.getProject();
					
					if(this._extensionCollection != null) {
						for(IProjectItemNode node : this._extensionCollection.getExtensions()) {
							
							Extension extension = ((ExtensionNode)node).getExtension();
							_projectService.updateExtension(extension, _projectInput);
						}
					}
					
					this.setDirty(false);
					Activator.getDefault().refreshViewers();
				}
			
		}catch(Exception e) {
			MessageDialog.openError(this.getSite().getShell(), 
					"Error", "Error while saving extension: " + e.getMessage());
		}
	}	

	@Override
	protected void createPartControl2(Composite composite) {
		IManagedForm  form = this.getManagedForm();
		if(form == null)
				form = new ManagedForm(composite);
		this.createFormContent(form);
	}

	@Override
	protected Control[] registryDirtyControls() {
		return new Control[] {textProjectName, textProjectLocation, textProjectModificationDate,
			 	textExtensionId, textExtensionTitle, textExtensionVendor,
				textExtensionVersion, licenseText};
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void showData() {
		ExtensionCollectionEditorInput ip = (ExtensionCollectionEditorInput)this.getEditorInput();
		_projectInput = ip.getProject();
		
		ExtensionCollectionNode nodes = null;
		if(ip.getTreeNode() instanceof ExtensionCollectionNode) {
			nodes = (ExtensionCollectionNode)ip.getTreeNode();
			
			if(_extensionCollection == null)
				_extensionCollection = nodes;
		}
			
		if (!textProjectName.isDisposed()) textProjectName.setText(_projectInput.getName());
		if (!textProjectLocation.isDisposed()) textProjectLocation.setText(_projectInput.getLocation().toString());
		if (!textProjectModificationDate.isDisposed()) textProjectModificationDate.setText(new Date(_projectInput.getModificationStamp()).toLocaleString());
		
		if(this._extensionCollection != null && this._extensionCollection.getExtensions().size() > 0) {
			if(_contentProvider == null) {
				_contentProvider = new ExtensionCollectionEditorContentProvider(this._extensionCollection);			
				if(!extensionsList.getList().isDisposed()) extensionsList.setContentProvider(_contentProvider);
			}
			
			if(_labelProvider == null) {
				_labelProvider = new ExtensionCollectionEditorLabelProvider();
				if(!extensionsList.getList().isDisposed()) extensionsList.setLabelProvider(_labelProvider);
			}
			
			if(extensionsList.getInput() == null)
				if(!extensionsList.getList().isDisposed()) extensionsList.setInput(this._extensionCollection);
			
		}
		
		if(nodes != null) {
			Extension ext = (Extension)(nodes.getExtensions().get(0).getModel());			
			if(!textExtensionId.isDisposed()) textExtensionId.setText(ext.getId());
			if(!textExtensionTitle.isDisposed()) textExtensionTitle.setText(ext.getTitle());
			if(!textExtensionVendor.isDisposed()) textExtensionVendor.setText(ext.getVendor());
			if(!textExtensionVersion.isDisposed()) textExtensionVersion.setText(ext.getVersion());
			if(!licenseText.isDisposed()) licenseText.setText(ext.getEula());
		}
		
		if(_currentSelection != null) {
			extensionsList.setSelection(_currentSelection);
		}
	}
	
	public String getExtensionInfo() {
		this.getEditorInput();
		List<IProjectItemNode> pkg = _extensionCollection.getExtensions();
		
		if(pkg == null)
			return "";
		
		String info = "Project: " + _projectInput.getName() + " [" + pkg.size() + " Extension(s)]";
		return info;		
	}
}