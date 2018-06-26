package com.armin.sap.ds.builder.project.models;

public class ComponentExtended extends Component {

	private boolean componentFileCreationEnabled = true;
	private String classToExtend;
	private String description;
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
