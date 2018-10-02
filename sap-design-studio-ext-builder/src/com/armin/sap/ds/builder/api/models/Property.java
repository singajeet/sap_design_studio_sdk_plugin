//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.15 at 02:30:36 AM IST 
//


package com.armin.sap.ds.builder.api.models;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Property of this extension component.
 * 
 * <p>Java class for Property complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Property">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sap.com/bi/zen/sdk}Descriptable">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://www.sap.com/bi/zen/sdk}Property" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="possibleValue" type="{http://www.sap.com/bi/zen/sdk}PossibleValueType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="option" type="{http://www.sap.com/bi/zen/sdk}Option" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required" type="{http://www.sap.com/bi/zen/sdk}PropertyType" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bindable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="modes" type="{http://www.sap.com/bi/zen/sdk}UI5Modes" default="commons m" />
 *       &lt;attribute name="transient" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="renderable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Property", propOrder = {
    "property",
    "possibleValue",
    "option"
})
public class Property
    extends Descriptable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -2010358678547856153L;
	protected List<Property> property;
    protected List<PossibleValueType> possibleValue;
    protected List<Option> option;
    @XmlAttribute(name = "type", required = true)
    protected PropertyType type;
    @XmlAttribute(name = "group")
    protected String group;
    @XmlAttribute(name = "bindable")
    protected Boolean bindable;
    @XmlAttribute(name = "modes")
    protected List<UI5Mode> modes;
    @XmlAttribute(name = "transient")
    protected Boolean _transient;
    @XmlAttribute(name = "renderable")
    protected Boolean renderable;

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the possibleValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the possibleValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPossibleValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PossibleValueType }
     * 
     * 
     */
    public List<PossibleValueType> getPossibleValue() {
        if (possibleValue == null) {
            possibleValue = new ArrayList<PossibleValueType>();
        }
        return this.possibleValue;
    }

    /**
     * Gets the value of the option property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the option property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Option }
     * 
     * 
     */
    public List<Option> getOption() {
        if (option == null) {
            option = new ArrayList<Option>();
        }
        return this.option;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setType(PropertyType value) {
        this.type = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the bindable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBindable() {
        if (bindable == null) {
            return false;
        } else {
            return bindable;
        }
    }

    /**
     * Sets the value of the bindable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindable(Boolean value) {
        this.bindable = value;
    }

    /**
     * Gets the value of the modes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UI5Mode }
     * 
     * 
     */
    public List<UI5Mode> getModes() {
        if (modes == null) {
            modes = new ArrayList<UI5Mode>();
        }
        return this.modes;
    }

    /**
     * Gets the value of the transient property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTransient() {
        if (_transient == null) {
            return false;
        } else {
            return _transient;
        }
    }

    /**
     * Sets the value of the transient property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransient(Boolean value) {
        this._transient = value;
    }

    /**
     * Gets the value of the renderable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRenderable() {
        if (renderable == null) {
            return true;
        } else {
            return renderable;
        }
    }

    /**
     * Sets the value of the renderable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRenderable(Boolean value) {
        this.renderable = value;
    }

}
