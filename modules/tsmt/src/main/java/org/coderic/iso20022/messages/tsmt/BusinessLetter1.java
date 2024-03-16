//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BusinessLetter1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessLetter1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="LttrIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}ISODate"/&gt;
 *         &lt;element name="RltdLttr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RltdMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CnttIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Priority3Code" minOccurs="0"/&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1"/&gt;
 *         &lt;element name="PmryRcpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuthstnUsr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RspnRcpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CpyRcpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OthrPty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssoctdDoc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GovngCtrct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LglCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}GovernanceRules2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max2000Text" minOccurs="0"/&gt;
 *         &lt;element name="Ntce" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max350Text" minOccurs="0"/&gt;
 *         &lt;element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}ValidationStatusInformation1" minOccurs="0"/&gt;
 *         &lt;element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyAndXMLSignature1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessLetter1", propOrder = {
    "applCntxt",
    "lttrIdr",
    "dt",
    "rltdLttr",
    "rltdMsg",
    "cnttIdr",
    "instrPrty",
    "orgtr",
    "pmryRcpt",
    "sndr",
    "authstnUsr",
    "rspnRcpt",
    "cpyRcpt",
    "othrPty",
    "assoctdDoc",
    "govngCtrct",
    "lglCntxt",
    "addtlInf",
    "ntce",
    "vldtnStsInf",
    "dgtlSgntr"
})
public class BusinessLetter1 {

    @XmlElement(name = "ApplCntxt")
    protected String applCntxt;
    @XmlElement(name = "LttrIdr", required = true)
    protected QualifiedDocumentInformation1 lttrIdr;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "RltdLttr")
    protected List<QualifiedDocumentInformation1> rltdLttr;
    @XmlElement(name = "RltdMsg")
    protected List<QualifiedDocumentInformation1> rltdMsg;
    @XmlElement(name = "CnttIdr")
    protected List<String> cnttIdr;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code instrPrty;
    @XmlElement(name = "Orgtr", required = true)
    protected QualifiedPartyIdentification1 orgtr;
    @XmlElement(name = "PmryRcpt", required = true)
    protected List<QualifiedPartyIdentification1> pmryRcpt;
    @XmlElement(name = "Sndr")
    protected List<QualifiedPartyIdentification1> sndr;
    @XmlElement(name = "AuthstnUsr", required = true)
    protected List<QualifiedPartyIdentification1> authstnUsr;
    @XmlElement(name = "RspnRcpt")
    protected List<QualifiedPartyIdentification1> rspnRcpt;
    @XmlElement(name = "CpyRcpt")
    protected List<QualifiedPartyIdentification1> cpyRcpt;
    @XmlElement(name = "OthrPty")
    protected List<QualifiedPartyIdentification1> othrPty;
    @XmlElement(name = "AssoctdDoc")
    protected List<QualifiedDocumentInformation1> assoctdDoc;
    @XmlElement(name = "GovngCtrct")
    protected List<QualifiedDocumentInformation1> govngCtrct;
    @XmlElement(name = "LglCntxt")
    protected List<GovernanceRules2> lglCntxt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Ntce")
    protected String ntce;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<QualifiedPartyAndXMLSignature1> dgtlSgntr;

    /**
     * Obtiene el valor de la propiedad applCntxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplCntxt() {
        return applCntxt;
    }

    /**
     * Define el valor de la propiedad applCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplCntxt(String value) {
        this.applCntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad lttrIdr.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedDocumentInformation1 }
     *     
     */
    public QualifiedDocumentInformation1 getLttrIdr() {
        return lttrIdr;
    }

    /**
     * Define el valor de la propiedad lttrIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedDocumentInformation1 }
     *     
     */
    public void setLttrIdr(QualifiedDocumentInformation1 value) {
        this.lttrIdr = value;
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
     * Gets the value of the rltdLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltdLttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdLttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getRltdLttr() {
        if (rltdLttr == null) {
            rltdLttr = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.rltdLttr;
    }

    /**
     * Gets the value of the rltdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getRltdMsg() {
        if (rltdMsg == null) {
            rltdMsg = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.rltdMsg;
    }

    /**
     * Gets the value of the cnttIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cnttIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnttIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCnttIdr() {
        if (cnttIdr == null) {
            cnttIdr = new ArrayList<String>();
        }
        return this.cnttIdr;
    }

    /**
     * Obtiene el valor de la propiedad instrPrty.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Define el valor de la propiedad instrPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setInstrPrty(Priority3Code value) {
        this.instrPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad orgtr.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedPartyIdentification1 }
     *     
     */
    public QualifiedPartyIdentification1 getOrgtr() {
        return orgtr;
    }

    /**
     * Define el valor de la propiedad orgtr.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedPartyIdentification1 }
     *     
     */
    public void setOrgtr(QualifiedPartyIdentification1 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the pmryRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pmryRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getPmryRcpt() {
        if (pmryRcpt == null) {
            pmryRcpt = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.pmryRcpt;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sndr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.sndr;
    }

    /**
     * Gets the value of the authstnUsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authstnUsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstnUsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getAuthstnUsr() {
        if (authstnUsr == null) {
            authstnUsr = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.authstnUsr;
    }

    /**
     * Gets the value of the rspnRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rspnRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getRspnRcpt() {
        if (rspnRcpt == null) {
            rspnRcpt = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.rspnRcpt;
    }

    /**
     * Gets the value of the cpyRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cpyRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpyRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getCpyRcpt() {
        if (cpyRcpt == null) {
            cpyRcpt = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.cpyRcpt;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<QualifiedPartyIdentification1> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<QualifiedPartyIdentification1>();
        }
        return this.othrPty;
    }

    /**
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.assoctdDoc;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     */
    public List<QualifiedDocumentInformation1> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<QualifiedDocumentInformation1>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lglCntxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglCntxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernanceRules2 }
     * 
     * 
     */
    public List<GovernanceRules2> getLglCntxt() {
        if (lglCntxt == null) {
            lglCntxt = new ArrayList<GovernanceRules2>();
        }
        return this.lglCntxt;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Obtiene el valor de la propiedad ntce.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtce() {
        return ntce;
    }

    /**
     * Define el valor de la propiedad ntce.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtce(String value) {
        this.ntce = value;
    }

    /**
     * Obtiene el valor de la propiedad vldtnStsInf.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Define el valor de la propiedad vldtnStsInf.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public void setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyAndXMLSignature1 }
     * 
     * 
     */
    public List<QualifiedPartyAndXMLSignature1> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<QualifiedPartyAndXMLSignature1>();
        }
        return this.dgtlSgntr;
    }

}
