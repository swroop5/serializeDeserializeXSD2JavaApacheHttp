//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.DABAG.Ref.WEG.Serie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.DABAG.Ref.WEG.Serie">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ref.wegserie" use="required" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.DABAG.Ref.WEG.Serie")
public class TypeDABAGRefWEGSerie {

    @XmlAttribute(name = "ref.wegserie", required = true)
    protected String refWegserie;

    /**
     * Gets the value of the refWegserie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefWegserie() {
        return refWegserie;
    }

    /**
     * Sets the value of the refWegserie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefWegserie(String value) {
        this.refWegserie = value;
    }

}
