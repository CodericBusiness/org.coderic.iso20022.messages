//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetailerSaleEnvironment2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RetailerSaleEnvironment2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleCpblties" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}SaleCapabilities1Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="MinAmtToDlvr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="MaxCshBckAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="MinSpltAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="DbtPrefrdFlg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="LltyHdlg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}LoyaltyHandling1Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerSaleEnvironment2", propOrder = {
    "saleCpblties",
    "ccy",
    "minAmtToDlvr",
    "maxCshBckAmt",
    "minSpltAmt",
    "dbtPrefrdFlg",
    "lltyHdlg"
})
public class RetailerSaleEnvironment2 {

    @XmlElement(name = "SaleCpblties")
    @XmlSchemaType(name = "string")
    protected List<SaleCapabilities1Code> saleCpblties;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MinAmtToDlvr")
    protected BigDecimal minAmtToDlvr;
    @XmlElement(name = "MaxCshBckAmt")
    protected BigDecimal maxCshBckAmt;
    @XmlElement(name = "MinSpltAmt")
    protected BigDecimal minSpltAmt;
    @XmlElement(name = "DbtPrefrdFlg")
    protected Boolean dbtPrefrdFlg;
    @XmlElement(name = "LltyHdlg")
    @XmlSchemaType(name = "string")
    protected LoyaltyHandling1Code lltyHdlg;

    /**
     * Gets the value of the saleCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the saleCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleCapabilities1Code }
     * 
     * 
     */
    public List<SaleCapabilities1Code> getSaleCpblties() {
        if (saleCpblties == null) {
            saleCpblties = new ArrayList<SaleCapabilities1Code>();
        }
        return this.saleCpblties;
    }

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
     * Obtiene el valor de la propiedad minAmtToDlvr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinAmtToDlvr() {
        return minAmtToDlvr;
    }

    /**
     * Define el valor de la propiedad minAmtToDlvr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinAmtToDlvr(BigDecimal value) {
        this.minAmtToDlvr = value;
    }

    /**
     * Obtiene el valor de la propiedad maxCshBckAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxCshBckAmt() {
        return maxCshBckAmt;
    }

    /**
     * Define el valor de la propiedad maxCshBckAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxCshBckAmt(BigDecimal value) {
        this.maxCshBckAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad minSpltAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinSpltAmt() {
        return minSpltAmt;
    }

    /**
     * Define el valor de la propiedad minSpltAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinSpltAmt(BigDecimal value) {
        this.minSpltAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtPrefrdFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDbtPrefrdFlg() {
        return dbtPrefrdFlg;
    }

    /**
     * Define el valor de la propiedad dbtPrefrdFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDbtPrefrdFlg(Boolean value) {
        this.dbtPrefrdFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad lltyHdlg.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyHandling1Code }
     *     
     */
    public LoyaltyHandling1Code getLltyHdlg() {
        return lltyHdlg;
    }

    /**
     * Define el valor de la propiedad lltyHdlg.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyHandling1Code }
     *     
     */
    public void setLltyHdlg(LoyaltyHandling1Code value) {
        this.lltyHdlg = value;
    }

}
