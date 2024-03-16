//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RateAndAmountFormat40Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RateAndAmountFormat40Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}PercentageRate"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ActiveCurrencyAnd13DecimalAmount"/&gt;
 *         &lt;element name="RateTpAndRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}RateTypeAndPercentageRate8"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateAndAmountFormat40Choice", propOrder = {
    "rate",
    "amt",
    "rateTpAndRate"
})
public class RateAndAmountFormat40Choice {

    @XmlElement(name = "Rate")
    protected BigDecimal rate;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "RateTpAndRate")
    protected RateTypeAndPercentageRate8 rateTpAndRate;

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

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad rateTpAndRate.
     * 
     * @return
     *     possible object is
     *     {@link RateTypeAndPercentageRate8 }
     *     
     */
    public RateTypeAndPercentageRate8 getRateTpAndRate() {
        return rateTpAndRate;
    }

    /**
     * Define el valor de la propiedad rateTpAndRate.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypeAndPercentageRate8 }
     *     
     */
    public void setRateTpAndRate(RateTypeAndPercentageRate8 value) {
        this.rateTpAndRate = value;
    }

}
