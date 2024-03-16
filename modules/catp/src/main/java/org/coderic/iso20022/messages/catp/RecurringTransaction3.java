//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RecurringTransaction3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RecurringTransaction3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODate"/&gt;
 *         &lt;element name="NbOfOcrncs" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODate"/&gt;
 *         &lt;element name="PrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Frequency3Code" minOccurs="0"/&gt;
 *         &lt;element name="IntrvlDay" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Number" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTransaction3", propOrder = {
    "startDt",
    "nbOfOcrncs",
    "endDt",
    "prdUnit",
    "intrvlDay"
})
public class RecurringTransaction3 {

    @XmlElement(name = "StartDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "NbOfOcrncs")
    protected BigDecimal nbOfOcrncs;
    @XmlElement(name = "EndDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency3Code prdUnit;
    @XmlElement(name = "IntrvlDay")
    protected BigDecimal intrvlDay;

    /**
     * Obtiene el valor de la propiedad startDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Define el valor de la propiedad startDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Obtiene el valor de la propiedad nbOfOcrncs.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfOcrncs() {
        return nbOfOcrncs;
    }

    /**
     * Define el valor de la propiedad nbOfOcrncs.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfOcrncs(BigDecimal value) {
        this.nbOfOcrncs = value;
    }

    /**
     * Obtiene el valor de la propiedad endDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Define el valor de la propiedad endDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
    }

    /**
     * Obtiene el valor de la propiedad prdUnit.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Code }
     *     
     */
    public Frequency3Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Define el valor de la propiedad prdUnit.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Code }
     *     
     */
    public void setPrdUnit(Frequency3Code value) {
        this.prdUnit = value;
    }

    /**
     * Obtiene el valor de la propiedad intrvlDay.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrvlDay() {
        return intrvlDay;
    }

    /**
     * Define el valor de la propiedad intrvlDay.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrvlDay(BigDecimal value) {
        this.intrvlDay = value;
    }

}
