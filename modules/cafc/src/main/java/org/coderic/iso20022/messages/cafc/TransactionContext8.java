//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionContext8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionContext8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO18245MerchantCategoryCode" minOccurs="0"/&gt;
 *         &lt;element name="MrchntCtgySpcfcData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FeeColltnInitr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}FeeCollectionInitiator1Code" minOccurs="0"/&gt;
 *         &lt;element name="TxInitr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TransactionInitiator1Code" minOccurs="0"/&gt;
 *         &lt;element name="PrtlShipmntInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="DelydChrgsInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="NoShowInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="ReauthstnInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="ReSubmissnInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="CardPrgrmmApld" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}CardProgrammeMode3" minOccurs="0"/&gt;
 *         &lt;element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Jurisdiction2" minOccurs="0"/&gt;
 *         &lt;element name="SttlmSvc" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SettlementService4" minOccurs="0"/&gt;
 *         &lt;element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Reconciliation3" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext8", propOrder = {
    "mrchntCtgyCd",
    "mrchntCtgySpcfcData",
    "feeColltnInitr",
    "txInitr",
    "prtlShipmntInd",
    "delydChrgsInd",
    "noShowInd",
    "reauthstnInd",
    "reSubmissnInd",
    "cardPrgrmmApld",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "addtlData"
})
public class TransactionContext8 {

    @XmlElement(name = "MrchntCtgyCd")
    protected String mrchntCtgyCd;
    @XmlElement(name = "MrchntCtgySpcfcData")
    protected String mrchntCtgySpcfcData;
    @XmlElement(name = "FeeColltnInitr")
    @XmlSchemaType(name = "string")
    protected FeeCollectionInitiator1Code feeColltnInitr;
    @XmlElement(name = "TxInitr")
    @XmlSchemaType(name = "string")
    protected TransactionInitiator1Code txInitr;
    @XmlElement(name = "PrtlShipmntInd")
    protected Boolean prtlShipmntInd;
    @XmlElement(name = "DelydChrgsInd")
    protected Boolean delydChrgsInd;
    @XmlElement(name = "NoShowInd")
    protected Boolean noShowInd;
    @XmlElement(name = "ReauthstnInd")
    protected Boolean reauthstnInd;
    @XmlElement(name = "ReSubmissnInd")
    protected Boolean reSubmissnInd;
    @XmlElement(name = "CardPrgrmmApld")
    protected CardProgrammeMode3 cardPrgrmmApld;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService4 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad mrchntCtgyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Define el valor de la propiedad mrchntCtgyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
    }

    /**
     * Obtiene el valor de la propiedad mrchntCtgySpcfcData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgySpcfcData() {
        return mrchntCtgySpcfcData;
    }

    /**
     * Define el valor de la propiedad mrchntCtgySpcfcData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCtgySpcfcData(String value) {
        this.mrchntCtgySpcfcData = value;
    }

    /**
     * Obtiene el valor de la propiedad feeColltnInitr.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionInitiator1Code }
     *     
     */
    public FeeCollectionInitiator1Code getFeeColltnInitr() {
        return feeColltnInitr;
    }

    /**
     * Define el valor de la propiedad feeColltnInitr.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionInitiator1Code }
     *     
     */
    public void setFeeColltnInitr(FeeCollectionInitiator1Code value) {
        this.feeColltnInitr = value;
    }

    /**
     * Obtiene el valor de la propiedad txInitr.
     * 
     * @return
     *     possible object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public TransactionInitiator1Code getTxInitr() {
        return txInitr;
    }

    /**
     * Define el valor de la propiedad txInitr.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionInitiator1Code }
     *     
     */
    public void setTxInitr(TransactionInitiator1Code value) {
        this.txInitr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtlShipmntInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlShipmntInd() {
        return prtlShipmntInd;
    }

    /**
     * Define el valor de la propiedad prtlShipmntInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlShipmntInd(Boolean value) {
        this.prtlShipmntInd = value;
    }

    /**
     * Obtiene el valor de la propiedad delydChrgsInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydChrgsInd() {
        return delydChrgsInd;
    }

    /**
     * Define el valor de la propiedad delydChrgsInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelydChrgsInd(Boolean value) {
        this.delydChrgsInd = value;
    }

    /**
     * Obtiene el valor de la propiedad noShowInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoShowInd() {
        return noShowInd;
    }

    /**
     * Define el valor de la propiedad noShowInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoShowInd(Boolean value) {
        this.noShowInd = value;
    }

    /**
     * Obtiene el valor de la propiedad reauthstnInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReauthstnInd() {
        return reauthstnInd;
    }

    /**
     * Define el valor de la propiedad reauthstnInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReauthstnInd(Boolean value) {
        this.reauthstnInd = value;
    }

    /**
     * Obtiene el valor de la propiedad reSubmissnInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReSubmissnInd() {
        return reSubmissnInd;
    }

    /**
     * Define el valor de la propiedad reSubmissnInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReSubmissnInd(Boolean value) {
        this.reSubmissnInd = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPrgrmmApld.
     * 
     * @return
     *     possible object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public CardProgrammeMode3 getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Define el valor de la propiedad cardPrgrmmApld.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public void setCardPrgrmmApld(CardProgrammeMode3 value) {
        this.cardPrgrmmApld = value;
    }

    /**
     * Obtiene el valor de la propiedad jursdctn.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction2 }
     *     
     */
    public Jurisdiction2 getJursdctn() {
        return jursdctn;
    }

    /**
     * Define el valor de la propiedad jursdctn.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction2 }
     *     
     */
    public void setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmSvc.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService4 }
     *     
     */
    public SettlementService4 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Define el valor de la propiedad sttlmSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService4 }
     *     
     */
    public void setSttlmSvc(SettlementService4 value) {
        this.sttlmSvc = value;
    }

    /**
     * Obtiene el valor de la propiedad rcncltn.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation3 }
     *     
     */
    public Reconciliation3 getRcncltn() {
        return rcncltn;
    }

    /**
     * Define el valor de la propiedad rcncltn.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation3 }
     *     
     */
    public void setRcncltn(Reconciliation3 value) {
        this.rcncltn = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
    }

}
