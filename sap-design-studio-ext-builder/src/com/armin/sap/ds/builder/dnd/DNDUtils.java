package com.armin.sap.ds.builder.dnd;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

public class DNDUtils {

	public static byte[] objectToByteArray(Object obj) throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();				
		ObjectOutputStream objOut = new ObjectOutputStream(out);
		objOut.writeObject(obj);
		objOut.flush();
		byte[] bytes = out.toByteArray().clone();
		objOut.close();
		
		return bytes;
	}

}
