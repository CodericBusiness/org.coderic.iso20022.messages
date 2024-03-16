//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Period11Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Period11Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODate"/&gt;
 *         &lt;element name="FrDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODate"/&gt;
 *         &lt;element name="ToDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODate"/&gt;
 *         &lt;element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Period2"/&gt;
 *         &lt;element name="FrToDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}DateTimePeriod1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period11Choice", propOrder = {
    "dt",
    "frDt",
    "toDt",
    "frToDt",
    "frToDtTm"
})
public class Period11Choice {

    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "FrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frDt;
    @XmlElement(name = "ToDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toDt;
    @XmlElement(name = "FrToDt")
    protected Period2 frToDt;
    @XmlElement(name = "FrToDtTm")
    protected DateTimePeriod1 frToDtTm;

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Obtiene el valor de la propiedad frDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrDt() {
        return frDt;
    }

    /**
     * Define el valor de la propiedad frDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrDt(XMLGregorianCalendar value) {
        this.frDt = value;
    }

    /**
     * Obtiene el valor de la propiedad toDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDt() {
        return toDt;
    }

    /**
     * Define el valor de la propiedad toDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDt(XMLGregorianCalendar value) {
        this.toDt = value;
    }

    /**
     * Obtiene el valor de la propiedad frToDt.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getFrToDt() {
        return frToDt;
    }

    /**
     * Define el valor de la propiedad frToDt.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public void setFrToDt(Period2 value) {
        this.frToDt = value;
    }

    /**
     * Obtiene el valor de la propiedad frToDtTm.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getFrToDtTm() {
        return frToDtTm;
    }

    /**
     * Define el valor de la propiedad frToDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setFrToDtTm(DateTimePeriod1 value) {
        this.frToDtTm = value;
    }

}
