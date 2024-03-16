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
 * <p>Clase Java para ChargeBackResponseV02 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChargeBackResponseV02"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Header61"/&gt;
 *         &lt;element name="Body" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ChargeBackResponse2"/&gt;
 *         &lt;element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ContentInformationType20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBackResponseV02", propOrder = {
    "hdr",
    "body",
    "sctyTrlr"
})
public class ChargeBackResponseV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header61 hdr;
    @XmlElement(name = "Body", required = true)
    protected ChargeBackResponse2 body;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType20 sctyTrlr;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link Header61 }
     *     
     */
    public Header61 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link Header61 }
     *     
     */
    public void setHdr(Header61 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBackResponse2 }
     *     
     */
    public ChargeBackResponse2 getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBackResponse2 }
     *     
     */
    public void setBody(ChargeBackResponse2 value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad sctyTrlr.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType20 }
     *     
     */
    public ContentInformationType20 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Define el valor de la propiedad sctyTrlr.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType20 }
     *     
     */
    public void setSctyTrlr(ContentInformationType20 value) {
        this.sctyTrlr = value;
    }

}
