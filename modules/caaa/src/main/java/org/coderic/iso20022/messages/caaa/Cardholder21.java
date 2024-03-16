//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cardholder21 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cardholder21"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PersonIdentification15" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max45Text" minOccurs="0"/&gt;
 *         &lt;element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="BllgAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PostalAddress22" minOccurs="0"/&gt;
 *         &lt;element name="ShppgAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PostalAddress22" minOccurs="0"/&gt;
 *         &lt;element name="TripNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Vhcl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Vehicle1" minOccurs="0"/&gt;
 *         &lt;element name="Authntcn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardholderAuthentication17" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TxVrfctnRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TransactionVerificationResult4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrsnlData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="MobData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}MobileData6" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder21", propOrder = {
    "id",
    "nm",
    "lang",
    "bllgAdr",
    "shppgAdr",
    "tripNb",
    "vhcl",
    "authntcn",
    "txVrfctnRslt",
    "prsnlData",
    "mobData"
})
public class Cardholder21 {

    @XmlElement(name = "Id")
    protected PersonIdentification15 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress22 bllgAdr;
    @XmlElement(name = "ShppgAdr")
    protected PostalAddress22 shppgAdr;
    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "Vhcl")
    protected Vehicle1 vhcl;
    @XmlElement(name = "Authntcn")
    protected List<CardholderAuthentication17> authntcn;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "PrsnlData")
    protected String prsnlData;
    @XmlElement(name = "MobData")
    protected List<MobileData6> mobData;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification15 }
     *     
     */
    public PersonIdentification15 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification15 }
     *     
     */
    public void setId(PersonIdentification15 value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad lang.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Define el valor de la propiedad lang.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Obtiene el valor de la propiedad bllgAdr.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Define el valor de la propiedad bllgAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public void setBllgAdr(PostalAddress22 value) {
        this.bllgAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad shppgAdr.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getShppgAdr() {
        return shppgAdr;
    }

    /**
     * Define el valor de la propiedad shppgAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public void setShppgAdr(PostalAddress22 value) {
        this.shppgAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad tripNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Define el valor de la propiedad tripNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNb(String value) {
        this.tripNb = value;
    }

    /**
     * Obtiene el valor de la propiedad vhcl.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle1 }
     *     
     */
    public Vehicle1 getVhcl() {
        return vhcl;
    }

    /**
     * Define el valor de la propiedad vhcl.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle1 }
     *     
     */
    public void setVhcl(Vehicle1 value) {
        this.vhcl = value;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderAuthentication17 }
     * 
     * 
     */
    public List<CardholderAuthentication17> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<CardholderAuthentication17>();
        }
        return this.authntcn;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult4 }
     * 
     * 
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<TransactionVerificationResult4>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Obtiene el valor de la propiedad prsnlData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlData() {
        return prsnlData;
    }

    /**
     * Define el valor de la propiedad prsnlData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrsnlData(String value) {
        this.prsnlData = value;
    }

    /**
     * Gets the value of the mobData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mobData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileData6 }
     * 
     * 
     */
    public List<MobileData6> getMobData() {
        if (mobData == null) {
            mobData = new ArrayList<MobileData6>();
        }
        return this.mobData;
    }

}
