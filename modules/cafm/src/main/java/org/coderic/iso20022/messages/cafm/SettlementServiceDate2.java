//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementServiceDate2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementServiceDate2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="DfrrdSttlmInd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="SttlmTm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOTime" minOccurs="0"/&gt;
 *         &lt;element name="SttlmPrd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SttlmCutOffTm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementServiceDate2", propOrder = {
    "reqdSttlmDt",
    "dfrrdSttlmInd",
    "sttlmDt",
    "sttlmTm",
    "sttlmPrd",
    "sttlmCutOffTm"
})
public class SettlementServiceDate2 {

    @XmlElement(name = "ReqdSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "DfrrdSttlmInd")
    protected Boolean dfrrdSttlmInd;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SttlmTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sttlmTm;
    @XmlElement(name = "SttlmPrd")
    protected String sttlmPrd;
    @XmlElement(name = "SttlmCutOffTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sttlmCutOffTm;

    /**
     * Obtiene el valor de la propiedad reqdSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Define el valor de la propiedad reqdSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad dfrrdSttlmInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdSttlmInd() {
        return dfrrdSttlmInd;
    }

    /**
     * Define el valor de la propiedad dfrrdSttlmInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfrrdSttlmInd(Boolean value) {
        this.dfrrdSttlmInd = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Define el valor de la propiedad sttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmTm() {
        return sttlmTm;
    }

    /**
     * Define el valor de la propiedad sttlmTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmTm(XMLGregorianCalendar value) {
        this.sttlmTm = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmPrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmPrd() {
        return sttlmPrd;
    }

    /**
     * Define el valor de la propiedad sttlmPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmPrd(String value) {
        this.sttlmPrd = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmCutOffTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmCutOffTm() {
        return sttlmCutOffTm;
    }

    /**
     * Define el valor de la propiedad sttlmCutOffTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmCutOffTm(XMLGregorianCalendar value) {
        this.sttlmCutOffTm = value;
    }

}
