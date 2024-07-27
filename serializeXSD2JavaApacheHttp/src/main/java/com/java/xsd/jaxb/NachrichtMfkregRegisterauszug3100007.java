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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="fachdaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="art.auszug" type="{http://www.xjustiz.de}Code.MFKREG.Registerauszugsart"/>
 *                   &lt;element name="stichtag.auszug" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="richtigkeit_vollstaendigkeit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="registerAuszuege" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="geschaeftszeichen.BfJ" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
 *                             &lt;element name="gegenstandUndGrund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
 *                             &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
 *                             &lt;element name="datum.anmeldung" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                             &lt;element name="datum.ruecknahme" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="aenderungshistorie" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
 *                             &lt;element name="anmeldung.beteiligung" type="{http://www.xjustiz.de}Type.GDS.Beteiligung" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "fachdaten"
})
@XmlRootElement(name = "nachricht.mfkreg.registerauszug.3100007")
public class NachrichtMfkregRegisterauszug3100007 {

    @XmlElement(required = true)
    protected TypeGDSNachrichtenkopf nachrichtenkopf;
    @XmlElement(required = true)
    protected NachrichtMfkregRegisterauszug3100007 .Fachdaten fachdaten;

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
     * Gets the value of the fachdaten property.
     * 
     * @return
     *     possible object is
     *     {@link NachrichtMfkregRegisterauszug3100007 .Fachdaten }
     *     
     */
    public NachrichtMfkregRegisterauszug3100007 .Fachdaten getFachdaten() {
        return fachdaten;
    }

