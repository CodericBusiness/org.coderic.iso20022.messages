//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TradingVenueIdentification1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TradingVenueIdentification1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MktIdCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}MICIdentifier"/&gt;
 *         &lt;element name="NtlCmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}CountryCode"/&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TradingVenueIdentification2"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueIdentification1Choice", propOrder = {
    "mktIdCd",
    "ntlCmptntAuthrty",
    "othr"
})
public class TradingVenueIdentification1Choice {

    @XmlElement(name = "MktIdCd")
    protected String mktIdCd;
    @XmlElement(name = "NtlCmptntAuthrty")
    protected String ntlCmptntAuthrty;
    @XmlElement(name = "Othr")
    protected TradingVenueIdentification2 othr;

    /**
     * Obtiene el valor de la propiedad mktIdCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktIdCd() {
        return mktIdCd;
    }

    /**
     * Define el valor de la propiedad mktIdCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktIdCd(String value) {
        this.mktIdCd = value;
    }

    /**
     * Obtiene el valor de la propiedad ntlCmptntAuthrty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlCmptntAuthrty() {
        return ntlCmptntAuthrty;
    }

    /**
     * Define el valor de la propiedad ntlCmptntAuthrty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlCmptntAuthrty(String value) {
        this.ntlCmptntAuthrty = value;
    }

    /**
     * Obtiene el valor de la propiedad othr.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification2 }
     *     
     */
    public TradingVenueIdentification2 getOthr() {
        return othr;
    }

    /**
     * Define el valor de la propiedad othr.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification2 }
     *     
     */
    public void setOthr(TradingVenueIdentification2 value) {
        this.othr = value;
    }

}
