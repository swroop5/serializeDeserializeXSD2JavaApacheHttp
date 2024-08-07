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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.GDS.Teilakte complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.GDS.Teilakte">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifikation" type="{http://www.xjustiz.de}Type.GDS.Xdomea.IdentifikationObjektType"/>
 *         &lt;element name="vertraulichkeitsstufe" type="{http://www.xjustiz.de}Code.GDS.Vertraulichkeitsstufe.Typ3" minOccurs="0"/>
 *         &lt;element name="laufzeit" type="{http://www.xjustiz.de}Type.GDS.Xdomea.ZeitraumType" minOccurs="0"/>
 *         &lt;element name="anwendungsspezifischeErweiterung" type="{http://www.xjustiz.de}Type.GDS.Xdomea.AnwendungsspezifischeErweiterungType" minOccurs="0"/>
 *         &lt;element name="xjustiz.fachspezifischeDaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="teilaktentyp" type="{http://www.xjustiz.de}Code.GDS.Teilaktentyp"/>
 *                   &lt;element name="anzeigename" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="person" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="akteneinsicht" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="letztePaginierungProTeilakte" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *                   &lt;element name="inhalt" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="teilakte" type="{http://www.xjustiz.de}Type.GDS.Teilakte" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Dokument" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ruecksendungEEB.erforderlich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="justizinterneDaten" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="roemischPaginiert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="zustellung41StPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "Type.GDS.Teilakte", propOrder = {
    "identifikation",
    "vertraulichkeitsstufe",
    "laufzeit",
    "anwendungsspezifischeErweiterung",
    "xjustizFachspezifischeDaten",
    "justizinterneDaten"
})
public class TypeGDSTeilakte {

    @XmlElement(required = true)
    protected TypeGDSXdomeaIdentifikationObjektType identifikation;
    protected CodeGDSVertraulichkeitsstufeTyp3 vertraulichkeitsstufe;
    protected TypeGDSXdomeaZeitraumType laufzeit;
    protected TypeGDSXdomeaAnwendungsspezifischeErweiterungType anwendungsspezifischeErweiterung;
    @XmlElement(name = "xjustiz.fachspezifischeDaten", required = true)
    protected TypeGDSTeilakte.XjustizFachspezifischeDaten xjustizFachspezifischeDaten;
    protected TypeGDSTeilakte.JustizinterneDaten justizinterneDaten;

    /**
     * Gets the value of the identifikation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaIdentifikationObjektType }
     *     
     */
    public TypeGDSXdomeaIdentifikationObjektType getIdentifikation() {
        return identifikation;
    }

    /**
     * Sets the value of the identifikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaIdentifikationObjektType }
     *     
     */
    public void setIdentifikation(TypeGDSXdomeaIdentifikationObjektType value) {
        this.identifikation = value;
    }

    /**
     * Gets the value of the vertraulichkeitsstufe property.
     * 
     * @return
     *     possible object is
     *     {@link CodeGDSVertraulichkeitsstufeTyp3 }
     *     
     */
    public CodeGDSVertraulichkeitsstufeTyp3 getVertraulichkeitsstufe() {
        return vertraulichkeitsstufe;
    }

    /**
     * Sets the value of the vertraulichkeitsstufe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeGDSVertraulichkeitsstufeTyp3 }
     *     
     */
    public void setVertraulichkeitsstufe(CodeGDSVertraulichkeitsstufeTyp3 value) {
        this.vertraulichkeitsstufe = value;
    }

    /**
     * Gets the value of the laufzeit property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public TypeGDSXdomeaZeitraumType getLaufzeit() {
        return laufzeit;
    }

    /**
     * Sets the value of the laufzeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaZeitraumType }
     *     
     */
    public void setLaufzeit(TypeGDSXdomeaZeitraumType value) {
        this.laufzeit = value;
    }

    /**
     * Gets the value of the anwendungsspezifischeErweiterung property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSXdomeaAnwendungsspezifischeErweiterungType }
     *     
     */
    public TypeGDSXdomeaAnwendungsspezifischeErweiterungType getAnwendungsspezifischeErweiterung() {
        return anwendungsspezifischeErweiterung;
    }

    /**
     * Sets the value of the anwendungsspezifischeErweiterung property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSXdomeaAnwendungsspezifischeErweiterungType }
     *     
     */
    public void setAnwendungsspezifischeErweiterung(TypeGDSXdomeaAnwendungsspezifischeErweiterungType value) {
        this.anwendungsspezifischeErweiterung = value;
    }

    /**
     * Gets the value of the xjustizFachspezifischeDaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSTeilakte.XjustizFachspezifischeDaten }
     *     
     */
    public TypeGDSTeilakte.XjustizFachspezifischeDaten getXjustizFachspezifischeDaten() {
        return xjustizFachspezifischeDaten;
    }

    /**
     * Sets the value of the xjustizFachspezifischeDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSTeilakte.XjustizFachspezifischeDaten }
     *     
     */
    public void setXjustizFachspezifischeDaten(TypeGDSTeilakte.XjustizFachspezifischeDaten value) {
        this.xjustizFachspezifischeDaten = value;
    }

    /**
     * Gets the value of the justizinterneDaten property.
     * 
     * @return
     *     possible object is
     *     {@link TypeGDSTeilakte.JustizinterneDaten }
     *     
     */
    public TypeGDSTeilakte.JustizinterneDaten getJustizinterneDaten() {
        return justizinterneDaten;
    }

