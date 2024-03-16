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
 * <p>Clase Java para PhysicalInterfaceParameter1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PhysicalInterfaceParameter1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IntrfcNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *         &lt;element name="IntrfcTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}POICommunicationType2Code" minOccurs="0"/&gt;
 *         &lt;element name="UsrNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AccsCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Binary" minOccurs="0"/&gt;
 *         &lt;element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlParams" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max2KBinary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalInterfaceParameter1", propOrder = {
    "intrfcNm",
    "intrfcTp",
    "usrNm",
    "accsCd",
    "sctyPrfl",
    "addtlParams"
})
public class PhysicalInterfaceParameter1 {

    @XmlElement(name = "IntrfcNm", required = true)
    protected String intrfcNm;
    @XmlElement(name = "IntrfcTp")
    @XmlSchemaType(name = "string")
    protected POICommunicationType2Code intrfcTp;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected byte[] accsCd;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "AddtlParams")
    protected byte[] addtlParams;

    /**
     * Obtiene el valor de la propiedad intrfcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrfcNm() {
        return intrfcNm;
    }

    /**
     * Define el valor de la propiedad intrfcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrfcNm(String value) {
        this.intrfcNm = value;
    }

    /**
     * Obtiene el valor de la propiedad intrfcTp.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public POICommunicationType2Code getIntrfcTp() {
        return intrfcTp;
    }

    /**
     * Define el valor de la propiedad intrfcTp.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public void setIntrfcTp(POICommunicationType2Code value) {
        this.intrfcTp = value;
    }

    /**
     * Obtiene el valor de la propiedad usrNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Define el valor de la propiedad usrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrNm(String value) {
        this.usrNm = value;
    }

    /**
     * Obtiene el valor de la propiedad accsCd.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccsCd() {
        return accsCd;
    }

    /**
     * Define el valor de la propiedad accsCd.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAccsCd(byte[] value) {
        this.accsCd = value;
    }

    /**
     * Obtiene el valor de la propiedad sctyPrfl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Define el valor de la propiedad sctyPrfl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyPrfl(String value) {
        this.sctyPrfl = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlParams.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlParams() {
        return addtlParams;
    }

    /**
     * Define el valor de la propiedad addtlParams.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddtlParams(byte[] value) {
        this.addtlParams = value;
    }

}
