//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Token1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Token1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max19NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Exact4NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknRqstrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max11NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="TknAssrncMtd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="TknInittdInd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token1", propOrder = {
    "pmtTkn",
    "tknXpryDt",
    "tknRqstrId",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknInittdInd"
})
public class Token1 {

    @XmlElement(name = "PmtTkn")
    protected String pmtTkn;
    @XmlElement(name = "TknXpryDt")
    protected String tknXpryDt;
    @XmlElement(name = "TknRqstrId")
    protected String tknRqstrId;
    @XmlElement(name = "TknAssrncData")
    protected String tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;

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
     *     {@link String }
     *     
     */
    public String getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Define el valor de la propiedad tknXpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknXpryDt(String value) {
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

}
