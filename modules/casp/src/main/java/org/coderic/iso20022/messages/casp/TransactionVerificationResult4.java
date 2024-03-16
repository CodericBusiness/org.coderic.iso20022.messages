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
 * <p>Clase Java para TransactionVerificationResult4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionVerificationResult4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}AuthenticationMethod6Code"/&gt;
 *         &lt;element name="VrfctnNtty" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}AuthenticationEntity2Code" minOccurs="0"/&gt;
 *         &lt;element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Verification1Code" minOccurs="0"/&gt;
 *         &lt;element name="AddtlRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max500Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionVerificationResult4", propOrder = {
    "mtd",
    "vrfctnNtty",
    "rslt",
    "addtlRslt"
})
public class TransactionVerificationResult4 {

    @XmlElement(name = "Mtd", required = true)
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod6Code mtd;
    @XmlElement(name = "VrfctnNtty")
    @XmlSchemaType(name = "string")
    protected AuthenticationEntity2Code vrfctnNtty;
    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Verification1Code rslt;
    @XmlElement(name = "AddtlRslt")
    protected String addtlRslt;

    /**
     * Obtiene el valor de la propiedad mtd.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod6Code }
     *     
     */
    public AuthenticationMethod6Code getMtd() {
        return mtd;
    }

    /**
     * Define el valor de la propiedad mtd.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod6Code }
     *     
     */
    public void setMtd(AuthenticationMethod6Code value) {
        this.mtd = value;
    }

    /**
     * Obtiene el valor de la propiedad vrfctnNtty.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationEntity2Code }
     *     
     */
    public AuthenticationEntity2Code getVrfctnNtty() {
        return vrfctnNtty;
    }

    /**
     * Define el valor de la propiedad vrfctnNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationEntity2Code }
     *     
     */
    public void setVrfctnNtty(AuthenticationEntity2Code value) {
        this.vrfctnNtty = value;
    }

    /**
     * Obtiene el valor de la propiedad rslt.
     * 
     * @return
     *     possible object is
     *     {@link Verification1Code }
     *     
     */
    public Verification1Code getRslt() {
        return rslt;
    }

    /**
     * Define el valor de la propiedad rslt.
     * 
     * @param value
     *     allowed object is
     *     {@link Verification1Code }
     *     
     */
    public void setRslt(Verification1Code value) {
        this.rslt = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRslt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRslt() {
        return addtlRslt;
    }

    /**
     * Define el valor de la propiedad addtlRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRslt(String value) {
        this.addtlRslt = value;
    }

}
