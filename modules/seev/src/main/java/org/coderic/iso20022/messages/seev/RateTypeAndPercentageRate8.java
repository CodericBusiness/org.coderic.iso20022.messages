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
 * <p>Clase Java para RateTypeAndPercentageRate8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RateTypeAndPercentageRate8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}RateType42Choice"/&gt;
 *         &lt;element name="Rate" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}PercentageRate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTypeAndPercentageRate8", propOrder = {
    "rateTp",
    "rate"
})
public class RateTypeAndPercentageRate8 {

    @XmlElement(name = "RateTp", required = true)
    protected RateType42Choice rateTp;
    @XmlElement(name = "Rate", required = true)
    protected BigDecimal rate;

    /**
     * Obtiene el valor de la propiedad rateTp.
     * 
     * @return
     *     possible object is
     *     {@link RateType42Choice }
     *     
     */
    public RateType42Choice getRateTp() {
        return rateTp;
    }

    /**
     * Define el valor de la propiedad rateTp.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType42Choice }
     *     
     */
    public void setRateTp(RateType42Choice value) {
        this.rateTp = value;
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
