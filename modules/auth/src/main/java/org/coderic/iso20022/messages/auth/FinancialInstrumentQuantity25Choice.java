//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancialInstrumentQuantity25Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrumentQuantity25Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}DecimalNumber"/&gt;
 *         &lt;element name="NmnlVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ActiveOrHistoricCurrencyAndAmount"/&gt;
 *         &lt;element name="MntryVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ActiveOrHistoricCurrencyAndAmount"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentQuantity25Choice", propOrder = {
    "unit",
    "nmnlVal",
    "mntryVal"
})
public class FinancialInstrumentQuantity25Choice {

    @XmlElement(name = "Unit")
    protected BigDecimal unit;
    @XmlElement(name = "NmnlVal")
    protected ActiveOrHistoricCurrencyAndAmount nmnlVal;
    @XmlElement(name = "MntryVal")
    protected ActiveOrHistoricCurrencyAndAmount mntryVal;

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnit(BigDecimal value) {
        this.unit = value;
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

    /**
     * Obtiene el valor de la propiedad mntryVal.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMntryVal() {
        return mntryVal;
    }

    /**
     * Define el valor de la propiedad mntryVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMntryVal(ActiveOrHistoricCurrencyAndAmount value) {
        this.mntryVal = value;
    }

}
