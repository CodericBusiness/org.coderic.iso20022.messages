//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:51 PM COT 
//


package org.coderic.iso20022.messages.admi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentification266 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification266"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtyNm" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max34Text" minOccurs="0"/&gt;
 *         &lt;element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}PartyIdentification265" minOccurs="0"/&gt;
 *         &lt;element name="AcctNb" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max34Text" minOccurs="0"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max105Text" minOccurs="0"/&gt;
 *         &lt;element name="ClrSysId" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}ClearingSystemIdentification2Choice" minOccurs="0"/&gt;
 *         &lt;element name="LglNttyIdr" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}LEIIdentifier" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification266", propOrder = {
    "ptyNm",
    "anyBIC",
    "acctNb",
    "adr",
    "clrSysId",
    "lglNttyIdr"
})
public class PartyIdentification266 {

    @XmlElement(name = "PtyNm")
    protected String ptyNm;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification265 anyBIC;
    @XmlElement(name = "AcctNb")
    protected String acctNb;
    @XmlElement(name = "Adr")
    protected String adr;
    @XmlElement(name = "ClrSysId")
    protected ClearingSystemIdentification2Choice clrSysId;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;

    /**
     * Obtiene el valor de la propiedad ptyNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyNm() {
        return ptyNm;
    }

    /**
     * Define el valor de la propiedad ptyNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyNm(String value) {
        this.ptyNm = value;
    }

    /**
     * Obtiene el valor de la propiedad anyBIC.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification265 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Define el valor de la propiedad anyBIC.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification265 }
     *     
     */
    public void setAnyBIC(PartyIdentification265 value) {
        this.anyBIC = value;
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
     * Obtiene el valor de la propiedad clrSysId.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    public ClearingSystemIdentification2Choice getClrSysId() {
        return clrSysId;
    }

    /**
     * Define el valor de la propiedad clrSysId.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    public void setClrSysId(ClearingSystemIdentification2Choice value) {
        this.clrSysId = value;
    }

    /**
     * Obtiene el valor de la propiedad lglNttyIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Define el valor de la propiedad lglNttyIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
    }

}
