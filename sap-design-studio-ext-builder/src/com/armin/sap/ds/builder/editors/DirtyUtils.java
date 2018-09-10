package com.armin.sap.ds.builder.editors;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;

public class DirtyUtils {

	public static void registryDirty(IDirtyListener listener, Control... controls) {
		if(controls == null) {
			return;
		}
		
		for(Control control : controls) {
			if(control instanceof Text) {
				Text text = (Text)control;
				text.addKeyListener(new KeyListenerImpl(listener));
			} else if(control instanceof StyledText) {
				StyledText text = (StyledText)control;
				text.addKeyListener(new KeyListenerImpl(listener));
			} else {
				throw new UnsupportedOperationException("Not support for " + control.getClass().getSimpleName());
			}
		}
	}
	
	
	static class KeyListenerImpl implements KeyListener{

		private IDirtyListener listener;
		
		
		public KeyListenerImpl(IDirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
				e.doit = true;
		}

		@Override
		public void keyReleased(KeyEvent e) {
			e.doit = true;
			if(e.character >= 32 && e.character <= 127) {
				listener.fireDirty();
			}			
		}
		
	}
	
	static class ListenerImpl implements Listener {

		private IDirtyListener listener;
		
		public ListenerImpl(IDirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void handleEvent(Event event) {
			listener.fireDirty();

		}

	}
	
	static class ModifyListenerImpl implements ModifyListener {

		private IDirtyListener listener;
		
		public ModifyListenerImpl(IDirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void modifyText(ModifyEvent e) {			
			listener.fireDirty();
		}

	}

	
	static class SelectionListenerImpl implements SelectionListener{

		private IDirtyListener listener;
		
		public SelectionListenerImpl(IDirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void widgetSelected(SelectionEvent e) {
			listener.fireDirty();
			
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class PropertyListenerImpl implements IPropertyListener{

		private IDirtyListener listener;
		
		public PropertyListenerImpl(IDirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void propertyChanged(Object source, int propId) {
			if(propId == IEditorPart.PROP_DIRTY) {
				listener.fireDirty();
			}			
		}
		
	}

	static class VerifyKeyListenerImpl implements VerifyKeyListener{
		private IDirtyListener listener;
		
		public VerifyKeyListenerImpl(IDirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void verifyKey(VerifyEvent event) {
			if(event.character >= 32 && event.character <= 126){
				listener.fireDirty();
			} 
			
		}
	}

	public static void registryDirty(IDirtyListener listener, IEditorPart extensionEditor,
			IEditorPart extensionSourceEditor) {
		extensionEditor.addPropertyListener(new PropertyListenerImpl(listener));
		
	}
}
