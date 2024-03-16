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
 * <p>Clase Java para Vehicle1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Vehicle1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VhclNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TrlrNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35NumericText" minOccurs="0"/&gt;
 *         &lt;element name="VhclTag" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="VhclTagNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDataReading5Code" minOccurs="0"/&gt;
 *         &lt;element name="UnitNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35NumericText" minOccurs="0"/&gt;
 *         &lt;element name="RplcmntCar" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="Odmtr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="Hbmtr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="TrlrHrs" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RefrHrs" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MntncId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DrvrOrVhclCard" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PlainCardData17" minOccurs="0"/&gt;
 *         &lt;element name="AddtlVhclData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Vehicle2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle1", propOrder = {
    "vhclNb",
    "trlrNb",
    "vhclTag",
    "vhclTagNtryMd",
    "unitNb",
    "rplcmntCar",
    "odmtr",
    "hbmtr",
    "trlrHrs",
    "refrHrs",
    "mntncId",
    "drvrOrVhclCard",
    "addtlVhclData"
})
public class Vehicle1 {

    @XmlElement(name = "VhclNb")
    protected String vhclNb;
    @XmlElement(name = "TrlrNb")
    protected String trlrNb;
    @XmlElement(name = "VhclTag")
    protected String vhclTag;
    @XmlElement(name = "VhclTagNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code vhclTagNtryMd;
    @XmlElement(name = "UnitNb")
    protected String unitNb;
    @XmlElement(name = "RplcmntCar")
    protected Boolean rplcmntCar;
    @XmlElement(name = "Odmtr")
    protected BigDecimal odmtr;
    @XmlElement(name = "Hbmtr")
    protected BigDecimal hbmtr;
    @XmlElement(name = "TrlrHrs")
    protected String trlrHrs;
    @XmlElement(name = "RefrHrs")
    protected String refrHrs;
    @XmlElement(name = "MntncId")
    protected String mntncId;
    @XmlElement(name = "DrvrOrVhclCard")
    protected PlainCardData17 drvrOrVhclCard;
    @XmlElement(name = "AddtlVhclData")
    protected List<Vehicle2> addtlVhclData;

    /**
     * Obtiene el valor de la propiedad vhclNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclNb() {
        return vhclNb;
    }

    /**
     * Define el valor de la propiedad vhclNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclNb(String value) {
        this.vhclNb = value;
    }

    /**
     * Obtiene el valor de la propiedad trlrNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlrNb() {
        return trlrNb;
    }

    /**
     * Define el valor de la propiedad trlrNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrlrNb(String value) {
        this.trlrNb = value;
    }

    /**
     * Obtiene el valor de la propiedad vhclTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclTag() {
        return vhclTag;
    }

    /**
     * Define el valor de la propiedad vhclTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclTag(String value) {
        this.vhclTag = value;
    }

    /**
     * Obtiene el valor de la propiedad vhclTagNtryMd.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading5Code }
     *     
     */
    public CardDataReading5Code getVhclTagNtryMd() {
        return vhclTagNtryMd;
    }

    /**
     * Define el valor de la propiedad vhclTagNtryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading5Code }
     *     
     */
    public void setVhclTagNtryMd(CardDataReading5Code value) {
        this.vhclTagNtryMd = value;
    }

    /**
     * Obtiene el valor de la propiedad unitNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNb() {
        return unitNb;
    }

    /**
     * Define el valor de la propiedad unitNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNb(String value) {
        this.unitNb = value;
    }

    /**
     * Obtiene el valor de la propiedad rplcmntCar.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcmntCar() {
        return rplcmntCar;
    }

    /**
     * Define el valor de la propiedad rplcmntCar.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRplcmntCar(Boolean value) {
        this.rplcmntCar = value;
    }

    /**
     * Obtiene el valor de la propiedad odmtr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOdmtr() {
        return odmtr;
    }

    /**
     * Define el valor de la propiedad odmtr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOdmtr(BigDecimal value) {
        this.odmtr = value;
    }

    /**
     * Obtiene el valor de la propiedad hbmtr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHbmtr() {
        return hbmtr;
    }

    /**
     * Define el valor de la propiedad hbmtr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHbmtr(BigDecimal value) {
        this.hbmtr = value;
    }

    /**
     * Obtiene el valor de la propiedad trlrHrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlrHrs() {
        return trlrHrs;
    }

    /**
     * Define el valor de la propiedad trlrHrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrlrHrs(String value) {
        this.trlrHrs = value;
    }

    /**
     * Obtiene el valor de la propiedad refrHrs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrHrs() {
        return refrHrs;
    }

    /**
     * Define el valor de la propiedad refrHrs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrHrs(String value) {
        this.refrHrs = value;
    }

    /**
     * Obtiene el valor de la propiedad mntncId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntncId() {
        return mntncId;
    }

    /**
     * Define el valor de la propiedad mntncId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntncId(String value) {
        this.mntncId = value;
    }

    /**
     * Obtiene el valor de la propiedad drvrOrVhclCard.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData17 }
     *     
     */
    public PlainCardData17 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Define el valor de la propiedad drvrOrVhclCard.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData17 }
     *     
     */
    public void setDrvrOrVhclCard(PlainCardData17 value) {
        this.drvrOrVhclCard = value;
    }

    /**
     * Gets the value of the addtlVhclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlVhclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlVhclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle2 }
     * 
     * 
     */
    public List<Vehicle2> getAddtlVhclData() {
        if (addtlVhclData == null) {
            addtlVhclData = new ArrayList<Vehicle2>();
        }
        return this.addtlVhclData;
    }

}
