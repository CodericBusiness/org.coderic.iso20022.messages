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
 * <p>Clase Java para CardholderAuthentication17 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardholderAuthentication17"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthntcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AuthenticationMethod8Code" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnXmptn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Exemption1Code" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max5000Binary" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdAuthntcnVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ContentInformationType40" minOccurs="0"/&gt;
 *         &lt;element name="CrdhldrOnLinePIN" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}OnLinePIN11" minOccurs="0"/&gt;
 *         &lt;element name="CrdhldrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PersonIdentification15" minOccurs="0"/&gt;
 *         &lt;element name="AdrVrfctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AddressVerification1" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnLvl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AuthenticationResult1Code" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ExternallyDefinedData5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardholderAuthentication17", propOrder = {
    "authntcnMtd",
    "authntcnXmptn",
    "authntcnVal",
    "prtctdAuthntcnVal",
    "crdhldrOnLinePIN",
    "crdhldrId",
    "adrVrfctn",
    "authntcnTp",
    "authntcnLvl",
    "authntcnRslt",
    "authntcnAddtlInf"
})
public class CardholderAuthentication17 {

    @XmlElement(name = "AuthntcnMtd")
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod8Code authntcnMtd;
    @XmlElement(name = "AuthntcnXmptn")
    @XmlSchemaType(name = "string")
    protected Exemption1Code authntcnXmptn;
    @XmlElement(name = "AuthntcnVal")
    protected byte[] authntcnVal;
    @XmlElement(name = "PrtctdAuthntcnVal")
    protected ContentInformationType40 prtctdAuthntcnVal;
    @XmlElement(name = "CrdhldrOnLinePIN")
    protected OnLinePIN11 crdhldrOnLinePIN;
    @XmlElement(name = "CrdhldrId")
    protected PersonIdentification15 crdhldrId;
    @XmlElement(name = "AdrVrfctn")
    protected AddressVerification1 adrVrfctn;
    @XmlElement(name = "AuthntcnTp")
    protected String authntcnTp;
    @XmlElement(name = "AuthntcnLvl")
    protected String authntcnLvl;
    @XmlElement(name = "AuthntcnRslt")
    @XmlSchemaType(name = "string")
    protected AuthenticationResult1Code authntcnRslt;
    @XmlElement(name = "AuthntcnAddtlInf")
    protected ExternallyDefinedData5 authntcnAddtlInf;

    /**
     * Obtiene el valor de la propiedad authntcnMtd.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod8Code }
     *     
     */
    public AuthenticationMethod8Code getAuthntcnMtd() {
        return authntcnMtd;
    }

    /**
     * Define el valor de la propiedad authntcnMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod8Code }
     *     
     */
    public void setAuthntcnMtd(AuthenticationMethod8Code value) {
        this.authntcnMtd = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnXmptn.
     * 
     * @return
     *     possible object is
     *     {@link Exemption1Code }
     *     
     */
    public Exemption1Code getAuthntcnXmptn() {
        return authntcnXmptn;
    }

    /**
     * Define el valor de la propiedad authntcnXmptn.
     * 
     * @param value
     *     allowed object is
     *     {@link Exemption1Code }
     *     
     */
    public void setAuthntcnXmptn(Exemption1Code value) {
        this.authntcnXmptn = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnVal.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAuthntcnVal() {
        return authntcnVal;
    }

    /**
     * Define el valor de la propiedad authntcnVal.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAuthntcnVal(byte[] value) {
        this.authntcnVal = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdAuthntcnVal.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType40 }
     *     
     */
    public ContentInformationType40 getPrtctdAuthntcnVal() {
        return prtctdAuthntcnVal;
    }

    /**
     * Define el valor de la propiedad prtctdAuthntcnVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType40 }
     *     
     */
    public void setPrtctdAuthntcnVal(ContentInformationType40 value) {
        this.prtctdAuthntcnVal = value;
    }

    /**
     * Obtiene el valor de la propiedad crdhldrOnLinePIN.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN11 }
     *     
     */
    public OnLinePIN11 getCrdhldrOnLinePIN() {
        return crdhldrOnLinePIN;
    }

    /**
     * Define el valor de la propiedad crdhldrOnLinePIN.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN11 }
     *     
     */
    public void setCrdhldrOnLinePIN(OnLinePIN11 value) {
        this.crdhldrOnLinePIN = value;
    }

    /**
     * Obtiene el valor de la propiedad crdhldrId.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification15 }
     *     
     */
    public PersonIdentification15 getCrdhldrId() {
        return crdhldrId;
    }

    /**
     * Define el valor de la propiedad crdhldrId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification15 }
     *     
     */
    public void setCrdhldrId(PersonIdentification15 value) {
        this.crdhldrId = value;
    }

    /**
     * Obtiene el valor de la propiedad adrVrfctn.
     * 
     * @return
     *     possible object is
     *     {@link AddressVerification1 }
     *     
     */
    public AddressVerification1 getAdrVrfctn() {
        return adrVrfctn;
    }

    /**
     * Define el valor de la propiedad adrVrfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressVerification1 }
     *     
     */
    public void setAdrVrfctn(AddressVerification1 value) {
        this.adrVrfctn = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTp() {
        return authntcnTp;
    }

    /**
     * Define el valor de la propiedad authntcnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthntcnTp(String value) {
        this.authntcnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnLvl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnLvl() {
        return authntcnLvl;
    }

    /**
     * Define el valor de la propiedad authntcnLvl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthntcnLvl(String value) {
        this.authntcnLvl = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnRslt.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResult1Code }
     *     
     */
    public AuthenticationResult1Code getAuthntcnRslt() {
        return authntcnRslt;
    }

    /**
     * Define el valor de la propiedad authntcnRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResult1Code }
     *     
     */
    public void setAuthntcnRslt(AuthenticationResult1Code value) {
        this.authntcnRslt = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnAddtlInf.
     * 
     * @return
     *     possible object is
     *     {@link ExternallyDefinedData5 }
     *     
     */
    public ExternallyDefinedData5 getAuthntcnAddtlInf() {
        return authntcnAddtlInf;
    }

    /**
     * Define el valor de la propiedad authntcnAddtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link ExternallyDefinedData5 }
     *     
     */
    public void setAuthntcnAddtlInf(ExternallyDefinedData5 value) {
        this.authntcnAddtlInf = value;
    }

}
