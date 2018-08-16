package com.armin.sap.ds.builder.editors;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class DirtyUtils {

	public static void registryDirty(DirtyListener listener, Control... controls) {
		if(controls == null) {
			return;
		}
		
		for(Control control : controls) {
			if(control instanceof Text) {
				Text text = (Text)control;
				text.addModifyListener(new ModifyListenerImpl(listener));				
			} else if(control instanceof StyledText) {
				StyledText text = (StyledText)control;
				text.addVerifyKeyListener(new VerifyKeyListenerImpl(listener));				
			} else {
				throw new UnsupportedOperationException("Not support for " + control.getClass().getSimpleName());
			}
		}
	}
	
	static class ListenerImpl implements Listener {

		private DirtyListener listener;
		
		public ListenerImpl(DirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void handleEvent(Event event) {
			listener.fireDirty();

		}

	}
	
	static class ModifyListenerImpl implements ModifyListener {

		private DirtyListener listener;
		
		public ModifyListenerImpl(DirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void modifyText(ModifyEvent e) {
			listener.fireDirty();
		}

	}

	
	static class SelectionListenerImpl implements SelectionListener{

		private DirtyListener listener;
		
		public SelectionListenerImpl(DirtyListener listener) {
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

	static class VerifyKeyListenerImpl implements VerifyKeyListener{
		private DirtyListener listener;
		
		public VerifyKeyListenerImpl(DirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void verifyKey(VerifyEvent event) {
			if(event.character >= 32 && event.character <= 126){
				listener.fireDirty();
			} 
			
		}
	}
}
