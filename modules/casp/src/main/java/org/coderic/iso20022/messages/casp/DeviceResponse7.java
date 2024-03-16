//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeviceResponse7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceResponse7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardPaymentEnvironment80" minOccurs="0"/&gt;
 *         &lt;element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardPaymentContext30" minOccurs="0"/&gt;
 *         &lt;element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}RetailerService9Code"/&gt;
 *         &lt;element name="DispRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceDisplayResponse2" minOccurs="0"/&gt;
 *         &lt;element name="InptRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceInputResponse6" minOccurs="0"/&gt;
 *         &lt;element name="PrtRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DevicePrintResponse1" minOccurs="0"/&gt;
 *         &lt;element name="ScrInptRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceSecureInputResponse6" minOccurs="0"/&gt;
 *         &lt;element name="InitlstnCardRdrRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceInitialisationCardReaderResponse2" minOccurs="0"/&gt;
 *         &lt;element name="CardRdrApplPrtcolDataUnitRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceSendApplicationProtocolDataUnitCardReaderResponse1" minOccurs="0"/&gt;
 *         &lt;element name="TrnsmssnRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DeviceTransmitMessageResponse1" minOccurs="0"/&gt;
 *         &lt;element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ResponseType11"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceResponse7", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "dispRspn",
    "inptRspn",
    "prtRspn",
    "scrInptRspn",
    "initlstnCardRdrRspn",
    "cardRdrApplPrtcolDataUnitRspn",
    "trnsmssnRspn",
    "rspn",
    "splmtryData"
})
public class DeviceResponse7 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment80 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService9Code svcCntt;
    @XmlElement(name = "DispRspn")
    protected DeviceDisplayResponse2 dispRspn;
    @XmlElement(name = "InptRspn")
    protected DeviceInputResponse6 inptRspn;
    @XmlElement(name = "PrtRspn")
    protected DevicePrintResponse1 prtRspn;
    @XmlElement(name = "ScrInptRspn")
    protected DeviceSecureInputResponse6 scrInptRspn;
    @XmlElement(name = "InitlstnCardRdrRspn")
    protected DeviceInitialisationCardReaderResponse2 initlstnCardRdrRspn;
    @XmlElement(name = "CardRdrApplPrtcolDataUnitRspn")
    protected DeviceSendApplicationProtocolDataUnitCardReaderResponse1 cardRdrApplPrtcolDataUnitRspn;
    @XmlElement(name = "TrnsmssnRspn")
    protected DeviceTransmitMessageResponse1 trnsmssnRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad envt.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public CardPaymentEnvironment80 getEnvt() {
        return envt;
    }

    /**
     * Define el valor de la propiedad envt.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public void setEnvt(CardPaymentEnvironment80 value) {
        this.envt = value;
    }

    /**
     * Obtiene el valor de la propiedad cntxt.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CardPaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Define el valor de la propiedad cntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public void setCntxt(CardPaymentContext30 value) {
        this.cntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad svcCntt.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService9Code }
     *     
     */
    public RetailerService9Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Define el valor de la propiedad svcCntt.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService9Code }
     *     
     */
    public void setSvcCntt(RetailerService9Code value) {
        this.svcCntt = value;
    }

    /**
     * Obtiene el valor de la propiedad dispRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayResponse2 }
     *     
     */
    public DeviceDisplayResponse2 getDispRspn() {
        return dispRspn;
    }

    /**
     * Define el valor de la propiedad dispRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayResponse2 }
     *     
     */
    public void setDispRspn(DeviceDisplayResponse2 value) {
        this.dispRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad inptRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputResponse6 }
     *     
     */
    public DeviceInputResponse6 getInptRspn() {
        return inptRspn;
    }

    /**
     * Define el valor de la propiedad inptRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputResponse6 }
     *     
     */
    public void setInptRspn(DeviceInputResponse6 value) {
        this.inptRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad prtRspn.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintResponse1 }
     *     
     */
    public DevicePrintResponse1 getPrtRspn() {
        return prtRspn;
    }

    /**
     * Define el valor de la propiedad prtRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintResponse1 }
     *     
     */
    public void setPrtRspn(DevicePrintResponse1 value) {
        this.prtRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad scrInptRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputResponse6 }
     *     
     */
    public DeviceSecureInputResponse6 getScrInptRspn() {
        return scrInptRspn;
    }

    /**
     * Define el valor de la propiedad scrInptRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputResponse6 }
     *     
     */
    public void setScrInptRspn(DeviceSecureInputResponse6 value) {
        this.scrInptRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad initlstnCardRdrRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderResponse2 }
     *     
     */
    public DeviceInitialisationCardReaderResponse2 getInitlstnCardRdrRspn() {
        return initlstnCardRdrRspn;
    }

    /**
     * Define el valor de la propiedad initlstnCardRdrRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderResponse2 }
     *     
     */
    public void setInitlstnCardRdrRspn(DeviceInitialisationCardReaderResponse2 value) {
        this.initlstnCardRdrRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad cardRdrApplPrtcolDataUnitRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 getCardRdrApplPrtcolDataUnitRspn() {
        return cardRdrApplPrtcolDataUnitRspn;
    }

    /**
     * Define el valor de la propiedad cardRdrApplPrtcolDataUnitRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public void setCardRdrApplPrtcolDataUnitRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
        this.cardRdrApplPrtcolDataUnitRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad trnsmssnRspn.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTransmitMessageResponse1 }
     *     
     */
    public DeviceTransmitMessageResponse1 getTrnsmssnRspn() {
        return trnsmssnRspn;
    }

    /**
     * Define el valor de la propiedad trnsmssnRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTransmitMessageResponse1 }
     *     
     */
    public void setTrnsmssnRspn(DeviceTransmitMessageResponse1 value) {
        this.trnsmssnRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad rspn.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Define el valor de la propiedad rspn.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setRspn(ResponseType11 value) {
        this.rspn = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
