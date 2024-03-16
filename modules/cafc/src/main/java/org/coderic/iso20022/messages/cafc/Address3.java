//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Address3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Address3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdrLine1" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max200Text" minOccurs="0"/&gt;
 *         &lt;element name="AdrLine2" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max200Text" minOccurs="0"/&gt;
 *         &lt;element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max200Text" minOccurs="0"/&gt;
 *         &lt;element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PstlCd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max100Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsnMnrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max100Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsnMjrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max100Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISOMax3ACountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address3", propOrder = {
    "adrLine1",
    "adrLine2",
    "strtNm",
    "bldgNb",
    "pstlCd",
    "twnNm",
    "ctrySubDvsnMnrNm",
    "ctrySubDvsnMjrNm",
    "ctry"
})
public class Address3 {

    @XmlElement(name = "AdrLine1")
    protected String adrLine1;
    @XmlElement(name = "AdrLine2")
    protected String adrLine2;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "PstlCd")
    protected String pstlCd;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "CtrySubDvsnMnrNm")
    protected String ctrySubDvsnMnrNm;
    @XmlElement(name = "CtrySubDvsnMjrNm")
    protected String ctrySubDvsnMjrNm;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Obtiene el valor de la propiedad adrLine1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine1() {
        return adrLine1;
    }

    /**
     * Define el valor de la propiedad adrLine1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLine1(String value) {
        this.adrLine1 = value;
    }

    /**
     * Obtiene el valor de la propiedad adrLine2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrLine2() {
        return adrLine2;
    }

    /**
     * Define el valor de la propiedad adrLine2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrLine2(String value) {
        this.adrLine2 = value;
    }

    /**
     * Obtiene el valor de la propiedad strtNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Define el valor de la propiedad strtNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Obtiene el valor de la propiedad bldgNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Define el valor de la propiedad bldgNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

    /**
     * Obtiene el valor de la propiedad pstlCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlCd() {
        return pstlCd;
    }

    /**
     * Define el valor de la propiedad pstlCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstlCd(String value) {
        this.pstlCd = value;
    }

    /**
     * Obtiene el valor de la propiedad twnNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Define el valor de la propiedad twnNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
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

}
