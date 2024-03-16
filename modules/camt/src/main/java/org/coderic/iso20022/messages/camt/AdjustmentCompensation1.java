//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdjustmentCompensation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentCompensation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitlAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="DueChrgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="AmtDue" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="CompstnAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/&gt;
 *         &lt;element name="CompstnAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DatePeriod5" minOccurs="0"/&gt;
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
@XmlType(name = "AdjustmentCompensation1", propOrder = {
    "initlAmt",
    "dueChrgs",
    "amtDue",
    "compstnAgt",
    "compstnAcct",
    "prd",
    "intrstRate",
    "rsn"
})
public class AdjustmentCompensation1 {

    @XmlElement(name = "InitlAmt")
    protected ActiveCurrencyAndAmount initlAmt;
    @XmlElement(name = "DueChrgs")
    protected ActiveCurrencyAndAmount dueChrgs;
    @XmlElement(name = "AmtDue", required = true)
    protected ActiveCurrencyAndAmount amtDue;
    @XmlElement(name = "CompstnAgt")
    protected BranchAndFinancialInstitutionIdentification6 compstnAgt;
    @XmlElement(name = "CompstnAcct")
    protected CashAccount40 compstnAcct;
    @XmlElement(name = "Prd")
    protected DatePeriod5 prd;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Rsn")
    protected String rsn;

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
     * Obtiene el valor de la propiedad dueChrgs.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDueChrgs() {
        return dueChrgs;
    }

    /**
     * Define el valor de la propiedad dueChrgs.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDueChrgs(ActiveCurrencyAndAmount value) {
        this.dueChrgs = value;
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
     * Obtiene el valor de la propiedad compstnAgt.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCompstnAgt() {
        return compstnAgt;
    }

    /**
     * Define el valor de la propiedad compstnAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCompstnAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.compstnAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad compstnAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCompstnAcct() {
        return compstnAcct;
    }

    /**
     * Define el valor de la propiedad compstnAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCompstnAcct(CashAccount40 value) {
        this.compstnAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad prd.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod5 }
     *     
     */
    public DatePeriod5 getPrd() {
        return prd;
    }

    /**
     * Define el valor de la propiedad prd.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod5 }
     *     
     */
    public void setPrd(DatePeriod5 value) {
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
