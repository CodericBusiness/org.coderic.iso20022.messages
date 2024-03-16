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
 * <p>Clase Java para Check1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Check1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BkId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AcctNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ChckNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ChckCardNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ChckTrckData2" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrackData2" minOccurs="0"/&gt;
 *         &lt;element name="ChckTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CheckType1Code" minOccurs="0"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max3Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check1", propOrder = {
    "bkId",
    "acctNb",
    "chckNb",
    "chckCardNb",
    "chckTrckData2",
    "chckTp",
    "ctry"
})
public class Check1 {

    @XmlElement(name = "BkId")
    protected String bkId;
    @XmlElement(name = "AcctNb")
    protected String acctNb;
    @XmlElement(name = "ChckNb")
    protected String chckNb;
    @XmlElement(name = "ChckCardNb")
    protected String chckCardNb;
    @XmlElement(name = "ChckTrckData2")
    protected TrackData2 chckTrckData2;
    @XmlElement(name = "ChckTp")
    @XmlSchemaType(name = "string")
    protected CheckType1Code chckTp;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Obtiene el valor de la propiedad bkId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkId() {
        return bkId;
    }

    /**
     * Define el valor de la propiedad bkId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkId(String value) {
        this.bkId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNb() {
        return acctNb;
    }

    /**
     * Define el valor de la propiedad acctNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNb(String value) {
        this.acctNb = value;
    }

    /**
     * Obtiene el valor de la propiedad chckNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckNb() {
        return chckNb;
    }

    /**
     * Define el valor de la propiedad chckNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckNb(String value) {
        this.chckNb = value;
    }

    /**
     * Obtiene el valor de la propiedad chckCardNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckCardNb() {
        return chckCardNb;
    }

    /**
     * Define el valor de la propiedad chckCardNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckCardNb(String value) {
        this.chckCardNb = value;
    }

    /**
     * Obtiene el valor de la propiedad chckTrckData2.
     * 
     * @return
     *     possible object is
     *     {@link TrackData2 }
     *     
     */
    public TrackData2 getChckTrckData2() {
        return chckTrckData2;
    }

    /**
     * Define el valor de la propiedad chckTrckData2.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackData2 }
     *     
     */
    public void setChckTrckData2(TrackData2 value) {
        this.chckTrckData2 = value;
    }

    /**
     * Obtiene el valor de la propiedad chckTp.
     * 
     * @return
     *     possible object is
     *     {@link CheckType1Code }
     *     
     */
    public CheckType1Code getChckTp() {
        return chckTp;
    }

    /**
     * Define el valor de la propiedad chckTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType1Code }
     *     
     */
    public void setChckTp(CheckType1Code value) {
        this.chckTp = value;
    }

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

}
