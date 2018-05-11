package com.armin.sap.ds.support;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.commons.text.StringSubstitutor;
import org.eclipse.jface.dialogs.MessageDialog;

import com.armin.sap.ds.ext.plugin.Activator;

public class TemplateParser {

	private Map<String, String> _fieldMap;
	private StringSubstitutor _parser;
	private String _templateText;
	private String _compiledText;
	
	public TemplateParser(Map<String, String> map) {
		_fieldMap = map;
		_parser = new StringSubstitutor(_fieldMap);
	}

	public void loadTemplate(String templateName) {
		String templatesPath = "/templates/";
		String templateFilePath = templatesPath + templateName + ".xml"; 
        
        try {
            InputStream inputStream = Activator.getDefault().getBundle().getEntry(templateFilePath).openStream();
            BufferedReader buf = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            
            String line = buf.readLine();
            while(line != null) {
            	sb.append(line).append("\n");
            	line = buf.readLine();
            }
        
            _templateText = sb.toString();
            
        } catch (IOException e) {
            MessageDialog.openError(null, "TemplateParser", "Error while loading template file: " + templateName + ".xml");
        }
	}
	
	public void parse() {
		_compiledText = _parser.replace(_templateText);
	}
	
	public String getCompiledText() {
		return _compiledText;
	}
	
	public InputStream getCompiledTextAsStream() {
		return new ByteArrayInputStream(_compiledText.getBytes());
	}
	
	public String getTemplateText() {
		return _templateText;
	}
	
	public InputStream getTemplateTextAsStream() {
		return new ByteArrayInputStream(_templateText.getBytes());
	}
}
