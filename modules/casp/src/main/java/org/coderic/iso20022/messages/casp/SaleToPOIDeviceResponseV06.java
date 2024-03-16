//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaleToPOIDeviceResponseV06 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SaleToPOIDeviceResponseV06"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Header41"/&gt;
 *         &lt;element name="DvcRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceResponse7"/&gt;
 *         &lt;element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ContentInformationType38" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIDeviceResponseV06", propOrder = {
    "hdr",
    "dvcRspn",
    "sctyTrlr"
})
public class SaleToPOIDeviceResponseV06 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "DvcRspn", required = true)
    protected DeviceResponse7 dvcRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType38 sctyTrlr;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public void setHdr(Header41 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad dvcRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceResponse7 }
     *     
     */
    public DeviceResponse7 getDvcRspn() {
        return dvcRspn;
    }

    /**
     * Define el valor de la propiedad dvcRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceResponse7 }
     *     
     */
    public void setDvcRspn(DeviceResponse7 value) {
        this.dvcRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad sctyTrlr.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType38 }
     *     
     */
    public ContentInformationType38 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Define el valor de la propiedad sctyTrlr.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType38 }
     *     
     */
    public void setSctyTrlr(ContentInformationType38 value) {
        this.sctyTrlr = value;
    }

}
