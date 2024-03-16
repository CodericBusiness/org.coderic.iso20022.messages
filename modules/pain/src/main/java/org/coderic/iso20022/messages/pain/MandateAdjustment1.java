//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MandateAdjustment1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MandateAdjustment1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DtAdjstmntRuleInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}TrueFalseIndicator"/&gt;
 *         &lt;element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Frequency37Choice" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PercentageRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAdjustment1", propOrder = {
    "dtAdjstmntRuleInd",
    "ctgy",
    "amt",
    "rate"
})
public class MandateAdjustment1 {

    @XmlElement(name = "DtAdjstmntRuleInd")
    protected boolean dtAdjstmntRuleInd;
    @XmlElement(name = "Ctgy")
    protected Frequency37Choice ctgy;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "Rate")
    protected BigDecimal rate;

    /**
     * Obtiene el valor de la propiedad dtAdjstmntRuleInd.
     * 
     */
    public boolean isDtAdjstmntRuleInd() {
        return dtAdjstmntRuleInd;
    }

    /**
     * Define el valor de la propiedad dtAdjstmntRuleInd.
     * 
     */
    public void setDtAdjstmntRuleInd(boolean value) {
        this.dtAdjstmntRuleInd = value;
    }

    /**
     * Obtiene el valor de la propiedad ctgy.
     * 
     * @return
     *     possible object is
     *     {@link Frequency37Choice }
     *     
     */
    public Frequency37Choice getCtgy() {
        return ctgy;
    }

    /**
     * Define el valor de la propiedad ctgy.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency37Choice }
     *     
     */
    public void setCtgy(Frequency37Choice value) {
        this.ctgy = value;
    }

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad rate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Define el valor de la propiedad rate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

}
