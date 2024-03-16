//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingInformationAndStatus1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancingInformationAndStatus1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FincgAllwdSummry" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingAllowedSummary1"/&gt;
 *         &lt;element name="InvcFincgDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}InvoiceFinancingDetails1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingInformationAndStatus1", propOrder = {
    "fincgAllwdSummry",
    "invcFincgDtls"
})
public class FinancingInformationAndStatus1 {

    @XmlElement(name = "FincgAllwdSummry", required = true)
    protected FinancingAllowedSummary1 fincgAllwdSummry;
    @XmlElement(name = "InvcFincgDtls", required = true)
    protected List<InvoiceFinancingDetails1> invcFincgDtls;

    /**
     * Obtiene el valor de la propiedad fincgAllwdSummry.
     * 
     * @return
     *     possible object is
     *     {@link FinancingAllowedSummary1 }
     *     
     */
    public FinancingAllowedSummary1 getFincgAllwdSummry() {
        return fincgAllwdSummry;
    }

    /**
     * Define el valor de la propiedad fincgAllwdSummry.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingAllowedSummary1 }
     *     
     */
    public void setFincgAllwdSummry(FinancingAllowedSummary1 value) {
        this.fincgAllwdSummry = value;
    }

    /**
     * Gets the value of the invcFincgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invcFincgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvcFincgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFinancingDetails1 }
     * 
     * 
     */
    public List<InvoiceFinancingDetails1> getInvcFincgDtls() {
        if (invcFincgDtls == null) {
            invcFincgDtls = new ArrayList<InvoiceFinancingDetails1>();
        }
        return this.invcFincgDtls;
    }

}