    /**
     * Sets the value of the fachdaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link NachrichtMfkregRegisterauszug3100007 .Fachdaten }
     *     
     */
    public void setFachdaten(NachrichtMfkregRegisterauszug3100007 .Fachdaten value) {
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
     *         &lt;element name="art.auszug" type="{http://www.xjustiz.de}Code.MFKREG.Registerauszugsart"/>
     *         &lt;element name="stichtag.auszug" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="richtigkeit_vollstaendigkeit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="registerAuszuege" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="geschaeftszeichen.BfJ" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
     *                   &lt;element name="gegenstandUndGrund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
     *                   &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
     *                   &lt;element name="datum.anmeldung" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                   &lt;element name="datum.ruecknahme" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="aenderungshistorie" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
     *                   &lt;element name="anmeldung.beteiligung" type="{http://www.xjustiz.de}Type.GDS.Beteiligung" maxOccurs="unbounded"/>
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
        "artAuszug",
        "stichtagAuszug",
        "richtigkeitVollstaendigkeit",
        "registerAuszuege"
    })
    public static class Fachdaten {

        @XmlElement(name = "art.auszug", required = true)
        protected CodeMFKREGRegisterauszugsart artAuszug;
        @XmlElement(name = "stichtag.auszug", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stichtagAuszug;
        @XmlElement(name = "richtigkeit_vollstaendigkeit")
        protected boolean richtigkeitVollstaendigkeit;
        @XmlElement(required = true)
        protected List<NachrichtMfkregRegisterauszug3100007 .Fachdaten.RegisterAuszuege> registerAuszuege;

        /**
         * Gets the value of the artAuszug property.
         * 
         * @return
         *     possible object is
         *     {@link CodeMFKREGRegisterauszugsart }
         *     
         */
        public CodeMFKREGRegisterauszugsart getArtAuszug() {
            return artAuszug;
        }

        /**
         * Sets the value of the artAuszug property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeMFKREGRegisterauszugsart }
         *     
         */
        public void setArtAuszug(CodeMFKREGRegisterauszugsart value) {
            this.artAuszug = value;
        }

        /**
         * Gets the value of the stichtagAuszug property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStichtagAuszug() {
            return stichtagAuszug;
        }

        /**
         * Sets the value of the stichtagAuszug property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStichtagAuszug(XMLGregorianCalendar value) {
            this.stichtagAuszug = value;
        }

        /**
         * Gets the value of the richtigkeitVollstaendigkeit property.
         * 
         */
        public boolean isRichtigkeitVollstaendigkeit() {
            return richtigkeitVollstaendigkeit;
        }

        /**
         * Sets the value of the richtigkeitVollstaendigkeit property.
         * 
         */
        public void setRichtigkeitVollstaendigkeit(boolean value) {
            this.richtigkeitVollstaendigkeit = value;
        }

        /**
         * Gets the value of the registerAuszuege property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the registerAuszuege property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRegisterAuszuege().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NachrichtMfkregRegisterauszug3100007 .Fachdaten.RegisterAuszuege }
         * 
         * 
         */
        public List<NachrichtMfkregRegisterauszug3100007 .Fachdaten.RegisterAuszuege> getRegisterAuszuege() {
            if (registerAuszuege == null) {
                registerAuszuege = new ArrayList<NachrichtMfkregRegisterauszug3100007 .Fachdaten.RegisterAuszuege>();
            }
            return this.registerAuszuege;
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
         *         &lt;element name="geschaeftszeichen.BfJ" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC"/>
         *         &lt;element name="gegenstandUndGrund" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
         *         &lt;element name="betrag" type="{http://www.xjustiz.de}Type.GDS.Geldbetrag" minOccurs="0"/>
         *         &lt;element name="datum.anmeldung" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *         &lt;element name="datum.ruecknahme" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="aenderungshistorie" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD" minOccurs="0"/>
         *         &lt;element name="anmeldung.beteiligung" type="{http://www.xjustiz.de}Type.GDS.Beteiligung" maxOccurs="unbounded"/>
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
            "geschaeftszeichenBfJ",
            "gegenstandUndGrund",
            "betrag",
            "datumAnmeldung",
            "datumRuecknahme",
            "aenderungshistorie",
            "anmeldungBeteiligung"
        })
        public static class RegisterAuszuege {

            @XmlElement(name = "geschaeftszeichen.BfJ", required = true)
            protected String geschaeftszeichenBfJ;
            @XmlElement(required = true)
            protected String gegenstandUndGrund;
            protected TypeGDSGeldbetrag betrag;
            @XmlElement(name = "datum.anmeldung", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumAnmeldung;
            @XmlElement(name = "datum.ruecknahme")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datumRuecknahme;
            protected String aenderungshistorie;
            @XmlElement(name = "anmeldung.beteiligung", required = true)
            protected List<TypeGDSBeteiligung> anmeldungBeteiligung;

            /**
             * Gets the value of the geschaeftszeichenBfJ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGeschaeftszeichenBfJ() {
                return geschaeftszeichenBfJ;
            }

            /**
             * Sets the value of the geschaeftszeichenBfJ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGeschaeftszeichenBfJ(String value) {
                this.geschaeftszeichenBfJ = value;
            }

            /**
             * Gets the value of the gegenstandUndGrund property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGegenstandUndGrund() {
                return gegenstandUndGrund;
            }

            /**
             * Sets the value of the gegenstandUndGrund property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGegenstandUndGrund(String value) {
                this.gegenstandUndGrund = value;
            }

            /**
             * Gets the value of the betrag property.
             * 
             * @return
             *     possible object is
             *     {@link TypeGDSGeldbetrag }
             *     
             */
            public TypeGDSGeldbetrag getBetrag() {
                return betrag;
            }

            /**
             * Sets the value of the betrag property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypeGDSGeldbetrag }
             *     
             */
            public void setBetrag(TypeGDSGeldbetrag value) {
                this.betrag = value;
            }

            /**
             * Gets the value of the datumAnmeldung property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatumAnmeldung() {
                return datumAnmeldung;
            }

            /**
             * Sets the value of the datumAnmeldung property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatumAnmeldung(XMLGregorianCalendar value) {
                this.datumAnmeldung = value;
            }

            /**
             * Gets the value of the datumRuecknahme property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatumRuecknahme() {
                return datumRuecknahme;
            }

            /**
             * Sets the value of the datumRuecknahme property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatumRuecknahme(XMLGregorianCalendar value) {
                this.datumRuecknahme = value;
            }

            /**
             * Gets the value of the aenderungshistorie property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAenderungshistorie() {
                return aenderungshistorie;
            }

            /**
             * Sets the value of the aenderungshistorie property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAenderungshistorie(String value) {
                this.aenderungshistorie = value;
            }

            /**
             * Gets the value of the anmeldungBeteiligung property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the anmeldungBeteiligung property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAnmeldungBeteiligung().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeGDSBeteiligung }
             * 
             * 
             */
            public List<TypeGDSBeteiligung> getAnmeldungBeteiligung() {
                if (anmeldungBeteiligung == null) {
                    anmeldungBeteiligung = new ArrayList<TypeGDSBeteiligung>();
                }
                return this.anmeldungBeteiligung;
            }

        }

    }

}