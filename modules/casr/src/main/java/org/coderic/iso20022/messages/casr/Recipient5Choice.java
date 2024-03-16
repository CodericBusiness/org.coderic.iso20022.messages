//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recipient5Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recipient5Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IssrAndSrlNb" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}IssuerAndSerialNumber1"/&gt;
 *         &lt;element name="KeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}KEKIdentifier2"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient5Choice", propOrder = {
    "issrAndSrlNb",
    "keyIdr"
})
public class Recipient5Choice {

    @XmlElement(name = "IssrAndSrlNb")
    protected IssuerAndSerialNumber1 issrAndSrlNb;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier2 keyIdr;

    /**
     * Obtiene el valor de la propiedad issrAndSrlNb.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumber1 }
     *     
     */
    public IssuerAndSerialNumber1 getIssrAndSrlNb() {
        return issrAndSrlNb;
    }

    /**
     * Define el valor de la propiedad issrAndSrlNb.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumber1 }
     *     
     */
    public void setIssrAndSrlNb(IssuerAndSerialNumber1 value) {
        this.issrAndSrlNb = value;
    }

    /**
     * Obtiene el valor de la propiedad keyIdr.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public KEKIdentifier2 getKeyIdr() {
        return keyIdr;
    }

    /**
     * Define el valor de la propiedad keyIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public void setKeyIdr(KEKIdentifier2 value) {
        this.keyIdr = value;
    }

}
