package com.armin.sap.ds.builder.models.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies an extension component.
 * 
 * <p>Java class for Component complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentExtended">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sap.com/bi/zen/sdk}Component">       
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */


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
	//@XmlAttribute(name="componentClient")
	//private ComponentClient componentClient;
	
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("id=%s, name=%s", id, name);
	}

	/**
	 * @return the componentClient
	 */
//	public ComponentClient getComponentClient() {
//		return componentClient;
//	}

	/**
	 * @param componentClient the componentClient to set
	 */
//	public void setComponentClient(ComponentClient componentClient) {
//		this.componentClient = componentClient;
//	}
	
	
}
