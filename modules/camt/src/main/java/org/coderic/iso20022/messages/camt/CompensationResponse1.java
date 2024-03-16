//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CompensationResponse1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CompensationResponse1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Grantd" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}TrueFalseIndicator"/&gt;
 *         &lt;element name="InitlAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="PdChrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="AmtDue" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="XpctdValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DatePeriod2" minOccurs="0"/&gt;
 *         &lt;element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}PercentageRate" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensationResponse1", propOrder = {
    "grantd",
    "initlAmt",
    "pdChrgs",
    "amtDue",
    "xpctdValDt",
    "prd",
    "intrstRate",
    "rsn"
})
public class CompensationResponse1 {

    @XmlElement(name = "Grantd")
    protected boolean grantd;
    @XmlElement(name = "InitlAmt")
    protected ActiveCurrencyAndAmount initlAmt;
    @XmlElement(name = "PdChrgs")
    protected ActiveCurrencyAndAmount pdChrgs;
    @XmlElement(name = "AmtDue")
    protected ActiveCurrencyAndAmount amtDue;
    @XmlElement(name = "XpctdValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdValDt;
    @XmlElement(name = "Prd")
    protected DatePeriod2 prd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Obtiene el valor de la propiedad grantd.
     * 
     */
    public boolean isGrantd() {
        return grantd;
    }

    /**
     * Define el valor de la propiedad grantd.
     * 
     */
    public void setGrantd(boolean value) {
        this.grantd = value;
    }

    /**
     * Obtiene el valor de la propiedad initlAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInitlAmt() {
        return initlAmt;
    }

    /**
     * Define el valor de la propiedad initlAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInitlAmt(ActiveCurrencyAndAmount value) {
        this.initlAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad pdChrgs.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPdChrgs() {
        return pdChrgs;
    }

    /**
     * Define el valor de la propiedad pdChrgs.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPdChrgs(ActiveCurrencyAndAmount value) {
        this.pdChrgs = value;
    }

    /**
     * Obtiene el valor de la propiedad amtDue.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmtDue() {
        return amtDue;
    }

    /**
     * Define el valor de la propiedad amtDue.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmtDue(ActiveCurrencyAndAmount value) {
        this.amtDue = value;
    }

    /**
     * Obtiene el valor de la propiedad xpctdValDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Define el valor de la propiedad xpctdValDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdValDt(XMLGregorianCalendar value) {
        this.xpctdValDt = value;
    }

    /**
     * Obtiene el valor de la propiedad prd.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getPrd() {
        return prd;
    }

    /**
     * Define el valor de la propiedad prd.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setPrd(DatePeriod2 value) {
        this.prd = value;
    }

    /**
     * Obtiene el valor de la propiedad intrstRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Define el valor de la propiedad intrstRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
    }

    /**
     * Obtiene el valor de la propiedad rsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Define el valor de la propiedad rsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

}
