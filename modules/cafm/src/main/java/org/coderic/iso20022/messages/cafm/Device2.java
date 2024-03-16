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
 * <p>Clase Java para Device2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Device2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Manfctr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="ManfctrMdlId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CustomerDeviceType2Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/&gt;
 *         &lt;element name="LctnCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISO3NumericCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="IPAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="DvcNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max100Text" minOccurs="0"/&gt;
 *         &lt;element name="DvcNmNrmlzd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max100Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Device2", propOrder = {
    "manfctr",
    "manfctrMdlId",
    "tp",
    "othrTp",
    "lang",
    "phneNb",
    "geogcLctn",
    "lctnCtryCd",
    "ipAdr",
    "email",
    "dvcNm",
    "dvcNmNrmlzd"
})
public class Device2 {

    @XmlElement(name = "Manfctr")
    protected String manfctr;
    @XmlElement(name = "ManfctrMdlId")
    protected String manfctrMdlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CustomerDeviceType2Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "LctnCtryCd")
    protected String lctnCtryCd;
    @XmlElement(name = "IPAdr")
    protected String ipAdr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "DvcNm")
    protected String dvcNm;
    @XmlElement(name = "DvcNmNrmlzd")
    protected String dvcNmNrmlzd;

    /**
     * Obtiene el valor de la propiedad manfctr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctr() {
        return manfctr;
    }

    /**
     * Define el valor de la propiedad manfctr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctr(String value) {
        this.manfctr = value;
    }

    /**
     * Obtiene el valor de la propiedad manfctrMdlId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManfctrMdlId() {
        return manfctrMdlId;
    }

    /**
     * Define el valor de la propiedad manfctrMdlId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManfctrMdlId(String value) {
        this.manfctrMdlId = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public CustomerDeviceType2Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDeviceType2Code }
     *     
     */
    public void setTp(CustomerDeviceType2Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Define el valor de la propiedad othrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
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

    /**
     * Obtiene el valor de la propiedad phneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Define el valor de la propiedad phneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad geogcLctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Define el valor de la propiedad geogcLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcLctn(String value) {
        this.geogcLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad lctnCtryCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLctnCtryCd() {
        return lctnCtryCd;
    }

    /**
     * Define el valor de la propiedad lctnCtryCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLctnCtryCd(String value) {
        this.lctnCtryCd = value;
    }

    /**
     * Obtiene el valor de la propiedad ipAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAdr() {
        return ipAdr;
    }

    /**
     * Define el valor de la propiedad ipAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAdr(String value) {
        this.ipAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad dvcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNm() {
        return dvcNm;
    }

    /**
     * Define el valor de la propiedad dvcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcNm(String value) {
        this.dvcNm = value;
    }

    /**
     * Obtiene el valor de la propiedad dvcNmNrmlzd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDvcNmNrmlzd() {
        return dvcNmNrmlzd;
    }

    /**
     * Define el valor de la propiedad dvcNmNrmlzd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDvcNmNrmlzd(String value) {
        this.dvcNmNrmlzd = value;
    }

}
