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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Environment22 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Environment22"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Accptr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification254" minOccurs="0"/&gt;
 *         &lt;element name="Pyer" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification257" minOccurs="0"/&gt;
 *         &lt;element name="Pyee" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification257" minOccurs="0"/&gt;
 *         &lt;element name="Termnl" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Terminal4" minOccurs="0"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardData8" minOccurs="0"/&gt;
 *         &lt;element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="CstmrDvc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CustomerDevice4" minOccurs="0"/&gt;
 *         &lt;element name="Wllt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Wallet2" minOccurs="0"/&gt;
 *         &lt;element name="Tkn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Token3" minOccurs="0"/&gt;
 *         &lt;element name="Crdhldr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Cardholder19" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment22", propOrder = {
    "acqrr",
    "orgtr",
    "sndr",
    "rcvr",
    "accptr",
    "pyer",
    "pyee",
    "termnl",
    "issr",
    "card",
    "dstn",
    "cstmrDvc",
    "wllt",
    "tkn",
    "crdhldr"
})
public class Environment22 {

    @XmlElement(name = "Acqrr")
    protected PartyIdentification263 acqrr;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Accptr")
    protected PartyIdentification254 accptr;
    @XmlElement(name = "Pyer")
    protected PartyIdentification257 pyer;
    @XmlElement(name = "Pyee")
    protected PartyIdentification257 pyee;
    @XmlElement(name = "Termnl")
    protected Terminal4 termnl;
    @XmlElement(name = "Issr")
    protected PartyIdentification263 issr;
    @XmlElement(name = "Card")
    protected CardData8 card;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice4 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected Wallet2 wllt;
    @XmlElement(name = "Tkn")
    protected Token3 tkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder19 crdhldr;

    /**
     * Obtiene el valor de la propiedad acqrr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getAcqrr() {
        return acqrr;
    }

    /**
     * Define el valor de la propiedad acqrr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setAcqrr(PartyIdentification263 value) {
        this.acqrr = value;
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
     * Obtiene el valor de la propiedad accptr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification254 }
     *     
     */
    public PartyIdentification254 getAccptr() {
        return accptr;
    }

    /**
     * Define el valor de la propiedad accptr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification254 }
     *     
     */
    public void setAccptr(PartyIdentification254 value) {
        this.accptr = value;
    }

    /**
     * Obtiene el valor de la propiedad pyer.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification257 }
     *     
     */
    public PartyIdentification257 getPyer() {
        return pyer;
    }

    /**
     * Define el valor de la propiedad pyer.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification257 }
     *     
     */
    public void setPyer(PartyIdentification257 value) {
        this.pyer = value;
    }

    /**
     * Obtiene el valor de la propiedad pyee.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification257 }
     *     
     */
    public PartyIdentification257 getPyee() {
        return pyee;
    }

    /**
     * Define el valor de la propiedad pyee.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification257 }
     *     
     */
    public void setPyee(PartyIdentification257 value) {
        this.pyee = value;
    }

    /**
     * Obtiene el valor de la propiedad termnl.
     * 
     * @return
     *     possible object is
     *     {@link Terminal4 }
     *     
     */
    public Terminal4 getTermnl() {
        return termnl;
    }

    /**
     * Define el valor de la propiedad termnl.
     * 
     * @param value
     *     allowed object is
     *     {@link Terminal4 }
     *     
     */
    public void setTermnl(Terminal4 value) {
        this.termnl = value;
    }

    /**
     * Obtiene el valor de la propiedad issr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getIssr() {
        return issr;
    }

    /**
     * Define el valor de la propiedad issr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setIssr(PartyIdentification263 value) {
        this.issr = value;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link CardData8 }
     *     
     */
    public CardData8 getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData8 }
     *     
     */
    public void setCard(CardData8 value) {
        this.card = value;
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
     * Obtiene el valor de la propiedad cstmrDvc.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice4 }
     *     
     */
    public CustomerDevice4 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Define el valor de la propiedad cstmrDvc.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice4 }
     *     
     */
    public void setCstmrDvc(CustomerDevice4 value) {
        this.cstmrDvc = value;
    }

    /**
     * Obtiene el valor de la propiedad wllt.
     * 
     * @return
     *     possible object is
     *     {@link Wallet2 }
     *     
     */
    public Wallet2 getWllt() {
        return wllt;
    }

    /**
     * Define el valor de la propiedad wllt.
     * 
     * @param value
     *     allowed object is
     *     {@link Wallet2 }
     *     
     */
    public void setWllt(Wallet2 value) {
        this.wllt = value;
    }

    /**
     * Obtiene el valor de la propiedad tkn.
     * 
     * @return
     *     possible object is
     *     {@link Token3 }
     *     
     */
    public Token3 getTkn() {
        return tkn;
    }

    /**
     * Define el valor de la propiedad tkn.
     * 
     * @param value
     *     allowed object is
     *     {@link Token3 }
     *     
     */
    public void setTkn(Token3 value) {
        this.tkn = value;
    }

    /**
     * Obtiene el valor de la propiedad crdhldr.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder19 }
     *     
     */
    public Cardholder19 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Define el valor de la propiedad crdhldr.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder19 }
     *     
     */
    public void setCrdhldr(Cardholder19 value) {
        this.crdhldr = value;
    }

}
