//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptedDataElement1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncryptedDataElement1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ExternalEncryptedElementIdentification1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrId" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="NcrptdData" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}EncryptedData1Choice"/&gt;
 *         &lt;element name="ClearTxtDataFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}EncryptedDataFormat1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrClearTxtDataFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedDataElement1", propOrder = {
    "id",
    "othrId",
    "ncrptdData",
    "clearTxtDataFrmt",
    "othrClearTxtDataFrmt"
})
public class EncryptedDataElement1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "OthrId")
    protected String othrId;
    @XmlElement(name = "NcrptdData", required = true)
    protected EncryptedData1Choice ncrptdData;
    @XmlElement(name = "ClearTxtDataFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptedDataFormat1Code clearTxtDataFrmt;
    @XmlElement(name = "OthrClearTxtDataFrmt")
    protected String othrClearTxtDataFrmt;

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
     * Obtiene el valor de la propiedad othrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrId() {
        return othrId;
    }

    /**
     * Define el valor de la propiedad othrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrId(String value) {
        this.othrId = value;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdData.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData1Choice }
     *     
     */
    public EncryptedData1Choice getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Define el valor de la propiedad ncrptdData.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData1Choice }
     *     
     */
    public void setNcrptdData(EncryptedData1Choice value) {
        this.ncrptdData = value;
    }

    /**
     * Obtiene el valor de la propiedad clearTxtDataFrmt.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public EncryptedDataFormat1Code getClearTxtDataFrmt() {
        return clearTxtDataFrmt;
    }

    /**
     * Define el valor de la propiedad clearTxtDataFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public void setClearTxtDataFrmt(EncryptedDataFormat1Code value) {
        this.clearTxtDataFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrClearTxtDataFrmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClearTxtDataFrmt() {
        return othrClearTxtDataFrmt;
    }

    /**
     * Define el valor de la propiedad othrClearTxtDataFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrClearTxtDataFrmt(String value) {
        this.othrClearTxtDataFrmt = value;
    }

}
