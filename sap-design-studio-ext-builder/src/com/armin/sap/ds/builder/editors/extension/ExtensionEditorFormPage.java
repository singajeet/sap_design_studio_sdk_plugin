package com.armin.sap.ds.builder.editors.extension;

import java.util.HashMap;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPartConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.ManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.ResourceManager;
import org.eclipse.wb.swt.SWTResourceManager;

import com.armin.sap.ds.builder.Activator;
import com.armin.sap.ds.builder.api.models.domain.Extension;
import com.armin.sap.ds.builder.api.models.domain.UI5Mode;
import com.armin.sap.ds.builder.editors.AbstractBaseEditorPart;
import com.armin.sap.ds.builder.service.IProjectService;
import com.armin.sap.ds.builder.service.ProjectService;
import com.armin.sap.ds.builder.ui.IRefreshForm;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ComponentNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.ExtensionNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.GroupNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.IProjectItemNode;
import com.armin.sap.ds.builder.ui.navigation.tree.nodes.InfoNode;

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
		
		private GroupNode groupNode;
		
		public TableComponentsContentProvider() {
			ResourcesPlugin.getWorkspace().addResourceChangeListener(this, IResourceChangeEvent.POST_CHANGE);
		}
		
		public Object[] getElements(Object inputElement) {
			if(inputElement != null && inputElement instanceof GroupNode) {
				groupNode = (GroupNode)inputElement;
			}
			if(groupNode != null) {
				return groupNode.getChildren(inputElement);
			}
			return new Object[] { new InfoNode("No components found!")};
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
		
		public GroupsListContentProvider() {}
//		public GroupsListContentProvider(ExtensionNode node) {
//			extensionNode = node;
//		}
		
		public Object[] getElements(Object inputElement) {
			if(inputElement != null && inputElement instanceof ExtensionNode) {
				extensionNode = (ExtensionNode)inputElement;
			}
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
	
	private static class TableColumnLabelProvider extends ColumnLabelProvider{

		private String _cellText = "";
		private HashMap<Object, Button> buttons = new HashMap<Object, Button>(); 
		
		/* (non-Javadoc)
		 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
		 */
		@Override
		public String getText(Object element) {
			// TODO Auto-generated method stub
			return _cellText;
		}

		@Override
		public void update(ViewerCell cell) {			
			
			ComponentNode componentNode = (ComponentNode)cell.getElement();
			
			switch(cell.getColumnIndex()) {
			case 0:
				_cellText = componentNode.getComponent().getId();
				break;
			case 1:
				_cellText = componentNode.getComponent().getTitle();
				break;
			case 2:
				_cellText = componentNode.getComponent().isDatabound() ? "Yes" : "No";
				break;
			case 3:
				_cellText = componentNode.getComponent().getHandlerType().toString();
				break;
			case 4:
				_cellText = "";
				for(UI5Mode mode : componentNode.getComponent().getModes()) {
					_cellText = _cellText + mode.toString() + ", ";
				}
				_cellText = _cellText.substring(0, _cellText.length() - 2);
				break;
			case 5:
				_cellText = componentNode.getComponent().isVisible() ? "Yes" : "No";
				break;
			case 6:
				TableItem item = (TableItem) cell.getItem();
				Button button;
				if(buttons.containsKey(cell.getElement())) {
					button = buttons.get(cell.getElement());
				} else {
					button = new Button((Composite)cell.getViewerRow().getControl(), SWT.NONE);
					button.setText("Edit");
					buttons.put(cell.getElement(), button);
				}
				TableEditor editor = new TableEditor(item.getParent());
				editor.grabHorizontal = true;
				editor.grabVertical = true;
				editor.setEditor(button, item, cell.getColumnIndex());
				editor.layout();
				_cellText = "";
				
				button.addSelectionListener(new SelectionListener() {

					@Override
					public void widgetSelected(SelectionEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void widgetDefaultSelected(SelectionEvent e) {
						// TODO Auto-generated method stub
						
					}
					
				});
				break;
			}
			cell.setText(_cellText);
			//super.update(cell);
		}
	}
	
	private static enum PROVIDERS{
		LIST_VIEWER,
		TABLE_VIEWER,
		BOTH
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
	private TableViewer _tableViewerComponents;
	private ListViewer _listViewer;
	private ColumnLabelProvider _cellLabelProvider;
	//private GroupNode _currentSelectedGroupNode;
	/**
	 * Create the form page.	
	 * @wbp.parser.constructor	 
	 */
	public ExtensionEditorFormPage() {
		super(ID, "Extension Editor");
		this.setPartName("Extension Editor");
		setIndex(0);
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
		setPartName("Extension Editor");
		setIndex(0);
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
		setPartName("Extension Editor");
		setIndex(0);
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
		//super.setInput(input);
		this._input = (ExtensionEditorInput)input;
		this._extensionNode = (ExtensionNode) this._input.getTreeNode();		
		setupProviders(PROVIDERS.BOTH);	
		firePropertyChange(IWorkbenchPartConstants.PROP_INPUT);
	}
	
	private void setupProviders(PROVIDERS provider) {
		if(this._extensionNode != null && !this._extensionNode.getGroups().isEmpty()) {
			
			if(_listViewer != null && (provider == PROVIDERS.LIST_VIEWER || provider == PROVIDERS.BOTH)) {
				this._listContentProvider = new GroupsListContentProvider();
				this._listLabelProvider = new GroupsListViewerLabelProvider();
				this._listViewer.setLabelProvider(_listLabelProvider);
				this._listViewer.setContentProvider(_listContentProvider);
				
				_listViewer.setInput(_extensionNode);
			}
			
			if(_tableViewerComponents != null && (provider == PROVIDERS.TABLE_VIEWER || provider == PROVIDERS.BOTH)) {
				this._tableContentProvider = new TableComponentsContentProvider();//(GroupNode)_extensionNode.getChildren(null)[0]);
				this._tableLabelProvider = new TableComponentsLabelProvider();
				
				this._cellLabelProvider = new TableColumnLabelProvider();
				_tableViewerComponents.setLabelProvider(_tableLabelProvider);
				_tableViewerComponents.setContentProvider(_tableContentProvider);
				
				_tableViewerComponents.setInput((GroupNode)_extensionNode.getChildren(null)[0]);
			}
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
		
		ExtensionEditorInput ip = this._input;
		_project = ip.getProject();
		
		ExtensionNode node = null;
		if(ip.getTreeNode() instanceof ExtensionNode) {
			node = (ExtensionNode)ip.getTreeNode();
			
			if(_extensionNode == null)
				_extensionNode = node;
		}
		
		if(node != null) {
			Extension ext = (Extension)(node.getExtension());			
			if(!_txtId.isDisposed()) _txtId.setText(ext.getId());
			if(!_txtTitle.isDisposed()) _txtTitle.setText(ext.getTitle());
			if(!_txtVendor.isDisposed()) _txtVendor.setText(ext.getVendor());
			if(!_txtVersion.isDisposed()) _txtVersion.setText(ext.getVersion());
			if(!_txtEula.isDisposed()) _txtEula.setText(ext.getEula());
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
		managedForm.getForm().getBody().setLayout(new GridLayout(1, false));
		managedForm.getForm().getBody().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));		
		
		Composite composite = new Composite(managedForm.getForm().getBody(), SWT.NONE);				
		
		managedForm.getToolkit().adapt(composite);
		managedForm.getToolkit().paintBordersFor(composite);
		composite.setLayout(new GridLayout(2, false));
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Group grpExtensionDetails = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpExtensionDetails.setLayout(new GridLayout(2, false));
		grpExtensionDetails.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
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

		
		ExpandBar expandBar = new ExpandBar(grpExtensionDetails, SWT.BORDER);
		expandBar.setForeground(SWTResourceManager.getColor(SWT.COLOR_LINK_FOREGROUND));
		expandBar.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		formToolkit.adapt(expandBar);
		formToolkit.paintBordersFor(expandBar);
		
		ExpandItem xpndtmNewExpanditem = new ExpandItem(expandBar, SWT.NONE);
		xpndtmNewExpanditem.setText("EULA");
		
		Composite composite_1 = new Composite(expandBar, SWT.BORDER);		
		formToolkit.adapt(composite_1);
		formToolkit.paintBordersFor(composite_1);
		composite_1.setLayout(new GridLayout(1, false));
		
		_txtEula = new Text(composite_1, SWT.V_SCROLL | SWT.MULTI);
		_txtEula.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.adapt(_txtEula, true, true);
		xpndtmNewExpanditem.setControl(composite_1);
		xpndtmNewExpanditem.setHeight(100);
		expandBar.requestLayout();
		
		Group grpGroups_1 = new Group(composite, SWT.BORDER | SWT.SHADOW_ETCHED_IN);
		grpGroups_1.setText("Groups");
		grpGroups_1.setLayout(new GridLayout(1, false));
		GridData gd_grpGroups_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_grpGroups_1.widthHint = 150;
		grpGroups_1.setLayoutData(gd_grpGroups_1);
		
		_listViewer = new ListViewer(grpGroups_1, SWT.BORDER | SWT.V_SCROLL);
		List listGroups = _listViewer.getList();
		listGroups.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		if(_listContentProvider == null) {
			setupProviders(PROVIDERS.LIST_VIEWER);
		}
		
		_listViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				if(event.getSelection() != null && !event.getSelection().isEmpty()) {
					IStructuredSelection selection = (IStructuredSelection)event.getSelection();
					
					if(selection.size() > 0) {
						GroupNode groupNode = (GroupNode)selection.getFirstElement();
						//_currentSelectedGroupNode = groupNode;
						_tableViewerComponents.setInput(groupNode);
						
					}
				}
			}
			
		});
		
		Group grpComponents = new Group(composite, SWT.NONE);
		grpComponents.setText("Component Details");
		grpComponents.setLayout(new GridLayout(1, false));
		grpComponents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));		
		
		ToolBar toolBar4Components = new ToolBar(grpComponents, SWT.NONE);		
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
		
		_tableViewerComponents = new TableViewer(composite_3, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION);
		_tableComponents = _tableViewerComponents.getTable();
		_tableComponents.setLinesVisible(true);
		_tableComponents.setHeaderVisible(true);
		_tableComponents.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		Activator.getDefault().registerViewer(_tableViewerComponents);
		
		formToolkit.paintBordersFor(_tableComponents);
		
		setupProviders(PROVIDERS.TABLE_VIEWER);
		
		//0
		TableViewerColumn tableViewerIDColumn = new TableViewerColumn(_tableViewerComponents, SWT.NONE);
		if(_cellLabelProvider != null)
			tableViewerIDColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnIDColumn = tableViewerIDColumn.getColumn();
		tblclmnIDColumn.setWidth(100);
		tblclmnIDColumn.setText("ID");
		//1
		TableViewerColumn tableViewerTitleColumn = new TableViewerColumn(_tableViewerComponents, SWT.NONE);
		if(_cellLabelProvider != null)
			tableViewerTitleColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnTitleColumn = tableViewerTitleColumn.getColumn();
		tblclmnTitleColumn.setMoveable(true);
		tblclmnTitleColumn.setWidth(100);
		tblclmnTitleColumn.setText("Title");
		//2
		TableViewerColumn tableViewerDataboundColumn = new TableViewerColumn(_tableViewerComponents, SWT.NONE);
		if(_cellLabelProvider != null)
			tableViewerDataboundColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnDataboundColumn = tableViewerDataboundColumn.getColumn();
		tblclmnDataboundColumn.setMoveable(true);
		tblclmnDataboundColumn.setWidth(100);
		tblclmnDataboundColumn.setText("Is Databound?");
		//3
		TableViewerColumn tableViewerHandlerTypeColumn = new TableViewerColumn(_tableViewerComponents, SWT.NONE);
		if(_cellLabelProvider != null)
			tableViewerHandlerTypeColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnHandlerTypeColumn = tableViewerHandlerTypeColumn.getColumn();
		tblclmnHandlerTypeColumn.setMoveable(true);
		tblclmnHandlerTypeColumn.setWidth(100);
		tblclmnHandlerTypeColumn.setText("Handler Type");
		//4
		TableViewerColumn tableViewerModesColumn = new TableViewerColumn(_tableViewerComponents, SWT.NONE);
		if(_cellLabelProvider != null)
			tableViewerModesColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnModesColumn = tableViewerModesColumn.getColumn();
		tblclmnModesColumn.setMoveable(true);
		tblclmnModesColumn.setWidth(100);
		tblclmnModesColumn.setText("Modes");
		//5
		TableViewerColumn tableViewerVisibleColumn = new TableViewerColumn(_tableViewerComponents, SWT.NONE);
		if(_cellLabelProvider != null)
			tableViewerVisibleColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnVisibleColumn = tableViewerVisibleColumn.getColumn();
		tblclmnVisibleColumn.setMoveable(true);
		tblclmnVisibleColumn.setWidth(100);
		tblclmnVisibleColumn.setText("Is Visible?");
		//6
		TableViewerColumn tableViewerActionColumn = new TableViewerColumn(_tableViewerComponents, SWT.PUSH);
		if(_cellLabelProvider != null)
			tableViewerActionColumn.setLabelProvider(_cellLabelProvider);
		TableColumn tblclmnActionColumn = tableViewerActionColumn.getColumn();
		tblclmnActionColumn.setMoveable(true);
		tblclmnActionColumn.setWidth(30);
		tblclmnActionColumn.setText("Action");
		
		if(!_extensionNode.getGroups().isEmpty()) {
			_tableViewerComponents.setInput((GroupNode)_extensionNode.getChildren(null)[0]);
			_listViewer.getList().select(0);
		}
		
		//register components for data refresh
		Activator.getDefault().registerViewer(_listViewer);
		Activator.getDefault().registerFormForRefresh(new IRefreshForm() {

			@Override
			public void refreshForm() {
				showData();				
			}
			
		});
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
