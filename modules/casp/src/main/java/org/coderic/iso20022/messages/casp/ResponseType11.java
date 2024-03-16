//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseType11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseType11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Response11Code"/&gt;
 *         &lt;element name="RspnRsn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}RetailerResultDetail1Code" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRspnInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType11", propOrder = {
    "rspn",
    "rspnRsn",
    "addtlRspnInf"
})
public class ResponseType11 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response11Code rspn;
    @XmlElement(name = "RspnRsn")
    @XmlSchemaType(name = "string")
    protected RetailerResultDetail1Code rspnRsn;
    @XmlElement(name = "AddtlRspnInf")
    protected String addtlRspnInf;

    /**
     * Obtiene el valor de la propiedad rspn.
     * 
     * @return
     *     possible object is
     *     {@link Response11Code }
     *     
     */
    public Response11Code getRspn() {
        return rspn;
    }

    /**
     * Define el valor de la propiedad rspn.
     * 
     * @param value
     *     allowed object is
     *     {@link Response11Code }
     *     
     */
    public void setRspn(Response11Code value) {
        this.rspn = value;
    }

    /**
     * Obtiene el valor de la propiedad rspnRsn.
     * 
     * @return
     *     possible object is
     *     {@link RetailerResultDetail1Code }
     *     
     */
    public RetailerResultDetail1Code getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Define el valor de la propiedad rspnRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerResultDetail1Code }
     *     
     */
    public void setRspnRsn(RetailerResultDetail1Code value) {
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
