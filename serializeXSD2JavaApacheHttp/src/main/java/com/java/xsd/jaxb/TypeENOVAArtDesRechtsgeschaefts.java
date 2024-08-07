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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Type.ENOVA.ArtDesRechtsgeschaefts complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Type.ENOVA.ArtDesRechtsgeschaefts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="art" type="{http://www.xjustiz.de}Code.ENOVA.ArtDesRechtsgeschaefts" minOccurs="0"/>
 *         &lt;element name="freitext" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeC" minOccurs="0"/>
 *         &lt;element name="rechtswirksamkeit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="auswahl_genehmigendePerson" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="beteiligter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/>
 *                   &lt;element name="dritter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="datumDerRechtswirksamkeit" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Type.ENOVA.ArtDesRechtsgeschaefts", propOrder = {
    "art",
    "freitext",
    "rechtswirksamkeit",
    "auswahlGenehmigendePerson",
    "datumDerRechtswirksamkeit"
})
public class TypeENOVAArtDesRechtsgeschaefts {

    protected CodeENOVAArtDesRechtsgeschaefts art;
    protected String freitext;
    protected Boolean rechtswirksamkeit;
    @XmlElement(name = "auswahl_genehmigendePerson")
    protected TypeENOVAArtDesRechtsgeschaefts.AuswahlGenehmigendePerson auswahlGenehmigendePerson;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumDerRechtswirksamkeit;

    /**
     * Gets the value of the art property.
     * 
     * @return
     *     possible object is
     *     {@link CodeENOVAArtDesRechtsgeschaefts }
     *     
     */
    public CodeENOVAArtDesRechtsgeschaefts getArt() {
        return art;
    }

    /**
     * Sets the value of the art property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeENOVAArtDesRechtsgeschaefts }
     *     
     */
    public void setArt(CodeENOVAArtDesRechtsgeschaefts value) {
        this.art = value;
    }

    /**
     * Gets the value of the freitext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreitext() {
        return freitext;
    }

    /**
     * Sets the value of the freitext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreitext(String value) {
        this.freitext = value;
    }

    /**
     * Gets the value of the rechtswirksamkeit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRechtswirksamkeit() {
        return rechtswirksamkeit;
    }

    /**
     * Sets the value of the rechtswirksamkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRechtswirksamkeit(Boolean value) {
        this.rechtswirksamkeit = value;
    }

    /**
     * Gets the value of the auswahlGenehmigendePerson property.
     * 
     * @return
     *     possible object is
     *     {@link TypeENOVAArtDesRechtsgeschaefts.AuswahlGenehmigendePerson }
     *     
     */
    public TypeENOVAArtDesRechtsgeschaefts.AuswahlGenehmigendePerson getAuswahlGenehmigendePerson() {
        return auswahlGenehmigendePerson;
    }

    /**
     * Sets the value of the auswahlGenehmigendePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeENOVAArtDesRechtsgeschaefts.AuswahlGenehmigendePerson }
     *     
     */
    public void setAuswahlGenehmigendePerson(TypeENOVAArtDesRechtsgeschaefts.AuswahlGenehmigendePerson value) {
        this.auswahlGenehmigendePerson = value;
    }

    /**
     * Gets the value of the datumDerRechtswirksamkeit property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumDerRechtswirksamkeit() {
        return datumDerRechtswirksamkeit;
    }

    /**
     * Sets the value of the datumDerRechtswirksamkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumDerRechtswirksamkeit(XMLGregorianCalendar value) {
        this.datumDerRechtswirksamkeit = value;
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
     *       &lt;choice>
     *         &lt;element name="beteiligter" type="{http://www.xjustiz.de}Type.GDS.Ref.Rollennummer"/>
     *         &lt;element name="dritter" type="{urn:xoev-de:kosit:xoev:datentyp:din-spec-91379_2019-03}datatypeD"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "beteiligter",
        "dritter"
    })
    public static class AuswahlGenehmigendePerson {

        protected TypeGDSRefRollennummer beteiligter;
        protected String dritter;

        /**
         * Gets the value of the beteiligter property.
         * 
         * @return
         *     possible object is
         *     {@link TypeGDSRefRollennummer }
         *     
         */
        public TypeGDSRefRollennummer getBeteiligter() {
            return beteiligter;
        }

        /**
         * Sets the value of the beteiligter property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeGDSRefRollennummer }
         *     
         */
        public void setBeteiligter(TypeGDSRefRollennummer value) {
            this.beteiligter = value;
        }

        /**
         * Gets the value of the dritter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDritter() {
            return dritter;
        }

        /**
         * Sets the value of the dritter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDritter(String value) {
            this.dritter = value;
        }

    }

}
