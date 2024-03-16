//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OriginalDataElements2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OriginalDataElements2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgClss" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}MessageClass1Code" minOccurs="0"/&gt;
 *         &lt;element name="MsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}MessageFunction16Code" minOccurs="0"/&gt;
 *         &lt;element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO8583TransactionTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="AcqrrId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max11NumericText" minOccurs="0"/&gt;
 *         &lt;element name="SndrId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max11NumericText" minOccurs="0"/&gt;
 *         &lt;element name="LclDt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="LclTm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISOTime" minOccurs="0"/&gt;
 *         &lt;element name="TmZone" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TrnsmssnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="SysTracAudtNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max12NumericText" minOccurs="0"/&gt;
 *         &lt;element name="RtrvlRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact12Text" minOccurs="0"/&gt;
 *         &lt;element name="LifeCyclSpprt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}LifeCycleSupport1Code" minOccurs="0"/&gt;
 *         &lt;element name="LifeCyclTracIdData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TransactionLifeCycleIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="LifeCyclTracIdMssng" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="AcqrrRefData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="AcqrrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max23NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CardIssrRefData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max1000Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalDataElements2", propOrder = {
    "msgClss",
    "msgFctn",
    "txTp",
    "acqrrId",
    "sndrId",
    "lclDt",
    "lclTm",
    "tmZone",
    "txRef",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprt",
    "lifeCyclTracIdData",
    "lifeCyclTracIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "cardIssrRefData"
})
public class OriginalDataElements2 {

    @XmlElement(name = "MsgClss")
    @XmlSchemaType(name = "string")
    protected MessageClass1Code msgClss;
    @XmlElement(name = "MsgFctn")
    @XmlSchemaType(name = "string")
    protected MessageFunction16Code msgFctn;
    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "AcqrrId")
    protected String acqrrId;
    @XmlElement(name = "SndrId")
    protected String sndrId;
    @XmlElement(name = "LclDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lclDt;
    @XmlElement(name = "LclTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lclTm;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TxRef")
    protected String txRef;
    @XmlElement(name = "TrnsmssnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb")
    protected String sysTracAudtNb;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclSpprt")
    @XmlSchemaType(name = "string")
    protected LifeCycleSupport1Code lifeCyclSpprt;
    @XmlElement(name = "LifeCyclTracIdData")
    protected TransactionLifeCycleIdentification1 lifeCyclTracIdData;
    @XmlElement(name = "LifeCyclTracIdMssng")
    protected String lifeCyclTracIdMssng;
    @XmlElement(name = "AcqrrRefData")
    protected String acqrrRefData;
    @XmlElement(name = "AcqrrRefNb")
    protected String acqrrRefNb;
    @XmlElement(name = "CardIssrRefData")
    protected String cardIssrRefData;

    /**
     * Obtiene el valor de la propiedad msgClss.
     * 
     * @return
     *     possible object is
     *     {@link MessageClass1Code }
     *     
     */
    public MessageClass1Code getMsgClss() {
        return msgClss;
    }

    /**
     * Define el valor de la propiedad msgClss.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageClass1Code }
     *     
     */
    public void setMsgClss(MessageClass1Code value) {
        this.msgClss = value;
    }

    /**
     * Obtiene el valor de la propiedad msgFctn.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction16Code }
     *     
     */
    public MessageFunction16Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Define el valor de la propiedad msgFctn.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction16Code }
     *     
     */
    public void setMsgFctn(MessageFunction16Code value) {
        this.msgFctn = value;
    }

    /**
     * Obtiene el valor de la propiedad txTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Define el valor de la propiedad txTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTp(String value) {
        this.txTp = value;
    }

    /**
     * Obtiene el valor de la propiedad acqrrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrId() {
        return acqrrId;
    }

    /**
     * Define el valor de la propiedad acqrrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrrId(String value) {
        this.acqrrId = value;
    }

    /**
     * Obtiene el valor de la propiedad sndrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrId() {
        return sndrId;
    }

    /**
     * Define el valor de la propiedad sndrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrId(String value) {
        this.sndrId = value;
    }

    /**
     * Obtiene el valor de la propiedad lclDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLclDt() {
        return lclDt;
    }

    /**
     * Define el valor de la propiedad lclDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLclDt(XMLGregorianCalendar value) {
        this.lclDt = value;
    }

    /**
     * Obtiene el valor de la propiedad lclTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLclTm() {
        return lclTm;
    }

    /**
     * Define el valor de la propiedad lclTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLclTm(XMLGregorianCalendar value) {
        this.lclTm = value;
    }

    /**
     * Obtiene el valor de la propiedad tmZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Define el valor de la propiedad tmZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmZone(String value) {
        this.tmZone = value;
    }

    /**
     * Obtiene el valor de la propiedad txRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxRef() {
        return txRef;
    }

    /**
     * Define el valor de la propiedad txRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxRef(String value) {
        this.txRef = value;
    }

    /**
     * Obtiene el valor de la propiedad trnsmssnDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnsmssnDtTm() {
        return trnsmssnDtTm;
    }

    /**
     * Define el valor de la propiedad trnsmssnDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnsmssnDtTm(XMLGregorianCalendar value) {
        this.trnsmssnDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad sysTracAudtNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTracAudtNb() {
        return sysTracAudtNb;
    }

    /**
     * Define el valor de la propiedad sysTracAudtNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
    }

    /**
     * Obtiene el valor de la propiedad rtrvlRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlRefNb() {
        return rtrvlRefNb;
    }

    /**
     * Define el valor de la propiedad rtrvlRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCyclSpprt.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public LifeCycleSupport1Code getLifeCyclSpprt() {
        return lifeCyclSpprt;
    }

    /**
     * Define el valor de la propiedad lifeCyclSpprt.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public void setLifeCyclSpprt(LifeCycleSupport1Code value) {
        this.lifeCyclSpprt = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCyclTracIdData.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLifeCycleIdentification1 }
     *     
     */
    public TransactionLifeCycleIdentification1 getLifeCyclTracIdData() {
        return lifeCyclTracIdData;
    }

    /**
     * Define el valor de la propiedad lifeCyclTracIdData.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLifeCycleIdentification1 }
     *     
     */
    public void setLifeCyclTracIdData(TransactionLifeCycleIdentification1 value) {
        this.lifeCyclTracIdData = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCyclTracIdMssng.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclTracIdMssng() {
        return lifeCyclTracIdMssng;
    }

    /**
     * Define el valor de la propiedad lifeCyclTracIdMssng.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCyclTracIdMssng(String value) {
        this.lifeCyclTracIdMssng = value;
    }

    /**
     * Obtiene el valor de la propiedad acqrrRefData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefData() {
        return acqrrRefData;
    }

    /**
     * Define el valor de la propiedad acqrrRefData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrrRefData(String value) {
        this.acqrrRefData = value;
    }

    /**
     * Obtiene el valor de la propiedad acqrrRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefNb() {
        return acqrrRefNb;
    }

    /**
     * Define el valor de la propiedad acqrrRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrrRefNb(String value) {
        this.acqrrRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad cardIssrRefData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrRefData() {
        return cardIssrRefData;
    }

    /**
     * Define el valor de la propiedad cardIssrRefData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssrRefData(String value) {
        this.cardIssrRefData = value;
    }

}
