//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseType6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseType6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Response2Code"/&gt;
 *         &lt;element name="RspnDtl" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}ResultDetail3Code" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType6", propOrder = {
    "rspn",
    "rspnDtl",
    "addtlRspn"
})
public class ResponseType6 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response2Code rspn;
    @XmlElement(name = "RspnDtl")
    @XmlSchemaType(name = "string")
    protected ResultDetail3Code rspnDtl;
    @XmlElement(name = "AddtlRspn")
    protected String addtlRspn;

    /**
     * Obtiene el valor de la propiedad rspn.
     * 
     * @return
     *     possible object is
     *     {@link Response2Code }
     *     
     */
    public Response2Code getRspn() {
        return rspn;
    }

    /**
     * Define el valor de la propiedad rspn.
     * 
     * @param value
     *     allowed object is
     *     {@link Response2Code }
     *     
     */
    public void setRspn(Response2Code value) {
        this.rspn = value;
    }

    /**
     * Obtiene el valor de la propiedad rspnDtl.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail3Code }
     *     
     */
    public ResultDetail3Code getRspnDtl() {
        return rspnDtl;
    }

    /**
     * Define el valor de la propiedad rspnDtl.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail3Code }
     *     
     */
    public void setRspnDtl(ResultDetail3Code value) {
        this.rspnDtl = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRspn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRspn() {
        return addtlRspn;
    }

    /**
     * Define el valor de la propiedad addtlRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRspn(String value) {
        this.addtlRspn = value;
    }

}
