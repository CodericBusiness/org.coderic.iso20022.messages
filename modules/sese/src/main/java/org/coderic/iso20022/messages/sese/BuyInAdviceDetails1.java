//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:51 PM COT 
//


package org.coderic.iso20022.messages.sese;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuyInAdviceDetails1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuyInAdviceDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}References23"/&gt;
 *         &lt;element name="BuyInStat" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}BuyInState1Code"/&gt;
 *         &lt;element name="BuyInDfrrl" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}BuyInDeferral1Code"/&gt;
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}SecurityIdentification19" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/&gt;
 *         &lt;element name="BuyInPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}RateAndAmountFormat39Choice" minOccurs="0"/&gt;
 *         &lt;element name="CshCompstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}AmountAndDirection102" minOccurs="0"/&gt;
 *         &lt;element name="BuyInSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}DateAndDateTime2Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInAdviceDetails1", propOrder = {
    "ref",
    "buyInStat",
    "buyInDfrrl",
    "finInstrmId",
    "qty",
    "buyInPric",
    "cshCompstnAmt",
    "buyInSttlmDt"
})
public class BuyInAdviceDetails1 {

    @XmlElement(name = "Ref", required = true)
    protected References23 ref;
    @XmlElement(name = "BuyInStat", required = true)
    @XmlSchemaType(name = "string")
    protected BuyInState1Code buyInStat;
    @XmlElement(name = "BuyInDfrrl", required = true)
    @XmlSchemaType(name = "string")
    protected BuyInDeferral1Code buyInDfrrl;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "BuyInPric")
    protected RateAndAmountFormat39Choice buyInPric;
    @XmlElement(name = "CshCompstnAmt")
    protected AmountAndDirection102 cshCompstnAmt;
    @XmlElement(name = "BuyInSttlmDt")
    protected DateAndDateTime2Choice buyInSttlmDt;

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link References23 }
     *     
     */
    public References23 getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link References23 }
     *     
     */
    public void setRef(References23 value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad buyInStat.
     * 
     * @return
     *     possible object is
     *     {@link BuyInState1Code }
     *     
     */
    public BuyInState1Code getBuyInStat() {
        return buyInStat;
    }

    /**
     * Define el valor de la propiedad buyInStat.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInState1Code }
     *     
     */
    public void setBuyInStat(BuyInState1Code value) {
        this.buyInStat = value;
    }

    /**
     * Obtiene el valor de la propiedad buyInDfrrl.
     * 
     * @return
     *     possible object is
     *     {@link BuyInDeferral1Code }
     *     
     */
    public BuyInDeferral1Code getBuyInDfrrl() {
        return buyInDfrrl;
    }

    /**
     * Define el valor de la propiedad buyInDfrrl.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInDeferral1Code }
     *     
     */
    public void setBuyInDfrrl(BuyInDeferral1Code value) {
        this.buyInDfrrl = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Define el valor de la propiedad finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
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
     * Obtiene el valor de la propiedad buyInPric.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getBuyInPric() {
        return buyInPric;
    }

    /**
     * Define el valor de la propiedad buyInPric.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public void setBuyInPric(RateAndAmountFormat39Choice value) {
        this.buyInPric = value;
    }

    /**
     * Obtiene el valor de la propiedad cshCompstnAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getCshCompstnAmt() {
        return cshCompstnAmt;
    }

    /**
     * Define el valor de la propiedad cshCompstnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setCshCompstnAmt(AmountAndDirection102 value) {
        this.cshCompstnAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad buyInSttlmDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getBuyInSttlmDt() {
        return buyInSttlmDt;
    }

    /**
     * Define el valor de la propiedad buyInSttlmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setBuyInSttlmDt(DateAndDateTime2Choice value) {
        this.buyInSttlmDt = value;
    }

}
