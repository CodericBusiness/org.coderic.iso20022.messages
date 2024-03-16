//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Transaction133 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Transaction133"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyXchgFctn" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}CardServiceType5Code"/&gt;
 *         &lt;element name="OthrKeyXchgFctn" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max256Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}TransactionIdentification12"/&gt;
 *         &lt;element name="KeyXchgTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}KeyType1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrKeyXchgTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="KeyXchgData" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}KeyExchangeData1" minOccurs="0"/&gt;
 *         &lt;element name="AddtlFee" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}AdditionalFee2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction133", propOrder = {
    "keyXchgFctn",
    "othrKeyXchgFctn",
    "msgRsn",
    "altrnMsgRsn",
    "txId",
    "keyXchgTp",
    "othrKeyXchgTp",
    "keyXchgData",
    "addtlFee",
    "addtlData"
})
public class Transaction133 {

    @XmlElement(name = "KeyXchgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected CardServiceType5Code keyXchgFctn;
    @XmlElement(name = "OthrKeyXchgFctn")
    protected String othrKeyXchgFctn;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentification12 txId;
    @XmlElement(name = "KeyXchgTp")
    @XmlSchemaType(name = "string")
    protected KeyType1Code keyXchgTp;
    @XmlElement(name = "OthrKeyXchgTp")
    protected String othrKeyXchgTp;
    @XmlElement(name = "KeyXchgData")
    protected KeyExchangeData1 keyXchgData;
    @XmlElement(name = "AddtlFee")
    protected List<AdditionalFee2> addtlFee;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad keyXchgFctn.
     * 
     * @return
     *     possible object is
     *     {@link CardServiceType5Code }
     *     
     */
    public CardServiceType5Code getKeyXchgFctn() {
        return keyXchgFctn;
    }

    /**
     * Define el valor de la propiedad keyXchgFctn.
     * 
     * @param value
     *     allowed object is
     *     {@link CardServiceType5Code }
     *     
     */
    public void setKeyXchgFctn(CardServiceType5Code value) {
        this.keyXchgFctn = value;
    }

    /**
     * Obtiene el valor de la propiedad othrKeyXchgFctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgFctn() {
        return othrKeyXchgFctn;
    }

    /**
     * Define el valor de la propiedad othrKeyXchgFctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrKeyXchgFctn(String value) {
        this.othrKeyXchgFctn = value;
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
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public TransactionIdentification12 getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentification12 }
     *     
     */
    public void setTxId(TransactionIdentification12 value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad keyXchgTp.
     * 
     * @return
     *     possible object is
     *     {@link KeyType1Code }
     *     
     */
    public KeyType1Code getKeyXchgTp() {
        return keyXchgTp;
    }

    /**
     * Define el valor de la propiedad keyXchgTp.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType1Code }
     *     
     */
    public void setKeyXchgTp(KeyType1Code value) {
        this.keyXchgTp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrKeyXchgTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrKeyXchgTp() {
        return othrKeyXchgTp;
    }

    /**
     * Define el valor de la propiedad othrKeyXchgTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrKeyXchgTp(String value) {
        this.othrKeyXchgTp = value;
    }

    /**
     * Obtiene el valor de la propiedad keyXchgData.
     * 
     * @return
     *     possible object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public KeyExchangeData1 getKeyXchgData() {
        return keyXchgData;
    }

    /**
     * Define el valor de la propiedad keyXchgData.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExchangeData1 }
     *     
     */
    public void setKeyXchgData(KeyExchangeData1 value) {
        this.keyXchgData = value;
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

}
