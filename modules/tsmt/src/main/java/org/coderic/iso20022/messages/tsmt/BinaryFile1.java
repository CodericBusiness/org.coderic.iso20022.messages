//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BinaryFile1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BinaryFile1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MIMETp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="NcodgTp" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CharSet" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InclBinryObjct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max100KBinary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryFile1", propOrder = {
    "mimeTp",
    "ncodgTp",
    "charSet",
    "inclBinryObjct"
})
public class BinaryFile1 {

    @XmlElement(name = "MIMETp")
    protected String mimeTp;
    @XmlElement(name = "NcodgTp")
    protected String ncodgTp;
    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "InclBinryObjct")
    protected byte[] inclBinryObjct;

    /**
     * Obtiene el valor de la propiedad mimeTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMIMETp() {
        return mimeTp;
    }

    /**
     * Define el valor de la propiedad mimeTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMIMETp(String value) {
        this.mimeTp = value;
    }

    /**
     * Obtiene el valor de la propiedad ncodgTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcodgTp() {
        return ncodgTp;
    }

    /**
     * Define el valor de la propiedad ncodgTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcodgTp(String value) {
        this.ncodgTp = value;
    }

    /**
     * Obtiene el valor de la propiedad charSet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * Define el valor de la propiedad charSet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharSet(String value) {
        this.charSet = value;
    }

    /**
     * Obtiene el valor de la propiedad inclBinryObjct.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInclBinryObjct() {
        return inclBinryObjct;
    }

    /**
     * Define el valor de la propiedad inclBinryObjct.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInclBinryObjct(byte[] value) {
        this.inclBinryObjct = value;
    }

}
