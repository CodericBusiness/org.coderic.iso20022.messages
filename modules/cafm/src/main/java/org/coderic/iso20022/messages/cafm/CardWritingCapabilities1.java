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
 * <p>Clase Java para CardWritingCapabilities1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardWritingCapabilities1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardDataWriting1Code"/&gt;
 *         &lt;element name="OthrCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardWritingCapabilities1", propOrder = {
    "cpblty",
    "othrCpblty"
})
public class CardWritingCapabilities1 {

    @XmlElement(name = "Cpblty", required = true)
    @XmlSchemaType(name = "string")
    protected CardDataWriting1Code cpblty;
    @XmlElement(name = "OthrCpblty")
    protected String othrCpblty;

    /**
     * Obtiene el valor de la propiedad cpblty.
     * 
     * @return
     *     possible object is
     *     {@link CardDataWriting1Code }
     *     
     */
    public CardDataWriting1Code getCpblty() {
        return cpblty;
    }

    /**
     * Define el valor de la propiedad cpblty.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataWriting1Code }
     *     
     */
    public void setCpblty(CardDataWriting1Code value) {
        this.cpblty = value;
    }

    /**
     * Obtiene el valor de la propiedad othrCpblty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCpblty() {
        return othrCpblty;
    }

    /**
     * Define el valor de la propiedad othrCpblty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrCpblty(String value) {
        this.othrCpblty = value;
    }

}
