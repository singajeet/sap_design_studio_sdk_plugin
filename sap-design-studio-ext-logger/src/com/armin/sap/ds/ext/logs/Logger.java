package com.armin.sap.ds.ext.logs;

import java.util.Date;

public class Logger {

	private Logger() {
		// TODO Auto-generated constructor stub		
	}
	
	public static void debug(String message) {
		System.out.println(new Date().toString() + " - " + message);
	}

	public static void debug(String message, Class<Object> type) {
		System.out.println(new Date().toString() + " - " + type.getSimpleName() + " - " + message);
	}
}
