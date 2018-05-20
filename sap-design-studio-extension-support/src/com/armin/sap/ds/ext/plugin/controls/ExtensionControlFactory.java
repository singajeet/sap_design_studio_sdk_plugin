package com.armin.sap.ds.ext.plugin.controls;

import java.util.HashMap;
import java.util.Map;

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

import com.armin.sap.ds.data.shared.ISharedData;
import com.armin.sap.ds.wizard.pages.IWizardDetailsPage;
import com.armin.sap.ds.xml.Extension;

public class ExtensionControlFactory {

	private static ExtensionControlFactory _factory;
	Map<String, ExtensionControl> _controlMap;
		
	private ExtensionControlFactory() {
		_controlMap = new HashMap<String, ExtensionControl>();
	}	
	
	public static ExtensionControlFactory getInstance() {
		if(_factory == null)
			_factory = new ExtensionControlFactory();
		
		return _factory;
	}
	
	public void createControl(String key, Composite root, ISharedData data) {
		if(!_controlMap.containsKey(key)) {
			ExtensionControl ctrl = new ExtensionControl(root, data);
			ctrl.createControl();
			_controlMap.put(key, ctrl);		
		}
	}
	
	public void createControl(String key, Composite root, ISharedData data, IWizardDetailsPage page) {
		if(!_controlMap.containsKey(key)) {
			ExtensionControl ctrl = new ExtensionControl(root, data, page);
			ctrl.createControl();
			_controlMap.put(key, ctrl);		
		}
	}
	
	public void createControl(String key, Composite root, ISharedData data, boolean excludeEula, IWizardDetailsPage page) {
		if(!_controlMap.containsKey(key)) {
			ExtensionControl ctrl = new ExtensionControl(root, data, excludeEula, page);
			ctrl.createControl();
			_controlMap.put(key, ctrl);		
		}
	}
	
	public void createControl(String key, Composite root, ISharedData data, boolean excludeEula, Extension model, IWizardDetailsPage page) {
		if(!_controlMap.containsKey(key)) {
			ExtensionControl ctrl = new ExtensionControl(root, data, excludeEula, page);
			ctrl.setModel(model);
			ctrl.createControl();
			_controlMap.put(key, ctrl);		
		}
	}
	
	public boolean exists(String key) {
		return _controlMap.containsKey(key);
	}
	
	public ExtensionControl getControlObject(String key) {
		if(_controlMap.containsKey(key))
			return _controlMap.get(key);
		
		return null;
	}
	
	public void remove(String key) {
		if(_controlMap.containsKey(key)) {
			_controlMap.remove(key);
		}
	}
	
	public Extension getModel(String key) {
		if(_controlMap.containsKey(key)) {
			return _controlMap.get(key).getModel();
		}
		
		return null;
	}
	
	public void setModel(String key, Extension model) {
		if(_controlMap.containsKey(key)) {
			_controlMap.get(key).setModel(model);
		}
	}
	
	public boolean validateControl(String key) {
		if(_controlMap.containsKey(key)) {
			return _controlMap.get(key).validateControl();
		}
		
		return false;
	}
	
	public void addEULAControl(String key) {
		if(_controlMap.containsKey(key)) {
			_controlMap.get(key).addEULAControl();
		}
	}
	
	public void addEULAToComposite(String key, Composite parent) {
		if(_controlMap.containsKey(key)) {
			_controlMap.get(key).addEULAControl(parent);
		}
	}
	
	public class ExtensionControl{
		
		private Text txtId;
		private Text txtTitle;
		private Text txtVersion;
		private Text txtVendor;
		private Text txtEula;
		private boolean _excludeEula = false;
		private Extension _model;
		
		private Composite _parent;
		private Composite _container;
		private ISharedData _data;
		private IWizardDetailsPage _page;
		
		public ExtensionControl(Composite root, ISharedData data, boolean excludeEula) {			
			this(root, data);
			_excludeEula = excludeEula;
		}
		
		public ExtensionControl(Composite root, ISharedData data, boolean excludeEula, IWizardDetailsPage page) {			
			this(root, data, page);
			_excludeEula = excludeEula;
		}
		
