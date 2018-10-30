package com.armin.sap.ds.builder.wizard.group;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import com.armin.sap.ds.builder.api.models.Group;
import com.armin.sap.ds.builder.api.models.IModel;
import com.armin.sap.ds.builder.controls.GroupFormControl;
import com.armin.sap.ds.builder.controls.IGroupChangedListener;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class GroupCreationPage extends WizardPage implements IWizardDetailsPage {

	private IStructuredSelection _selection;
	private GroupFormControl groupCtl;
	private Group _model;
	private ExtensionNode _parentExtensionTreeNode;
	
	public GroupCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName);
		setTitle("Design Studio Group");
		setDescription("This wizard helps in creating new group to categorize SDK components");
		this._selection = selection;
		_model = new Group();
		setPageComplete(false);
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public GroupCreationPage(IStructuredSelection selection) {
		super("New Design Studio Group");
		setTitle("Design Studio Group");
		setDescription("This wizard helps in creating new group to categorize SDK components");
		this._selection = selection;
		_model = new Group();
		setPageComplete(false);
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite topLevel = new Composite(parent, SWT.NONE);
		topLevel.setLayout(new GridLayout());
		topLevel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
				| GridData.HORIZONTAL_ALIGN_FILL));
		topLevel.setFont(parent.getFont());
		
		setErrorMessage(null);
		setMessage(null);
		setControl(topLevel);
		createCompositeChildControls();
		initialize();	
	}
	
	private void createCompositeChildControls() {
		Composite area = (Composite)this.getControl();
		groupCtl = new GroupFormControl(area, SWT.NONE, _model);
		groupCtl.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		groupCtl.addGroupChangedListener(new IGroupChangedListener() {
			
			@Override
			public void OnGroupChanged(boolean isValid) {
				setPageComplete(isValid);
			}
		});
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (_selection != null && _selection.isEmpty() == false
				&& _selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) _selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof ExtensionNode) {
				IProjectItemNode item = (ExtensionNode)obj;
				_parentExtensionTreeNode = (ExtensionNode)obj;
				groupCtl.setExtensionId(item.getModel().getId());
			}
		}
		
	}

	public ExtensionNode getParentExtensionTreeNode() {
		return _parentExtensionTreeNode;
	}
		
	@Override
	public boolean validatePage() {
		return groupCtl.validateControl();
	}

	@Override
	public IModel getModel() {
		return _model;
	}

}
