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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResponseType7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResponseType7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Response4Code"/&gt;
 *         &lt;element name="RspnRsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ResultDetail4Code" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRspnInf" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType7", propOrder = {
    "rspn",
    "rspnRsn",
    "addtlRspnInf"
})
public class ResponseType7 {

    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response4Code rspn;
    @XmlElement(name = "RspnRsn")
    @XmlSchemaType(name = "string")
    protected ResultDetail4Code rspnRsn;
    @XmlElement(name = "AddtlRspnInf")
    protected String addtlRspnInf;

    /**
     * Obtiene el valor de la propiedad rspn.
     * 
     * @return
     *     possible object is
     *     {@link Response4Code }
     *     
     */
    public Response4Code getRspn() {
        return rspn;
    }

    /**
     * Define el valor de la propiedad rspn.
     * 
     * @param value
     *     allowed object is
     *     {@link Response4Code }
     *     
     */
    public void setRspn(Response4Code value) {
        this.rspn = value;
    }

    /**
     * Obtiene el valor de la propiedad rspnRsn.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail4Code }
     *     
     */
    public ResultDetail4Code getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Define el valor de la propiedad rspnRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail4Code }
     *     
     */
    public void setRspnRsn(ResultDetail4Code value) {
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
