package com.armin.sap.ds.builder.extension.editor;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.CoolBar;
import org.eclipse.swt.widgets.CoolItem;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.editors.AbstractBaseEditorPart;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.GroupNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;

public class ExtensionEditorFormPage extends AbstractBaseEditorPart {
	private class TableComponentsLabelProvider extends LabelProvider implements ITableLabelProvider {
		public Image getColumnImage(Object element, int columnIndex) {
			Image image = null;
			 
	        if (IProjectItemNode.class.isInstance(element)) {
	            image = ((IProjectItemNode)element).getImage();
	        }
			return image;
		}
		public String getColumnText(Object element, int columnIndex) {
			String text = "";
	        if (IProjectItemNode.class.isInstance(element)) {
	            text = ((IProjectItemNode)element).getName();
	        }

			return text;
		}
	}
	private static class TableComponentsContentProvider implements IStructuredContentProvider, IResourceChangeListener {
		
		private ExtensionNode extensionNode;
//		private Viewer _viewer;
		
//		public TableComponentsContentProvider() {
//			ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
//		}
		
		public TableComponentsContentProvider(ExtensionNode node) {
			extensionNode = node;
			ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
		}
		
		public Object[] getElements(Object inputElement) {
			ArrayList<Object> childs = new ArrayList<Object>();
			if(extensionNode != null) {
				for(Object groupObject : extensionNode.getChildren(inputElement)) {
					GroupNode group = (GroupNode)groupObject;
					Object[] components = group.getChildren(inputElement);
					for(Object comp : components) {
						childs.add(comp);
					}
				}
				return childs.toArray();
			}
			return new Object[0];
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			IStructuredContentProvider.super.inputChanged(viewer, oldInput, newInput);
//			_viewer = viewer;
		}

		@Override
		public void resourceChanged(IResourceChangeEvent event) {
		}
	}	
	
	private static class GroupsListViewerLabelProvider extends LabelProvider {
		public Image getImage(Object element) {
			Image image = null;
			 
	        if (IProjectItemNode.class.isInstance(element)) {
	            image = ((IProjectItemNode)element).getImage();
	        }
			return image;
		}
		public String getText(Object element) {
			String text = "";
	        if (IProjectItemNode.class.isInstance(element)) {
	            text = ((IProjectItemNode)element).getName();
	        }
	 
	        return text;
		}
	}
	private static class GroupsListContentProvider implements IStructuredContentProvider {
		private ExtensionNode extensionNode;
		
//		public GroupsListContentProvider() {}
		public GroupsListContentProvider(ExtensionNode node) {
			extensionNode = node;
		}
		
