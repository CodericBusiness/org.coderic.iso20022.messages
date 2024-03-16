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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContentInformationType19 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContentInformationType19"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ContentType2Code"/&gt;
 *         &lt;element name="EnvlpdData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}EnvelopedData5" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcdData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AuthenticatedData5" minOccurs="0"/&gt;
 *         &lt;element name="SgndData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}SignedData5" minOccurs="0"/&gt;
 *         &lt;element name="DgstdData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}DigestedData5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType19", propOrder = {
    "cnttTp",
    "envlpdData",
    "authntcdData",
    "sgndData",
    "dgstdData"
})
public class ContentInformationType19 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData5 envlpdData;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData5 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData5 sgndData;
    @XmlElement(name = "DgstdData")
    protected DigestedData5 dgstdData;

    /**
     * Obtiene el valor de la propiedad cnttTp.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Define el valor de la propiedad cnttTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public void setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
    }

    /**
     * Obtiene el valor de la propiedad envlpdData.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData5 }
     *     
     */
    public EnvelopedData5 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Define el valor de la propiedad envlpdData.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData5 }
     *     
     */
    public void setEnvlpdData(EnvelopedData5 value) {
        this.envlpdData = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcdData.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData5 }
     *     
     */
    public AuthenticatedData5 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Define el valor de la propiedad authntcdData.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData5 }
     *     
     */
    public void setAuthntcdData(AuthenticatedData5 value) {
        this.authntcdData = value;
    }

    /**
     * Obtiene el valor de la propiedad sgndData.
     * 
     * @return
     *     possible object is
     *     {@link SignedData5 }
     *     
     */
    public SignedData5 getSgndData() {
        return sgndData;
    }

    /**
     * Define el valor de la propiedad sgndData.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData5 }
     *     
     */
    public void setSgndData(SignedData5 value) {
        this.sgndData = value;
    }

    /**
     * Obtiene el valor de la propiedad dgstdData.
     * 
     * @return
     *     possible object is
     *     {@link DigestedData5 }
     *     
     */
    public DigestedData5 getDgstdData() {
        return dgstdData;
    }

    /**
     * Define el valor de la propiedad dgstdData.
     * 
     * @param value
     *     allowed object is
     *     {@link DigestedData5 }
     *     
     */
    public void setDgstdData(DigestedData5 value) {
        this.dgstdData = value;
    }

}
