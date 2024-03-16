//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingAllowedSummary1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancingAllowedSummary1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FincdItmNb" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Number"/&gt;
 *         &lt;element name="TtlAccptdItmsAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="ApldPctg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}PercentageRate" minOccurs="0"/&gt;
 *         &lt;element name="TtlFincdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="FincgDtDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingDateDetails1" minOccurs="0"/&gt;
 *         &lt;element name="CdtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}CashAccount7" minOccurs="0"/&gt;
 *         &lt;element name="FincgAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}CashAccount7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingAllowedSummary1", propOrder = {
    "fincdItmNb",
    "ttlAccptdItmsAmt",
    "apldPctg",
    "ttlFincdAmt",
    "fincgDtDtls",
    "cdtAcct",
    "fincgAcct"
})
public class FinancingAllowedSummary1 {

    @XmlElement(name = "FincdItmNb", required = true)
    protected BigDecimal fincdItmNb;
    @XmlElement(name = "TtlAccptdItmsAmt", required = true)
    protected ActiveCurrencyAndAmount ttlAccptdItmsAmt;
    @XmlElement(name = "ApldPctg")
    protected BigDecimal apldPctg;
    @XmlElement(name = "TtlFincdAmt", required = true)
    protected ActiveCurrencyAndAmount ttlFincdAmt;
    @XmlElement(name = "FincgDtDtls")
    protected FinancingDateDetails1 fincgDtDtls;
    @XmlElement(name = "CdtAcct")
    protected CashAccount7 cdtAcct;
    @XmlElement(name = "FincgAcct")
    protected CashAccount7 fincgAcct;

    /**
     * Obtiene el valor de la propiedad fincdItmNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFincdItmNb() {
        return fincdItmNb;
    }

    /**
     * Define el valor de la propiedad fincdItmNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFincdItmNb(BigDecimal value) {
        this.fincdItmNb = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlAccptdItmsAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlAccptdItmsAmt() {
        return ttlAccptdItmsAmt;
    }

    /**
     * Define el valor de la propiedad ttlAccptdItmsAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlAccptdItmsAmt(ActiveCurrencyAndAmount value) {
        this.ttlAccptdItmsAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad apldPctg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApldPctg() {
        return apldPctg;
    }

    /**
     * Define el valor de la propiedad apldPctg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApldPctg(BigDecimal value) {
        this.apldPctg = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlFincdAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlFincdAmt() {
        return ttlFincdAmt;
    }

    /**
     * Define el valor de la propiedad ttlFincdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlFincdAmt(ActiveCurrencyAndAmount value) {
        this.ttlFincdAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad fincgDtDtls.
     * 
     * @return
     *     possible object is
     *     {@link FinancingDateDetails1 }
     *     
     */
    public FinancingDateDetails1 getFincgDtDtls() {
        return fincgDtDtls;
    }

    /**
     * Define el valor de la propiedad fincgDtDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingDateDetails1 }
     *     
     */
    public void setFincgDtDtls(FinancingDateDetails1 value) {
        this.fincgDtDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Define el valor de la propiedad cdtAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setCdtAcct(CashAccount7 value) {
        this.cdtAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad fincgAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount7 }
     *     
     */
    public CashAccount7 getFincgAcct() {
        return fincgAcct;
    }

    /**
     * Define el valor de la propiedad fincgAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount7 }
     *     
     */
    public void setFincgAcct(CashAccount7 value) {
        this.fincgAcct = value;
    }

}
