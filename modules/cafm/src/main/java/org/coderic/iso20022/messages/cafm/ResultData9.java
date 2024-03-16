//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultData9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultData9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}FileActionResult1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrRslt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISO8583ResponseCode"/&gt;
 *         &lt;element name="OthrRsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultData9", propOrder = {
    "rslt",
    "othrRslt",
    "rsltDtls",
    "othrRsltDtls"
})
public class ResultData9 {

    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected FileActionResult1Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls", required = true)
    protected String rsltDtls;
    @XmlElement(name = "OthrRsltDtls")
    protected String othrRsltDtls;

    /**
     * Obtiene el valor de la propiedad rslt.
     * 
     * @return
     *     possible object is
     *     {@link FileActionResult1Code }
     *     
     */
    public FileActionResult1Code getRslt() {
        return rslt;
    }

    /**
     * Define el valor de la propiedad rslt.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionResult1Code }
     *     
     */
    public void setRslt(FileActionResult1Code value) {
        this.rslt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrRslt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Define el valor de la propiedad othrRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRslt(String value) {
        this.othrRslt = value;
    }

    /**
     * Obtiene el valor de la propiedad rsltDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltDtls() {
        return rsltDtls;
    }

    /**
     * Define el valor de la propiedad rsltDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsltDtls(String value) {
        this.rsltDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad othrRsltDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRsltDtls() {
        return othrRsltDtls;
    }

    /**
     * Define el valor de la propiedad othrRsltDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRsltDtls(String value) {
        this.othrRsltDtls = value;
    }

}
