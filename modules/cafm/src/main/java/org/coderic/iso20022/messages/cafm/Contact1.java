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
 * <p>Clase Java para Contact1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Contact1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="HomePhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="BizPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="MobPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="OthrPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="PrsnlEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="BizEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="OthrEmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISO2ALanguageCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact1", propOrder = {
    "nm",
    "homePhneNb",
    "bizPhneNb",
    "mobPhneNb",
    "othrPhneNb",
    "prsnlEmailAdr",
    "bizEmailAdr",
    "othrEmailAdr",
    "lang"
})
public class Contact1 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "HomePhneNb")
    protected String homePhneNb;
    @XmlElement(name = "BizPhneNb")
    protected String bizPhneNb;
    @XmlElement(name = "MobPhneNb")
    protected String mobPhneNb;
    @XmlElement(name = "OthrPhneNb")
    protected String othrPhneNb;
    @XmlElement(name = "PrsnlEmailAdr")
    protected String prsnlEmailAdr;
    @XmlElement(name = "BizEmailAdr")
    protected String bizEmailAdr;
    @XmlElement(name = "OthrEmailAdr")
    protected String othrEmailAdr;
    @XmlElement(name = "Lang")
    protected String lang;

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
     * Obtiene el valor de la propiedad homePhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhneNb() {
        return homePhneNb;
    }

    /**
     * Define el valor de la propiedad homePhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhneNb(String value) {
        this.homePhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad bizPhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPhneNb() {
        return bizPhneNb;
    }

    /**
     * Define el valor de la propiedad bizPhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizPhneNb(String value) {
        this.bizPhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad mobPhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobPhneNb() {
        return mobPhneNb;
    }

    /**
     * Define el valor de la propiedad mobPhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobPhneNb(String value) {
        this.mobPhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad othrPhneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPhneNb() {
        return othrPhneNb;
    }

    /**
     * Define el valor de la propiedad othrPhneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPhneNb(String value) {
        this.othrPhneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad prsnlEmailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlEmailAdr() {
        return prsnlEmailAdr;
    }

    /**
     * Define el valor de la propiedad prsnlEmailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrsnlEmailAdr(String value) {
        this.prsnlEmailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad bizEmailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizEmailAdr() {
        return bizEmailAdr;
    }

    /**
     * Define el valor de la propiedad bizEmailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizEmailAdr(String value) {
        this.bizEmailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad othrEmailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrEmailAdr() {
        return othrEmailAdr;
    }

    /**
     * Define el valor de la propiedad othrEmailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrEmailAdr(String value) {
        this.othrEmailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
