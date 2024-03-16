//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementObligation5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementObligation5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RltdSttlmOblgtnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OblgtnTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ObligationType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}FinancialInstrumentQuantity1Choice"/&gt;
 *         &lt;element name="NetPosPric" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Price4" minOccurs="0"/&gt;
 *         &lt;element name="TradgCcy" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AmountAndDirection27"/&gt;
 *         &lt;element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ISODate"/&gt;
 *         &lt;element name="SctiesMvmntTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReceiveDelivery1Code"/&gt;
 *         &lt;element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DeliveryReceiptType2Code"/&gt;
 *         &lt;element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Reference19" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligation5", propOrder = {
    "rltdSttlmOblgtnId",
    "oblgtnTp",
    "desc",
    "tradDt",
    "qty",
    "netPosPric",
    "tradgCcy",
    "sttlmAmt",
    "sttlmDt",
    "sctiesMvmntTp",
    "pmt",
    "refs"
})
public class SettlementObligation5 {

    @XmlElement(name = "RltdSttlmOblgtnId")
    protected String rltdSttlmOblgtnId;
    @XmlElement(name = "OblgtnTp")
    protected ObligationType1Choice oblgtnTp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "TradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "NetPosPric")
    protected Price4 netPosPric;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection27 sttlmAmt;
    @XmlElement(name = "SttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "Pmt", required = true)
    @XmlSchemaType(name = "string")
    protected DeliveryReceiptType2Code pmt;
    @XmlElement(name = "Refs")
    protected Reference19 refs;

    /**
     * Obtiene el valor de la propiedad rltdSttlmOblgtnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdSttlmOblgtnId() {
        return rltdSttlmOblgtnId;
    }

    /**
     * Define el valor de la propiedad rltdSttlmOblgtnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdSttlmOblgtnId(String value) {
        this.rltdSttlmOblgtnId = value;
    }

    /**
     * Obtiene el valor de la propiedad oblgtnTp.
     * 
     * @return
     *     possible object is
     *     {@link ObligationType1Choice }
     *     
     */
    public ObligationType1Choice getOblgtnTp() {
        return oblgtnTp;
    }

    /**
     * Define el valor de la propiedad oblgtnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ObligationType1Choice }
     *     
     */
    public void setOblgtnTp(ObligationType1Choice value) {
        this.oblgtnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Obtiene el valor de la propiedad tradDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Define el valor de la propiedad tradDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
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
     * Obtiene el valor de la propiedad netPosPric.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getNetPosPric() {
        return netPosPric;
    }

    /**
     * Define el valor de la propiedad netPosPric.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public void setNetPosPric(Price4 value) {
        this.netPosPric = value;
    }

    /**
     * Obtiene el valor de la propiedad tradgCcy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Define el valor de la propiedad tradgCcy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgCcy(String value) {
        this.tradgCcy = value;
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
     * Obtiene el valor de la propiedad sttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Define el valor de la propiedad sttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
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
     * Obtiene el valor de la propiedad refs.
     * 
     * @return
     *     possible object is
     *     {@link Reference19 }
     *     
     */
    public Reference19 getRefs() {
        return refs;
    }

    /**
     * Define el valor de la propiedad refs.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference19 }
     *     
     */
    public void setRefs(Reference19 value) {
        this.refs = value;
    }

}
