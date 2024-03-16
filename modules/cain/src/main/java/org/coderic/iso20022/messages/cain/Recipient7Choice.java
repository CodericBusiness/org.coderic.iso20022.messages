//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recipient7Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recipient7Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="KeyTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}KeyTransport6"/&gt;
 *         &lt;element name="KEK" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}KEK6"/&gt;
 *         &lt;element name="KeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}KEKIdentifier6"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient7Choice", propOrder = {
    "keyTrnsprt",
    "kek",
    "keyIdr"
})
public class Recipient7Choice {

    @XmlElement(name = "KeyTrnsprt")
    protected KeyTransport6 keyTrnsprt;
    @XmlElement(name = "KEK")
    protected KEK6 kek;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier6 keyIdr;

    /**
     * Obtiene el valor de la propiedad keyTrnsprt.
     * 
     * @return
     *     possible object is
     *     {@link KeyTransport6 }
     *     
     */
    public KeyTransport6 getKeyTrnsprt() {
        return keyTrnsprt;
    }

    /**
     * Define el valor de la propiedad keyTrnsprt.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTransport6 }
     *     
     */
    public void setKeyTrnsprt(KeyTransport6 value) {
        this.keyTrnsprt = value;
    }

    /**
     * Obtiene el valor de la propiedad kek.
     * 
     * @return
     *     possible object is
     *     {@link KEK6 }
     *     
     */
    public KEK6 getKEK() {
        return kek;
    }

    /**
     * Define el valor de la propiedad kek.
     * 
     * @param value
     *     allowed object is
     *     {@link KEK6 }
     *     
     */
    public void setKEK(KEK6 value) {
        this.kek = value;
    }

    /**
     * Obtiene el valor de la propiedad keyIdr.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier6 }
     *     
     */
    public KEKIdentifier6 getKeyIdr() {
        return keyIdr;
    }

    /**
     * Define el valor de la propiedad keyIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier6 }
     *     
     */
    public void setKeyIdr(KEKIdentifier6 value) {
        this.keyIdr = value;
    }

}
