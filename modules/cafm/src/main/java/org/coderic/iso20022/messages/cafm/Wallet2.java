//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Wallet2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Wallet2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification258" minOccurs="0"/&gt;
 *         &lt;element name="PANAge" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="UsrAcctAge" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="WlltAcctAge" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="DaysSncLastActvty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="Actvty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max10PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="ActvtyIntrvl" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Frequency12Code" minOccurs="0"/&gt;
 *         &lt;element name="LastWlltChng" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="SspdCrds" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="WlltAcctCtry" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOMax3ACountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardDataReading9Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrCardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="WlltAcctEmailAge" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="WlltPrvdrRskAssmnt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}RiskAssessment1Code" minOccurs="0"/&gt;
 *         &lt;element name="WlltPrvdrRskAssmntMdlVrsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="WlltPrvdrPhneScore" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="WlltPrvdrDvcScore" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="WlltPrvdrAcctScore" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max5PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wallet2", propOrder = {
    "prvdr",
    "panAge",
    "usrAcctAge",
    "wlltAcctAge",
    "daysSncLastActvty",
    "actvty",
    "actvtyIntrvl",
    "lastWlltChng",
    "sspdCrds",
    "wlltAcctCtry",
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "wlltAcctEmailAge",
    "wlltPrvdrRskAssmnt",
    "wlltPrvdrRskAssmntMdlVrsn",
    "wlltPrvdrPhneScore",
    "wlltPrvdrDvcScore",
    "wlltPrvdrAcctScore",
    "addtlData"
})
public class Wallet2 {

