//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMExceptionAcknowledgementV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMExceptionAcknowledgementV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Header32"/&gt;
 *         &lt;element name="PrtctdATMXcptnAck" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ContentInformationType10" minOccurs="0"/&gt;
 *         &lt;element name="ATMXcptnAck" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMExceptionAcknowledgement1" minOccurs="0"/&gt;
 *         &lt;element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ContentInformationType15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMExceptionAcknowledgementV01", propOrder = {
    "hdr",
    "prtctdATMXcptnAck",
    "atmXcptnAck",
    "sctyTrlr"
})
public class ATMExceptionAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header32 hdr;
    @XmlElement(name = "PrtctdATMXcptnAck")
    protected ContentInformationType10 prtctdATMXcptnAck;
    @XmlElement(name = "ATMXcptnAck")
    protected ATMExceptionAcknowledgement1 atmXcptnAck;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link Header32 }
     *     
     */
    public Header32 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link Header32 }
     *     
     */
    public void setHdr(Header32 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdATMXcptnAck.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMXcptnAck() {
        return prtctdATMXcptnAck;
    }

    /**
     * Define el valor de la propiedad prtctdATMXcptnAck.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdATMXcptnAck(ContentInformationType10 value) {
        this.prtctdATMXcptnAck = value;
    }

    /**
     * Obtiene el valor de la propiedad atmXcptnAck.
     * 
     * @return
     *     possible object is
     *     {@link ATMExceptionAcknowledgement1 }
     *     
     */
    public ATMExceptionAcknowledgement1 getATMXcptnAck() {
        return atmXcptnAck;
    }

    /**
     * Define el valor de la propiedad atmXcptnAck.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMExceptionAcknowledgement1 }
     *     
     */
    public void setATMXcptnAck(ATMExceptionAcknowledgement1 value) {
        this.atmXcptnAck = value;
    }

    /**
     * Obtiene el valor de la propiedad sctyTrlr.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Define el valor de la propiedad sctyTrlr.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public void setSctyTrlr(ContentInformationType15 value) {
        this.sctyTrlr = value;
    }

}
