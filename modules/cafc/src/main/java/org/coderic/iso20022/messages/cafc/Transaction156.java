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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Transaction156 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Transaction156"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO8583TransactionTypeCode"/&gt;
 *         &lt;element name="TxSubTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CxlInd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max256Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpclPrgrmmQlfctn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SpecialProgrammeQualification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TransactionIdentification51"/&gt;
 *         &lt;element name="TxAmts" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TransactionAmounts2"/&gt;
 *         &lt;element name="AddtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalAmounts3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FeeColltnCycl" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact1NumericText" minOccurs="0"/&gt;
 *         &lt;element name="FeeColltnRef" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}FeeCollectionReference1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction156", propOrder = {
    "txTp",
    "txSubTp",
    "cxlInd",
    "msgRsn",
    "altrnMsgRsn",
    "spclPrgrmmQlfctn",
    "txId",
    "txAmts",
    "addtlAmt",
    "addtlFee",
    "addtlData",
    "feeColltnCycl",
    "feeColltnRef"
})
public class Transaction156 {

    @XmlElement(name = "TxTp", required = true)
    protected String txTp;
    @XmlElement(name = "TxSubTp")
    protected String txSubTp;
    @XmlElement(name = "CxlInd")
    protected Boolean cxlInd;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "SpclPrgrmmQlfctn")
    protected List<SpecialProgrammeQualification1> spclPrgrmmQlfctn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification51 txId;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts2 txAmts;
    @XmlElement(name = "AddtlAmt")
    protected List<AdditionalAmounts3> addtlAmt;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "FeeColltnCycl")
    protected String feeColltnCycl;
    @XmlElement(name = "FeeColltnRef")
    protected FeeCollectionReference1 feeColltnRef;

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
     * Obtiene el valor de la propiedad txSubTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSubTp() {
        return txSubTp;
    }

    /**
     * Define el valor de la propiedad txSubTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSubTp(String value) {
        this.txSubTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cxlInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCxlInd() {
        return cxlInd;
    }

    /**
     * Define el valor de la propiedad cxlInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCxlInd(Boolean value) {
        this.cxlInd = value;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the msgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<String>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the altrnMsgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<String>();
        }
        return this.altrnMsgRsn;
    }

    /**
     * Gets the value of the spclPrgrmmQlfctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the spclPrgrmmQlfctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclPrgrmmQlfctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeQualification1 }
     * 
     * 
     */
    public List<SpecialProgrammeQualification1> getSpclPrgrmmQlfctn() {
        if (spclPrgrmmQlfctn == null) {
            spclPrgrmmQlfctn = new ArrayList<SpecialProgrammeQualification1>();
        }
        return this.spclPrgrmmQlfctn;
    }

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification51 }
     *     
     */
    public TransactionIdentification51 getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification51 }
     *     
     */
    public void setTxId(TransactionIdentification51 value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad txAmts.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmounts2 }
     *     
     */
    public TransactionAmounts2 getTxAmts() {
        return txAmts;
    }

    /**
     * Define el valor de la propiedad txAmts.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmounts2 }
     *     
     */
    public void setTxAmts(TransactionAmounts2 value) {
        this.txAmts = value;
    }

    /**
     * Gets the value of the addtlAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAmounts3 }
     * 
     * 
     */
    public List<AdditionalAmounts3> getAddtlAmt() {
        if (addtlAmt == null) {
            addtlAmt = new ArrayList<AdditionalAmounts3>();
        }
        return this.addtlAmt;
    }

    /**
     * Gets the value of the addtlFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalFee2 }
     * 
     * 
     */
    public List<AdditionalFee2> getAddtlFee() {
        if (addtlFee == null) {
            addtlFee = new ArrayList<AdditionalFee2>();
        }
        return this.addtlFee;
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

    /**
     * Obtiene el valor de la propiedad feeColltnCycl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeColltnCycl() {
        return feeColltnCycl;
    }

    /**
     * Define el valor de la propiedad feeColltnCycl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeColltnCycl(String value) {
        this.feeColltnCycl = value;
    }

    /**
     * Obtiene el valor de la propiedad feeColltnRef.
     * 
     * @return
     *     possible object is
     *     {@link FeeCollectionReference1 }
     *     
     */
    public FeeCollectionReference1 getFeeColltnRef() {
        return feeColltnRef;
    }

    /**
     * Define el valor de la propiedad feeColltnRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeCollectionReference1 }
     *     
     */
    public void setFeeColltnRef(FeeCollectionReference1 value) {
        this.feeColltnRef = value;
    }

}
