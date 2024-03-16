//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LocalData4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocalData4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOMax3ALanguageCode"/&gt;
 *         &lt;element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="LglCorpNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max210Text" minOccurs="0"/&gt;
 *         &lt;element name="NmAndLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max200Text" minOccurs="0"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Address3" minOccurs="0"/&gt;
 *         &lt;element name="AddtlAdrInf" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max512Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max512Text" minOccurs="0"/&gt;
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
@XmlType(name = "LocalData4", propOrder = {
    "lang",
    "shrtNm",
    "lglCorpNm",
    "nmAndLctn",
    "adr",
    "addtlAdrInf",
    "addtlCtctInf",
    "addtlData"
})
public class LocalData4 {

    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "LglCorpNm")
    protected String lglCorpNm;
    @XmlElement(name = "NmAndLctn")
    protected String nmAndLctn;
    @XmlElement(name = "Adr")
    protected Address3 adr;
    @XmlElement(name = "AddtlAdrInf")
    protected String addtlAdrInf;
    @XmlElement(name = "AddtlCtctInf")
    protected String addtlCtctInf;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
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
     *     {@link Address3 }
     *     
     */
    public Address3 getAdr() {
        return adr;
    }

    /**
     * Define el valor de la propiedad adr.
     * 
     * @param value
     *     allowed object is
     *     {@link Address3 }
     *     
     */
    public void setAdr(Address3 value) {
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
