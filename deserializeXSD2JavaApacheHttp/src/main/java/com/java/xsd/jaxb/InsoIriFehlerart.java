//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inso.iri.fehlerart.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="inso.iri.fehlerart">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="InternalServiceException"/>
 *     &lt;enumeration value="NotImplementedException"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "inso.iri.fehlerart")
@XmlEnum
public enum InsoIriFehlerart {

    @XmlEnumValue("InternalServiceException")
    INTERNAL_SERVICE_EXCEPTION("InternalServiceException"),
    @XmlEnumValue("NotImplementedException")
    NOT_IMPLEMENTED_EXCEPTION("NotImplementedException");
    private final String value;

    InsoIriFehlerart(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InsoIriFehlerart fromValue(String v) {
        for (InsoIriFehlerart c: InsoIriFehlerart.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}