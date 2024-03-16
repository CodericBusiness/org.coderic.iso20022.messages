//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderData4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderData4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SubmitgNtty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}LEIIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="DrctElctrncAccs" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="ClntId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}PersonOrOrganisation4Choice" minOccurs="0"/&gt;
 *         &lt;element name="InvstmtDcsnPrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ExecutingParty2Choice" minOccurs="0"/&gt;
 *         &lt;element name="ExctgPrsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ExecutingParty2Choice" minOccurs="0"/&gt;
 *         &lt;element name="NonExctgBrkr" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}LEIIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}RegulatoryTradingCapacity1Code" minOccurs="0"/&gt;
 *         &lt;element name="LqdtyPrvsnActvty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="OrdrClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderClassification2" minOccurs="0"/&gt;
 *         &lt;element name="OrdrPrics" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderPriceData2" minOccurs="0"/&gt;
 *         &lt;element name="InstrData" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderInstructionData2" minOccurs="0"/&gt;
 *         &lt;element name="TxData" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TransactionData3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderData4", propOrder = {
    "submitgNtty",
    "drctElctrncAccs",
    "clntId",
    "invstmtDcsnPrsn",
    "exctgPrsn",
    "nonExctgBrkr",
    "tradgCpcty",
    "lqdtyPrvsnActvty",
    "ordrClssfctn",
    "ordrPrics",
    "instrData",
    "txData"
})
public class OrderData4 {

    @XmlElement(name = "SubmitgNtty")
    protected String submitgNtty;
    @XmlElement(name = "DrctElctrncAccs")
    protected Boolean drctElctrncAccs;
    @XmlElement(name = "ClntId")
    protected PersonOrOrganisation4Choice clntId;
    @XmlElement(name = "InvstmtDcsnPrsn")
    protected ExecutingParty2Choice invstmtDcsnPrsn;
    @XmlElement(name = "ExctgPrsn")
    protected ExecutingParty2Choice exctgPrsn;
    @XmlElement(name = "NonExctgBrkr")
    protected String nonExctgBrkr;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected RegulatoryTradingCapacity1Code tradgCpcty;
    @XmlElement(name = "LqdtyPrvsnActvty")
    protected Boolean lqdtyPrvsnActvty;
    @XmlElement(name = "OrdrClssfctn")
    protected OrderClassification2 ordrClssfctn;
    @XmlElement(name = "OrdrPrics")
    protected OrderPriceData2 ordrPrics;
    @XmlElement(name = "InstrData")
    protected OrderInstructionData2 instrData;
    @XmlElement(name = "TxData")
    protected TransactionData3 txData;

    /**
     * Obtiene el valor de la propiedad submitgNtty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgNtty() {
        return submitgNtty;
    }

    /**
     * Define el valor de la propiedad submitgNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitgNtty(String value) {
        this.submitgNtty = value;
    }

    /**
     * Obtiene el valor de la propiedad drctElctrncAccs.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctElctrncAccs() {
        return drctElctrncAccs;
    }

    /**
     * Define el valor de la propiedad drctElctrncAccs.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrctElctrncAccs(Boolean value) {
        this.drctElctrncAccs = value;
    }

    /**
     * Obtiene el valor de la propiedad clntId.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganisation4Choice }
     *     
     */
    public PersonOrOrganisation4Choice getClntId() {
        return clntId;
    }

    /**
     * Define el valor de la propiedad clntId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganisation4Choice }
     *     
     */
    public void setClntId(PersonOrOrganisation4Choice value) {
        this.clntId = value;
    }

    /**
     * Obtiene el valor de la propiedad invstmtDcsnPrsn.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public ExecutingParty2Choice getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    /**
     * Define el valor de la propiedad invstmtDcsnPrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public void setInvstmtDcsnPrsn(ExecutingParty2Choice value) {
        this.invstmtDcsnPrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad exctgPrsn.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public ExecutingParty2Choice getExctgPrsn() {
        return exctgPrsn;
    }

    /**
     * Define el valor de la propiedad exctgPrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty2Choice }
     *     
     */
    public void setExctgPrsn(ExecutingParty2Choice value) {
        this.exctgPrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad nonExctgBrkr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonExctgBrkr() {
        return nonExctgBrkr;
    }

    /**
     * Define el valor de la propiedad nonExctgBrkr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonExctgBrkr(String value) {
        this.nonExctgBrkr = value;
    }

    /**
     * Obtiene el valor de la propiedad tradgCpcty.
     * 
     * @return
     *     possible object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public RegulatoryTradingCapacity1Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Define el valor de la propiedad tradgCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulatoryTradingCapacity1Code }
     *     
     */
    public void setTradgCpcty(RegulatoryTradingCapacity1Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Obtiene el valor de la propiedad lqdtyPrvsnActvty.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdtyPrvsnActvty() {
        return lqdtyPrvsnActvty;
    }

    /**
     * Define el valor de la propiedad lqdtyPrvsnActvty.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLqdtyPrvsnActvty(Boolean value) {
        this.lqdtyPrvsnActvty = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrClssfctn.
     * 
     * @return
     *     possible object is
     *     {@link OrderClassification2 }
     *     
     */
    public OrderClassification2 getOrdrClssfctn() {
        return ordrClssfctn;
    }

    /**
     * Define el valor de la propiedad ordrClssfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderClassification2 }
     *     
     */
    public void setOrdrClssfctn(OrderClassification2 value) {
        this.ordrClssfctn = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrPrics.
     * 
     * @return
     *     possible object is
     *     {@link OrderPriceData2 }
     *     
     */
    public OrderPriceData2 getOrdrPrics() {
        return ordrPrics;
    }

    /**
     * Define el valor de la propiedad ordrPrics.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPriceData2 }
     *     
     */
    public void setOrdrPrics(OrderPriceData2 value) {
        this.ordrPrics = value;
    }

    /**
     * Obtiene el valor de la propiedad instrData.
     * 
     * @return
     *     possible object is
     *     {@link OrderInstructionData2 }
     *     
     */
    public OrderInstructionData2 getInstrData() {
        return instrData;
    }

    /**
     * Define el valor de la propiedad instrData.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInstructionData2 }
     *     
     */
    public void setInstrData(OrderInstructionData2 value) {
        this.instrData = value;
    }

    /**
     * Obtiene el valor de la propiedad txData.
     * 
     * @return
     *     possible object is
     *     {@link TransactionData3 }
     *     
     */
    public TransactionData3 getTxData() {
        return txData;
    }

    /**
     * Define el valor de la propiedad txData.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionData3 }
     *     
     */
    public void setTxData(TransactionData3 value) {
        this.txData = value;
    }

}
