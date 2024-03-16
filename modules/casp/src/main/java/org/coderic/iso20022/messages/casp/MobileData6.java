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
 * <p>Clase Java para MobileData6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MobileData6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Min2Max3AlphaText" minOccurs="0"/&gt;
 *         &lt;element name="MobNtwkCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Min2Max3NumericText" minOccurs="0"/&gt;
 *         &lt;element name="MobMskdMSISDN" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Glctn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Geolocation1" minOccurs="0"/&gt;
 *         &lt;element name="SnstvMobData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SensitiveMobileData1" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdMobData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ContentInformationType40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MobileData6", propOrder = {
    "mobCtryCd",
    "mobNtwkCd",
    "mobMskdMSISDN",
    "glctn",
    "snstvMobData",
    "prtctdMobData"
})
public class MobileData6 {

    @XmlElement(name = "MobCtryCd")
    protected String mobCtryCd;
    @XmlElement(name = "MobNtwkCd")
    protected String mobNtwkCd;
    @XmlElement(name = "MobMskdMSISDN")
    protected String mobMskdMSISDN;
    @XmlElement(name = "Glctn")
    protected Geolocation1 glctn;
    @XmlElement(name = "SnstvMobData")
    protected SensitiveMobileData1 snstvMobData;
    @XmlElement(name = "PrtctdMobData")
    protected ContentInformationType40 prtctdMobData;

    /**
     * Obtiene el valor de la propiedad mobCtryCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobCtryCd() {
        return mobCtryCd;
    }

    /**
     * Define el valor de la propiedad mobCtryCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobCtryCd(String value) {
        this.mobCtryCd = value;
    }

    /**
     * Obtiene el valor de la propiedad mobNtwkCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobNtwkCd() {
        return mobNtwkCd;
    }

    /**
     * Define el valor de la propiedad mobNtwkCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobNtwkCd(String value) {
        this.mobNtwkCd = value;
    }

    /**
     * Obtiene el valor de la propiedad mobMskdMSISDN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobMskdMSISDN() {
        return mobMskdMSISDN;
    }

    /**
     * Define el valor de la propiedad mobMskdMSISDN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobMskdMSISDN(String value) {
        this.mobMskdMSISDN = value;
    }

    /**
     * Obtiene el valor de la propiedad glctn.
     * 
     * @return
     *     possible object is
     *     {@link Geolocation1 }
     *     
     */
    public Geolocation1 getGlctn() {
        return glctn;
    }

    /**
     * Define el valor de la propiedad glctn.
     * 
     * @param value
     *     allowed object is
     *     {@link Geolocation1 }
     *     
     */
    public void setGlctn(Geolocation1 value) {
        this.glctn = value;
    }

    /**
     * Obtiene el valor de la propiedad snstvMobData.
     * 
     * @return
     *     possible object is
     *     {@link SensitiveMobileData1 }
     *     
     */
    public SensitiveMobileData1 getSnstvMobData() {
        return snstvMobData;
    }

    /**
     * Define el valor de la propiedad snstvMobData.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitiveMobileData1 }
     *     
     */
    public void setSnstvMobData(SensitiveMobileData1 value) {
        this.snstvMobData = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdMobData.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType40 }
     *     
     */
    public ContentInformationType40 getPrtctdMobData() {
        return prtctdMobData;
    }

    /**
     * Define el valor de la propiedad prtctdMobData.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType40 }
     *     
     */
    public void setPrtctdMobData(ContentInformationType40 value) {
        this.prtctdMobData = value;
    }

}
