//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Environment27 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Environment27"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SttlmInstn" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="FI" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}FinancialInstitution6" minOccurs="0"/&gt;
 *         &lt;element name="OthrInstn" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}PartyIdentification258" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment27", propOrder = {
    "sttlmInstn",
    "orgtr",
    "sndr",
    "rcvr",
    "dstn",
    "fi",
    "othrInstn"
})
public class Environment27 {

    @XmlElement(name = "SttlmInstn")
    protected PartyIdentification263 sttlmInstn;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "FI")
    protected FinancialInstitution6 fi;
    @XmlElement(name = "OthrInstn")
    protected PartyIdentification258 othrInstn;

    /**
     * Obtiene el valor de la propiedad sttlmInstn.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSttlmInstn() {
        return sttlmInstn;
    }

    /**
     * Define el valor de la propiedad sttlmInstn.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setSttlmInstn(PartyIdentification263 value) {
        this.sttlmInstn = value;
    }

    /**
     * Obtiene el valor de la propiedad orgtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getOrgtr() {
        return orgtr;
    }

    /**
     * Define el valor de la propiedad orgtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setOrgtr(PartyIdentification263 value) {
        this.orgtr = value;
    }

    /**
     * Obtiene el valor de la propiedad sndr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSndr() {
        return sndr;
    }

    /**
     * Define el valor de la propiedad sndr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setSndr(PartyIdentification263 value) {
        this.sndr = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getRcvr() {
        return rcvr;
    }

    /**
     * Define el valor de la propiedad rcvr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setRcvr(PartyIdentification263 value) {
        this.rcvr = value;
    }

    /**
     * Obtiene el valor de la propiedad dstn.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getDstn() {
        return dstn;
    }

    /**
     * Define el valor de la propiedad dstn.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setDstn(PartyIdentification263 value) {
        this.dstn = value;
    }

    /**
     * Obtiene el valor de la propiedad fi.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution6 }
     *     
     */
    public FinancialInstitution6 getFI() {
        return fi;
    }

    /**
     * Define el valor de la propiedad fi.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution6 }
     *     
     */
    public void setFI(FinancialInstitution6 value) {
        this.fi = value;
    }

    /**
     * Obtiene el valor de la propiedad othrInstn.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getOthrInstn() {
        return othrInstn;
    }

    /**
     * Define el valor de la propiedad othrInstn.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setOthrInstn(PartyIdentification258 value) {
        this.othrInstn = value;
    }

}
