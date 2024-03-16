//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportContent1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportContent1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RptLineSeq" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max10NumericText" minOccurs="0"/&gt;
 *         &lt;element name="FrmtdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ReportContent1Choice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent1", propOrder = {
    "rptLineSeq",
    "frmtdCntt"
})
public class ReportContent1 {

    @XmlElement(name = "RptLineSeq")
    protected String rptLineSeq;
    @XmlElement(name = "FrmtdCntt", required = true)
    protected ReportContent1Choice frmtdCntt;

    /**
     * Obtiene el valor de la propiedad rptLineSeq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptLineSeq() {
        return rptLineSeq;
    }

    /**
     * Define el valor de la propiedad rptLineSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptLineSeq(String value) {
        this.rptLineSeq = value;
    }

    /**
     * Obtiene el valor de la propiedad frmtdCntt.
     * 
     * @return
     *     possible object is
     *     {@link ReportContent1Choice }
     *     
     */
    public ReportContent1Choice getFrmtdCntt() {
        return frmtdCntt;
    }

    /**
     * Define el valor de la propiedad frmtdCntt.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportContent1Choice }
     *     
     */
    public void setFrmtdCntt(ReportContent1Choice value) {
        this.frmtdCntt = value;
    }

}
