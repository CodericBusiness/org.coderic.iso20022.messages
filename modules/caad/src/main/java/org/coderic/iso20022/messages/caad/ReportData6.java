//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportData6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportData6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Qlfr" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Tm" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ISOTime" minOccurs="0"/&gt;
 *         &lt;element name="Seq" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max5NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TtlOcrncs" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max5NumericText" minOccurs="0"/&gt;
 *         &lt;element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Frequency17Code" minOccurs="0"/&gt;
 *         &lt;element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}CorrectionIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="ConttnInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}OutputFormat5Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Cntt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ReportContent1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData6", propOrder = {
    "nm",
    "id",
    "qlfr",
    "dt",
    "tm",
    "seq",
    "ttlOcrncs",
    "frqcy",
    "crrctn",
    "conttnInd",
    "addtlData",
    "frmt",
    "othrFrmt",
    "cntt"
})
public class ReportData6 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Qlfr")
    protected String qlfr;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;
    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "TtlOcrncs")
    protected String ttlOcrncs;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency17Code frqcy;
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "ConttnInd")
    protected Boolean conttnInd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat5Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Cntt")
    protected List<ReportContent1> cntt;

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad qlfr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQlfr() {
        return qlfr;
    }

    /**
     * Define el valor de la propiedad qlfr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQlfr(String value) {
        this.qlfr = value;
    }

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Obtiene el valor de la propiedad tm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Define el valor de la propiedad tm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
    }

    /**
     * Obtiene el valor de la propiedad seq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Define el valor de la propiedad seq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeq(String value) {
        this.seq = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlOcrncs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlOcrncs() {
        return ttlOcrncs;
    }

    /**
     * Define el valor de la propiedad ttlOcrncs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlOcrncs(String value) {
        this.ttlOcrncs = value;
    }

    /**
     * Obtiene el valor de la propiedad frqcy.
     * 
     * @return
     *     possible object is
     *     {@link Frequency17Code }
     *     
     */
    public Frequency17Code getFrqcy() {
        return frqcy;
    }

    /**
     * Define el valor de la propiedad frqcy.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency17Code }
     *     
     */
    public void setFrqcy(Frequency17Code value) {
        this.frqcy = value;
    }

    /**
     * Obtiene el valor de la propiedad crrctn.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public CorrectionIdentification1 getCrrctn() {
        return crrctn;
    }

    /**
     * Define el valor de la propiedad crrctn.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public void setCrrctn(CorrectionIdentification1 value) {
        this.crrctn = value;
    }

    /**
     * Obtiene el valor de la propiedad conttnInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConttnInd() {
        return conttnInd;
    }

    /**
     * Define el valor de la propiedad conttnInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConttnInd(Boolean value) {
        this.conttnInd = value;
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
     * Obtiene el valor de la propiedad frmt.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat5Code }
     *     
     */
    public OutputFormat5Code getFrmt() {
        return frmt;
    }

    /**
     * Define el valor de la propiedad frmt.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat5Code }
     *     
     */
    public void setFrmt(OutputFormat5Code value) {
        this.frmt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrFrmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Define el valor de la propiedad othrFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrmt(String value) {
        this.othrFrmt = value;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportContent1 }
     * 
     * 
     */
    public List<ReportContent1> getCntt() {
        if (cntt == null) {
            cntt = new ArrayList<ReportContent1>();
        }
        return this.cntt;
    }

}
