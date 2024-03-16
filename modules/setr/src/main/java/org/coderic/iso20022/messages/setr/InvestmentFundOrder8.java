//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestmentFundOrder8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestmentFundOrder8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text"/&gt;
 *         &lt;element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CxlRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DealRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InvstmtAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}InvestmentAccount58" minOccurs="0"/&gt;
 *         &lt;element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}FinancialInstrument57" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundOrder8", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "cxlRef",
    "dealRef",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class InvestmentFundOrder8 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount58 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument57 finInstrmDtls;

    /**
     * Obtiene el valor de la propiedad mstrRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Define el valor de la propiedad mstrRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Define el valor de la propiedad ordrRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrRef(String value) {
        this.ordrRef = value;
    }

    /**
     * Obtiene el valor de la propiedad clntRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Define el valor de la propiedad clntRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Obtiene el valor de la propiedad cxlRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Define el valor de la propiedad cxlRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRef(String value) {
        this.cxlRef = value;
    }

    /**
     * Obtiene el valor de la propiedad dealRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Define el valor de la propiedad dealRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealRef(String value) {
        this.dealRef = value;
    }

    /**
     * Obtiene el valor de la propiedad invstmtAcctDtls.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public InvestmentAccount58 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Define el valor de la propiedad invstmtAcctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount58 }
     *     
     */
    public void setInvstmtAcctDtls(InvestmentAccount58 value) {
        this.invstmtAcctDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmDtls.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Define el valor de la propiedad finInstrmDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
    }

}
