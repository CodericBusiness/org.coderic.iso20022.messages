//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MerchantToken2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MerchantToken2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TknXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max10Text" minOccurs="0"/&gt;
 *         &lt;element name="TknChrtc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TknRqstr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PaymentTokenIdentifiers1" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncLvl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max500Binary" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncMtd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknInittdInd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantToken2", propOrder = {
    "tkn",
    "tknXpryDt",
    "tknChrtc",
    "tknRqstr",
    "tknAssrncLvl",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknInittdInd"
})
public class MerchantToken2 {

    @XmlElement(name = "Tkn")
    protected String tkn;
    @XmlElement(name = "TknXpryDt")
    protected String tknXpryDt;
    @XmlElement(name = "TknChrtc")
    protected List<String> tknChrtc;
    @XmlElement(name = "TknRqstr")
    protected PaymentTokenIdentifiers1 tknRqstr;
    @XmlElement(name = "TknAssrncLvl")
    protected BigDecimal tknAssrncLvl;
    @XmlElement(name = "TknAssrncData")
    protected byte[] tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;

    /**
     * Obtiene el valor de la propiedad tkn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTkn() {
        return tkn;
    }

    /**
     * Define el valor de la propiedad tkn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTkn(String value) {
        this.tkn = value;
    }

    /**
     * Obtiene el valor de la propiedad tknXpryDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Define el valor de la propiedad tknXpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknXpryDt(String value) {
        this.tknXpryDt = value;
    }

    /**
     * Gets the value of the tknChrtc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tknChrtc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTknChrtc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTknChrtc() {
        if (tknChrtc == null) {
            tknChrtc = new ArrayList<String>();
        }
        return this.tknChrtc;
    }

    /**
     * Obtiene el valor de la propiedad tknRqstr.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public PaymentTokenIdentifiers1 getTknRqstr() {
        return tknRqstr;
    }

    /**
     * Define el valor de la propiedad tknRqstr.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTokenIdentifiers1 }
     *     
     */
    public void setTknRqstr(PaymentTokenIdentifiers1 value) {
        this.tknRqstr = value;
    }

    /**
     * Obtiene el valor de la propiedad tknAssrncLvl.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTknAssrncLvl() {
        return tknAssrncLvl;
    }

    /**
     * Define el valor de la propiedad tknAssrncLvl.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTknAssrncLvl(BigDecimal value) {
        this.tknAssrncLvl = value;
    }

    /**
     * Obtiene el valor de la propiedad tknAssrncData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Define el valor de la propiedad tknAssrncData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTknAssrncData(byte[] value) {
        this.tknAssrncData = value;
    }

    /**
     * Obtiene el valor de la propiedad tknAssrncMtd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Define el valor de la propiedad tknAssrncMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
    }

    /**
     * Obtiene el valor de la propiedad tknInittdInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknInittdInd() {
        return tknInittdInd;
    }

    /**
     * Define el valor de la propiedad tknInittdInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
    }

}
