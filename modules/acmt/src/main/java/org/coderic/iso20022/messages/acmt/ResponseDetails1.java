//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:45 PM COT 
//


package org.coderic.iso20022.messages.acmt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseDetails1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspnCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}Max35Text"/&gt;
 *         &lt;element name="AddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}Max350Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDetails1", propOrder = {
    "rspnCd",
    "addtlDtls"
})
public class ResponseDetails1 {

    @XmlElement(name = "RspnCd", required = true)
    protected String rspnCd;
    @XmlElement(name = "AddtlDtls")
    protected String addtlDtls;

    /**
     * Obtiene el valor de la propiedad rspnCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnCd() {
        return rspnCd;
    }

    /**
     * Define el valor de la propiedad rspnCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnCd(String value) {
        this.rspnCd = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlDtls.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlDtls() {
        return addtlDtls;
    }

    /**
     * Define el valor de la propiedad addtlDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlDtls(String value) {
        this.addtlDtls = value;
    }

}
