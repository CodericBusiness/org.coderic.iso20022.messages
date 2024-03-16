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
 * <p>Clase Java para Recipient13Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Recipient13Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="IssrAndSrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}IssuerAndSerialNumber2"/&gt;
 *         &lt;element name="SbjtKeyIdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max140Binary"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient13Choice", propOrder = {
    "issrAndSrlNb",
    "sbjtKeyIdr"
})
public class Recipient13Choice {

    @XmlElement(name = "IssrAndSrlNb")
    protected IssuerAndSerialNumber2 issrAndSrlNb;
    @XmlElement(name = "SbjtKeyIdr")
    protected byte[] sbjtKeyIdr;

    /**
     * Obtiene el valor de la propiedad issrAndSrlNb.
     * 
     * @return
     *     possible object is
     *     {@link IssuerAndSerialNumber2 }
     *     
     */
    public IssuerAndSerialNumber2 getIssrAndSrlNb() {
        return issrAndSrlNb;
    }

    /**
     * Define el valor de la propiedad issrAndSrlNb.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerAndSerialNumber2 }
     *     
     */
    public void setIssrAndSrlNb(IssuerAndSerialNumber2 value) {
        this.issrAndSrlNb = value;
    }

    /**
     * Obtiene el valor de la propiedad sbjtKeyIdr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSbjtKeyIdr() {
        return sbjtKeyIdr;
    }

    /**
     * Define el valor de la propiedad sbjtKeyIdr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSbjtKeyIdr(byte[] value) {
        this.sbjtKeyIdr = value;
    }

}
