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
 * <p>Clase Java para DeviceOperatingSystem1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceOperatingSystem1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}DeviceOperatingSystemType1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Bld" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceOperatingSystem1", propOrder = {
    "id",
    "tp",
    "othrTp",
    "vrsn",
    "bld"
})
public class DeviceOperatingSystem1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected DeviceOperatingSystemType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "Bld")
    protected String bld;

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
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOperatingSystemType1Code }
     *     
     */
    public DeviceOperatingSystemType1Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOperatingSystemType1Code }
     *     
     */
    public void setTp(DeviceOperatingSystemType1Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Define el valor de la propiedad othrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad vrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Define el valor de la propiedad vrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad bld.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBld() {
        return bld;
    }

    /**
     * Define el valor de la propiedad bld.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBld(String value) {
        this.bld = value;
    }

}
