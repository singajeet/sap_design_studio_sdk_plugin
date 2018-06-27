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

import com.armin.sap.ds.builder.navigator.tree.ExtensionNode;
import com.armin.sap.ds.builder.navigator.tree.IProjectItemNode;
import com.armin.sap.ds.builder.project.models.Extension;
import com.armin.sap.ds.builder.project.models.IModel;
import com.armin.sap.ds.builder.wizard.IWizardDetailsPage;


public class GroupCreationPage extends WizardNewFileCreationPage implements IWizardDetailsPage {

	Text _selectedExtension;
	Text _newGroupName;
	IStructuredSelection _selection;
	
	public GroupCreationPage(String pageName, IStructuredSelection selection) {
		super(pageName, selection);
		setTitle("Design Studio Group");
		setDescription("This wizard helps in creating new group to categorize SDK components");
		this._selection = selection;
	}
	
	public GroupCreationPage(IStructuredSelection selection) {
		super("New Design Studio Group", selection);
		setTitle("Design Studio Group");
		setDescription("This wizard helps in creating new group to categorize SDK components");
		this._selection = selection;
	}
	
	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Extension:");

		_selectedExtension = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		_selectedExtension.setLayoutData(gd);
		_selectedExtension.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				
			}
		});
		
		Label groupLabel = new Label(container, SWT.NULL);
		groupLabel.setText("Group Name: ");
		
		_newGroupName = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gdGroup = new GridData(GridData.FILL_HORIZONTAL);
		_newGroupName.setLayoutData(gdGroup);
		_newGroupName.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				
			}
		});
		
		initialize();
		setControl(container);
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
				_selectedExtension.setText(item.getModel().getId() + "(" + ((Extension)item.getModel()).getTitle() + ")");
				//containerText.setText(container.getFullPath().toString());
			}
		}
		
	}

		
	@Override
	public boolean validatePage() {
		return false;
	}

	@Override
	public IModel getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
