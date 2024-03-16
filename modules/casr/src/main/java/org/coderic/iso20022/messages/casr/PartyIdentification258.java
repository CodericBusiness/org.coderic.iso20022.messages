//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentification258 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification258"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max35Text"/&gt;
 *         &lt;element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}ISO3NumericCountryCode" minOccurs="0"/&gt;
 *         &lt;element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="LglCorpNm" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}Max99Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}AdditionalData1" minOccurs="0"/&gt;
 *         &lt;element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}LocalData1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification258", propOrder = {
    "id",
    "assgnr",
    "ctry",
    "shrtNm",
    "lglCorpNm",
    "addtlId",
    "lclData"
})
public class PartyIdentification258 {

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
    @XmlElement(name = "LclData")
    protected LocalData1 lclData;

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
     * Obtiene el valor de la propiedad lclData.
     * 
     * @return
     *     possible object is
     *     {@link LocalData1 }
     *     
     */
    public LocalData1 getLclData() {
        return lclData;
    }

    /**
     * Define el valor de la propiedad lclData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData1 }
     *     
     */
    public void setLclData(LocalData1 value) {
        this.lclData = value;
    }

}
