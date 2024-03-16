//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:28 PM COT 
//


package org.coderic.iso20022.messages.cafr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Token2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Token2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max19NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}ISOYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="TknRqstrId" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max11NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknInittdInd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="StorgLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}StorageLocation1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrStorgLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrtcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}ProtectionMethod1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrPrtcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.004.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token2", propOrder = {
    "pmtTkn",
    "tknXpryDt",
    "tknRqstrId",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknInittdInd",
    "storgLctn",
    "othrStorgLctn",
    "prtcnMtd",
    "othrPrtcnMtd",
    "addtlData"
})
public class Token2 {

    @XmlElement(name = "PmtTkn")
    protected String pmtTkn;
    @XmlElement(name = "TknXpryDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar tknXpryDt;
    @XmlElement(name = "TknRqstrId")
    protected String tknRqstrId;
    @XmlElement(name = "TknAssrncData")
    protected String tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;
    @XmlElement(name = "StorgLctn")
    @XmlSchemaType(name = "string")
    protected StorageLocation1Code storgLctn;
    @XmlElement(name = "OthrStorgLctn")
    protected String othrStorgLctn;
    @XmlElement(name = "PrtcnMtd")
    @XmlSchemaType(name = "string")
    protected ProtectionMethod1Code prtcnMtd;
    @XmlElement(name = "OthrPrtcnMtd")
    protected String othrPrtcnMtd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad pmtTkn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Define el valor de la propiedad pmtTkn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtTkn(String value) {
        this.pmtTkn = value;
    }

    /**
     * Obtiene el valor de la propiedad tknXpryDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Define el valor de la propiedad tknXpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTknXpryDt(XMLGregorianCalendar value) {
        this.tknXpryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad tknRqstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRqstrId() {
        return tknRqstrId;
    }

    /**
     * Define el valor de la propiedad tknRqstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknRqstrId(String value) {
        this.tknRqstrId = value;
    }

    /**
     * Obtiene el valor de la propiedad tknAssrncData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Define el valor de la propiedad tknAssrncData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncData(String value) {
        this.tknAssrncData = value;
    }

    /**
     * Obtiene el valor de la propiedad tknAssrncMtd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Define el valor de la propiedad tknAssrncMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
    }

    /**
     * Obtiene el valor de la propiedad tknInittdInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknInittdInd() {
        return tknInittdInd;
    }

    /**
     * Define el valor de la propiedad tknInittdInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
    }

    /**
     * Obtiene el valor de la propiedad storgLctn.
     * 
     * @return
     *     possible object is
     *     {@link StorageLocation1Code }
     *     
     */
    public StorageLocation1Code getStorgLctn() {
        return storgLctn;
    }

    /**
     * Define el valor de la propiedad storgLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageLocation1Code }
     *     
     */
    public void setStorgLctn(StorageLocation1Code value) {
        this.storgLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad othrStorgLctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrStorgLctn() {
        return othrStorgLctn;
    }

    /**
     * Define el valor de la propiedad othrStorgLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrStorgLctn(String value) {
        this.othrStorgLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad prtcnMtd.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionMethod1Code }
     *     
     */
    public ProtectionMethod1Code getPrtcnMtd() {
        return prtcnMtd;
    }

    /**
     * Define el valor de la propiedad prtcnMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionMethod1Code }
     *     
     */
    public void setPrtcnMtd(ProtectionMethod1Code value) {
        this.prtcnMtd = value;
    }

    /**
     * Obtiene el valor de la propiedad othrPrtcnMtd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPrtcnMtd() {
        return othrPrtcnMtd;
    }

    /**
     * Define el valor de la propiedad othrPrtcnMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPrtcnMtd(String value) {
        this.othrPrtcnMtd = value;
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
