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
 * <p>Clase Java para DetailedAmount17 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetailedAmount17"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmtToTrf" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ImpliedCurrencyAndAmount"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Fees" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}DetailedAmount18" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dontn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}DetailedAmount18" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount17", propOrder = {
    "amtToTrf",
    "ccy",
    "fees",
    "dontn"
})
public class DetailedAmount17 {

    @XmlElement(name = "AmtToTrf", required = true)
    protected BigDecimal amtToTrf;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount18> fees;
    @XmlElement(name = "Dontn")
    protected List<DetailedAmount18> dontn;

    /**
     * Obtiene el valor de la propiedad amtToTrf.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtToTrf() {
        return amtToTrf;
    }

    /**
     * Define el valor de la propiedad amtToTrf.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtToTrf(BigDecimal value) {
        this.amtToTrf = value;
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
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     */
    public List<DetailedAmount18> getFees() {
        if (fees == null) {
            fees = new ArrayList<DetailedAmount18>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the dontn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dontn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     */
    public List<DetailedAmount18> getDontn() {
        if (dontn == null) {
            dontn = new ArrayList<DetailedAmount18>();
        }
        return this.dontn;
    }

}