		public ExtensionControl(Composite root, ISharedData data, IWizardDetailsPage page) {	
			_parent = root;
			_data = data;
			_page = page;
		}
		
		public ExtensionControl(Composite root, ISharedData data) {	
			_parent = root;
			_data = data;
		}
			
		public void createControl() {
			if(_model == null)
				_model = new Extension();
			
			_container = new Composite(_parent, SWT.NONE);
			_container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));;
			GridLayout layout = new GridLayout(2, false);
			_container.setLayout(layout);
			
			//--- First Row
			Label lblId = new Label(_container, SWT.NONE);
			lblId.setText("Extension Id:");
			txtId = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
			txtId.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			txtId.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					_model.setId(txtId.getText());
					_data.setData("packageName", txtId.getText());	
					if(_page != null)
						_page.setPageComplete(validateControl());
				}
			});
			//--- Second Row
			Label lblTitle = new Label(_container, SWT.NONE);
			lblTitle.setText("Extension Title:");
			txtTitle = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
			txtTitle.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			txtTitle.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					_model.setTitle(txtTitle.getText());
					if(_page != null)
						_page.setPageComplete(validateControl());
				}
			});
			//--- Third Row
			Label lblVersion = new Label(_container, SWT.NONE);
			lblVersion.setText("Version:");
			txtVersion = new Text(_container, SWT.SINGLE | SWT.BORDER | SWT.FILL);
			txtVersion.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			txtVersion.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					_model.setVersion(txtVersion.getText());
					if(_page != null)
						_page.setPageComplete(validateControl());
				}
			});
			txtVersion.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {					
					String inputText = txtVersion.getText();
					boolean isNumeric = inputText.matches("-?\\d+(\\.\\d{1})?");
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
					if(_page != null)
						_page.setPageComplete(validateControl());
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
			txtVendor.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			txtVendor.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					_model.setVendor(txtVendor.getText());
					if(_page != null)
						_page.setPageComplete(validateControl());
				}
			});
			
			if(!_excludeEula) {
				createEULAControl(_container);
			}
		}
		
		public void addEULAControl() {
			createEULAControl(_container);
		}
		
		public void addEULAControl(Composite parent) {
			createEULAControl(parent);
		}
		
		private void createEULAControl(Composite container) {
			//--- Separator
			Label lineSeparator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
			GridData lineSeparatorGridData1 = new GridData(GridData.FILL_HORIZONTAL);
			lineSeparatorGridData1.horizontalSpan = 2;
			lineSeparator1.setLayoutData(lineSeparatorGridData1);
			//--- Fifth Row
			Label lblEula = new Label(container, SWT.NONE);
			lblEula.setText("EULA (End User License Agreement):");
			GridData gridDataEulaLabel = new GridData(GridData.FILL_HORIZONTAL);
			gridDataEulaLabel.horizontalSpan = 2;
			lblEula.setLayoutData(gridDataEulaLabel);
			txtEula = new Text(container, SWT.MULTI | SWT.BORDER | SWT.WRAP);
			GridData gridDataEulaText = new GridData();
			gridDataEulaText.horizontalSpan = 2;
			gridDataEulaText.horizontalAlignment = SWT.FILL;
			gridDataEulaText.grabExcessHorizontalSpace = true;
			gridDataEulaText.verticalAlignment = SWT.FILL;
			gridDataEulaText.grabExcessVerticalSpace = true;
			txtEula.setLayoutData(gridDataEulaText);
			txtEula.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					_model.setEula(txtEula.getText());	
					if(_page != null)
						_page.setPageComplete(validateControl());
				}
			});
		}
		
		public Extension getModel() {
			return _model;
		}
		
		public void setModel(Extension model) {
			_model = model;
			txtId.setText(_model.getId());
			txtTitle.setText(_model.getTitle());
			txtVersion.setText(_model.getVersion());
			txtVendor.setText(_model.getVendor());
			txtEula.setText(_model.getEula());
		}
		
		public boolean validateControl() {
			return isNotNullOrEmpty(txtId) && isNotNullOrEmpty(txtTitle) 
					&& isNotNullOrEmpty(txtVersion);
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
	}

}
