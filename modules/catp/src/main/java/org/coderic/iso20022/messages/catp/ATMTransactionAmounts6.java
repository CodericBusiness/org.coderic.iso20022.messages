//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMTransactionAmounts6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMTransactionAmounts6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="MaxPssblAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="MinPssblAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMTransactionAmounts7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransactionAmounts6", propOrder = {
    "ccy",
    "maxPssblAmt",
    "minPssblAmt",
    "addtlAmt"
})
public class ATMTransactionAmounts6 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MaxPssblAmt")
    protected BigDecimal maxPssblAmt;
    @XmlElement(name = "MinPssblAmt")
    protected BigDecimal minPssblAmt;
    @XmlElement(name = "AddtlAmt")
    protected List<ATMTransactionAmounts7> addtlAmt;

    /**
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Obtiene el valor de la propiedad maxPssblAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxPssblAmt() {
        return maxPssblAmt;
    }

    /**
     * Define el valor de la propiedad maxPssblAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxPssblAmt(BigDecimal value) {
        this.maxPssblAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad minPssblAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinPssblAmt() {
        return minPssblAmt;
    }

    /**
     * Define el valor de la propiedad minPssblAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinPssblAmt(BigDecimal value) {
        this.minPssblAmt = value;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTransactionAmounts7 }
     * 
     * 
     */
    public List<ATMTransactionAmounts7> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<ATMTransactionAmounts7>();
        }
        return this.addtlAmt;
    }

}
