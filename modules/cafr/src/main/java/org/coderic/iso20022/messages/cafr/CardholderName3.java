//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:28 PM COT 
//


package org.coderic.iso20022.messages.cafr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardholderName3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardholderName3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="GvnNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MddlNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="LastNm" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderName3", propOrder = {
    "nm",
    "gvnNm",
    "mddlNm",
    "lastNm"
})
public class CardholderName3 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "GvnNm")
    protected String gvnNm;
    @XmlElement(name = "MddlNm")
    protected String mddlNm;
    @XmlElement(name = "LastNm")
    protected String lastNm;

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad gvnNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGvnNm() {
        return gvnNm;
    }

    /**
     * Define el valor de la propiedad gvnNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGvnNm(String value) {
        this.gvnNm = value;
    }

    /**
     * Obtiene el valor de la propiedad mddlNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMddlNm() {
        return mddlNm;
    }

    /**
     * Define el valor de la propiedad mddlNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMddlNm(String value) {
        this.mddlNm = value;
    }

    /**
     * Obtiene el valor de la propiedad lastNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Define el valor de la propiedad lastNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNm(String value) {
        this.lastNm = value;
    }

}
