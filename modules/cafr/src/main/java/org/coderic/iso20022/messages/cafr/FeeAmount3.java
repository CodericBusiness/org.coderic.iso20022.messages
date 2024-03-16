//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:28 PM COT 
//


package org.coderic.iso20022.messages.cafr;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeeAmount3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeeAmount3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}ImpliedCurrencyAndAmount"/&gt;
 *         &lt;element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}CreditDebit3Code" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}ISO3NumericCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="FctvXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}BaseOne25Rate" minOccurs="0"/&gt;
 *         &lt;element name="ConvsDt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="ConvsTm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}ISOTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAmount3", propOrder = {
    "amt",
    "cdtDbt",
    "ccy",
    "fctvXchgRate",
    "convsDt",
    "convsTm"
})
public class FeeAmount3 {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "FctvXchgRate")
    protected BigDecimal fctvXchgRate;
    @XmlElement(name = "ConvsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar convsDt;
    @XmlElement(name = "ConvsTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar convsTm;

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtDbt.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Define el valor de la propiedad cdtDbt.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

    /**
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Obtiene el valor de la propiedad fctvXchgRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctvXchgRate() {
        return fctvXchgRate;
    }

    /**
     * Define el valor de la propiedad fctvXchgRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFctvXchgRate(BigDecimal value) {
        this.fctvXchgRate = value;
    }

    /**
     * Obtiene el valor de la propiedad convsDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvsDt() {
        return convsDt;
    }

    /**
     * Define el valor de la propiedad convsDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvsDt(XMLGregorianCalendar value) {
        this.convsDt = value;
    }

    /**
     * Obtiene el valor de la propiedad convsTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvsTm() {
        return convsTm;
    }

    /**
     * Define el valor de la propiedad convsTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvsTm(XMLGregorianCalendar value) {
        this.convsTm = value;
    }

}
