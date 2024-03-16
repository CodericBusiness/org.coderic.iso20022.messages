//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Capabilities2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Capabilities2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardRdngCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardReadingCapabilities1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CardWrtgCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardWritingCapabilities1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PINLngthCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="PINNtrySctyChrtc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PINEntrySecurityCharacteristic1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrPINNtrySctyChrtc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ApprvlCdLngth" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="MxScrptLngth" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="CardCaptrCpbl" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="OnLineCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}OnLineCapability2Code" minOccurs="0"/&gt;
 *         &lt;element name="MsgCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}DisplayCapabilities6" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CrdhldrVrfctnCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardholderVerificationCapabilities1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TempScrCardDataStorg" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities2", propOrder = {
    "cardRdngCpblty",
    "cardWrtgCpblty",
    "pinLngthCpblty",
    "pinNtrySctyChrtc",
    "othrPINNtrySctyChrtc",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblty",
    "msgCpblty",
    "crdhldrVrfctnCpblty",
    "tempScrCardDataStorg"
})
public class Capabilities2 {

    @XmlElement(name = "CardRdngCpblty")
    protected List<CardReadingCapabilities1> cardRdngCpblty;
    @XmlElement(name = "CardWrtgCpblty")
    protected List<CardWritingCapabilities1> cardWrtgCpblty;
    @XmlElement(name = "PINLngthCpblty")
    protected BigDecimal pinLngthCpblty;
    @XmlElement(name = "PINNtrySctyChrtc")
    @XmlSchemaType(name = "string")
    protected PINEntrySecurityCharacteristic1Code pinNtrySctyChrtc;
    @XmlElement(name = "OthrPINNtrySctyChrtc")
    protected String othrPINNtrySctyChrtc;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblty")
    @XmlSchemaType(name = "string")
    protected OnLineCapability2Code onLineCpblty;
    @XmlElement(name = "MsgCpblty")
    protected List<DisplayCapabilities6> msgCpblty;
    @XmlElement(name = "CrdhldrVrfctnCpblty")
    protected List<CardholderVerificationCapabilities1> crdhldrVrfctnCpblty;
    @XmlElement(name = "TempScrCardDataStorg")
    protected Boolean tempScrCardDataStorg;

    /**
     * Gets the value of the cardRdngCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cardRdngCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardReadingCapabilities1 }
     * 
     * 
     */
    public List<CardReadingCapabilities1> getCardRdngCpblty() {
        if (cardRdngCpblty == null) {
            cardRdngCpblty = new ArrayList<CardReadingCapabilities1>();
        }
        return this.cardRdngCpblty;
    }

    /**
     * Gets the value of the cardWrtgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cardWrtgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrtgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardWritingCapabilities1 }
     * 
     * 
     */
    public List<CardWritingCapabilities1> getCardWrtgCpblty() {
        if (cardWrtgCpblty == null) {
            cardWrtgCpblty = new ArrayList<CardWritingCapabilities1>();
        }
        return this.cardWrtgCpblty;
    }

    /**
     * Obtiene el valor de la propiedad pinLngthCpblty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblty() {
        return pinLngthCpblty;
    }

    /**
     * Define el valor de la propiedad pinLngthCpblty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPINLngthCpblty(BigDecimal value) {
        this.pinLngthCpblty = value;
    }

    /**
     * Obtiene el valor de la propiedad pinNtrySctyChrtc.
     * 
     * @return
     *     possible object is
     *     {@link PINEntrySecurityCharacteristic1Code }
     *     
     */
    public PINEntrySecurityCharacteristic1Code getPINNtrySctyChrtc() {
        return pinNtrySctyChrtc;
    }

    /**
     * Define el valor de la propiedad pinNtrySctyChrtc.
     * 
     * @param value
     *     allowed object is
     *     {@link PINEntrySecurityCharacteristic1Code }
     *     
     */
    public void setPINNtrySctyChrtc(PINEntrySecurityCharacteristic1Code value) {
        this.pinNtrySctyChrtc = value;
    }

    /**
     * Obtiene el valor de la propiedad othrPINNtrySctyChrtc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPINNtrySctyChrtc() {
        return othrPINNtrySctyChrtc;
    }

    /**
     * Define el valor de la propiedad othrPINNtrySctyChrtc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPINNtrySctyChrtc(String value) {
        this.othrPINNtrySctyChrtc = value;
    }

    /**
     * Obtiene el valor de la propiedad apprvlCdLngth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprvlCdLngth() {
        return apprvlCdLngth;
    }

    /**
     * Define el valor de la propiedad apprvlCdLngth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApprvlCdLngth(BigDecimal value) {
        this.apprvlCdLngth = value;
    }

    /**
     * Obtiene el valor de la propiedad mxScrptLngth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMxScrptLngth() {
        return mxScrptLngth;
    }

    /**
     * Define el valor de la propiedad mxScrptLngth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMxScrptLngth(BigDecimal value) {
        this.mxScrptLngth = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCaptrCpbl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardCaptrCpbl() {
        return cardCaptrCpbl;
    }

    /**
     * Define el valor de la propiedad cardCaptrCpbl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardCaptrCpbl(Boolean value) {
        this.cardCaptrCpbl = value;
    }

    /**
     * Obtiene el valor de la propiedad onLineCpblty.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public OnLineCapability2Code getOnLineCpblty() {
        return onLineCpblty;
    }

    /**
     * Define el valor de la propiedad onLineCpblty.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public void setOnLineCpblty(OnLineCapability2Code value) {
        this.onLineCpblty = value;
    }

    /**
     * Gets the value of the msgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the msgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities6 }
     * 
     * 
     */
    public List<DisplayCapabilities6> getMsgCpblty() {
        if (msgCpblty == null) {
            msgCpblty = new ArrayList<DisplayCapabilities6>();
        }
        return this.msgCpblty;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapabilities1 }
     * 
     * 
     */
    public List<CardholderVerificationCapabilities1> getCrdhldrVrfctnCpblty() {
        if (crdhldrVrfctnCpblty == null) {
            crdhldrVrfctnCpblty = new ArrayList<CardholderVerificationCapabilities1>();
        }
        return this.crdhldrVrfctnCpblty;
    }

    /**
     * Obtiene el valor de la propiedad tempScrCardDataStorg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataStorg() {
        return tempScrCardDataStorg;
    }

    /**
     * Define el valor de la propiedad tempScrCardDataStorg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempScrCardDataStorg(Boolean value) {
        this.tempScrCardDataStorg = value;
    }

}
