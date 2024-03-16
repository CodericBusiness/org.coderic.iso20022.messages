//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderIdentification2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderIdentification2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdrBookId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max35Text"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}PositiveNumber"/&gt;
 *         &lt;element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderPriority1" minOccurs="0"/&gt;
 *         &lt;element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODateTime"/&gt;
 *         &lt;element name="TradVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}MICIdentifier"/&gt;
 *         &lt;element name="FinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrument99Choice"/&gt;
 *         &lt;element name="OrdrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max50Text" minOccurs="0"/&gt;
 *         &lt;element name="DtOfRct" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="VldtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ValidityPeriod1Choice" minOccurs="0"/&gt;
 *         &lt;element name="OrdrRstrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderRestriction1Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VldtyDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderEventType1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderIdentification2", propOrder = {
    "ordrBookId",
    "seqNb",
    "prty",
    "tmStmp",
    "tradVn",
    "finInstrm",
    "ordrId",
    "dtOfRct",
    "vldtyPrd",
    "ordrRstrctn",
    "vldtyDtTm",
    "evtTp"
})
public class OrderIdentification2 {

    @XmlElement(name = "OrdrBookId", required = true)
    protected String ordrBookId;
    @XmlElement(name = "SeqNb", required = true)
    protected BigDecimal seqNb;
    @XmlElement(name = "Prty")
    protected OrderPriority1 prty;
    @XmlElement(name = "TmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;
    @XmlElement(name = "TradVn", required = true)
    protected String tradVn;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrument99Choice finInstrm;
    @XmlElement(name = "OrdrId")
    protected String ordrId;
    @XmlElement(name = "DtOfRct")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfRct;
    @XmlElement(name = "VldtyPrd")
    protected ValidityPeriod1Choice vldtyPrd;
    @XmlElement(name = "OrdrRstrctn")
    protected List<OrderRestriction1Choice> ordrRstrctn;
    @XmlElement(name = "VldtyDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldtyDtTm;
    @XmlElement(name = "EvtTp")
    protected OrderEventType1Choice evtTp;

    /**
     * Obtiene el valor de la propiedad ordrBookId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrBookId() {
        return ordrBookId;
    }

    /**
     * Define el valor de la propiedad ordrBookId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrBookId(String value) {
        this.ordrBookId = value;
    }

    /**
     * Obtiene el valor de la propiedad seqNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Define el valor de la propiedad seqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad prty.
     * 
     * @return
     *     possible object is
     *     {@link OrderPriority1 }
     *     
     */
    public OrderPriority1 getPrty() {
        return prty;
    }

    /**
     * Define el valor de la propiedad prty.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPriority1 }
     *     
     */
    public void setPrty(OrderPriority1 value) {
        this.prty = value;
    }

    /**
     * Obtiene el valor de la propiedad tmStmp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
        return tmStmp;
    }

    /**
     * Define el valor de la propiedad tmStmp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
    }

    /**
     * Obtiene el valor de la propiedad tradVn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradVn() {
        return tradVn;
    }

    /**
     * Define el valor de la propiedad tradVn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradVn(String value) {
        this.tradVn = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrm.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument99Choice }
     *     
     */
    public FinancialInstrument99Choice getFinInstrm() {
        return finInstrm;
    }

    /**
     * Define el valor de la propiedad finInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument99Choice }
     *     
     */
    public void setFinInstrm(FinancialInstrument99Choice value) {
        this.finInstrm = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrId() {
        return ordrId;
    }

    /**
     * Define el valor de la propiedad ordrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrId(String value) {
        this.ordrId = value;
    }

    /**
     * Obtiene el valor de la propiedad dtOfRct.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfRct() {
        return dtOfRct;
    }

    /**
     * Define el valor de la propiedad dtOfRct.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfRct(XMLGregorianCalendar value) {
        this.dtOfRct = value;
    }

    /**
     * Obtiene el valor de la propiedad vldtyPrd.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriod1Choice }
     *     
     */
    public ValidityPeriod1Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Define el valor de la propiedad vldtyPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriod1Choice }
     *     
     */
    public void setVldtyPrd(ValidityPeriod1Choice value) {
        this.vldtyPrd = value;
    }

    /**
     * Gets the value of the ordrRstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ordrRstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRestriction1Choice }
     * 
     * 
     */
    public List<OrderRestriction1Choice> getOrdrRstrctn() {
        if (ordrRstrctn == null) {
            ordrRstrctn = new ArrayList<OrderRestriction1Choice>();
        }
        return this.ordrRstrctn;
    }

    /**
     * Obtiene el valor de la propiedad vldtyDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtyDtTm() {
        return vldtyDtTm;
    }

    /**
     * Define el valor de la propiedad vldtyDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldtyDtTm(XMLGregorianCalendar value) {
        this.vldtyDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad evtTp.
     * 
     * @return
     *     possible object is
     *     {@link OrderEventType1Choice }
     *     
     */
    public OrderEventType1Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Define el valor de la propiedad evtTp.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderEventType1Choice }
     *     
     */
    public void setEvtTp(OrderEventType1Choice value) {
        this.evtTp = value;
    }

}
