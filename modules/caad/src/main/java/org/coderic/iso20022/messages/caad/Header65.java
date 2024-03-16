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
 * <p>Clase Java para Header65 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Header65"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}MessageFunction27Code"/&gt;
 *         &lt;element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max2048Text"/&gt;
 *         &lt;element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ReTrnsmssnCntr" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max3NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ISODateTime"/&gt;
 *         &lt;element name="BtchMgmtInf" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}BatchManagementInformation1" minOccurs="0"/&gt;
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}GenericIdentification183"/&gt;
 *         &lt;element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}GenericIdentification183" minOccurs="0"/&gt;
 *         &lt;element name="TracData" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Traceability9" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header65", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "reTrnsmssnCntr",
    "creDtTm",
    "btchMgmtInf",
    "initgPty",
    "rcptPty",
    "tracData",
    "tracblt"
})
public class Header65 {

    @XmlElement(name = "MsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction27Code msgFctn;
    @XmlElement(name = "PrtcolVrsn", required = true)
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId")
    protected String xchgId;
    @XmlElement(name = "ReTrnsmssnCntr")
    protected String reTrnsmssnCntr;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "BtchMgmtInf")
    protected BatchManagementInformation1 btchMgmtInf;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification183 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification183 rcptPty;
    @XmlElement(name = "TracData")
    protected List<AdditionalData1> tracData;
    @XmlElement(name = "Tracblt")
    protected List<Traceability9> tracblt;

    /**
     * Obtiene el valor de la propiedad msgFctn.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction27Code }
     *     
     */
    public MessageFunction27Code getMsgFctn() {
        return msgFctn;
    }

    /**
     * Define el valor de la propiedad msgFctn.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction27Code }
     *     
     */
    public void setMsgFctn(MessageFunction27Code value) {
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
     *     {@link String }
     *     
     */
    public String getReTrnsmssnCntr() {
        return reTrnsmssnCntr;
    }

    /**
     * Define el valor de la propiedad reTrnsmssnCntr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReTrnsmssnCntr(String value) {
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
     * Obtiene el valor de la propiedad btchMgmtInf.
     * 
     * @return
     *     possible object is
     *     {@link BatchManagementInformation1 }
     *     
     */
    public BatchManagementInformation1 getBtchMgmtInf() {
        return btchMgmtInf;
    }

    /**
     * Define el valor de la propiedad btchMgmtInf.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchManagementInformation1 }
     *     
     */
    public void setBtchMgmtInf(BatchManagementInformation1 value) {
        this.btchMgmtInf = value;
    }

    /**
     * Obtiene el valor de la propiedad initgPty.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getInitgPty() {
        return initgPty;
    }

    /**
     * Define el valor de la propiedad initgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public void setInitgPty(GenericIdentification183 value) {
        this.initgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad rcptPty.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getRcptPty() {
        return rcptPty;
    }

    /**
     * Define el valor de la propiedad rcptPty.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public void setRcptPty(GenericIdentification183 value) {
        this.rcptPty = value;
    }

    /**
     * Gets the value of the tracData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tracData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getTracData() {
        if (tracData == null) {
            tracData = new ArrayList<AdditionalData1>();
        }
        return this.tracData;
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
     * {@link Traceability9 }
     * 
     * 
     */
    public List<Traceability9> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability9>();
        }
        return this.tracblt;
    }

}
