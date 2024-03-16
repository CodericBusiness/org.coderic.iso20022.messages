//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentification255 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification255"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text"/&gt;
 *         &lt;element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO3NumericCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="LglCorpNm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max99Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalData1" minOccurs="0"/&gt;
 *         &lt;element name="NmAndLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max99Text"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Address2" minOccurs="0"/&gt;
 *         &lt;element name="AddtlAdrInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CstmrSvc" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="TaxRegnId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}LocalData4" minOccurs="0"/&gt;
 *         &lt;element name="SpnsrdMrchnt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SponsoredMerchant2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification255", propOrder = {
    "id",
    "assgnr",
    "ctry",
    "shrtNm",
    "lglCorpNm",
    "addtlId",
    "nmAndLctn",
    "adr",
    "addtlAdrInf",
    "geogcLctn",
    "email",
    "urlAdr",
    "phneNb",
    "cstmrSvc",
    "addtlCtctInf",
    "taxRegnId",
    "addtlData",
    "lclData",
    "spnsrdMrchnt"
})
public class PartyIdentification255 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Assgnr")
    protected String assgnr;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "AddtlId")
    protected AdditionalData1 addtlId;
    @XmlElement(name = "NmAndLctn", required = true)
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "AddtlAdrInf")
    protected String addtlAdrInf;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtctInf")
    protected String addtlCtctInf;
    @XmlElement(name = "TaxRegnId")
    protected String taxRegnId;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData4 lclData;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<SponsoredMerchant2> spnsrdMrchnt;

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
     * Obtiene el valor de la propiedad assgnr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssgnr() {
        return assgnr;
    }

    /**
     * Define el valor de la propiedad assgnr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssgnr(String value) {
        this.assgnr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Obtiene el valor de la propiedad shrtNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Define el valor de la propiedad shrtNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

    /**
     * Obtiene el valor de la propiedad lglCorpNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglCorpNm() {
        return lglCorpNm;
    }

    /**
     * Define el valor de la propiedad lglCorpNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglCorpNm(String value) {
        this.lglCorpNm = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlId.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlId() {
        return addtlId;
    }

    /**
     * Define el valor de la propiedad addtlId.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public void setAddtlId(AdditionalData1 value) {
        this.addtlId = value;
    }

    /**
     * Obtiene el valor de la propiedad nmAndLctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmAndLctn() {
        return nmAndLctn;
    }

    /**
     * Define el valor de la propiedad nmAndLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmAndLctn(String value) {
        this.nmAndLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad adr.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Define el valor de la propiedad adr.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlAdrInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlAdrInf() {
        return addtlAdrInf;
    }

    /**
     * Define el valor de la propiedad addtlAdrInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlAdrInf(String value) {
        this.addtlAdrInf = value;
    }

    /**
     * Obtiene el valor de la propiedad geogcLctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Define el valor de la propiedad geogcLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcLctn(String value) {
        this.geogcLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad urlAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Define el valor de la propiedad urlAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad phneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Define el valor de la propiedad phneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmrSvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrSvc() {
        return cstmrSvc;
    }

    /**
     * Define el valor de la propiedad cstmrSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrSvc(String value) {
        this.cstmrSvc = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlCtctInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCtctInf() {
        return addtlCtctInf;
    }

    /**
     * Define el valor de la propiedad addtlCtctInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlCtctInf(String value) {
        this.addtlCtctInf = value;
    }

    /**
     * Obtiene el valor de la propiedad taxRegnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegnId() {
        return taxRegnId;
    }

    /**
     * Define el valor de la propiedad taxRegnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegnId(String value) {
        this.taxRegnId = value;
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
     * Obtiene el valor de la propiedad lclData.
     * 
     * @return
     *     possible object is
     *     {@link LocalData4 }
     *     
     */
    public LocalData4 getLclData() {
        return lclData;
    }

    /**
     * Define el valor de la propiedad lclData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData4 }
     *     
     */
    public void setLclData(LocalData4 value) {
        this.lclData = value;
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
     * {@link SponsoredMerchant2 }
     * 
     * 
     */
    public List<SponsoredMerchant2> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<SponsoredMerchant2>();
        }
        return this.spnsrdMrchnt;
    }

}
