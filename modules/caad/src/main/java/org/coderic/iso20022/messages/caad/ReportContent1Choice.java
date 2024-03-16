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
 * <p>Clase Java para ReportContent1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportContent1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Txt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max10MbText"/&gt;
 *         &lt;element name="Binry" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max20MbBinary"/&gt;
 *         &lt;element name="PrtctdData" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ProtectedData1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportContent1Choice", propOrder = {
    "txt",
    "binry",
    "prtctdData"
})
public class ReportContent1Choice {

    @XmlElement(name = "Txt")
    protected String txt;
    @XmlElement(name = "Binry")
    protected byte[] binry;
    @XmlElement(name = "PrtctdData")
    protected ProtectedData1 prtctdData;

    /**
     * Obtiene el valor de la propiedad txt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxt() {
        return txt;
    }

    /**
     * Define el valor de la propiedad txt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxt(String value) {
        this.txt = value;
    }

    /**
     * Obtiene el valor de la propiedad binry.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinry() {
        return binry;
    }

    /**
     * Define el valor de la propiedad binry.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinry(byte[] value) {
        this.binry = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdData.
     * 
     * @return
     *     possible object is
     *     {@link ProtectedData1 }
     *     
     */
    public ProtectedData1 getPrtctdData() {
        return prtctdData;
    }

    /**
     * Define el valor de la propiedad prtctdData.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectedData1 }
     *     
     */
    public void setPrtctdData(ProtectedData1 value) {
        this.prtctdData = value;
    }

}
