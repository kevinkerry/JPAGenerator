//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 08:53:40 PM CEST 
//


package es.uned.master.enfoquegenerativo.xml.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="table" type="{}tableComplexType"/>
 *         &lt;element name="fields" type="{}fieldsComplexType" minOccurs="0"/>
 *         &lt;element name="associations" type="{}associationsComplexType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityComplexType", propOrder = {
    "table",
    "fields",
    "associations"
})
public class EntityComplexType {

    @XmlElement(required = true)
    protected TableComplexType table;
    protected FieldsComplexType fields;
    protected AssociationsComplexType associations;

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link TableComplexType }
     *     
     */
    public TableComplexType getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableComplexType }
     *     
     */
    public void setTable(TableComplexType value) {
        this.table = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link FieldsComplexType }
     *     
     */
    public FieldsComplexType getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsComplexType }
     *     
     */
    public void setFields(FieldsComplexType value) {
        this.fields = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link AssociationsComplexType }
     *     
     */
    public AssociationsComplexType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociationsComplexType }
     *     
     */
    public void setAssociations(AssociationsComplexType value) {
        this.associations = value;
    }

}
