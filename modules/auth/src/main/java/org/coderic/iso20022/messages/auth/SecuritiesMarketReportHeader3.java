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
 * <p>Clase Java para SecuritiesMarketReportHeader3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesMarketReportHeader3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TradingVenueIdentification1Choice"/&gt;
 *         &lt;element name="RptgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Period11Choice"/&gt;
 *         &lt;element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISINOct2015Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubmissnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="MsgPgntn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Pagination1" minOccurs="0"/&gt;
 *         &lt;element name="NbRcrds" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Number" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMarketReportHeader3", propOrder = {
    "rptgNtty",
    "rptgPrd",
    "isin",
    "submissnDtTm",
    "msgPgntn",
    "nbRcrds"
})
public class SecuritiesMarketReportHeader3 {

    @XmlElement(name = "RptgNtty", required = true)
    protected TradingVenueIdentification1Choice rptgNtty;
    @XmlElement(name = "RptgPrd", required = true)
    protected Period11Choice rptgPrd;
    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "SubmissnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissnDtTm;
    @XmlElement(name = "MsgPgntn")
    protected Pagination1 msgPgntn;
    @XmlElement(name = "NbRcrds")
    protected BigDecimal nbRcrds;

    /**
     * Obtiene el valor de la propiedad rptgNtty.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public TradingVenueIdentification1Choice getRptgNtty() {
        return rptgNtty;
    }

    /**
     * Define el valor de la propiedad rptgNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public void setRptgNtty(TradingVenueIdentification1Choice value) {
        this.rptgNtty = value;
    }

    /**
     * Obtiene el valor de la propiedad rptgPrd.
     * 
     * @return
     *     possible object is
     *     {@link Period11Choice }
     *     
     */
    public Period11Choice getRptgPrd() {
        return rptgPrd;
    }

    /**
     * Define el valor de la propiedad rptgPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link Period11Choice }
     *     
     */
    public void setRptgPrd(Period11Choice value) {
        this.rptgPrd = value;
    }

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<String>();
        }
        return this.isin;
    }

    /**
     * Obtiene el valor de la propiedad submissnDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissnDtTm() {
        return submissnDtTm;
    }

    /**
     * Define el valor de la propiedad submissnDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissnDtTm(XMLGregorianCalendar value) {
        this.submissnDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad msgPgntn.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Define el valor de la propiedad msgPgntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setMsgPgntn(Pagination1 value) {
        this.msgPgntn = value;
    }

    /**
     * Obtiene el valor de la propiedad nbRcrds.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbRcrds() {
        return nbRcrds;
    }

    /**
     * Define el valor de la propiedad nbRcrds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbRcrds(BigDecimal value) {
        this.nbRcrds = value;
    }

}
