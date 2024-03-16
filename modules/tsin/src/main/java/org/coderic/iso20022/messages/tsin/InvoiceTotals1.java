//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceTotals1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceTotals1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TtlTaxblAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Adjustment5" minOccurs="0"/&gt;
 *         &lt;element name="TtlInvcAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="PmtDueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTotals1", propOrder = {
    "ttlTaxblAmt",
    "ttlTaxAmt",
    "adjstmnt",
    "ttlInvcAmt",
    "pmtDueDt"
})
public class InvoiceTotals1 {

    @XmlElement(name = "TtlTaxblAmt", required = true)
    protected ActiveCurrencyAndAmount ttlTaxblAmt;
    @XmlElement(name = "TtlTaxAmt", required = true)
    protected ActiveCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Adjstmnt")
    protected Adjustment5 adjstmnt;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected ActiveCurrencyAndAmount ttlInvcAmt;
    @XmlElement(name = "PmtDueDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;

    /**
     * Obtiene el valor de la propiedad ttlTaxblAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxblAmt() {
        return ttlTaxblAmt;
    }

    /**
     * Define el valor de la propiedad ttlTaxblAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlTaxblAmt(ActiveCurrencyAndAmount value) {
        this.ttlTaxblAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlTaxAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Define el valor de la propiedad ttlTaxAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlTaxAmt(ActiveCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad adjstmnt.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment5 }
     *     
     */
    public Adjustment5 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Define el valor de la propiedad adjstmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment5 }
     *     
     */
    public void setAdjstmnt(Adjustment5 value) {
        this.adjstmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlInvcAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Define el valor de la propiedad ttlInvcAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlInvcAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtDueDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Define el valor de la propiedad pmtDueDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
    }

}
