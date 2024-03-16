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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OnLinePIN11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OnLinePIN11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NcrptdPINBlck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ContentInformationType40"/&gt;
 *         &lt;element name="PINFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PINFormat3Code"/&gt;
 *         &lt;element name="AddtlInpt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnLinePIN11", propOrder = {
    "ncrptdPINBlck",
    "pinFrmt",
    "addtlInpt"
})
public class OnLinePIN11 {

    @XmlElement(name = "NcrptdPINBlck", required = true)
    protected ContentInformationType40 ncrptdPINBlck;
    @XmlElement(name = "PINFrmt", required = true)
    @XmlSchemaType(name = "string")
    protected PINFormat3Code pinFrmt;
    @XmlElement(name = "AddtlInpt")
    protected String addtlInpt;

    /**
     * Obtiene el valor de la propiedad ncrptdPINBlck.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType40 }
     *     
     */
    public ContentInformationType40 getNcrptdPINBlck() {
        return ncrptdPINBlck;
    }

    /**
     * Define el valor de la propiedad ncrptdPINBlck.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType40 }
     *     
     */
    public void setNcrptdPINBlck(ContentInformationType40 value) {
        this.ncrptdPINBlck = value;
    }

    /**
     * Obtiene el valor de la propiedad pinFrmt.
     * 
     * @return
     *     possible object is
     *     {@link PINFormat3Code }
     *     
     */
    public PINFormat3Code getPINFrmt() {
        return pinFrmt;
    }

    /**
     * Define el valor de la propiedad pinFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link PINFormat3Code }
     *     
     */
    public void setPINFrmt(PINFormat3Code value) {
        this.pinFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInpt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInpt() {
        return addtlInpt;
    }

    /**
     * Define el valor de la propiedad addtlInpt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInpt(String value) {
        this.addtlInpt = value;
    }

}
