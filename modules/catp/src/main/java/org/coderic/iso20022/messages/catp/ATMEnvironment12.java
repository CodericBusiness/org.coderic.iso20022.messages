//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMEnvironment12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMEnvironment12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Acquirer7" minOccurs="0"/&gt;
 *         &lt;element name="ATMMgr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Acquirer8" minOccurs="0"/&gt;
 *         &lt;element name="HstgNtty" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}TerminalHosting1" minOccurs="0"/&gt;
 *         &lt;element name="ATM" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}AutomatedTellerMachine2"/&gt;
 *         &lt;element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMCustomer5"/&gt;
 *         &lt;element name="PrtctdCardData" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType10" minOccurs="0"/&gt;
 *         &lt;element name="PlainCardData" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}PlainCardData19" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMEnvironment12", propOrder = {
    "acqrr",
    "atmMgr",
    "hstgNtty",
    "atm",
    "cstmr",
    "prtctdCardData",
    "plainCardData"
})
public class ATMEnvironment12 {

    @XmlElement(name = "Acqrr")
    protected Acquirer7 acqrr;
    @XmlElement(name = "ATMMgr")
    protected Acquirer8 atmMgr;
    @XmlElement(name = "HstgNtty")
    protected TerminalHosting1 hstgNtty;
    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine2 atm;
    @XmlElement(name = "Cstmr", required = true)
    protected ATMCustomer5 cstmr;
    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType10 prtctdCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData19 plainCardData;

    /**
     * Obtiene el valor de la propiedad acqrr.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer7 }
     *     
     */
    public Acquirer7 getAcqrr() {
        return acqrr;
    }

    /**
     * Define el valor de la propiedad acqrr.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer7 }
     *     
     */
    public void setAcqrr(Acquirer7 value) {
        this.acqrr = value;
    }

    /**
     * Obtiene el valor de la propiedad atmMgr.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer8 }
     *     
     */
    public Acquirer8 getATMMgr() {
        return atmMgr;
    }

    /**
     * Define el valor de la propiedad atmMgr.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer8 }
     *     
     */
    public void setATMMgr(Acquirer8 value) {
        this.atmMgr = value;
    }

    /**
     * Obtiene el valor de la propiedad hstgNtty.
     * 
     * @return
     *     possible object is
     *     {@link TerminalHosting1 }
     *     
     */
    public TerminalHosting1 getHstgNtty() {
        return hstgNtty;
    }

    /**
     * Define el valor de la propiedad hstgNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalHosting1 }
     *     
     */
    public void setHstgNtty(TerminalHosting1 value) {
        this.hstgNtty = value;
    }

    /**
     * Obtiene el valor de la propiedad atm.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine2 }
     *     
     */
    public AutomatedTellerMachine2 getATM() {
        return atm;
    }

    /**
     * Define el valor de la propiedad atm.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine2 }
     *     
     */
    public void setATM(AutomatedTellerMachine2 value) {
        this.atm = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmr.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomer5 }
     *     
     */
    public ATMCustomer5 getCstmr() {
        return cstmr;
    }

    /**
     * Define el valor de la propiedad cstmr.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomer5 }
     *     
     */
    public void setCstmr(ATMCustomer5 value) {
        this.cstmr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdCardData.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Define el valor de la propiedad prtctdCardData.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdCardData(ContentInformationType10 value) {
        this.prtctdCardData = value;
    }

    /**
     * Obtiene el valor de la propiedad plainCardData.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData19 }
     *     
     */
    public PlainCardData19 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Define el valor de la propiedad plainCardData.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData19 }
     *     
     */
    public void setPlainCardData(PlainCardData19 value) {
        this.plainCardData = value;
    }

}
