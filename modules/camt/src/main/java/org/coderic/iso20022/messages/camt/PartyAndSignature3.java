//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyAndSignature3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyAndSignature3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}PartyIdentification135"/&gt;
 *         &lt;element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}SkipPayload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAndSignature3", propOrder = {
    "pty",
    "sgntr"
})
public class PartyAndSignature3 {

    @XmlElement(name = "Pty", required = true)
    protected PartyIdentification135 pty;
    @XmlElement(name = "Sgntr", required = true)
    protected SkipPayload sgntr;

    /**
     * Obtiene el valor de la propiedad pty.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPty() {
        return pty;
    }

    /**
     * Define el valor de la propiedad pty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setPty(PartyIdentification135 value) {
        this.pty = value;
    }

    /**
     * Obtiene el valor de la propiedad sgntr.
     * 
     * @return
     *     possible object is
     *     {@link SkipPayload }
     *     
     */
    public SkipPayload getSgntr() {
        return sgntr;
    }

    /**
     * Define el valor de la propiedad sgntr.
     * 
     * @param value
     *     allowed object is
     *     {@link SkipPayload }
     *     
     */
    public void setSgntr(SkipPayload value) {
        this.sgntr = value;
    }

}