    /**
     * Sets the value of the justizinterneDaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeGDSTeilakte.JustizinterneDaten }
     *     
     */
    public void setJustizinterneDaten(TypeGDSTeilakte.JustizinterneDaten value) {
        this.justizinterneDaten = value;
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
     *         &lt;element name="roemischPaginiert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="zustellung41StPO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "roemischPaginiert",
        "zustellung41StPO"
    })
    public static class JustizinterneDaten {

        protected Boolean roemischPaginiert;
        protected Boolean zustellung41StPO;

        /**
         * Gets the value of the roemischPaginiert property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRoemischPaginiert() {
            return roemischPaginiert;
        }

        /**
         * Sets the value of the roemischPaginiert property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRoemischPaginiert(Boolean value) {
            this.roemischPaginiert = value;
        }

        /**
         * Gets the value of the zustellung41StPO property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isZustellung41StPO() {
            return zustellung41StPO;
        }

        /**
         * Sets the value of the zustellung41StPO property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setZustellung41StPO(Boolean value) {
            this.zustellung41StPO = value;
        }

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
     *         &lt;element name="teilaktentyp" type="{http://www.xjustiz.de}Code.GDS.Teilaktentyp"/>
     *         &lt;element name="anzeigename" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="person" type="{http://www.xjustiz.de}Type.GDS.Ref.Beteiligtennummer" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="akteneinsicht" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="letztePaginierungProTeilakte" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
     *         &lt;element name="inhalt" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="teilakte" type="{http://www.xjustiz.de}Type.GDS.Teilakte" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Dokument" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ruecksendungEEB.erforderlich" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
        "teilaktentyp",
        "anzeigename",
        "person",
        "akteneinsicht",
        "letztePaginierungProTeilakte",
        "inhalt",
        "ruecksendungEEBErforderlich"
    })
    public static class XjustizFachspezifischeDaten {

        @XmlElement(required = true)
        protected CodeGDSTeilaktentyp teilaktentyp;
        protected String anzeigename;
        protected List<TypeGDSRefBeteiligtennummer> person;
        protected Boolean akteneinsicht;
        protected String letztePaginierungProTeilakte;
        protected TypeGDSTeilakte.XjustizFachspezifischeDaten.Inhalt inhalt;
        @XmlElement(name = "ruecksendungEEB.erforderlich")
        protected Boolean ruecksendungEEBErforderlich;

        /**
         * Gets the value of the teilaktentyp property.
         * 
         * @return
         *     possible object is
         *     {@link CodeGDSTeilaktentyp }
         *     
         */
        public CodeGDSTeilaktentyp getTeilaktentyp() {
            return teilaktentyp;
        }

        /**
         * Sets the value of the teilaktentyp property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeGDSTeilaktentyp }
         *     
         */
        public void setTeilaktentyp(CodeGDSTeilaktentyp value) {
            this.teilaktentyp = value;
        }

        /**
         * Gets the value of the anzeigename property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnzeigename() {
            return anzeigename;
        }

        /**
         * Sets the value of the anzeigename property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnzeigename(String value) {
            this.anzeigename = value;
        }

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeGDSRefBeteiligtennummer }
         * 
         * 
         */
        public List<TypeGDSRefBeteiligtennummer> getPerson() {
            if (person == null) {
                person = new ArrayList<TypeGDSRefBeteiligtennummer>();
            }
            return this.person;
        }

        /**
         * Gets the value of the akteneinsicht property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAkteneinsicht() {
            return akteneinsicht;
        }

        /**
         * Sets the value of the akteneinsicht property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAkteneinsicht(Boolean value) {
            this.akteneinsicht = value;
        }

        /**
         * Gets the value of the letztePaginierungProTeilakte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLetztePaginierungProTeilakte() {
            return letztePaginierungProTeilakte;
        }

        /**
         * Sets the value of the letztePaginierungProTeilakte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLetztePaginierungProTeilakte(String value) {
            this.letztePaginierungProTeilakte = value;
        }

        /**
         * Gets the value of the inhalt property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSTeilakte.XjustizFachspezifischeDaten.Inhalt }
         *     
         */
        public TypeGDSTeilakte.XjustizFachspezifischeDaten.Inhalt getInhalt() {
            return inhalt;
        }

        /**
         * Sets the value of the inhalt property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSTeilakte.XjustizFachspezifischeDaten.Inhalt }
         *     
         */
        public void setInhalt(TypeGDSTeilakte.XjustizFachspezifischeDaten.Inhalt value) {
            this.inhalt = value;
        }

        /**
         * Gets the value of the ruecksendungEEBErforderlich property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRuecksendungEEBErforderlich() {
            return ruecksendungEEBErforderlich;
        }

        /**
         * Sets the value of the ruecksendungEEBErforderlich property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRuecksendungEEBErforderlich(Boolean value) {
            this.ruecksendungEEBErforderlich = value;
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
         *         &lt;element name="teilakte" type="{http://www.xjustiz.de}Type.GDS.Teilakte" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="dokument" type="{http://www.xjustiz.de}Type.GDS.Dokument" maxOccurs="unbounded" minOccurs="0"/>
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
            "teilakte",
            "dokument"
        })
        public static class Inhalt {

            protected List<TypeGDSTeilakte> teilakte;
            protected List<TypeGDSDokument> dokument;

            /**
             * Gets the value of the teilakte property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the teilakte property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTeilakte().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeGDSTeilakte }
             * 
             * 
             */
            public List<TypeGDSTeilakte> getTeilakte() {
                if (teilakte == null) {
                    teilakte = new ArrayList<TypeGDSTeilakte>();
                }
                return this.teilakte;
            }

            /**
             * Gets the value of the dokument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dokument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDokument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeGDSDokument }
             * 
             * 
             */
            public List<TypeGDSDokument> getDokument() {
                if (dokument == null) {
                    dokument = new ArrayList<TypeGDSDokument>();
                }
                return this.dokument;
            }

        }

    }

}
