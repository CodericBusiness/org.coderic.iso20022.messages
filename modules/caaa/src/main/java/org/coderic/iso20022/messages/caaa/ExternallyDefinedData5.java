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
 * <p>Clase Java para ExternallyDefinedData5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExternallyDefinedData5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max1025Text"/&gt;
 *         &lt;element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max100KBinary" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ContentInformationType39" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max1025Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternallyDefinedData5", propOrder = {
    "id",
    "val",
    "prtctdVal",
    "tp"
})
public class ExternallyDefinedData5 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Val")
    protected byte[] val;
    @XmlElement(name = "PrtctdVal")
    protected ContentInformationType39 prtctdVal;
    @XmlElement(name = "Tp")
    protected String tp;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad val.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVal() {
        return val;
    }

    /**
     * Define el valor de la propiedad val.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVal(byte[] value) {
        this.val = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdVal.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPrtctdVal() {
        return prtctdVal;
    }

    /**
     * Define el valor de la propiedad prtctdVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public void setPrtctdVal(ContentInformationType39 value) {
        this.prtctdVal = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

}
