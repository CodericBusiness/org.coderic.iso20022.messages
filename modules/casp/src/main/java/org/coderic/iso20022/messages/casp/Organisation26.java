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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Organisation26 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Organisation26"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CmonNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max70Text"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="CtryCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ISO3NumericCountryCode"/&gt;
 *         &lt;element name="MrchntCtgyCd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Min3Max4Text"/&gt;
 *         &lt;element name="RegdIdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation26", propOrder = {
    "cmonNm",
    "adr",
    "ctryCd",
    "mrchntCtgyCd",
    "regdIdr"
})
public class Organisation26 {

    @XmlElement(name = "CmonNm", required = true)
    protected String cmonNm;
    @XmlElement(name = "Adr")
    protected String adr;
    @XmlElement(name = "CtryCd", required = true)
    protected String ctryCd;
    @XmlElement(name = "MrchntCtgyCd", required = true)
    protected String mrchntCtgyCd;
    @XmlElement(name = "RegdIdr", required = true)
    protected String regdIdr;

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
     * Obtiene el valor de la propiedad adr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Define el valor de la propiedad adr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctryCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryCd() {
        return ctryCd;
    }

    /**
     * Define el valor de la propiedad ctryCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryCd(String value) {
        this.ctryCd = value;
    }

    /**
     * Obtiene el valor de la propiedad mrchntCtgyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntCtgyCd() {
        return mrchntCtgyCd;
    }

    /**
     * Define el valor de la propiedad mrchntCtgyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntCtgyCd(String value) {
        this.mrchntCtgyCd = value;
    }

    /**
     * Obtiene el valor de la propiedad regdIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdIdr() {
        return regdIdr;
    }

    /**
     * Define el valor de la propiedad regdIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdIdr(String value) {
        this.regdIdr = value;
    }

}
