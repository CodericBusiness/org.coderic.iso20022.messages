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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Authority1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Authority1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISO3NumericCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsnMjr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOCountrySubDivisionCode" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsnMnr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOCountrySubDivisionCode" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsnMjrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max50Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsnMnrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max50Text" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max50Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authority1", propOrder = {
    "ctry",
    "ctrySubDvsnMjr",
    "ctrySubDvsnMnr",
    "ctrySubDvsnMjrNm",
    "ctrySubDvsnMnrNm",
    "nm"
})
public class Authority1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CtrySubDvsnMjr")
    protected String ctrySubDvsnMjr;
    @XmlElement(name = "CtrySubDvsnMnr")
    protected String ctrySubDvsnMnr;
    @XmlElement(name = "CtrySubDvsnMjrNm")
    protected String ctrySubDvsnMjrNm;
    @XmlElement(name = "CtrySubDvsnMnrNm")
    protected String ctrySubDvsnMnrNm;
    @XmlElement(name = "Nm")
    protected String nm;

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrySubDvsnMjr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjr() {
        return ctrySubDvsnMjr;
    }

    /**
     * Define el valor de la propiedad ctrySubDvsnMjr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMjr(String value) {
        this.ctrySubDvsnMjr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrySubDvsnMnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnr() {
        return ctrySubDvsnMnr;
    }

    /**
     * Define el valor de la propiedad ctrySubDvsnMnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMnr(String value) {
        this.ctrySubDvsnMnr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrySubDvsnMjrNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMjrNm() {
        return ctrySubDvsnMjrNm;
    }

    /**
     * Define el valor de la propiedad ctrySubDvsnMjrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMjrNm(String value) {
        this.ctrySubDvsnMjrNm = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrySubDvsnMnrNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrySubDvsnMnrNm() {
        return ctrySubDvsnMnrNm;
    }

    /**
     * Define el valor de la propiedad ctrySubDvsnMnrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrySubDvsnMnrNm(String value) {
        this.ctrySubDvsnMnrNm = value;
    }

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

}