    @XmlElement(name = "Prvdr")
    protected PartyIdentification258 prvdr;
    @XmlElement(name = "PANAge")
    protected BigDecimal panAge;
    @XmlElement(name = "UsrAcctAge")
    protected BigDecimal usrAcctAge;
    @XmlElement(name = "WlltAcctAge")
    protected BigDecimal wlltAcctAge;
    @XmlElement(name = "DaysSncLastActvty")
    protected BigDecimal daysSncLastActvty;
    @XmlElement(name = "Actvty")
    protected BigDecimal actvty;
    @XmlElement(name = "ActvtyIntrvl")
    @XmlSchemaType(name = "string")
    protected Frequency12Code actvtyIntrvl;
    @XmlElement(name = "LastWlltChng")
    protected BigDecimal lastWlltChng;
    @XmlElement(name = "SspdCrds")
    protected BigDecimal sspdCrds;
    @XmlElement(name = "WlltAcctCtry")
    protected String wlltAcctCtry;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading9Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "WlltAcctEmailAge")
    protected BigDecimal wlltAcctEmailAge;
    @XmlElement(name = "WlltPrvdrRskAssmnt")
    @XmlSchemaType(name = "string")
    protected RiskAssessment1Code wlltPrvdrRskAssmnt;
    @XmlElement(name = "WlltPrvdrRskAssmntMdlVrsn")
    protected String wlltPrvdrRskAssmntMdlVrsn;
    @XmlElement(name = "WlltPrvdrPhneScore")
    protected BigDecimal wlltPrvdrPhneScore;
    @XmlElement(name = "WlltPrvdrDvcScore")
    protected BigDecimal wlltPrvdrDvcScore;
    @XmlElement(name = "WlltPrvdrAcctScore")
    protected BigDecimal wlltPrvdrAcctScore;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad prvdr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getPrvdr() {
        return prvdr;
    }

    /**
     * Define el valor de la propiedad prvdr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setPrvdr(PartyIdentification258 value) {
        this.prvdr = value;
    }

    /**
     * Obtiene el valor de la propiedad panAge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPANAge() {
        return panAge;
    }

    /**
     * Define el valor de la propiedad panAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPANAge(BigDecimal value) {
        this.panAge = value;
    }

    /**
     * Obtiene el valor de la propiedad usrAcctAge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUsrAcctAge() {
        return usrAcctAge;
    }

    /**
     * Define el valor de la propiedad usrAcctAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUsrAcctAge(BigDecimal value) {
        this.usrAcctAge = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltAcctAge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltAcctAge() {
        return wlltAcctAge;
    }

    /**
     * Define el valor de la propiedad wlltAcctAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltAcctAge(BigDecimal value) {
        this.wlltAcctAge = value;
    }

    /**
     * Obtiene el valor de la propiedad daysSncLastActvty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysSncLastActvty() {
        return daysSncLastActvty;
    }

    /**
     * Define el valor de la propiedad daysSncLastActvty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysSncLastActvty(BigDecimal value) {
        this.daysSncLastActvty = value;
    }

    /**
     * Obtiene el valor de la propiedad actvty.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActvty() {
        return actvty;
    }

    /**
     * Define el valor de la propiedad actvty.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActvty(BigDecimal value) {
        this.actvty = value;
    }

    /**
     * Obtiene el valor de la propiedad actvtyIntrvl.
     * 
     * @return
     *     possible object is
     *     {@link Frequency12Code }
     *     
     */
    public Frequency12Code getActvtyIntrvl() {
        return actvtyIntrvl;
    }

    /**
     * Define el valor de la propiedad actvtyIntrvl.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency12Code }
     *     
     */
    public void setActvtyIntrvl(Frequency12Code value) {
        this.actvtyIntrvl = value;
    }

    /**
     * Obtiene el valor de la propiedad lastWlltChng.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastWlltChng() {
        return lastWlltChng;
    }

    /**
     * Define el valor de la propiedad lastWlltChng.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastWlltChng(BigDecimal value) {
        this.lastWlltChng = value;
    }

    /**
     * Obtiene el valor de la propiedad sspdCrds.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSspdCrds() {
        return sspdCrds;
    }

    /**
     * Define el valor de la propiedad sspdCrds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSspdCrds(BigDecimal value) {
        this.sspdCrds = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltAcctCtry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlltAcctCtry() {
        return wlltAcctCtry;
    }

    /**
     * Define el valor de la propiedad wlltAcctCtry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlltAcctCtry(String value) {
        this.wlltAcctCtry = value;
    }

    /**
     * Obtiene el valor de la propiedad cardDataNtryMd.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading9Code }
     *     
     */
    public CardDataReading9Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Define el valor de la propiedad cardDataNtryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading9Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading9Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Obtiene el valor de la propiedad othrCardDataNtryMd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCardDataNtryMd() {
        return othrCardDataNtryMd;
    }

    /**
     * Define el valor de la propiedad othrCardDataNtryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltAcctEmailAge.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltAcctEmailAge() {
        return wlltAcctEmailAge;
    }

    /**
     * Define el valor de la propiedad wlltAcctEmailAge.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltAcctEmailAge(BigDecimal value) {
        this.wlltAcctEmailAge = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltPrvdrRskAssmnt.
     * 
     * @return
     *     possible object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public RiskAssessment1Code getWlltPrvdrRskAssmnt() {
        return wlltPrvdrRskAssmnt;
    }

    /**
     * Define el valor de la propiedad wlltPrvdrRskAssmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskAssessment1Code }
     *     
     */
    public void setWlltPrvdrRskAssmnt(RiskAssessment1Code value) {
        this.wlltPrvdrRskAssmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltPrvdrRskAssmntMdlVrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWlltPrvdrRskAssmntMdlVrsn() {
        return wlltPrvdrRskAssmntMdlVrsn;
    }

    /**
     * Define el valor de la propiedad wlltPrvdrRskAssmntMdlVrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWlltPrvdrRskAssmntMdlVrsn(String value) {
        this.wlltPrvdrRskAssmntMdlVrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltPrvdrPhneScore.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrPhneScore() {
        return wlltPrvdrPhneScore;
    }

    /**
     * Define el valor de la propiedad wlltPrvdrPhneScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltPrvdrPhneScore(BigDecimal value) {
        this.wlltPrvdrPhneScore = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltPrvdrDvcScore.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrDvcScore() {
        return wlltPrvdrDvcScore;
    }

    /**
     * Define el valor de la propiedad wlltPrvdrDvcScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltPrvdrDvcScore(BigDecimal value) {
        this.wlltPrvdrDvcScore = value;
    }

    /**
     * Obtiene el valor de la propiedad wlltPrvdrAcctScore.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWlltPrvdrAcctScore() {
        return wlltPrvdrAcctScore;
    }

    /**
     * Define el valor de la propiedad wlltPrvdrAcctScore.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWlltPrvdrAcctScore(BigDecimal value) {
        this.wlltPrvdrAcctScore = value;
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

}
