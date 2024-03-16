//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaleContext4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SaleContext4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SaleRefNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CshrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CshrLang" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}LanguageCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShftNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CstmrOrdrReqFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="PurchsOrdrNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InvcNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DlvryNoteNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SpnsrdMrchnt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Organisation26" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpltPmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="RmngAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="ForceOnlnFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="ReuseCardDataFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AllwdNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDataReading8Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SaleTknScp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SaleTokenScope1Code" minOccurs="0"/&gt;
 *         &lt;element name="AddtlSaleData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max70Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContext4", propOrder = {
    "saleId",
    "saleRefNb",
    "saleRcncltnId",
    "cshrId",
    "cshrLang",
    "shftNb",
    "cstmrOrdrReqFlg",
    "purchsOrdrNb",
    "invcNb",
    "dlvryNoteNb",
    "spnsrdMrchnt",
    "spltPmt",
    "rmngAmt",
    "forceOnlnFlg",
    "reuseCardDataFlg",
    "allwdNtryMd",
    "saleTknScp",
    "addtlSaleData"
})
public class SaleContext4 {

    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "CshrLang")
    protected List<String> cshrLang;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "CstmrOrdrReqFlg")
    protected Boolean cstmrOrdrReqFlg;
    @XmlElement(name = "PurchsOrdrNb")
    protected String purchsOrdrNb;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "DlvryNoteNb")
    protected String dlvryNoteNb;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<Organisation26> spnsrdMrchnt;
    @XmlElement(name = "SpltPmt")
    protected Boolean spltPmt;
    @XmlElement(name = "RmngAmt")
    protected BigDecimal rmngAmt;
    @XmlElement(name = "ForceOnlnFlg")
    protected Boolean forceOnlnFlg;
    @XmlElement(name = "ReuseCardDataFlg")
    protected Boolean reuseCardDataFlg;
    @XmlElement(name = "AllwdNtryMd")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading8Code> allwdNtryMd;
    @XmlElement(name = "SaleTknScp")
    @XmlSchemaType(name = "string")
    protected SaleTokenScope1Code saleTknScp;
    @XmlElement(name = "AddtlSaleData")
    protected String addtlSaleData;

    /**
     * Obtiene el valor de la propiedad saleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Define el valor de la propiedad saleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * Obtiene el valor de la propiedad saleRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Define el valor de la propiedad saleRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefNb(String value) {
        this.saleRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad saleRcncltnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Define el valor de la propiedad saleRcncltnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

    /**
     * Obtiene el valor de la propiedad cshrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Define el valor de la propiedad cshrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshrId(String value) {
        this.cshrId = value;
    }

    /**
     * Gets the value of the cshrLang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cshrLang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshrLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCshrLang() {
        if (cshrLang == null) {
            cshrLang = new ArrayList<String>();
        }
        return this.cshrLang;
    }

    /**
     * Obtiene el valor de la propiedad shftNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Define el valor de la propiedad shftNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShftNb(String value) {
        this.shftNb = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmrOrdrReqFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrOrdrReqFlg() {
        return cstmrOrdrReqFlg;
    }

    /**
     * Define el valor de la propiedad cstmrOrdrReqFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCstmrOrdrReqFlg(Boolean value) {
        this.cstmrOrdrReqFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad purchsOrdrNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsOrdrNb() {
        return purchsOrdrNb;
    }

    /**
     * Define el valor de la propiedad purchsOrdrNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchsOrdrNb(String value) {
        this.purchsOrdrNb = value;
    }

    /**
     * Obtiene el valor de la propiedad invcNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Define el valor de la propiedad invcNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvcNb(String value) {
        this.invcNb = value;
    }

    /**
     * Obtiene el valor de la propiedad dlvryNoteNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryNoteNb() {
        return dlvryNoteNb;
    }

    /**
     * Define el valor de la propiedad dlvryNoteNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryNoteNb(String value) {
        this.dlvryNoteNb = value;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation26 }
     * 
     * 
     */
    public List<Organisation26> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<Organisation26>();
        }
        return this.spnsrdMrchnt;
    }

    /**
     * Obtiene el valor de la propiedad spltPmt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltPmt() {
        return spltPmt;
    }

    /**
     * Define el valor de la propiedad spltPmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpltPmt(Boolean value) {
        this.spltPmt = value;
    }

    /**
     * Obtiene el valor de la propiedad rmngAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmngAmt() {
        return rmngAmt;
    }

    /**
     * Define el valor de la propiedad rmngAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRmngAmt(BigDecimal value) {
        this.rmngAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad forceOnlnFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceOnlnFlg() {
        return forceOnlnFlg;
    }

    /**
     * Define el valor de la propiedad forceOnlnFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceOnlnFlg(Boolean value) {
        this.forceOnlnFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad reuseCardDataFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReuseCardDataFlg() {
        return reuseCardDataFlg;
    }

    /**
     * Define el valor de la propiedad reuseCardDataFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReuseCardDataFlg(Boolean value) {
        this.reuseCardDataFlg = value;
    }

    /**
     * Gets the value of the allwdNtryMd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allwdNtryMd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdNtryMd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading8Code }
     * 
     * 
     */
    public List<CardDataReading8Code> getAllwdNtryMd() {
        if (allwdNtryMd == null) {
            allwdNtryMd = new ArrayList<CardDataReading8Code>();
        }
        return this.allwdNtryMd;
    }

    /**
     * Obtiene el valor de la propiedad saleTknScp.
     * 
     * @return
     *     possible object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public SaleTokenScope1Code getSaleTknScp() {
        return saleTknScp;
    }

    /**
     * Define el valor de la propiedad saleTknScp.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public void setSaleTknScp(SaleTokenScope1Code value) {
        this.saleTknScp = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlSaleData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlSaleData() {
        return addtlSaleData;
    }

    /**
     * Define el valor de la propiedad addtlSaleData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlSaleData(String value) {
        this.addtlSaleData = value;
    }

}
