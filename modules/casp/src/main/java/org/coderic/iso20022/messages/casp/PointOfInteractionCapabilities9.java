//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PointOfInteractionCapabilities9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionCapabilities9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardRdngCpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDataReading8Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CrdhldrVrfctnCpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardholderVerificationCapability4Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PINLngthCpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="ApprvlCdLngth" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="MxScrptLngth" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="CardCaptrCpbl" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="OnLineCpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}OnLineCapability1Code" minOccurs="0"/&gt;
 *         &lt;element name="MsgCpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DisplayCapabilities4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities9", propOrder = {
    "cardRdngCpblties",
    "crdhldrVrfctnCpblties",
    "pinLngthCpblties",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblties",
    "msgCpblties"
})
public class PointOfInteractionCapabilities9 {

    @XmlElement(name = "CardRdngCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading8Code> cardRdngCpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability4Code> crdhldrVrfctnCpblties;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblties")
    @XmlSchemaType(name = "string")
    protected OnLineCapability1Code onLineCpblties;
    @XmlElement(name = "MsgCpblties")
    protected List<DisplayCapabilities4> msgCpblties;

    /**
     * Gets the value of the cardRdngCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cardRdngCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading8Code }
     * 
     * 
     */
    public List<CardDataReading8Code> getCardRdngCpblties() {
        if (cardRdngCpblties == null) {
            cardRdngCpblties = new ArrayList<CardDataReading8Code>();
        }
        return this.cardRdngCpblties;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability4Code }
     * 
     * 
     */
    public List<CardholderVerificationCapability4Code> getCrdhldrVrfctnCpblties() {
        if (crdhldrVrfctnCpblties == null) {
            crdhldrVrfctnCpblties = new ArrayList<CardholderVerificationCapability4Code>();
        }
        return this.crdhldrVrfctnCpblties;
    }

    /**
     * Obtiene el valor de la propiedad pinLngthCpblties.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblties() {
        return pinLngthCpblties;
    }

    /**
     * Define el valor de la propiedad pinLngthCpblties.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPINLngthCpblties(BigDecimal value) {
        this.pinLngthCpblties = value;
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
     * Obtiene el valor de la propiedad onLineCpblties.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public OnLineCapability1Code getOnLineCpblties() {
        return onLineCpblties;
    }

    /**
     * Define el valor de la propiedad onLineCpblties.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public void setOnLineCpblties(OnLineCapability1Code value) {
        this.onLineCpblties = value;
    }

    /**
     * Gets the value of the msgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the msgCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities4 }
     * 
     * 
     */
    public List<DisplayCapabilities4> getMsgCpblties() {
        if (msgCpblties == null) {
            msgCpblties = new ArrayList<DisplayCapabilities4>();
        }
        return this.msgCpblties;
    }

}
