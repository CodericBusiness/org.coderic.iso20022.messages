//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlainCardData19 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlainCardData19"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAN" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Min8Max28NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CardSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Min2Max3NumericText" minOccurs="0"/&gt;
 *         &lt;element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max10Text" minOccurs="0"/&gt;
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max10Text" minOccurs="0"/&gt;
 *         &lt;element name="Trck1" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max76Text" minOccurs="0"/&gt;
 *         &lt;element name="Trck2" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max37Text" minOccurs="0"/&gt;
 *         &lt;element name="Trck3" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max104Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData19", propOrder = {
    "pan",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "trck1",
    "trck2",
    "trck3"
})
public class PlainCardData19 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt")
    protected String fctvDt;
    @XmlElement(name = "XpryDt")
    protected String xpryDt;
    @XmlElement(name = "Trck1")
    protected String trck1;
    @XmlElement(name = "Trck2")
    protected String trck2;
    @XmlElement(name = "Trck3")
    protected String trck3;

    /**
     * Obtiene el valor de la propiedad pan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Define el valor de la propiedad pan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Define el valor de la propiedad cardSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNb(String value) {
        this.cardSeqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad fctvDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFctvDt() {
        return fctvDt;
    }

    /**
     * Define el valor de la propiedad fctvDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFctvDt(String value) {
        this.fctvDt = value;
    }

    /**
     * Obtiene el valor de la propiedad xpryDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryDt() {
        return xpryDt;
    }

    /**
     * Define el valor de la propiedad xpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpryDt(String value) {
        this.xpryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad trck1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck1() {
        return trck1;
    }

    /**
     * Define el valor de la propiedad trck1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck1(String value) {
        this.trck1 = value;
    }

    /**
     * Obtiene el valor de la propiedad trck2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck2() {
        return trck2;
    }

    /**
     * Define el valor de la propiedad trck2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck2(String value) {
        this.trck2 = value;
    }

    /**
     * Obtiene el valor de la propiedad trck3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck3() {
        return trck3;
    }

    /**
     * Define el valor de la propiedad trck3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck3(String value) {
        this.trck3 = value;
    }

}
