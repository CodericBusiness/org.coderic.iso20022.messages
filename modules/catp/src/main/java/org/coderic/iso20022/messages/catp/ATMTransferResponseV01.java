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
 * <p>Clase Java para ATMTransferResponseV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMTransferResponseV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Header31"/&gt;
 *         &lt;element name="PrtctdATMTrfRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType10" minOccurs="0"/&gt;
 *         &lt;element name="ATMTrfRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMTransferResponse1" minOccurs="0"/&gt;
 *         &lt;element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType15" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransferResponseV01", propOrder = {
    "hdr",
    "prtctdATMTrfRspn",
    "atmTrfRspn",
    "sctyTrlr"
})
public class ATMTransferResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMTrfRspn")
    protected ContentInformationType10 prtctdATMTrfRspn;
    @XmlElement(name = "ATMTrfRspn")
    protected ATMTransferResponse1 atmTrfRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link Header31 }
     *     
     */
    public Header31 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link Header31 }
     *     
     */
    public void setHdr(Header31 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdATMTrfRspn.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMTrfRspn() {
        return prtctdATMTrfRspn;
    }

    /**
     * Define el valor de la propiedad prtctdATMTrfRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdATMTrfRspn(ContentInformationType10 value) {
        this.prtctdATMTrfRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad atmTrfRspn.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransferResponse1 }
     *     
     */
    public ATMTransferResponse1 getATMTrfRspn() {
        return atmTrfRspn;
    }

    /**
     * Define el valor de la propiedad atmTrfRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransferResponse1 }
     *     
     */
    public void setATMTrfRspn(ATMTransferResponse1 value) {
        this.atmTrfRspn = value;
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
