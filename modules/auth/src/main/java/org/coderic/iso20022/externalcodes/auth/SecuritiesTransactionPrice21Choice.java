//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 08:18:03 PM COT 
//


package org.coderic.iso20022.externalcodes.auth;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecuritiesTransactionPrice21Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice21Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}AmountAndDirection53"/&gt;
 *         &lt;element name="Pctg" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}PercentageRate"/&gt;
 *         &lt;element name="Yld" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}PercentageRate"/&gt;
 *         &lt;element name="BsisPts" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}DecimalNumber"/&gt;
 *         &lt;element name="NmnlVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ActiveOrHistoricCurrencyAndAmount"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice21Choice", propOrder = {
    "mntryVal",
    "pctg",
    "yld",
    "bsisPts",
    "nmnlVal"
})
public class SecuritiesTransactionPrice21Choice {

    @XmlElement(name = "MntryVal")
    protected AmountAndDirection53 mntryVal;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "Yld")
    protected BigDecimal yld;
    @XmlElement(name = "BsisPts")
    protected BigDecimal bsisPts;
    @XmlElement(name = "NmnlVal")
    protected ActiveOrHistoricCurrencyAndAmount nmnlVal;

    /**
     * Obtiene el valor de la propiedad mntryVal.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMntryVal() {
        return mntryVal;
    }

    /**
     * Define el valor de la propiedad mntryVal.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setMntryVal(AmountAndDirection53 value) {
        this.mntryVal = value;
    }

    /**
     * Obtiene el valor de la propiedad pctg.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Define el valor de la propiedad pctg.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctg(BigDecimal value) {
        this.pctg = value;
    }

    /**
     * Obtiene el valor de la propiedad yld.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYld() {
        return yld;
    }

    /**
     * Define el valor de la propiedad yld.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYld(BigDecimal value) {
        this.yld = value;
    }

    /**
     * Obtiene el valor de la propiedad bsisPts.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBsisPts() {
        return bsisPts;
    }

    /**
     * Define el valor de la propiedad bsisPts.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBsisPts(BigDecimal value) {
        this.bsisPts = value;
    }

    /**
     * Obtiene el valor de la propiedad nmnlVal.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Define el valor de la propiedad nmnlVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setNmnlVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.nmnlVal = value;
    }

}
