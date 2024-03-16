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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardAccount13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardAccount13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}CardAccountType3Code" minOccurs="0"/&gt;
 *         &lt;element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="AcctIdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}AccountIdentification31Choice" minOccurs="0"/&gt;
 *         &lt;element name="CdtRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}PartyIdentification72Choice" minOccurs="0"/&gt;
 *         &lt;element name="BalBfr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}AmountAndDirection43" minOccurs="0"/&gt;
 *         &lt;element name="BalAftr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}AmountAndDirection43" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAccount13", propOrder = {
    "acctTp",
    "acctNm",
    "ccy",
    "acctIdr",
    "cdtRef",
    "svcr",
    "balBfr",
    "balAftr"
})
public class CardAccount13 {

    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "AcctIdr")
    protected AccountIdentification31Choice acctIdr;
    @XmlElement(name = "CdtRef")
    protected String cdtRef;
    @XmlElement(name = "Svcr")
    protected PartyIdentification72Choice svcr;
    @XmlElement(name = "BalBfr")
    protected AmountAndDirection43 balBfr;
    @XmlElement(name = "BalAftr")
    protected AmountAndDirection43 balAftr;

    /**
     * Obtiene el valor de la propiedad acctTp.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Define el valor de la propiedad acctTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public void setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
    }

    /**
     * Obtiene el valor de la propiedad acctNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Define el valor de la propiedad acctNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Obtiene el valor de la propiedad acctIdr.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public AccountIdentification31Choice getAcctIdr() {
        return acctIdr;
    }

    /**
     * Define el valor de la propiedad acctIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification31Choice }
     *     
     */
    public void setAcctIdr(AccountIdentification31Choice value) {
        this.acctIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtRef() {
        return cdtRef;
    }

    /**
     * Define el valor de la propiedad cdtRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtRef(String value) {
        this.cdtRef = value;
    }

    /**
     * Obtiene el valor de la propiedad svcr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public PartyIdentification72Choice getSvcr() {
        return svcr;
    }

    /**
     * Define el valor de la propiedad svcr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification72Choice }
     *     
     */
    public void setSvcr(PartyIdentification72Choice value) {
        this.svcr = value;
    }

    /**
     * Obtiene el valor de la propiedad balBfr.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public AmountAndDirection43 getBalBfr() {
        return balBfr;
    }

    /**
     * Define el valor de la propiedad balBfr.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public void setBalBfr(AmountAndDirection43 value) {
        this.balBfr = value;
    }

    /**
     * Obtiene el valor de la propiedad balAftr.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public AmountAndDirection43 getBalAftr() {
        return balAftr;
    }

    /**
     * Define el valor de la propiedad balAftr.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection43 }
     *     
     */
    public void setBalAftr(AmountAndDirection43 value) {
        this.balAftr = value;
    }

}
