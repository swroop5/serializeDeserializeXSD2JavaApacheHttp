//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Ref.FremdeNachrichtenID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Ref.FremdeNachrichtenID">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ref.fremdeNachrichtenID" type="{http://www.xjustiz.de}Type.GDS.Xdomea.stringUUIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Ref.FremdeNachrichtenID", propOrder = {
    "refFremdeNachrichtenID"
})
public class TypeGDSRefFremdeNachrichtenID {

    @XmlElement(name = "ref.fremdeNachrichtenID", required = true)
    protected String refFremdeNachrichtenID;

    /**
     * Gets the value of the refFremdeNachrichtenID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefFremdeNachrichtenID() {
        return refFremdeNachrichtenID;
    }

    /**
     * Sets the value of the refFremdeNachrichtenID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefFremdeNachrichtenID(String value) {
        this.refFremdeNachrichtenID = value;
    }

}
