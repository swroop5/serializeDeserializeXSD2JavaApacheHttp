//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Der Type.GDS.Grunddaten enth�lt Meta-Informationen zum Verfahren und dessen Beteiligte. Er kann auch Angaben zu Terminen enthalten.
 * 
 * <p>Java class for Type.GDS.Grunddaten complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Grunddaten">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="verfahrensdaten" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="verfahrensnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="instanzdaten" type="{http://www.xjustiz.de}Type.GDS.Instanzdaten" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="beteiligung" type="{http://www.xjustiz.de}Type.GDS.Beteiligung" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="terminsdaten" type="{http://www.xjustiz.de}Type.GDS.Terminsdaten" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.GDS.Grunddaten", propOrder = {
    "verfahrensdaten"
})
public class TypeGDSGrunddaten {

    protected TypeGDSGrunddaten.Verfahrensdaten verfahrensdaten;

    /**
     * Gets the value of the verfahrensdaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten.Verfahrensdaten }
     *     
     */
    public TypeGDSGrunddaten.Verfahrensdaten getVerfahrensdaten() {
        return verfahrensdaten;
    }

    /**
     * Sets the value of the verfahrensdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten.Verfahrensdaten }
     *     
     */
    public void setVerfahrensdaten(TypeGDSGrunddaten.Verfahrensdaten value) {
        this.verfahrensdaten = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="verfahrensnummer" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="instanzdaten" type="{http://www.xjustiz.de}Type.GDS.Instanzdaten" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="beteiligung" type="{http://www.xjustiz.de}Type.GDS.Beteiligung" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="terminsdaten" type="{http://www.xjustiz.de}Type.GDS.Terminsdaten" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "verfahrensnummer",
        "instanzdaten",
        "beteiligung",
        "terminsdaten"
    })
    public static class Verfahrensdaten {

        protected String verfahrensnummer;
        protected List<TypeGDSInstanzdaten> instanzdaten;
        protected List<TypeGDSBeteiligung> beteiligung;
        protected List<TypeGDSTerminsdaten> terminsdaten;

        /**
         * Gets the value of the verfahrensnummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerfahrensnummer() {
            return verfahrensnummer;
        }

        /**
         * Sets the value of the verfahrensnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerfahrensnummer(String value) {
            this.verfahrensnummer = value;
        }

        /**
         * Gets the value of the instanzdaten property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the instanzdaten property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInstanzdaten().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeGDSInstanzdaten }
         * 
         * 
         */
        public List<TypeGDSInstanzdaten> getInstanzdaten() {
            if (instanzdaten == null) {
                instanzdaten = new ArrayList<TypeGDSInstanzdaten>();
            }
            return this.instanzdaten;
        }

        /**
         * Gets the value of the beteiligung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the beteiligung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBeteiligung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeGDSBeteiligung }
         * 
         * 
         */
        public List<TypeGDSBeteiligung> getBeteiligung() {
            if (beteiligung == null) {
                beteiligung = new ArrayList<TypeGDSBeteiligung>();
            }
            return this.beteiligung;
        }

        /**
         * Gets the value of the terminsdaten property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the terminsdaten property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTerminsdaten().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeGDSTerminsdaten }
         * 
         * 
         */
        public List<TypeGDSTerminsdaten> getTerminsdaten() {
            if (terminsdaten == null) {
                terminsdaten = new ArrayList<TypeGDSTerminsdaten>();
            }
            return this.terminsdaten;
        }

    }

}
