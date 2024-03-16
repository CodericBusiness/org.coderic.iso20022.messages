//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parameter14 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parameter14"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NcrptnFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}EncryptionFormat3Code" minOccurs="0"/&gt;
 *         &lt;element name="InitlstnVctr" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max500Binary" minOccurs="0"/&gt;
 *         &lt;element name="BPddg" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}BytePadding1Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter14", propOrder = {
    "ncrptnFrmt",
    "initlstnVctr",
    "bPddg"
})
public class Parameter14 {

    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptionFormat3Code ncrptnFrmt;
    @XmlElement(name = "InitlstnVctr")
    protected byte[] initlstnVctr;
    @XmlElement(name = "BPddg")
    @XmlSchemaType(name = "string")
    protected BytePadding1Code bPddg;

    /**
     * Obtiene el valor de la propiedad ncrptnFrmt.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionFormat3Code }
     *     
     */
    public EncryptionFormat3Code getNcrptnFrmt() {
        return ncrptnFrmt;
    }

    /**
     * Define el valor de la propiedad ncrptnFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionFormat3Code }
     *     
     */
    public void setNcrptnFrmt(EncryptionFormat3Code value) {
        this.ncrptnFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad initlstnVctr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInitlstnVctr() {
        return initlstnVctr;
    }

    /**
     * Define el valor de la propiedad initlstnVctr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInitlstnVctr(byte[] value) {
        this.initlstnVctr = value;
    }

    /**
     * Obtiene el valor de la propiedad bPddg.
     * 
     * @return
     *     possible object is
     *     {@link BytePadding1Code }
     *     
     */
    public BytePadding1Code getBPddg() {
        return bPddg;
    }

    /**
     * Define el valor de la propiedad bPddg.
     * 
     * @param value
     *     allowed object is
     *     {@link BytePadding1Code }
     *     
     */
    public void setBPddg(BytePadding1Code value) {
        this.bPddg = value;
    }

}
