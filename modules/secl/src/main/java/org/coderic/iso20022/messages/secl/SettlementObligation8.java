//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementObligation8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementObligation8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SttlmOblgtnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text"/&gt;
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecurityIdentification14"/&gt;
 *         &lt;element name="IntnddSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DateFormat11Choice"/&gt;
 *         &lt;element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}FinancialInstrumentQuantity1Choice"/&gt;
 *         &lt;element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AmountAndDirection27"/&gt;
 *         &lt;element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}MarketIdentification84"/&gt;
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}TradeDate3Choice" minOccurs="0"/&gt;
 *         &lt;element name="TradgCpcty" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}TradingCapacity5Code" minOccurs="0"/&gt;
 *         &lt;element name="ClrAcctTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ClearingAccountType1Code" minOccurs="0"/&gt;
 *         &lt;element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SafekeepingPlaceFormat7Choice" minOccurs="0"/&gt;
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecuritiesAccount19" minOccurs="0"/&gt;
 *         &lt;element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReceiveDelivery1Code" minOccurs="0"/&gt;
 *         &lt;element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DeliveryReceiptType2Code"/&gt;
 *         &lt;element name="SttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SettlementParties4Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlSttlmOblgtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SettlementObligation5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation8", propOrder = {
    "sttlmOblgtnId",
    "finInstrmId",
    "intnddSttlmDt",
    "qty",
    "sttlmAmt",
    "plcOfTrad",
    "tradDt",
    "tradgCpcty",
    "clrAcctTp",
    "sfkpgPlc",
    "sfkpgAcct",
    "sctiesMvmntTp",
    "pmt",
    "sttlmPties",
    "addtlSttlmOblgtnDtls"
})
public class SettlementObligation8 {

    @XmlElement(name = "SttlmOblgtnId", required = true)
    protected String sttlmOblgtnId;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification14 finInstrmId;
    @XmlElement(name = "IntnddSttlmDt", required = true)
    protected DateFormat11Choice intnddSttlmDt;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "PlcOfTrad", required = true)
    protected MarketIdentification84 plcOfTrad;
    @XmlElement(name = "TradDt")
    protected TradeDate3Choice tradDt;
    @XmlElement(name = "TradgCpcty")
    @XmlSchemaType(name = "string")
    protected TradingCapacity5Code tradgCpcty;
    @XmlElement(name = "ClrAcctTp")
    @XmlSchemaType(name = "string")
    protected ClearingAccountType1Code clrAcctTp;
    @XmlElement(name = "SfkpgPlc")
    protected SafekeepingPlaceFormat7Choice sfkpgPlc;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "SctiesMvmntTp")
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties4Choice sttlmPties;
    @XmlElement(name = "AddtlSttlmOblgtnDtls")
    protected List<SettlementObligation5> addtlSttlmOblgtnDtls;

    /**
     * Obtiene el valor de la propiedad sttlmOblgtnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmOblgtnId() {
        return sttlmOblgtnId;
    }

    /**
     * Define el valor de la propiedad sttlmOblgtnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmOblgtnId(String value) {
        this.sttlmOblgtnId = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public SecurityIdentification14 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Define el valor de la propiedad finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification14 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification14 value) {
        this.finInstrmId = value;
    }

    /**
     * Obtiene el valor de la propiedad intnddSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat11Choice }
     *     
     */
    public DateFormat11Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Define el valor de la propiedad intnddSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat11Choice }
     *     
     */
    public void setIntnddSttlmDt(DateFormat11Choice value) {
        this.intnddSttlmDt = value;
    }

    /**
     * Obtiene el valor de la propiedad qty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Define el valor de la propiedad qty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public AmountAndDirection27 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Define el valor de la propiedad sttlmAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection27 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection27 value) {
        this.sttlmAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad plcOfTrad.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification84 }
     *     
     */
    public MarketIdentification84 getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Define el valor de la propiedad plcOfTrad.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification84 }
     *     
     */
    public void setPlcOfTrad(MarketIdentification84 value) {
        this.plcOfTrad = value;
    }

    /**
     * Obtiene el valor de la propiedad tradDt.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate3Choice }
     *     
     */
    public TradeDate3Choice getTradDt() {
        return tradDt;
    }

    /**
     * Define el valor de la propiedad tradDt.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate3Choice }
     *     
     */
    public void setTradDt(TradeDate3Choice value) {
        this.tradDt = value;
    }

    /**
     * Obtiene el valor de la propiedad tradgCpcty.
     * 
     * @return
     *     possible object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public TradingCapacity5Code getTradgCpcty() {
        return tradgCpcty;
    }

    /**
     * Define el valor de la propiedad tradgCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingCapacity5Code }
     *     
     */
    public void setTradgCpcty(TradingCapacity5Code value) {
        this.tradgCpcty = value;
    }

    /**
     * Obtiene el valor de la propiedad clrAcctTp.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccountType1Code }
     *     
     */
    public ClearingAccountType1Code getClrAcctTp() {
        return clrAcctTp;
    }

    /**
     * Define el valor de la propiedad clrAcctTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccountType1Code }
     *     
     */
    public void setClrAcctTp(ClearingAccountType1Code value) {
        this.clrAcctTp = value;
    }

    /**
     * Obtiene el valor de la propiedad sfkpgPlc.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public SafekeepingPlaceFormat7Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Define el valor de la propiedad sfkpgPlc.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat7Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat7Choice value) {
        this.sfkpgPlc = value;
    }

    /**
     * Obtiene el valor de la propiedad sfkpgAcct.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Define el valor de la propiedad sfkpgAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesMvmntTp.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Define el valor de la propiedad sctiesMvmntTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public void setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
    }

    /**
     * Obtiene el valor de la propiedad pmt.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public DeliveryReceiptType2Code getPmt() {
        return pmt;
    }

    /**
     * Define el valor de la propiedad pmt.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryReceiptType2Code }
     *     
     */
    public void setPmt(DeliveryReceiptType2Code value) {
        this.pmt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties4Choice }
     *     
     */
    public SettlementParties4Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Define el valor de la propiedad sttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties4Choice }
     *     
     */
    public void setSttlmPties(SettlementParties4Choice value) {
        this.sttlmPties = value;
    }

    /**
     * Gets the value of the addtlSttlmOblgtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSttlmOblgtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSttlmOblgtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementObligation5 }
     * 
     * 
     */
    public List<SettlementObligation5> getAddtlSttlmOblgtnDtls() {
        if (addtlSttlmOblgtnDtls == null) {
            addtlSttlmOblgtnDtls = new ArrayList<SettlementObligation5>();
        }
        return this.addtlSttlmOblgtnDtls;
    }

}
