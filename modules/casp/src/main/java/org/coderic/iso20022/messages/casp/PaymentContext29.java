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
 * <p>Clase Java para PaymentContext29 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentContext29"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardPres" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="CrdhldrPres" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="OnLineCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AttndncCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}AttendanceContext1Code" minOccurs="0"/&gt;
 *         &lt;element name="TxEnvt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TransactionEnvironment1Code" minOccurs="0"/&gt;
 *         &lt;element name="TxChanl" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TransactionChannel5Code" minOccurs="0"/&gt;
 *         &lt;element name="BizArea" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}BusinessArea2Code" minOccurs="0"/&gt;
 *         &lt;element name="AttndntMsgCpbl" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AttndntLang" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDataReading8Code" minOccurs="0"/&gt;
 *         &lt;element name="FllbckInd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardFallback1Code" minOccurs="0"/&gt;
 *         &lt;element name="SpprtdOptn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SupportedPaymentOption2Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentContext29", propOrder = {
    "cardPres",
    "crdhldrPres",
    "onLineCntxt",
    "attndncCntxt",
    "txEnvt",
    "txChanl",
    "bizArea",
    "attndntMsgCpbl",
    "attndntLang",
    "cardDataNtryMd",
    "fllbckInd",
    "spprtdOptn"
})
public class PaymentContext29 {

    @XmlElement(name = "CardPres")
    protected Boolean cardPres;
    @XmlElement(name = "CrdhldrPres")
    protected Boolean crdhldrPres;
    @XmlElement(name = "OnLineCntxt")
    protected Boolean onLineCntxt;
    @XmlElement(name = "AttndncCntxt")
    @XmlSchemaType(name = "string")
    protected AttendanceContext1Code attndncCntxt;
    @XmlElement(name = "TxEnvt")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment1Code txEnvt;
    @XmlElement(name = "TxChanl")
    @XmlSchemaType(name = "string")
    protected TransactionChannel5Code txChanl;
    @XmlElement(name = "BizArea")
    @XmlSchemaType(name = "string")
    protected BusinessArea2Code bizArea;
    @XmlElement(name = "AttndntMsgCpbl")
    protected Boolean attndntMsgCpbl;
    @XmlElement(name = "AttndntLang")
    protected String attndntLang;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardDataNtryMd;
    @XmlElement(name = "FllbckInd")
    @XmlSchemaType(name = "string")
    protected CardFallback1Code fllbckInd;
    @XmlElement(name = "SpprtdOptn")
    @XmlSchemaType(name = "string")
    protected List<SupportedPaymentOption2Code> spprtdOptn;

    /**
     * Obtiene el valor de la propiedad cardPres.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Define el valor de la propiedad cardPres.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardPres(Boolean value) {
        this.cardPres = value;
    }

    /**
     * Obtiene el valor de la propiedad crdhldrPres.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Define el valor de la propiedad crdhldrPres.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
    }

    /**
     * Obtiene el valor de la propiedad onLineCntxt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnLineCntxt() {
        return onLineCntxt;
    }

    /**
     * Define el valor de la propiedad onLineCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnLineCntxt(Boolean value) {
        this.onLineCntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad attndncCntxt.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public AttendanceContext1Code getAttndncCntxt() {
        return attndncCntxt;
    }

    /**
     * Define el valor de la propiedad attndncCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceContext1Code }
     *     
     */
    public void setAttndncCntxt(AttendanceContext1Code value) {
        this.attndncCntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad txEnvt.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment1Code }
     *     
     */
    public TransactionEnvironment1Code getTxEnvt() {
        return txEnvt;
    }

    /**
     * Define el valor de la propiedad txEnvt.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment1Code }
     *     
     */
    public void setTxEnvt(TransactionEnvironment1Code value) {
        this.txEnvt = value;
    }

    /**
     * Obtiene el valor de la propiedad txChanl.
     * 
     * @return
     *     possible object is
     *     {@link TransactionChannel5Code }
     *     
     */
    public TransactionChannel5Code getTxChanl() {
        return txChanl;
    }

    /**
     * Define el valor de la propiedad txChanl.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionChannel5Code }
     *     
     */
    public void setTxChanl(TransactionChannel5Code value) {
        this.txChanl = value;
    }

    /**
     * Obtiene el valor de la propiedad bizArea.
     * 
     * @return
     *     possible object is
     *     {@link BusinessArea2Code }
     *     
     */
    public BusinessArea2Code getBizArea() {
        return bizArea;
    }

    /**
     * Define el valor de la propiedad bizArea.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessArea2Code }
     *     
     */
    public void setBizArea(BusinessArea2Code value) {
        this.bizArea = value;
    }

    /**
     * Obtiene el valor de la propiedad attndntMsgCpbl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttndntMsgCpbl() {
        return attndntMsgCpbl;
    }

    /**
     * Define el valor de la propiedad attndntMsgCpbl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttndntMsgCpbl(Boolean value) {
        this.attndntMsgCpbl = value;
    }

    /**
     * Obtiene el valor de la propiedad attndntLang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttndntLang() {
        return attndntLang;
    }

    /**
     * Define el valor de la propiedad attndntLang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttndntLang(String value) {
        this.attndntLang = value;
    }

    /**
     * Obtiene el valor de la propiedad cardDataNtryMd.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Define el valor de la propiedad cardDataNtryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading8Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Obtiene el valor de la propiedad fllbckInd.
     * 
     * @return
     *     possible object is
     *     {@link CardFallback1Code }
     *     
     */
    public CardFallback1Code getFllbckInd() {
        return fllbckInd;
    }

    /**
     * Define el valor de la propiedad fllbckInd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardFallback1Code }
     *     
     */
    public void setFllbckInd(CardFallback1Code value) {
        this.fllbckInd = value;
    }

    /**
     * Gets the value of the spprtdOptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the spprtdOptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpprtdOptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupportedPaymentOption2Code }
     * 
     * 
     */
    public List<SupportedPaymentOption2Code> getSpprtdOptn() {
        if (spprtdOptn == null) {
            spprtdOptn = new ArrayList<SupportedPaymentOption2Code>();
        }
        return this.spprtdOptn;
    }

}
