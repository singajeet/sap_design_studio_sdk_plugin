package com.armin.sap.ds.builder.diagrams.dialogs;

import java.util.HashMap;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import com.armin.sap.ds.builder.core.common.IDEConstants;
import com.armin.sap.ds.builder.models.extended.Constant;

public class NewConstantDialog extends TitleAreaDialog {
	private Text _textConstantName;
	private Text _textConstantValue;
	private Combo _comboConstantType;
	private Button btnRadioQualifierPrivate;
	private Button btnRadioQualifierPublic;
	private Button buttonCheckIsArray; 

	private HashMap<String, String> _inputMap;
	private Constant _existingConstant;
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public NewConstantDialog(Shell parentShell, Constant existingConstant, HashMap<String, String> inputMap) {
		super(parentShell);
		_inputMap = inputMap;
		_existingConstant = existingConstant;
		
		if(existingConstant != null) {
			updateFieldsFromConstant();
		}
	}

	private void updateFieldsFromConstant() {
		if(_textConstantName != null) {
			_textConstantName.setText(_existingConstant.getName());
		}
		
		if(_textConstantValue != null) {
			_textConstantValue.setText(_existingConstant.getValue());
		}
		
		if(_comboConstantType != null) {
			int index = _comboConstantType.indexOf(_existingConstant.getType());
			_comboConstantType.select(index);
		}
		
		if(_existingConstant.getQualifier().equalsIgnoreCase(IDEConstants.PUBLIC))
			btnRadioQualifierPublic.setSelection(true);
		if(_existingConstant.getQualifier().equalsIgnoreCase(IDEConstants.PRIVATE))
			btnRadioQualifierPrivate.setSelection(true);
		if(_existingConstant.isIsArray())
			buttonCheckIsArray.setSelection(true);
		else
			buttonCheckIsArray.setSelection(false);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitleImage(SWTResourceManager.getImage("/home/armin/eclipse-workspace/sap-design-studio-ext-builder/images/constant_64x64.png"));
		setTitle("New Constant");
		setMessage("Define a Constant");
		Composite area = (Composite) super.createDialogArea(parent);
		area.setLayout(new GridLayout(1, false));
		Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(2, false));
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Name:");
		
		_textConstantName = new Text(container, SWT.BORDER);
		_textConstantName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		_textConstantName.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				updateOkButtonState();
			}
		});
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setText("Data Type:");
		
		_comboConstantType = new Combo(container, SWT.NONE);
		_comboConstantType.setItems(new String[] {"String", "Int", "Float", "Long", "Double", "Char", "Boolean", "Object"});
		_comboConstantType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		_comboConstantType.select(0);
		
		Label lblNewLabel_2 = new Label(container, SWT.NONE);
		lblNewLabel_2.setText("Value:");
		
		_textConstantValue = new Text(container, SWT.BORDER);
		_textConstantValue.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		_textConstantValue.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				updateOkButtonState();
			}
		});
		
		Label lblNewLabel_3 = new Label(container, SWT.NONE);
		lblNewLabel_3.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false, 1, 1));
		lblNewLabel_3.setText("Qualifier");
		
		Composite composite = new Composite(container, SWT.BORDER);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));
		
		btnRadioQualifierPrivate = new Button(composite, SWT.RADIO);
		btnRadioQualifierPrivate.setText("Private");
		
		btnRadioQualifierPublic = new Button(composite, SWT.RADIO);
		btnRadioQualifierPublic.setSelection(true);
		btnRadioQualifierPublic.setText("Public");
		new Label(container, SWT.NONE);
		
		buttonCheckIsArray = new Button(container, SWT.CHECK);
		buttonCheckIsArray.setText("Is Array?");
		

		return area;
	}

	
	
	protected void updateOkButtonState() {
		if(!_textConstantName.getText().isEmpty() && !_textConstantValue.getText().isEmpty()) {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		} else {
			getButton(IDialogConstants.OK_ID).setEnabled(false);
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		// TODO Auto-generated method stub
		updateInputMap();
		super.okPressed();
	}
	
	private void updateInputMap() {
		this._inputMap.clear();
		
		this._inputMap.put(IDEConstants.NAME, _textConstantName.getText());
		this._inputMap.put(IDEConstants.TYPE, _comboConstantType.getItem(_comboConstantType.getSelectionIndex()));
		this._inputMap.put(IDEConstants.VALUE, _textConstantValue.getText());
		if(btnRadioQualifierPrivate.getSelection())
			this._inputMap.put(IDEConstants.QUALIFIER, IDEConstants.PRIVATE);
		else if(btnRadioQualifierPublic.getSelection())
			this._inputMap.put(IDEConstants.QUALIFIER, IDEConstants.PUBLIC);
		
		if(buttonCheckIsArray.getSelection())
			this._inputMap.put(IDEConstants.IS_ARRAY, IDEConstants.TRUE);
		else
			this._inputMap.put(IDEConstants.IS_ARRAY, IDEConstants.FALSE);
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 336);
	}
}
