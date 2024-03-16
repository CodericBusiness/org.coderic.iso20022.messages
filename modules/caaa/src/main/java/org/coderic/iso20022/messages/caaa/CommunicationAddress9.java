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
 * <p>Clase Java para CommunicationAddress9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CommunicationAddress9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PostalAddress22" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="Phne" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="CstmrSvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCtctInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max256Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationAddress9", propOrder = {
    "pstlAdr",
    "email",
    "urlAdr",
    "phne",
    "cstmrSvc",
    "addtlCtctInf"
})
public class CommunicationAddress9 {

    @XmlElement(name = "PstlAdr")
    protected PostalAddress22 pstlAdr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "Phne")
    protected String phne;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtctInf")
    protected String addtlCtctInf;

    /**
     * Obtiene el valor de la propiedad pstlAdr.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Define el valor de la propiedad pstlAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public void setPstlAdr(PostalAddress22 value) {
        this.pstlAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Obtiene el valor de la propiedad urlAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Define el valor de la propiedad urlAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad phne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhne() {
        return phne;
    }

    /**
     * Define el valor de la propiedad phne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhne(String value) {
        this.phne = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmrSvc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrSvc() {
        return cstmrSvc;
    }

    /**
     * Define el valor de la propiedad cstmrSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrSvc(String value) {
        this.cstmrSvc = value;
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

}
