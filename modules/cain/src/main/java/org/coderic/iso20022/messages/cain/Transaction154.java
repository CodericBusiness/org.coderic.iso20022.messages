//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Transaction154 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Transaction154"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max256Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}TransactionIdentification17"/&gt;
 *         &lt;element name="TxAmts" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}TransactionAmounts2"/&gt;
 *         &lt;element name="DsptData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}DisputeData3"/&gt;
 *         &lt;element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}AdditionalInformation20" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction154", propOrder = {
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "txAmts",
    "dsptData",
    "addtlFee",
    "addtlInf",
    "addtlData"
})
public class Transaction154 {

    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification17 txId;
    @XmlElement(name = "TxAmts", required = true)
    protected TransactionAmounts2 txAmts;
    @XmlElement(name = "DsptData", required = true)
    protected DisputeData3 dsptData;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation20 addtlInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification17 }
     *     
     */
    public TransactionIdentification17 getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification17 }
     *     
     */
    public void setTxId(TransactionIdentification17 value) {
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
     * Obtiene el valor de la propiedad dsptData.
     * 
     * @return
     *     possible object is
     *     {@link DisputeData3 }
     *     
     */
    public DisputeData3 getDsptData() {
        return dsptData;
    }

    /**
     * Define el valor de la propiedad dsptData.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeData3 }
     *     
     */
    public void setDsptData(DisputeData3 value) {
        this.dsptData = value;
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
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation20 }
     *     
     */
    public AdditionalInformation20 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation20 }
     *     
     */
    public void setAddtlInf(AdditionalInformation20 value) {
        this.addtlInf = value;
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
