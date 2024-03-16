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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdditionalFee2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFee2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TypeOfAmount21Code"/&gt;
 *         &lt;element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FeePrgm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FeeDscrptr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FeeAmt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}FeeAmount3"/&gt;
 *         &lt;element name="FeeRcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}FeeAmount3" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max140Text" minOccurs="0"/&gt;
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
@XmlType(name = "AdditionalFee2", propOrder = {
    "tp",
    "othrTp",
    "feePrgm",
    "feeDscrptr",
    "feeAmt",
    "feeRcncltnAmt",
    "desc",
    "addtlData"
})
public class AdditionalFee2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfAmount21Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "FeePrgm")
    protected String feePrgm;
    @XmlElement(name = "FeeDscrptr")
    protected String feeDscrptr;
    @XmlElement(name = "FeeAmt", required = true)
    protected FeeAmount3 feeAmt;
    @XmlElement(name = "FeeRcncltnAmt")
    protected FeeAmount3 feeRcncltnAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public TypeOfAmount21Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public void setTp(TypeOfAmount21Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Define el valor de la propiedad othrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad feePrgm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePrgm() {
        return feePrgm;
    }

    /**
     * Define el valor de la propiedad feePrgm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeePrgm(String value) {
        this.feePrgm = value;
    }

    /**
     * Obtiene el valor de la propiedad feeDscrptr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDscrptr() {
        return feeDscrptr;
    }

    /**
     * Define el valor de la propiedad feeDscrptr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDscrptr(String value) {
        this.feeDscrptr = value;
    }

    /**
     * Obtiene el valor de la propiedad feeAmt.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount3 }
     *     
     */
    public FeeAmount3 getFeeAmt() {
        return feeAmt;
    }

    /**
     * Define el valor de la propiedad feeAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount3 }
     *     
     */
    public void setFeeAmt(FeeAmount3 value) {
        this.feeAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad feeRcncltnAmt.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount3 }
     *     
     */
    public FeeAmount3 getFeeRcncltnAmt() {
        return feeRcncltnAmt;
    }

    /**
     * Define el valor de la propiedad feeRcncltnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount3 }
     *     
     */
    public void setFeeRcncltnAmt(FeeAmount3 value) {
        this.feeRcncltnAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad desc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Define el valor de la propiedad desc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
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
