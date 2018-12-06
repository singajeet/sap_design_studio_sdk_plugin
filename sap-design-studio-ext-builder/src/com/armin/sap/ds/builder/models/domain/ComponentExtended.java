package com.armin.sap.ds.builder.models.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComponentExtended")
public class ComponentExtended extends Component {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2239142225088092338L;
	
	@XmlAttribute(name = "componentFileCreationEnabled")
	private boolean componentFileCreationEnabled = true;
	@XmlAttribute(name="classToExtend")
	private String classToExtend;
	@XmlAttribute(name="description")
	private String description;
	@XmlAttribute(name="packageName")
	private String packageName;
	
	public ComponentExtended() {
		
	}

	/**
	 * @return the componentFileCreationEnabled
	 */
	public boolean isComponentFileCreationEnabled() {
		return componentFileCreationEnabled;
	}

	/**
	 * @param componentFileCreationEnabled the componentFileCreationEnabled to set
	 */
	public void setComponentFileCreationEnabled(boolean componentFileCreationEnabled) {
		this.componentFileCreationEnabled = componentFileCreationEnabled;
	}

	/**
	 * @return the classToExtend
	 */
	public String getClassToExtend() {
		return classToExtend;
	}

	/**
	 * @param classToExtend the classToExtend to set
	 */
	public void setClassToExtend(String classToExtend) {
		this.classToExtend = classToExtend;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the packageName
	 */
	public String getPackageName() {
		return packageName;
	}

	/**
	 * @param packageName the packageName to set
	 */
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	
}
