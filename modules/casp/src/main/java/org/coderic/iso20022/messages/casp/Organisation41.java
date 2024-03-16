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
 * <p>Clase Java para Organisation41 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Organisation41"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}GenericIdentification32" minOccurs="0"/&gt;
 *         &lt;element name="CmonNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="LctnCtgy" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}LocationCategory4Code" minOccurs="0"/&gt;
 *         &lt;element name="LctnAndCtct" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CommunicationAddress9" minOccurs="0"/&gt;
 *         &lt;element name="SchmeData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation41", propOrder = {
    "id",
    "cmonNm",
    "lctnCtgy",
    "lctnAndCtct",
    "schmeData"
})
public class Organisation41 {

    @XmlElement(name = "Id")
    protected GenericIdentification32 id;
    @XmlElement(name = "CmonNm")
    protected String cmonNm;
    @XmlElement(name = "LctnCtgy")
    @XmlSchemaType(name = "string")
    protected LocationCategory4Code lctnCtgy;
    @XmlElement(name = "LctnAndCtct")
    protected CommunicationAddress9 lctnAndCtct;
    @XmlElement(name = "SchmeData")
    protected String schmeData;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public void setId(GenericIdentification32 value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad cmonNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonNm() {
        return cmonNm;
    }

    /**
     * Define el valor de la propiedad cmonNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonNm(String value) {
        this.cmonNm = value;
    }

    /**
     * Obtiene el valor de la propiedad lctnCtgy.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory4Code }
     *     
     */
    public LocationCategory4Code getLctnCtgy() {
        return lctnCtgy;
    }

    /**
     * Define el valor de la propiedad lctnCtgy.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory4Code }
     *     
     */
    public void setLctnCtgy(LocationCategory4Code value) {
        this.lctnCtgy = value;
    }

    /**
     * Obtiene el valor de la propiedad lctnAndCtct.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress9 }
     *     
     */
    public CommunicationAddress9 getLctnAndCtct() {
        return lctnAndCtct;
    }

    /**
     * Define el valor de la propiedad lctnAndCtct.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress9 }
     *     
     */
    public void setLctnAndCtct(CommunicationAddress9 value) {
        this.lctnAndCtct = value;
    }

    /**
     * Obtiene el valor de la propiedad schmeData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchmeData() {
        return schmeData;
    }

    /**
     * Define el valor de la propiedad schmeData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchmeData(String value) {
        this.schmeData = value;
    }

}
