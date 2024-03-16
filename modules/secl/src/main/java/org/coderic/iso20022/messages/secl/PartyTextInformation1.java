//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyTextInformation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyTextInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DclrtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max350Text" minOccurs="0"/&gt;
 *         &lt;element name="PtyCtctDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max350Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyTextInformation1", propOrder = {
    "dclrtnDtls",
    "ptyCtctDtls",
    "regnDtls"
})
public class PartyTextInformation1 {

    @XmlElement(name = "DclrtnDtls")
    protected String dclrtnDtls;
    @XmlElement(name = "PtyCtctDtls")
    protected String ptyCtctDtls;
    @XmlElement(name = "RegnDtls")
    protected String regnDtls;

    /**
     * Obtiene el valor de la propiedad dclrtnDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Define el valor de la propiedad dclrtnDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDclrtnDtls(String value) {
        this.dclrtnDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad ptyCtctDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyCtctDtls() {
        return ptyCtctDtls;
    }

    /**
     * Define el valor de la propiedad ptyCtctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyCtctDtls(String value) {
        this.ptyCtctDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad regnDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnDtls() {
        return regnDtls;
    }

    /**
     * Define el valor de la propiedad regnDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnDtls(String value) {
        this.regnDtls = value;
    }

}
