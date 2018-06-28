package com.armin.sap.ds.builder.wizard.group;

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

import com.armin.sap.ds.builder.controls.GroupControl;
import com.armin.sap.ds.builder.controls.IGroupChangedListener;
import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.project.models.Group;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class GroupCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	private IStructuredSelection _selection;
	private GroupControl groupCtl;
	private Group _model;
	private ExtensionNode _parentExtensionTreeNode;
	
	public GroupCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle("Design Studio Group");
		setDescription("This wizard helps in creating new group to categorize SDK components");
		this._selection = selection;
		_model = new Group();
		setPageComplete(false);
	}
	
	public GroupCreationPage(IStructuredSelection selection) {
		super("New Design Studio Group", selection);
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
		groupCtl = new GroupControl(area, SWT.NONE, _model);
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
