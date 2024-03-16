//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncapsulatedContent3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncapsulatedContent3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ContentType2Code"/&gt;
 *         &lt;element name="Cntt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max100KBinary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncapsulatedContent3", propOrder = {
    "cnttTp",
    "cntt"
})
public class EncapsulatedContent3 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "Cntt")
    protected byte[] cntt;

    /**
     * Obtiene el valor de la propiedad cnttTp.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Define el valor de la propiedad cnttTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public void setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cntt.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCntt() {
        return cntt;
    }

    /**
     * Define el valor de la propiedad cntt.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCntt(byte[] value) {
        this.cntt = value;
    }

}
