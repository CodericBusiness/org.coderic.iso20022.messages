//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseType8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseType8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspndrId" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text"/&gt;
 *         &lt;element name="Cdfctn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text"/&gt;
 *         &lt;element name="RspnRsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRspnInf" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType8", propOrder = {
    "rspndrId",
    "cdfctn",
    "rspn",
    "rspnRsn",
    "addtlRspnInf"
})
public class ResponseType8 {

    @XmlElement(name = "RspndrId", required = true)
    protected String rspndrId;
    @XmlElement(name = "Cdfctn")
    protected String cdfctn;
    @XmlElement(name = "Rspn", required = true)
    protected String rspn;
    @XmlElement(name = "RspnRsn")
    protected String rspnRsn;
    @XmlElement(name = "AddtlRspnInf")
    protected String addtlRspnInf;

    /**
     * Obtiene el valor de la propiedad rspndrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndrId() {
        return rspndrId;
    }

    /**
     * Define el valor de la propiedad rspndrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspndrId(String value) {
        this.rspndrId = value;
    }

    /**
     * Obtiene el valor de la propiedad cdfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdfctn() {
        return cdfctn;
    }

    /**
     * Define el valor de la propiedad cdfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdfctn(String value) {
        this.cdfctn = value;
    }

    /**
     * Obtiene el valor de la propiedad rspn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspn() {
        return rspn;
    }

    /**
     * Define el valor de la propiedad rspn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspn(String value) {
        this.rspn = value;
    }

    /**
     * Obtiene el valor de la propiedad rspnRsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Define el valor de la propiedad rspnRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnRsn(String value) {
        this.rspnRsn = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRspnInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRspnInf() {
        return addtlRspnInf;
    }

    /**
     * Define el valor de la propiedad addtlRspnInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRspnInf(String value) {
        this.addtlRspnInf = value;
    }

}
