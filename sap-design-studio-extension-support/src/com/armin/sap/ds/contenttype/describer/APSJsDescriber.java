package com.armin.sap.ds.contenttype.describer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.content.IContentDescription;
import org.eclipse.core.runtime.content.ITextContentDescriber;

public class APSJsDescriber implements ITextContentDescriber {

	private static final String SUB_CLASS_KEYWORD = "sap.designstudio.sdk.PropertyPage.subclass";
	
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
		String line = reader.readLine();
		
		if(line == null) {
			return null;
		}
		
		if(line.startsWith(SUB_CLASS_KEYWORD)) {
			return line;
		}
		
		return null;
	}
}
