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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="nachrichtenkopf" type="{http://www.xjustiz.de}Type.GDS.Nachrichtenkopf"/>
 *         &lt;element name="grunddaten" type="{http://www.xjustiz.de}Type.GDS.Grunddaten"/>
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="kostenfachdaten" type="{http://www.xjustiz.de}Type.KASSE.Kostenfachdaten" minOccurs="0"/>
 *                   &lt;element name="rechnungspostenblock" type="{http://www.xjustiz.de}Type.KASSE.Rechnungspostenblock"/>
 *                   &lt;element name="zahlungspartner" type="{http://www.xjustiz.de}Type.KASSE.Zahlungspartnerdaten" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="kassenanordnung" type="{http://www.xjustiz.de}Type.KASSE.Kassenanordnungsgrunddaten" minOccurs="0"/>
 *                   &lt;element name="kontierung" type="{http://www.xjustiz.de}Type.KASSE.Kontierungsposten" minOccurs="0"/>
 *                   &lt;element name="rechtsbehelfe" type="{http://www.xjustiz.de}Type.KASSE.Rechtsbehelfe" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "nachrichtenkopf",
    "grunddaten",
    "fachdaten"
})
@XmlRootElement(name = "nachricht.kasse.kostennachricht.2000002")
public class NachrichtKasseKostennachricht2000002 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected TypeGDSGrunddaten grunddaten;
    @XmlElement(required = true)
    protected NachrichtKasseKostennachricht2000002 .Fachdaten fachdaten;

    /**
     * Gets the value of the nachrichtenkopf property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public TypeGDSNachrichtenkopf getNachrichtenkopf() {
        return nachrichtenkopf;
    }

    /**
     * Sets the value of the nachrichtenkopf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSNachrichtenkopf }
     *     
     */
    public void setNachrichtenkopf(TypeGDSNachrichtenkopf value) {
        this.nachrichtenkopf = value;
    }

    /**
     * Gets the value of the grunddaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public TypeGDSGrunddaten getGrunddaten() {
        return grunddaten;
    }

    /**
     * Sets the value of the grunddaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSGrunddaten }
     *     
     */
    public void setGrunddaten(TypeGDSGrunddaten value) {
        this.grunddaten = value;
    }

    /**
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtKasseKostennachricht2000002 .Fachdaten }
     *     
     */
    public NachrichtKasseKostennachricht2000002 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtKasseKostennachricht2000002 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtKasseKostennachricht2000002 .Fachdaten value) {
        this.fachdaten = value;
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
     *         &lt;element name="kostenfachdaten" type="{http://www.xjustiz.de}Type.KASSE.Kostenfachdaten" minOccurs="0"/>
     *         &lt;element name="rechnungspostenblock" type="{http://www.xjustiz.de}Type.KASSE.Rechnungspostenblock"/>
     *         &lt;element name="zahlungspartner" type="{http://www.xjustiz.de}Type.KASSE.Zahlungspartnerdaten" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="kassenanordnung" type="{http://www.xjustiz.de}Type.KASSE.Kassenanordnungsgrunddaten" minOccurs="0"/>
     *         &lt;element name="kontierung" type="{http://www.xjustiz.de}Type.KASSE.Kontierungsposten" minOccurs="0"/>
     *         &lt;element name="rechtsbehelfe" type="{http://www.xjustiz.de}Type.KASSE.Rechtsbehelfe" minOccurs="0"/>
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
        "kostenfachdaten",
        "rechnungspostenblock",
        "zahlungspartner",
        "kassenanordnung",
        "kontierung",
        "rechtsbehelfe"
    })
    public static class Fachdaten {

        protected TypeKASSEKostenfachdaten kostenfachdaten;
        @XmlElement(required = true)
        protected TypeKASSERechnungspostenblock rechnungspostenblock;
        protected List<TypeKASSEZahlungspartnerdaten> zahlungspartner;
        protected TypeKASSEKassenanordnungsgrunddaten kassenanordnung;
        protected TypeKASSEKontierungsposten kontierung;
        protected TypeKASSERechtsbehelfe rechtsbehelfe;

        /**
         * Gets the value of the kostenfachdaten property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEKostenfachdaten }
         *     
         */
        public TypeKASSEKostenfachdaten getKostenfachdaten() {
            return kostenfachdaten;
        }

        /**
         * Sets the value of the kostenfachdaten property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEKostenfachdaten }
         *     
         */
        public void setKostenfachdaten(TypeKASSEKostenfachdaten value) {
            this.kostenfachdaten = value;
        }

        /**
         * Gets the value of the rechnungspostenblock property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSERechnungspostenblock }
         *     
         */
        public TypeKASSERechnungspostenblock getRechnungspostenblock() {
            return rechnungspostenblock;
        }

        /**
         * Sets the value of the rechnungspostenblock property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSERechnungspostenblock }
         *     
         */
        public void setRechnungspostenblock(TypeKASSERechnungspostenblock value) {
            this.rechnungspostenblock = value;
        }

        /**
         * Gets the value of the zahlungspartner property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zahlungspartner property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZahlungspartner().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeKASSEZahlungspartnerdaten }
         * 
         * 
         */
        public List<TypeKASSEZahlungspartnerdaten> getZahlungspartner() {
            if (zahlungspartner == null) {
                zahlungspartner = new ArrayList<TypeKASSEZahlungspartnerdaten>();
            }
            return this.zahlungspartner;
        }

        /**
         * Gets the value of the kassenanordnung property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEKassenanordnungsgrunddaten }
         *     
         */
        public TypeKASSEKassenanordnungsgrunddaten getKassenanordnung() {
            return kassenanordnung;
        }

        /**
         * Sets the value of the kassenanordnung property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEKassenanordnungsgrunddaten }
         *     
         */
        public void setKassenanordnung(TypeKASSEKassenanordnungsgrunddaten value) {
            this.kassenanordnung = value;
        }

        /**
         * Gets the value of the kontierung property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSEKontierungsposten }
         *     
         */
        public TypeKASSEKontierungsposten getKontierung() {
            return kontierung;
        }

        /**
         * Sets the value of the kontierung property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSEKontierungsposten }
         *     
         */
        public void setKontierung(TypeKASSEKontierungsposten value) {
            this.kontierung = value;
        }

        /**
         * Gets the value of the rechtsbehelfe property.
         * 
         * @return
         *     possible object is
         *     {@link TypeKASSERechtsbehelfe }
         *     
         */
        public TypeKASSERechtsbehelfe getRechtsbehelfe() {
            return rechtsbehelfe;
        }

        /**
         * Sets the value of the rechtsbehelfe property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeKASSERechtsbehelfe }
         *     
         */
        public void setRechtsbehelfe(TypeKASSERechtsbehelfe value) {
            this.rechtsbehelfe = value;
        }

    }

}