//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Environment23 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Environment23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Accptr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification255" minOccurs="0"/&gt;
 *         &lt;element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyIdentification263" minOccurs="0"/&gt;
 *         &lt;element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}CardData2" minOccurs="0"/&gt;
 *         &lt;element name="Tkn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Token2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment23", propOrder = {
    "acqrr",
    "orgtr",
    "sndr",
    "rcvr",
    "accptr",
    "dstn",
    "issr",
    "card",
    "tkn"
})
public class Environment23 {

    @XmlElement(name = "Acqrr")
    protected PartyIdentification263 acqrr;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Accptr")
    protected PartyIdentification255 accptr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "Issr")
    protected PartyIdentification263 issr;
    @XmlElement(name = "Card")
    protected CardData2 card;
    @XmlElement(name = "Tkn")
    protected Token2 tkn;

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
     *     {@link PartyIdentification255 }
     *     
     */
    public PartyIdentification255 getAccptr() {
        return accptr;
    }

    /**
     * Define el valor de la propiedad accptr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification255 }
     *     
     */
    public void setAccptr(PartyIdentification255 value) {
        this.accptr = value;
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
     *     {@link CardData2 }
     *     
     */
    public CardData2 getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link CardData2 }
     *     
     */
    public void setCard(CardData2 value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad tkn.
     * 
     * @return
     *     possible object is
     *     {@link Token2 }
     *     
     */
    public Token2 getTkn() {
        return tkn;
    }

    /**
     * Define el valor de la propiedad tkn.
     * 
     * @param value
     *     allowed object is
     *     {@link Token2 }
     *     
     */
    public void setTkn(Token2 value) {
        this.tkn = value;
    }

}
