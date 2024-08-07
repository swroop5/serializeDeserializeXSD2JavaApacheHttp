//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.13 at 01:28:34 PM CEST 
//


package com.java.xsd.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Mit dem Datentyp sollen alle Szenarien abgedeckt werden, bei denen eine Forderung ohne die T�tigung einer Zahlung erlischt.
 * 
 * <p>Java class for Type.KASSE.Erledigungen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.KASSE.Erledigungen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="erledigung" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="erledigungsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
 *                   &lt;element name="sachkonto" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="erledigungsart" type="{http://www.xjustiz.de}Code.KASSE.Erledigungsart" minOccurs="0"/>
 *                   &lt;element name="erledigungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="buchungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="buchungsinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="rechnungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gesamtbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.KASSE.Erledigungen", propOrder = {
    "erledigung",
    "gesamtbetrag"
})
public class TypeKASSEErledigungen {

    protected List<TypeKASSEErledigungen.Erledigung> erledigung;
    protected TypeGDSGeldbetrag gesamtbetrag;

    /**
     * Gets the value of the erledigung property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erledigung property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErledigung().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKASSEErledigungen.Erledigung }
     * 
     * 
     */
    public List<TypeKASSEErledigungen.Erledigung> getErledigung() {
        if (erledigung == null) {
            erledigung = new ArrayList<TypeKASSEErledigungen.Erledigung>();
        }
        return this.erledigung;
    }

    /**
     * Gets the value of the gesamtbetrag property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public TypeGDSGeldbetrag getGesamtbetrag() {
        return gesamtbetrag;
    }

    /**
     * Sets the value of the gesamtbetrag property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGeldbetrag }
     *     
     */
    public void setGesamtbetrag(TypeGDSGeldbetrag value) {
        this.gesamtbetrag = value;
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
     *         &lt;element name="erledigungsbetrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag"/>
     *         &lt;element name="sachkonto" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="erledigungsart" type="{http://www.xjustiz.de}Code.KASSE.Erledigungsart" minOccurs="0"/>
     *         &lt;element name="erledigungsdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="buchungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="buchungsinformationen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="kassenzeichen" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="rechnungsnummer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        "erledigungsbetrag",
        "sachkonto",
        "erledigungsart",
        "erledigungsdatum",
        "buchungsdatum",
        "buchungsinformationen",
        "kassenzeichen",
        "rechnungsnummer"
    })
    public static class Erledigung {

        @XmlElement(required = true)
        protected TypeGDSGeldbetrag erledigungsbetrag;
        protected String sachkonto;
        protected CodeKASSEErledigungsart erledigungsart;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar erledigungsdatum;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar buchungsdatum;
        protected String buchungsinformationen;
        protected String kassenzeichen;
        protected BigInteger rechnungsnummer;

        /**
         * Gets the value of the erledigungsbetrag property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public TypeGDSGeldbetrag getErledigungsbetrag() {
            return erledigungsbetrag;
        }

        /**
         * Sets the value of the erledigungsbetrag property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSGeldbetrag }
         *     
         */
        public void setErledigungsbetrag(TypeGDSGeldbetrag value) {
            this.erledigungsbetrag = value;
        }

        /**
         * Gets the value of the sachkonto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSachkonto() {
            return sachkonto;
        }

        /**
         * Sets the value of the sachkonto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSachkonto(String value) {
            this.sachkonto = value;
        }

        /**
         * Gets the value of the erledigungsart property.
         * 
         * @return
         *     possible object is
         *     {@link CodeKASSEErledigungsart }
         *     
         */
        public CodeKASSEErledigungsart getErledigungsart() {
            return erledigungsart;
        }

        /**
         * Sets the value of the erledigungsart property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeKASSEErledigungsart }
         *     
         */
        public void setErledigungsart(CodeKASSEErledigungsart value) {
            this.erledigungsart = value;
        }

        /**
         * Gets the value of the erledigungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getErledigungsdatum() {
            return erledigungsdatum;
        }

        /**
         * Sets the value of the erledigungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setErledigungsdatum(XMLGregorianCalendar value) {
            this.erledigungsdatum = value;
        }

        /**
         * Gets the value of the buchungsdatum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBuchungsdatum() {
            return buchungsdatum;
        }

        /**
         * Sets the value of the buchungsdatum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBuchungsdatum(XMLGregorianCalendar value) {
            this.buchungsdatum = value;
        }

        /**
         * Gets the value of the buchungsinformationen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBuchungsinformationen() {
            return buchungsinformationen;
        }

        /**
         * Sets the value of the buchungsinformationen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBuchungsinformationen(String value) {
            this.buchungsinformationen = value;
        }

        /**
         * Gets the value of the kassenzeichen property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKassenzeichen() {
            return kassenzeichen;
        }

        /**
         * Sets the value of the kassenzeichen property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKassenzeichen(String value) {
            this.kassenzeichen = value;
        }

        /**
         * Gets the value of the rechnungsnummer property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRechnungsnummer() {
            return rechnungsnummer;
        }

        /**
         * Sets the value of the rechnungsnummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRechnungsnummer(BigInteger value) {
            this.rechnungsnummer = value;
        }

    }

}
