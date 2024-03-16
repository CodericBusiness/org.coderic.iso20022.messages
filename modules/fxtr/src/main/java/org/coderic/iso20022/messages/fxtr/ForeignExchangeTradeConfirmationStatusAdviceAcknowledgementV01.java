//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:16 PM COT 
//


package org.coderic.iso20022.messages.fxtr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvcAckId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}MessageIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="ReqId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}MessageIdentification1"/&gt;
 *         &lt;element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}ISODate"/&gt;
 *         &lt;element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}Max35Text"/&gt;
 *         &lt;element name="TradgMd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}TradingModeType1Code"/&gt;
 *         &lt;element name="AffirmSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}AffirmStatus1Code"/&gt;
 *         &lt;element name="ConfSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}TradeConfirmationStatus1Code"/&gt;
 *         &lt;element name="MktId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}MarketIdentification88"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}AdditionalInformation5" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.038.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01", propOrder = {
    "advcAckId",
    "reqId",
    "tradDt",
    "tradId",
    "tradgMd",
    "affirmSts",
    "confSts",
    "mktId",
    "addtlInf",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationStatusAdviceAcknowledgementV01 {

    @XmlElement(name = "AdvcAckId")
    protected MessageIdentification1 advcAckId;
    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "TradgMd", required = true)
    @XmlSchemaType(name = "string")
    protected TradingModeType1Code tradgMd;
    @XmlElement(name = "AffirmSts", required = true)
    @XmlSchemaType(name = "string")
    protected AffirmStatus1Code affirmSts;
    @XmlElement(name = "ConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected TradeConfirmationStatus1Code confSts;
    @XmlElement(name = "MktId", required = true)
    protected MarketIdentification88 mktId;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation5 addtlInf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad advcAckId.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAdvcAckId() {
        return advcAckId;
    }

    /**
     * Define el valor de la propiedad advcAckId.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setAdvcAckId(MessageIdentification1 value) {
        this.advcAckId = value;
    }

    /**
     * Obtiene el valor de la propiedad reqId.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Define el valor de la propiedad reqId.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setReqId(MessageIdentification1 value) {
        this.reqId = value;
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
     * Obtiene el valor de la propiedad tradId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Define el valor de la propiedad tradId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradId(String value) {
        this.tradId = value;
    }

    /**
     * Obtiene el valor de la propiedad tradgMd.
     * 
     * @return
     *     possible object is
     *     {@link TradingModeType1Code }
     *     
     */
    public TradingModeType1Code getTradgMd() {
        return tradgMd;
    }

    /**
     * Define el valor de la propiedad tradgMd.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingModeType1Code }
     *     
     */
    public void setTradgMd(TradingModeType1Code value) {
        this.tradgMd = value;
    }

    /**
     * Obtiene el valor de la propiedad affirmSts.
     * 
     * @return
     *     possible object is
     *     {@link AffirmStatus1Code }
     *     
     */
    public AffirmStatus1Code getAffirmSts() {
        return affirmSts;
    }

    /**
     * Define el valor de la propiedad affirmSts.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmStatus1Code }
     *     
     */
    public void setAffirmSts(AffirmStatus1Code value) {
        this.affirmSts = value;
    }

    /**
     * Obtiene el valor de la propiedad confSts.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public TradeConfirmationStatus1Code getConfSts() {
        return confSts;
    }

    /**
     * Define el valor de la propiedad confSts.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmationStatus1Code }
     *     
     */
    public void setConfSts(TradeConfirmationStatus1Code value) {
        this.confSts = value;
    }

    /**
     * Obtiene el valor de la propiedad mktId.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification88 }
     *     
     */
    public MarketIdentification88 getMktId() {
        return mktId;
    }

    /**
     * Define el valor de la propiedad mktId.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification88 }
     *     
     */
    public void setMktId(MarketIdentification88 value) {
        this.mktId = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation5 }
     *     
     */
    public AdditionalInformation5 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation5 }
     *     
     */
    public void setAddtlInf(AdditionalInformation5 value) {
        this.addtlInf = value;
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
