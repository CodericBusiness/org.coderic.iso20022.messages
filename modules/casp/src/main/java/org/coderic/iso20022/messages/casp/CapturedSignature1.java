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
 * <p>Clase Java para CapturedSignature1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CapturedSignature1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImgFrmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text"/&gt;
 *         &lt;element name="ImgData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max2MBBinary" minOccurs="0"/&gt;
 *         &lt;element name="ImgRef" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max500Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapturedSignature1", propOrder = {
    "imgFrmt",
    "imgData",
    "imgRef",
    "addtlInf"
})
public class CapturedSignature1 {

    @XmlElement(name = "ImgFrmt", required = true)
    protected String imgFrmt;
    @XmlElement(name = "ImgData")
    protected byte[] imgData;
    @XmlElement(name = "ImgRef")
    protected String imgRef;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Obtiene el valor de la propiedad imgFrmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFrmt() {
        return imgFrmt;
    }

    /**
     * Define el valor de la propiedad imgFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFrmt(String value) {
        this.imgFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad imgData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImgData() {
        return imgData;
    }

    /**
     * Define el valor de la propiedad imgData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImgData(byte[] value) {
        this.imgData = value;
    }

    /**
     * Obtiene el valor de la propiedad imgRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgRef() {
        return imgRef;
    }

    /**
     * Define el valor de la propiedad imgRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgRef(String value) {
        this.imgRef = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
