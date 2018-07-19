package com.armin.sap.ds.builder.controls;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.armin.sap.ds.builder.api.models.Extension;
import com.armin.sap.ds.builder.shared.ISharedData;

public class ExtensionControl extends Composite {

	private Extension _model;
	
	private Text txtId;
	private Text txtTitle;
	private Text txtVersion;
	private Text txtVendor;
	private Text txtEula;		
	
	private ISharedData _sharedData;
	
	private Composite _container;
	private List<IExtensionChangedListener> _listeners;
	
	public ExtensionControl(Composite parent, int style) {
		super(parent, style);
		_model = new Extension();
		_listeners = new ArrayList<IExtensionChangedListener>();
		this.createControl();
	}

	public ExtensionControl(Composite parent, int style, Extension model) {
		super(parent, style);
		_model = model;
		_listeners = new ArrayList<IExtensionChangedListener>();
		this.createControl();
	}
	
	public void setSharedData(ISharedData data) {
		this._sharedData = data;
	}
	
	/**
	 * @return the txtId
	 */
	public String getExtensionId() {
		return txtId.getText();
	}

	/**
	 * @param txtId the txtId to set
	 */
	public void setExtensionId(String txtId) {
		this.txtId.setText(txtId);
		if(_sharedData != null) {
			_sharedData.setData("packageName", txtId);
		}
	}

	/**
	 * @return the txtTitle
	 */
	public String getExtensionTitle() {
		return txtTitle.getText();
	}

	/**
	 * @param txtTitle the txtTitle to set
	 */
	public void setExtensionTitle(String txtTitle) {
		this.txtTitle.setText(txtTitle);
	}

	/**
	 * @return the txtVersion
	 */
	public String getExtensionVersion() {
		return txtVersion.getText();
	}

	/**
	 * @param txtVersion the txtVersion to set
	 */
	public void setExtensionVersion(String txtVersion) {
		this.txtVersion.setText(txtVersion);
	}

	/**
	 * @return the txtVendor
	 */
	public String getExtensionVendor() {
		return txtVendor.getText();
	}

	/**
	 * @param txtVendor the txtVendor to set
	 */
	public void setExtensionVendor(String txtVendor) {
		this.txtVendor.setText(txtVendor);
	}

	/**
	 * @return the txtEula
	 */
	public String getExtensionEula() {
		return txtEula.getText();
	}

	/**
	 * @param txtEula the txtEula to set
	 */
	public void setExtensionEula(String txtEula) {
		this.txtEula.setText(txtEula);
	}

	public void createControl() {
		_container = new Composite(this.getParent(), SWT.NONE);
		_container.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));;
		GridLayout layout = new GridLayout(2, false);
		_container.setLayout(layout);
		
		//--- First Row
		Label lblId = new Label(_container, SWT.NONE);
		lblId.setText("Extension Id:");
		txtId = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtId.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				_model.setId(txtId.getText());
				validateControl();
				if(_sharedData != null) {
					_sharedData.setData("packageName", txtId.getText());
				}
			}
		});
		txtId.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				//Insert validation logic here
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//--- Second Row
		Label lblTitle = new Label(_container, SWT.NONE);
		lblTitle.setText("Extension Title:");
		txtTitle = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtTitle.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtTitle.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				_model.setTitle(txtTitle.getText());
				validateControl();
			}
		});
		//--- Third Row
		Label lblVersion = new Label(_container, SWT.NONE);
		lblVersion.setText("Version:");
		txtVersion = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtVersion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtVersion.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				_model.setVersion(txtVersion.getText());
				validateControl();
			}
		});
		txtVersion.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {					
				String inputText = txtVersion.getText();
				boolean isNumeric = inputText.matches("\\d+(\\.\\d{1})?");
				if(!isNumeric) {
					MessageDialog.open(MessageDialog.ERROR, null, "Invalid Number", "Input should be in form 'xx.x' or 'xx' where x is a digit", SWT.SHEET);
					txtVersion.setText("");
					txtVersion.setFocus();
					return;
				}
				if(!inputText.contains(".")) {
					txtVersion.setText(inputText + ".0");
					_model.setVersion(txtVersion.getText());
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		//--- Fourth Row
		Label lblVendor = new Label(_container, SWT.NONE);
		lblVendor.setText("Vendor Name:");
		txtVendor = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
		txtVendor.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		txtVendor.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				_model.setVendor(txtVendor.getText());				
			}
		});
		
		createEULAControl(_container);
		
	}
	
	private void createEULAControl(Composite container) {
		//--- Separator
		Label lineSeparator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData lineSeparatorGridData1 = new GridData(SWT.FILL, SWT.CENTER, true, false);
		lineSeparatorGridData1.horizontalSpan = 2;
		lineSeparator1.setLayoutData(lineSeparatorGridData1);
		//--- Fifth Row
		Label lblEula = new Label(container, SWT.NONE);
		lblEula.setText("EULA (End User License Agreement):");
		GridData gridDataEulaLabel = new GridData(SWT.FILL, SWT.TOP, true, false);		
		gridDataEulaLabel.horizontalSpan = 2;
		lblEula.setLayoutData(gridDataEulaLabel);
		txtEula = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP);
		GridData gridDataEulaText = new GridData();
		gridDataEulaText.minimumHeight = 50;
		gridDataEulaText.horizontalSpan = 2;
		gridDataEulaText.horizontalAlignment = SWT.FILL;
		gridDataEulaText.grabExcessHorizontalSpace = true;
		gridDataEulaText.verticalAlignment = SWT.FILL;
		gridDataEulaText.grabExcessVerticalSpace = true;
		txtEula.setLayoutData(gridDataEulaText);
		txtEula.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				_model.setEula(txtEula.getText());				
			}
		});
	}
	
	public Extension getModel() {
		return _model;
	}
	
	public void setModel(Extension model) {
		_model = model;
	}
	
	public void addExtensionChangedListener(IExtensionChangedListener listener) {
		if(listener != null)
			_listeners.add(listener);
	}
	
	private void notifyAllListeners(boolean isValid) {
		for(IExtensionChangedListener listener : _listeners) {
			listener.OnExtensionChanged(isValid);
		}
	}
	
	public boolean validateControl() {
		boolean isValid = isNotNullOrEmpty(txtId) && isNotNullOrEmpty(txtTitle) 
				&& isNotNullOrEmpty(txtVersion);
		notifyAllListeners(isValid);
		return isValid;
	}
	
	private boolean isNotNullOrEmpty(Control control) {
		if(control == null)
			return false;
		
		if(control instanceof Text) {
			return !((Text)control).getText().isEmpty();
		}
		
		if(control instanceof Combo) {
			int index = ((Combo)control).getSelectionIndex();
			if(index < 0)
				return false;
			String item = ((Combo)control).getItem(index);
			if(item == null)
				return false;
			if(item.isEmpty())
				return false;
		}
		
		if(control instanceof Button) {			
			Button btn = (Button)control;
			
			if(btn.getStyle() == SWT.CHECK || btn.getStyle() == SWT.RADIO) {
				return !btn.getSelection();
			}			
		}
		
		return true;
	}
	public Composite get_container() {
		return _container;
	}
}
