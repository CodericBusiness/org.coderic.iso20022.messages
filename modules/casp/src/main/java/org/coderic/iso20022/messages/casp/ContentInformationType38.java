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
 * <p>Clase Java para ContentInformationType38 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContentInformationType38"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ContentType2Code"/&gt;
 *         &lt;element name="AuthntcdData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}AuthenticatedData10" minOccurs="0"/&gt;
 *         &lt;element name="SgndData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SignedData9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType38", propOrder = {
    "cnttTp",
    "authntcdData",
    "sgndData"
})
public class ContentInformationType38 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "AuthntcdData")
    protected AuthenticatedData10 authntcdData;
    @XmlElement(name = "SgndData")
    protected SignedData9 sgndData;

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
     * Obtiene el valor de la propiedad authntcdData.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticatedData10 }
     *     
     */
    public AuthenticatedData10 getAuthntcdData() {
        return authntcdData;
    }

    /**
     * Define el valor de la propiedad authntcdData.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticatedData10 }
     *     
     */
    public void setAuthntcdData(AuthenticatedData10 value) {
        this.authntcdData = value;
    }

    /**
     * Obtiene el valor de la propiedad sgndData.
     * 
     * @return
     *     possible object is
     *     {@link SignedData9 }
     *     
     */
    public SignedData9 getSgndData() {
        return sgndData;
    }

    /**
     * Define el valor de la propiedad sgndData.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedData9 }
     *     
     */
    public void setSgndData(SignedData9 value) {
        this.sgndData = value;
    }

}
