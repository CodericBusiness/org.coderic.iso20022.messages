//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para IssuerAndSerialNumber1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IssuerAndSerialNumber1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}CertificateIssuer1"/&gt;
 *         &lt;element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max35Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerAndSerialNumber1", propOrder = {
    "issr",
    "srlNb"
})
public class IssuerAndSerialNumber1 {

    @XmlElement(name = "Issr", required = true)
    protected CertificateIssuer1 issr;
    @XmlElement(name = "SrlNb", required = true)
    protected byte[] srlNb;

    /**
     * Obtiene el valor de la propiedad issr.
     * 
     * @return
     *     possible object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public CertificateIssuer1 getIssr() {
        return issr;
    }

    /**
     * Define el valor de la propiedad issr.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateIssuer1 }
     *     
     */
    public void setIssr(CertificateIssuer1 value) {
        this.issr = value;
    }

    /**
     * Obtiene el valor de la propiedad srlNb.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSrlNb() {
        return srlNb;
    }

    /**
     * Define el valor de la propiedad srlNb.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSrlNb(byte[] value) {
        this.srlNb = value;
    }

}
