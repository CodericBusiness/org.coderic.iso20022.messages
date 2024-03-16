//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

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
 * <p>Clase Java para Header32 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Header32"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMMessageFunction2"/&gt;
 *         &lt;element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max6Text"/&gt;
 *         &lt;element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max3NumericText"/&gt;
 *         &lt;element name="ReTrnsmssnCntr" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ISODateTime"/&gt;
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text"/&gt;
 *         &lt;element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrcStat" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Traceability4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header32", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "reTrnsmssnCntr",
    "creDtTm",
    "initgPty",
    "rcptPty",
    "prcStat",
    "tracblt"
})
public class Header32 {

    @XmlElement(name = "MsgFctn", required = true)
    protected ATMMessageFunction2 msgFctn;
    @XmlElement(name = "PrtcolVrsn", required = true)
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "ReTrnsmssnCntr")
    protected BigDecimal reTrnsmssnCntr;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InitgPty", required = true)
    protected String initgPty;
    @XmlElement(name = "RcptPty")
    protected String rcptPty;
    @XmlElement(name = "PrcStat")
    protected String prcStat;
    @XmlElement(name = "Tracblt")
    protected List<Traceability4> tracblt;

    /**
     * Obtiene el valor de la propiedad msgFctn.
     * 
     * @return
     *     possible object is
     *     {@link ATMMessageFunction2 }
     *     
     */
    public ATMMessageFunction2 getMsgFctn() {
        return msgFctn;
    }

    /**
     * Define el valor de la propiedad msgFctn.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMessageFunction2 }
     *     
     */
    public void setMsgFctn(ATMMessageFunction2 value) {
        this.msgFctn = value;
    }

    /**
     * Obtiene el valor de la propiedad prtcolVrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Define el valor de la propiedad prtcolVrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad xchgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Define el valor de la propiedad xchgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgId(String value) {
        this.xchgId = value;
    }

    /**
     * Obtiene el valor de la propiedad reTrnsmssnCntr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReTrnsmssnCntr() {
        return reTrnsmssnCntr;
    }

    /**
     * Define el valor de la propiedad reTrnsmssnCntr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReTrnsmssnCntr(BigDecimal value) {
        this.reTrnsmssnCntr = value;
    }

    /**
     * Obtiene el valor de la propiedad creDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Define el valor de la propiedad creDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad initgPty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitgPty() {
        return initgPty;
    }

    /**
     * Define el valor de la propiedad initgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitgPty(String value) {
        this.initgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad rcptPty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptPty() {
        return rcptPty;
    }

    /**
     * Define el valor de la propiedad rcptPty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptPty(String value) {
        this.rcptPty = value;
    }

    /**
     * Obtiene el valor de la propiedad prcStat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcStat() {
        return prcStat;
    }

    /**
     * Define el valor de la propiedad prcStat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcStat(String value) {
        this.prcStat = value;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability4 }
     * 
     * 
     */
    public List<Traceability4> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability4>();
        }
        return this.tracblt;
    }

}
