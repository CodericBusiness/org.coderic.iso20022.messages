//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetailedAmount22 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetailedAmount22"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO8583AmountTypeCode"/&gt;
 *         &lt;element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}CreditDebit3Code" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ImpliedCurrencyAndAmount"/&gt;
 *         &lt;element name="CrdhldrBllgAmt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="RcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max70Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount22", propOrder = {
    "tp",
    "othrTp",
    "cdtDbt",
    "amt",
    "crdhldrBllgAmt",
    "rcncltnAmt",
    "desc"
})
public class DetailedAmount22 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected BigDecimal crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected BigDecimal rcncltnAmt;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Define el valor de la propiedad othrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
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
     * Obtiene el valor de la propiedad crdhldrBllgAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Define el valor de la propiedad crdhldrBllgAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrdhldrBllgAmt(BigDecimal value) {
        this.crdhldrBllgAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad rcncltnAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Define el valor de la propiedad rcncltnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRcncltnAmt(BigDecimal value) {
        this.rcncltnAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