		public Object[] getElements(Object inputElement) {
			if(extensionNode != null) {
				return extensionNode.getChildren(inputElement);
			}
			return null;
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	public static final String ID = "com.armin.sap.ds.builder.editors.extension_editor_form_page";
	private Text _txtId;
	private Text _txtTitle;
	private Text _txtVersion;
	private Text _txtVendor;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	private Text _txtEula;
	private Table _tableComponents;
	private ExtensionNode _extensionNode;
	private ExtensionEditorInput _input;
	private TableComponentsContentProvider _tableContentProvider;
	private TableComponentsLabelProvider _tableLabelProvider;
	private GroupsListContentProvider _listContentProvider;
	private GroupsListViewerLabelProvider _listLabelProvider;
	private IProjectService _projectService;
	private IProject _project;
	
	/**
	 * Create the form page.	
	 * @wbp.parser.constructor	 
	 */
	public ExtensionEditorFormPage() {
		super(ID, "Extension Editor");
		setPartName("SAP Design Studio Extension");
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
	public ExtensionEditorFormPage(String id, String title) {
		super(id, title);
		setPartName("SAP Design Studio Extension");
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
	 * @param title''	 
	 */
	public ExtensionEditorFormPage(FormEditor editor, String id, String title) {
		super(editor, id, title);
		setPartName("SAP Design Studio Extension");
		setActive(true);
		_projectService = (IProjectService) PlatformUI.getWorkbench().getService(IProjectService.class);
		if(_projectService == null) {
			_projectService = new ProjectService();
		}
	}

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
	 */
	@Override
	protected void setInput(IEditorInput input) {
		super.setInput(input);
		this._input = (ExtensionEditorInput)input;
		this._extensionNode = (ExtensionNode) this._input.getTreeNode();
		setupProviders();		
	}
	
	private void setupProviders() {
		if(this._extensionNode != null && this._extensionNode.getExtension() != null) {
			this._tableContentProvider = new TableComponentsContentProvider(_extensionNode);
			this._tableLabelProvider = new TableComponentsLabelProvider();
			this._listContentProvider = new GroupsListContentProvider(_extensionNode);
			this._listLabelProvider = new GroupsListViewerLabelProvider();
		}
	}

	private void updateExtensionModelFromUI() {
		if(this._extensionNode != null && this._extensionNode.getExtension() != null) {
			Extension model = this._extensionNode.getExtension();
			if(model.getId().toUpperCase().equals(_txtId.getText().toUpperCase())) {
				model.setTitle(_txtTitle.getText());
				model.setVendor(_txtVendor.getText());
				model.setVersion(_txtVersion.getText());
				model.setEula(_txtEula.getText());
			}
		}
	}
	
	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createPartControl2(Composite composite) {
		IManagedForm  form = this.getManagedForm();
		if(form == null)
				form = new ManagedForm(composite);
		this.createFormContent(form);
	}
	
	

	@Override
	public void showData() {
		ExtensionEditorInput ip = (ExtensionEditorInput)this.getEditorInput();
		_project = ip.getProject();
		
		ExtensionNode node = null;
		if(ip.getTreeNode() instanceof ExtensionNode) {
			node = (ExtensionNode)ip.getTreeNode();
			
			if(_extensionNode == null)
				_extensionNode = node;
		}
		
		if(node != null) {
			Extension ext = (Extension)(node.getExtension());			
			_txtId.setText(ext.getId());
			_txtTitle.setText(ext.getTitle());
			_txtVendor.setText(ext.getVendor());
			_txtVersion.setText(ext.getVersion());
			_txtEula.setText(ext.getEula());
		}
		
	}

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
		
		Group grpExtension = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpExtension.setText("Extension");
		grpExtension.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpExtension.setLayout(new GridLayout(2, false));
		
		Group grpExtensionDetails = new Group(grpExtension, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpExtensionDetails.setLayout(new GridLayout(2, false));
		grpExtensionDetails.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		grpExtensionDetails.setText("Extension Details");
		
		Label lblNewLabel = new Label(grpExtensionDetails, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("ID");
		
		_txtId = new Text(grpExtensionDetails, SWT.BORDER | SWT.READ_ONLY);
		_txtId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(grpExtensionDetails, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Title");
		
		_txtTitle = new Text(grpExtensionDetails, SWT.BORDER);
		_txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_2 = new Label(grpExtensionDetails, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("Version");
		
		_txtVersion = new Text(grpExtensionDetails, SWT.BORDER);
		_txtVersion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_3 = new Label(grpExtensionDetails, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_3.setText("Vendor");
		
		_txtVendor = new Text(grpExtensionDetails, SWT.BORDER);
		_txtVendor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Composite composite_2 = new Composite(grpExtensionDetails, SWT.NONE);
		composite_2.setLayout(new GridLayout(2, false));
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		formToolkit.adapt(composite_2);
		formToolkit.paintBordersFor(composite_2);
		
		ExpandBar expandBar = new ExpandBar(composite_2, SWT.BORDER);
		expandBar.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		formToolkit.adapt(expandBar);
		formToolkit.paintBordersFor(expandBar);
		
		ExpandItem xpndtmNewExpanditem = new ExpandItem(expandBar, SWT.NONE);
		xpndtmNewExpanditem.setText("EULA");
		
		Composite composite_1 = new Composite(expandBar, SWT.BORDER);
		xpndtmNewExpanditem.setControl(composite_1);
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(1, false));
		
		_txtEula = new Text(composite_1, SWT.V_SCROLL | SWT.MULTI);
		_txtEula.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(_txtEula, true, true);
		xpndtmNewExpanditem.setHeight(100);
		
		
		Group grpGroups_1 = new Group(grpExtension, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpGroups_1.setText("Groups");
		grpGroups_1.setLayout(new GridLayout(1, false));
		GridData gd_grpGroups_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_grpGroups_1.widthHint = 150;
		grpGroups_1.setLayoutData(gd_grpGroups_1);
		
		ListViewer listViewer = new ListViewer(grpGroups_1, SWT.BORDER | SWT.V_SCROLL);
		List listGroups = listViewer.getList();
		listGroups.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		if(_listContentProvider == null) {
			setupProviders();
		}
		
		listViewer.setLabelProvider(_listLabelProvider);
		listViewer.setContentProvider(_listContentProvider);
		
		Group grpComponents = new Group(grpExtension, SWT.NONE);
		grpComponents.setText("Component Details");
		grpComponents.setLayout(new GridLayout(1, false));
		grpComponents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		
		CoolBar coolBar = new CoolBar(grpComponents, SWT.BORDER | SWT.FLAT);
		coolBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolkit.adapt(coolBar);
		formToolkit.paintBordersFor(coolBar);
		
		CoolItem coolItem = new CoolItem(coolBar, SWT.NONE);
		
		ToolBar toolBar4Components = new ToolBar(coolBar, SWT.FLAT | SWT.RIGHT | SWT.SHADOW_OUT);
		coolItem.setControl(toolBar4Components);
		formToolkit.adapt(toolBar4Components);
		formToolkit.paintBordersFor(toolBar4Components);
		
		ToolItem tltmToolItemNewComponent = new ToolItem(toolBar4Components, SWT.NONE);
		tltmToolItemNewComponent.setToolTipText("New Component");
		tltmToolItemNewComponent.setImage(ResourceManager.getPluginImage("com.armin.sap.ds.builder", "images/new.png"));
		
		ToolItem tltmToolItemEditComponent = new ToolItem(toolBar4Components, SWT.NONE);
		tltmToolItemEditComponent.setToolTipText("Edit selected component");
		tltmToolItemEditComponent.setImage(ResourceManager.getPluginImage("com.armin.sap.ds.builder", "images/edit.png"));
		
		ToolItem tltmToolItemDeleteComponent = new ToolItem(toolBar4Components, SWT.NONE);
		tltmToolItemDeleteComponent.setToolTipText("Delete selected component");
		tltmToolItemDeleteComponent.setImage(ResourceManager.getPluginImage("com.armin.sap.ds.builder", "images/delete.gif"));
		
		Composite composite_3 = new Composite(grpComponents, SWT.NONE);
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(composite_3);
		formToolkit.paintBordersFor(composite_3);
		composite_3.setLayout(new GridLayout(1, false));
		
		TableViewer tableViewerComponents = new TableViewer(composite_3, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION);
		_tableComponents = tableViewerComponents.getTable();
		_tableComponents.setLinesVisible(true);
		_tableComponents.setHeaderVisible(true);
		_tableComponents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(_tableComponents);
		
		TableViewerColumn tableViewerIDColumn = new TableViewerColumn(tableViewerComponents, SWT.NONE);
		TableColumn tblclmnIDColumn = tableViewerIDColumn.getColumn();
		tblclmnIDColumn.setWidth(100);
		tblclmnIDColumn.setText("ID");
		
		TableViewerColumn tableViewerTitleColumn = new TableViewerColumn(tableViewerComponents, SWT.NONE);
		TableColumn tblclmnTitleColumn = tableViewerTitleColumn.getColumn();
		tblclmnTitleColumn.setMoveable(true);
		tblclmnTitleColumn.setWidth(100);
		tblclmnTitleColumn.setText("Title");
		
		TableViewerColumn tableViewerDataboundColumn = new TableViewerColumn(tableViewerComponents, SWT.NONE);
		TableColumn tblclmnDataboundColumn = tableViewerDataboundColumn.getColumn();
		tblclmnDataboundColumn.setMoveable(true);
		tblclmnDataboundColumn.setWidth(100);
		tblclmnDataboundColumn.setText("Is Databound?");
		
		TableViewerColumn tableViewerHandlerTypeColumn = new TableViewerColumn(tableViewerComponents, SWT.NONE);
		TableColumn tblclmnHandlerTypeColumn = tableViewerHandlerTypeColumn.getColumn();
		tblclmnHandlerTypeColumn.setMoveable(true);
		tblclmnHandlerTypeColumn.setWidth(100);
		tblclmnHandlerTypeColumn.setText("Handler Type");
		
		TableViewerColumn tableViewerModesColumn = new TableViewerColumn(tableViewerComponents, SWT.NONE);
		TableColumn tblclmnModesColumn = tableViewerModesColumn.getColumn();
		tblclmnModesColumn.setMoveable(true);
		tblclmnModesColumn.setWidth(100);
		tblclmnModesColumn.setText("Modes");
		
		TableViewerColumn tableViewerVisibleColumn = new TableViewerColumn(tableViewerComponents, SWT.NONE);
		TableColumn tblclmnVisibleColumn = tableViewerVisibleColumn.getColumn();
		tblclmnVisibleColumn.setMoveable(true);
		tblclmnVisibleColumn.setWidth(100);
		tblclmnVisibleColumn.setText("Is Visible?");
		tableViewerComponents.setLabelProvider(_tableLabelProvider);
		tableViewerComponents.setContentProvider(_tableContentProvider);	
		
	}

	
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {		
		super.doSave(monitor);
		try {
			_project = _input.getProject();
			
			if(this._extensionNode != null) {
					this.updateExtensionModelFromUI();
					Extension extension = ((ExtensionNode)this._extensionNode).getExtension();
					_projectService.updateExtension(extension, _project);				
			}
			
			this.setDirty(false);
		
		}catch(Exception e) {
			MessageDialog.openError(this.getSite().getShell(), 
					"Error", "Error while saving extension: " + e.getMessage());
		}
	}

	@Override
	protected Control[] registryDirtyControls() {
		
		return new Control[] {_txtTitle, _txtVendor,
				_txtVersion, _txtEula};
	}
}
