//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.16 at 08:53:40 PM CEST 
//


package es.uned.master.enfoquegenerativo.xml.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for repositoryComplexType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="repositoryComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchMethods" type="{}searchMethodsComplexType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="primaryKeyType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "repositoryComplexType", propOrder = {
    "searchMethods"
})
public class RepositoryComplexType {

    protected SearchMethodsComplexType searchMethods;
    @XmlAttribute(name = "primaryKeyType")
    protected String primaryKeyType;

    /**
     * Gets the value of the searchMethods property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMethodsComplexType }
     *     
     */
    public SearchMethodsComplexType getSearchMethods() {
        return searchMethods;
    }

    /**
     * Sets the value of the searchMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMethodsComplexType }
     *     
     */
    public void setSearchMethods(SearchMethodsComplexType value) {
        this.searchMethods = value;
    }

    /**
     * Gets the value of the primaryKeyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryKeyType() {
        return primaryKeyType;
    }

    /**
     * Sets the value of the primaryKeyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryKeyType(String value) {
        this.primaryKeyType = value;
    }

}