//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancialInstitution7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstitution7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Address2" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="PhneNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CstmrSvc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}LocalData2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstitution7", propOrder = {
    "id",
    "nm",
    "adr",
    "email",
    "urlAdr",
    "phneNb",
    "cstmrSvc",
    "addtlCtctInf",
    "lclData"
})
public class FinancialInstitution7 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "PhneNb")
    protected String phneNb;
    @XmlElement(name = "CstmrSvc")
    protected String cstmrSvc;
    @XmlElement(name = "AddtlCtctInf")
    protected String addtlCtctInf;
    @XmlElement(name = "LclData")
    protected LocalData2 lclData;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad adr.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Define el valor de la propiedad adr.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
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
     * Obtiene el valor de la propiedad phneNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhneNb() {
        return phneNb;
    }

    /**
     * Define el valor de la propiedad phneNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhneNb(String value) {
        this.phneNb = value;
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

    /**
     * Obtiene el valor de la propiedad lclData.
     * 
     * @return
     *     possible object is
     *     {@link LocalData2 }
     *     
     */
    public LocalData2 getLclData() {
        return lclData;
    }

    /**
     * Define el valor de la propiedad lclData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData2 }
     *     
     */
    public void setLclData(LocalData2 value) {
        this.lclData = value;
    }

}
