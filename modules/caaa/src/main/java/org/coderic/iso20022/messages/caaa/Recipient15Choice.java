//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Recipient15Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recipient15Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="KeyTrnsprt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}KeyTransport10"/&gt;
 *         &lt;element name="KEK" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}KEK9"/&gt;
 *         &lt;element name="KeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}KEKIdentifier7"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient15Choice", propOrder = {
    "keyTrnsprt",
    "kek",
    "keyIdr"
})
public class Recipient15Choice {

    @XmlElement(name = "KeyTrnsprt")
    protected KeyTransport10 keyTrnsprt;
    @XmlElement(name = "KEK")
    protected KEK9 kek;
    @XmlElement(name = "KeyIdr")
    protected KEKIdentifier7 keyIdr;

    /**
     * Obtiene el valor de la propiedad keyTrnsprt.
     * 
     * @return
     *     possible object is
     *     {@link KeyTransport10 }
     *     
     */
    public KeyTransport10 getKeyTrnsprt() {
        return keyTrnsprt;
    }

    /**
     * Define el valor de la propiedad keyTrnsprt.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyTransport10 }
     *     
     */
    public void setKeyTrnsprt(KeyTransport10 value) {
        this.keyTrnsprt = value;
    }

    /**
     * Obtiene el valor de la propiedad kek.
     * 
     * @return
     *     possible object is
     *     {@link KEK9 }
     *     
     */
    public KEK9 getKEK() {
        return kek;
    }

    /**
     * Define el valor de la propiedad kek.
     * 
     * @param value
     *     allowed object is
     *     {@link KEK9 }
     *     
     */
    public void setKEK(KEK9 value) {
        this.kek = value;
    }

    /**
     * Obtiene el valor de la propiedad keyIdr.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier7 }
     *     
     */
    public KEKIdentifier7 getKeyIdr() {
        return keyIdr;
    }

    /**
     * Define el valor de la propiedad keyIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier7 }
     *     
     */
    public void setKeyIdr(KEKIdentifier7 value) {
        this.keyIdr = value;
    }

}
