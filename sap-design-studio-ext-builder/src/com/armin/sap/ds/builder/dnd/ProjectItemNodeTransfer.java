package com.armin.sap.ds.builder.dnd;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import org.apache.commons.lang.ArrayUtils;
import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.swt.dnd.TransferData;

import com.armin.sap.ds.builder.models.domain.IModel;

public class ProjectItemNodeTransfer extends ByteArrayTransfer {

	private static final String PROJECT_ITEM_NODE_TYPE_NAME = "project_item_node_type";
	private static final int PROJECT_ITEM_NODE_TYPE_ID = registerType(PROJECT_ITEM_NODE_TYPE_NAME);
	private static ProjectItemNodeTransfer _instance = new ProjectItemNodeTransfer();
	
	protected ProjectItemNodeTransfer() {
		
	}
	
	public static ProjectItemNodeTransfer getInstance() {
		return _instance;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.ByteArrayTransfer#javaToNative(java.lang.Object, org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	protected void javaToNative(Object object, TransferData transferData) {
		
		if(object == null || !(object instanceof IModel[])) return;
		
		if(isSupportedType(transferData)) 
		{
			Object[] items = (Object[])object;
			byte[] itemsBuffer = null;
			try {
				for(Object item : items) {
					IModel itemModel = (IModel)item;
					byte[] buffer = DNDUtils.objectToByteArray(itemModel);
					System.out.println("[ProjectItemNodeTransfer] Converted java object to native (bytes[]): " + buffer.length);
					if(itemsBuffer == null) {
						itemsBuffer = buffer;
					} else {
						itemsBuffer = ArrayUtils.addAll(itemsBuffer, buffer);
					}									
				}	
				super.javaToNative(itemsBuffer, transferData);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.swt.dnd.ByteArrayTransfer#nativeToJava(org.eclipse.swt.dnd.TransferData)
	 */
	@Override
	protected Object nativeToJava(TransferData transferData) {
		
		Object obj = null;
		ArrayList<Object> objs = new ArrayList<Object>();
		if(isSupportedType(transferData)) 
		{
			byte[] buffer = (byte[])super.nativeToJava(transferData);			
			
			if(buffer == null) return null;
			
			System.out.println("[ProjectItemNodeTransfer] Number of bytes available to paste: " + buffer.length);
			
			try {
				ByteArrayInputStream in = new ByteArrayInputStream(buffer);
				
				System.out.println("[ProjectItemNodeTransfer] Bytes available to paste: " + in.available());
				
				while(in.available() > 0) {
					ObjectInputStream objIn = new ObjectInputStream(in);
					obj = objIn.readObject();					

					if(obj == null)
						break;
					
					objs.add(obj);
					
					System.out.println("[ProjectItemNodeTransfer] 1 Object(s) pasted: " + obj);
					
					objIn.close();
				}				
				in.close();
			}catch(Exception e) {
				e.printStackTrace();
			}			
		}
		return objs.toArray();
	}

	@Override
	protected String[] getTypeNames() {		
		return new String[]{PROJECT_ITEM_NODE_TYPE_NAME};
	}

	@Override
	protected int[] getTypeIds() {		
		return new int[] {PROJECT_ITEM_NODE_TYPE_ID};
	}

	boolean checkMyType(Object object) {
		if (object == null || !(object instanceof IModel[]) || ((IModel[])object).length == 0) return false;
		IModel[] modelTypes = (IModel[])object;
		for (IModel modelType : modelTypes) {
			if (modelType == null ||
				modelType.getId() == null ||
				modelType.getId().length() == 0 ||
				modelType.getName() == null ||
				modelType.getName().length() == 0) return false;
		}
		return true;
	}
	
	@Override
	protected boolean validate(Object object) {
		return this.checkMyType(object);
	}

}
