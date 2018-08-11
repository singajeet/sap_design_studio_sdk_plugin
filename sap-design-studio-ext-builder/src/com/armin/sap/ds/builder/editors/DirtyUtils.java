package com.armin.sap.ds.builder.editors;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.List;
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
				text.addVerifyListener(new VerifyListenerImpl(listener));
			} else if(control instanceof StyledText) {
				StyledText text = (StyledText)control;
				text.addVerifyListener(new VerifyListenerImpl(listener));
			} else if(control instanceof List) {
				List list = (List)control;
				list.addListener(SWT.Modify, new ListenerImpl(listener));
				//list.addSelectionListener(new SelectionListenerImpl(listener));
			}
			else {
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

	static class VerifyListenerImpl implements VerifyListener{
		private DirtyListener listener;
		
		public VerifyListenerImpl(DirtyListener listener) {
			this.listener = listener;
		}
		
		@Override
		public void verifyText(VerifyEvent arg0) {
			listener.fireDirty();
		}
	}
}
