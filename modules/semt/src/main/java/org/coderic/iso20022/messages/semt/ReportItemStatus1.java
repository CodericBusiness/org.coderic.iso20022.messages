//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportItemStatus1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportItemStatus1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Xcptn" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemRejectionReason1Choice"/&gt;
 *         &lt;element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}Max210Text" minOccurs="0"/&gt;
 *         &lt;element name="RptItm" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItem1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItemStatus1", propOrder = {
    "xcptn",
    "addtlRsnInf",
    "rptItm"
})
public class ReportItemStatus1 {

    @XmlElement(name = "Xcptn", required = true)
    protected ReportItemRejectionReason1Choice xcptn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;
    @XmlElement(name = "RptItm")
    protected List<ReportItem1> rptItm;

    /**
     * Obtiene el valor de la propiedad xcptn.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemRejectionReason1Choice }
     *     
     */
    public ReportItemRejectionReason1Choice getXcptn() {
        return xcptn;
    }

    /**
     * Define el valor de la propiedad xcptn.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemRejectionReason1Choice }
     *     
     */
    public void setXcptn(ReportItemRejectionReason1Choice value) {
        this.xcptn = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRsnInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Define el valor de la propiedad addtlRsnInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

    /**
     * Gets the value of the rptItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rptItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportItem1 }
     * 
     * 
     */
    public List<ReportItem1> getRptItm() {
        if (rptItm == null) {
            rptItm = new ArrayList<ReportItem1>();
        }
        return this.rptItm;
    }

}
