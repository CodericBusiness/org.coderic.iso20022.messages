//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecurityIdentification25Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecurityIdentification25Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}ISINOct2015Identifier"/&gt;
 *         &lt;element name="SEDOL" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}SEDOLIdentifier"/&gt;
 *         &lt;element name="CUSIP" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}CUSIPIdentifier"/&gt;
 *         &lt;element name="RIC" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}RICIdentifier"/&gt;
 *         &lt;element name="TckrSymb" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}TickerIdentifier"/&gt;
 *         &lt;element name="Blmbrg" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Bloomberg2Identifier"/&gt;
 *         &lt;element name="CTA" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}ConsolidatedTapeAssociationIdentifier"/&gt;
 *         &lt;element name="QUICK" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}QUICKIdentifier"/&gt;
 *         &lt;element name="Wrtppr" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}WertpapierIdentifier"/&gt;
 *         &lt;element name="Dtch" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}DutchIdentifier"/&gt;
 *         &lt;element name="Vlrn" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}ValorenIdentifier"/&gt;
 *         &lt;element name="SCVM" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}SicovamIdentifier"/&gt;
 *         &lt;element name="Belgn" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}BelgianIdentifier"/&gt;
 *         &lt;element name="Cmon" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}EuroclearClearstreamIdentifier"/&gt;
 *         &lt;element name="OthrPrtryId" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}AlternateSecurityIdentification7"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification25Choice", propOrder = {
    "isin",
    "sedol",
    "cusip",
    "ric",
    "tckrSymb",
    "blmbrg",
    "cta",
    "quick",
    "wrtppr",
    "dtch",
    "vlrn",
    "scvm",
    "belgn",
    "cmon",
    "othrPrtryId"
})
public class SecurityIdentification25Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "SEDOL")
    protected String sedol;
    @XmlElement(name = "CUSIP")
    protected String cusip;
    @XmlElement(name = "RIC")
    protected String ric;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "Blmbrg")
    protected String blmbrg;
    @XmlElement(name = "CTA")
    protected String cta;
    @XmlElement(name = "QUICK")
    protected String quick;
    @XmlElement(name = "Wrtppr")
    protected String wrtppr;
    @XmlElement(name = "Dtch")
    protected String dtch;
    @XmlElement(name = "Vlrn")
    protected String vlrn;
    @XmlElement(name = "SCVM")
    protected String scvm;
    @XmlElement(name = "Belgn")
    protected String belgn;
    @XmlElement(name = "Cmon")
    protected String cmon;
    @XmlElement(name = "OthrPrtryId")
    protected AlternateSecurityIdentification7 othrPrtryId;

    /**
     * Obtiene el valor de la propiedad isin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Define el valor de la propiedad isin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Obtiene el valor de la propiedad sedol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEDOL() {
        return sedol;
    }

    /**
     * Define el valor de la propiedad sedol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEDOL(String value) {
        this.sedol = value;
    }

    /**
     * Obtiene el valor de la propiedad cusip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSIP() {
        return cusip;
    }

    /**
     * Define el valor de la propiedad cusip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSIP(String value) {
        this.cusip = value;
    }

    /**
     * Obtiene el valor de la propiedad ric.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIC() {
        return ric;
    }

    /**
     * Define el valor de la propiedad ric.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIC(String value) {
        this.ric = value;
    }

    /**
     * Obtiene el valor de la propiedad tckrSymb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckrSymb() {
        return tckrSymb;
    }

    /**
     * Define el valor de la propiedad tckrSymb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckrSymb(String value) {
        this.tckrSymb = value;
    }

    /**
     * Obtiene el valor de la propiedad blmbrg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlmbrg() {
        return blmbrg;
    }

    /**
     * Define el valor de la propiedad blmbrg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlmbrg(String value) {
        this.blmbrg = value;
    }

    /**
     * Obtiene el valor de la propiedad cta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTA() {
        return cta;
    }

    /**
     * Define el valor de la propiedad cta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTA(String value) {
        this.cta = value;
    }

    /**
     * Obtiene el valor de la propiedad quick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUICK() {
        return quick;
    }

    /**
     * Define el valor de la propiedad quick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUICK(String value) {
        this.quick = value;
    }

    /**
     * Obtiene el valor de la propiedad wrtppr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWrtppr() {
        return wrtppr;
    }

    /**
     * Define el valor de la propiedad wrtppr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWrtppr(String value) {
        this.wrtppr = value;
    }

    /**
     * Obtiene el valor de la propiedad dtch.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtch() {
        return dtch;
    }

    /**
     * Define el valor de la propiedad dtch.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtch(String value) {
        this.dtch = value;
    }

    /**
     * Obtiene el valor de la propiedad vlrn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVlrn() {
        return vlrn;
    }

    /**
     * Define el valor de la propiedad vlrn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVlrn(String value) {
        this.vlrn = value;
    }

    /**
     * Obtiene el valor de la propiedad scvm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCVM() {
        return scvm;
    }

    /**
     * Define el valor de la propiedad scvm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCVM(String value) {
        this.scvm = value;
    }

    /**
     * Obtiene el valor de la propiedad belgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgn() {
        return belgn;
    }

    /**
     * Define el valor de la propiedad belgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgn(String value) {
        this.belgn = value;
    }

    /**
     * Obtiene el valor de la propiedad cmon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmon() {
        return cmon;
    }

    /**
     * Define el valor de la propiedad cmon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmon(String value) {
        this.cmon = value;
    }

    /**
     * Obtiene el valor de la propiedad othrPrtryId.
     * 
     * @return
     *     possible object is
     *     {@link AlternateSecurityIdentification7 }
     *     
     */
    public AlternateSecurityIdentification7 getOthrPrtryId() {
        return othrPrtryId;
    }

    /**
     * Define el valor de la propiedad othrPrtryId.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateSecurityIdentification7 }
     *     
     */
    public void setOthrPrtryId(AlternateSecurityIdentification7 value) {
        this.othrPrtryId = value;
    }

}
