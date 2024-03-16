//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Acquirer7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Acquirer7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcqrgInstn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Brnch" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acquirer7", propOrder = {
    "acqrgInstn",
    "brnch"
})
public class Acquirer7 {

    @XmlElement(name = "AcqrgInstn")
    protected String acqrgInstn;
    @XmlElement(name = "Brnch")
    protected String brnch;

    /**
     * Obtiene el valor de la propiedad acqrgInstn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrgInstn() {
        return acqrgInstn;
    }

    /**
     * Define el valor de la propiedad acqrgInstn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrgInstn(String value) {
        this.acqrgInstn = value;
    }

    /**
     * Obtiene el valor de la propiedad brnch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnch() {
        return brnch;
    }

    /**
     * Define el valor de la propiedad brnch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrnch(String value) {
        this.brnch = value;
    }

}
