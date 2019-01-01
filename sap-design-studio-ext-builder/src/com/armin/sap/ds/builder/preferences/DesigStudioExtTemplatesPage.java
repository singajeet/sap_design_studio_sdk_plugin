package com.armin.sap.ds.builder.preferences;

import org.eclipse.core.runtime.Assert;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.armin.sap.ds.builder.Activator;

public class DesigStudioExtTemplatesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	private int validateStrategy = StringFieldEditor.VALIDATE_ON_KEY_STROKE;
	private int textLimit =StringFieldEditor.UNLIMITED;
	IPreferenceStore store;
	Text textField;
	
	public DesigStudioExtTemplatesPage() {
		super(GRID);
		store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);
		setDescription("SAP Design Studio Templates");
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors() {
		MultiTextFieldEditor jsTemplate = new MultiTextFieldEditor(
				Settings.FOR.JS_TEMPLATE_ID, 
				"JavaScript File Template:",
				getFieldEditorParent());
		
		addField(jsTemplate);		
		
		MultiTextFieldEditor cssTemplate = new MultiTextFieldEditor(
				Settings.FOR.CSS_TEMPLATE_ID, 
				"CSS File Template:",
				getFieldEditorParent());
		
		addField(cssTemplate);
		
		MultiTextFieldEditor ztlTemplate = new MultiTextFieldEditor(
				Settings.FOR.ZTL_TEMPLATE_ID, 
				"ZTL File Template:",
				getFieldEditorParent());
		
		addField(ztlTemplate);
		
	}

	public class MultiTextFieldEditor extends StringFieldEditor {
		
		public MultiTextFieldEditor() {
			// TODO Auto-generated constructor stub
		}
		
		public MultiTextFieldEditor(String name, String labelText, int width,
            int strategy, Composite parent) {
			super(name, labelText, width, strategy, parent);
		}
		
		public MultiTextFieldEditor(String name, String labelText, int width,
            Composite parent) {
			super(name, labelText, width, parent);
		}
		
		public MultiTextFieldEditor(String name, String labelText, Composite parent) {
			super(name, labelText, parent);
		}

		/* (non-Javadoc)
		 * @see org.eclipse.jface.preference.StringFieldEditor#getTextControl(org.eclipse.swt.widgets.Composite)
		 */
		@Override
		public Text getTextControl(Composite parent) {
			textField = super.getTextControl();
			if (textField == null) {
	            textField = new Text(parent, SWT.MULTI | SWT.BORDER);
	            Point currSize = textField.getSize();
	            textField.setSize(currSize.x, 150);
	            
	            textField.setFont(parent.getFont());
	            switch (validateStrategy) {
	            case VALIDATE_ON_KEY_STROKE:
	                textField.addKeyListener(new KeyAdapter() {

	                    @Override
						public void keyReleased(KeyEvent e) {
	                        valueChanged();
	                    }
	                });
	                textField.addFocusListener(new FocusAdapter() {
	                	// Ensure that the value is checked on focus loss in case we
	                	// missed a keyRelease or user hasn't released key.
	                	// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=214716
	                    @Override
						public void focusLost(FocusEvent e) {
	                        valueChanged();
	                    }
	                });


	                break;
	            case VALIDATE_ON_FOCUS_LOST:
	                textField.addKeyListener(new KeyAdapter() {
	                    @Override
						public void keyPressed(KeyEvent e) {
	                        clearErrorMessage();
	                    }
	                });
	                textField.addFocusListener(new FocusAdapter() {
	                    @Override
						public void focusGained(FocusEvent e) {
	                        refreshValidState();
	                    }

	                    @Override
						public void focusLost(FocusEvent e) {
	                        valueChanged();
	                    }
	                });
	                break;
	            default:
	                Assert.isTrue(false, "Unknown validate strategy");//$NON-NLS-1$
	            }
	            textField.addDisposeListener(event -> textField = null);
	            if (textLimit > 0) {//Only set limits above 0 - see SWT spec
	                textField.setTextLimit(textLimit);
	            }
	        } else {
	            checkParent(textField, parent);
	        }
	        return textField;
		}
		
		
	}
}
