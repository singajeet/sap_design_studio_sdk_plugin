package com.armin.sap.ds.contenttype.describer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

public class JsDescriber implements ITextContentDescriber {

	private static final String DEFINE_KEYWORD = "define";
	private static final String COMPONENT_SUB_CLASS_KEYWORD = "Component.subclass";
	
	public JsDescriber() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int describe(InputStream contents, IContentDescription description) throws IOException {
		return describe(new InputStreamReader(contents), description);
	}

	@Override
	public QualifiedName[] getSupportedOptions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int describe(Reader contents, IContentDescription description) throws IOException {
		return doDescribe(contents) == null ? INVALID : VALID;
	}
	
	private String doDescribe(Reader content) throws IOException{
		
		if(content == null || !content.ready()) {
			return null;
		}
		
		BufferedReader reader = new BufferedReader(content);
		
		String lineOne = reader.readLine();
		if(lineOne == null) {
			return null;
		}
		
		String lineTwo = reader.readLine();
		if(lineTwo == null) {
			return null;
		}
		
		
		if(lineOne.startsWith(DEFINE_KEYWORD) && lineTwo.contains(COMPONENT_SUB_CLASS_KEYWORD)) {
			return lineOne + "\n" + lineTwo;
		}
		
		return null;
	}

}
