package com.armin.sap.ds.builder.controls;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.builder.models.domain.Group;

public class GroupFormControl extends Composite {
	private Text txtExtensionId;
	private Text txtGroupId;
	private Text txtGroupName;
	private Group _model;
	private List<IGroupChangedListener> _listeners;
	
	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GroupFormControl(Composite parent, int style, Group model) {
		this(parent, style);
		_model = model;				
	}

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public GroupFormControl(Composite parent, int style) {
		super(parent, SWT.BORDER);
		
		_model = new Group();
		_listeners = new ArrayList<IGroupChangedListener>();
		
		GridLayout gridLayout = new GridLayout(2, false);
		gridLayout.marginBottom = 5;
		gridLayout.marginLeft = 5;
		gridLayout.marginRight = 5;
		gridLayout.marginTop = 5;
		setLayout(gridLayout);
		
		Label lblNewLabel = new Label(this, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Extension Id:");
		
		txtExtensionId = new Text(this, SWT.BORDER);
		txtExtensionId.setEditable(false);
		txtExtensionId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel_1 = new Label(this, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Group Id:");
		
		txtGroupId = new Text(this, SWT.BORDER);
		txtGroupId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtGroupId.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				if(_model != null) {
					_model.setId(txtGroupId.getText());
				}		
				validateControl();
			}
			
		});
		
		Label lblNewLabel_2 = new Label(this, SWT.NONE);
		lblNewLabel_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_2.setText("Group Name:");
		
		txtGroupName = new Text(this, SWT.BORDER);
		txtGroupName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtGroupName.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				if(_model != null) {
					_model.setName(txtGroupName.getText());
					_model.setTitle(txtGroupName.getText());
				}
				validateControl();
			}
			
		});
	}
	
	public void setModel(Group model) {
		this._model = model;
	}
	
	public Group getModel() {
		return this._model;
	}
	
	public void setExtensionId(String id) {
		this.txtExtensionId.setText(id);		
	}
	
	public String getExtensionId() {
		return this.txtExtensionId.getText();
	}
	
	public void setGroupId(String id) {
		this.txtGroupId.setText(id);
		if(this._model != null) {
			this._model.setId(id);
		}
	}
	
	public String getGroupId() {
		return this.txtGroupId.getText();
	}
	
	public void setGroupName(String name) {
		this.txtGroupName.setText(name);
		if(this._model != null) {
			this._model.setTitle(name);
			this._model.setName(name);
		}
	}
	
	public String getGroupName() {
		return this.txtGroupName.getText();
	}
	
	public boolean validateControl() {
		boolean isValid = !txtGroupName.getText().isEmpty() && !txtGroupId.getText().isEmpty();
		notifyAllListeners(isValid);
		return isValid;
	}
	
	public void addGroupChangedListener(IGroupChangedListener listener) {
		if(listener != null)
			_listeners.add(listener);
	}
	
	private void notifyAllListeners(boolean isValid) {
		for(IGroupChangedListener listener : _listeners) {
			listener.OnGroupChanged(isValid);
		}
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}
