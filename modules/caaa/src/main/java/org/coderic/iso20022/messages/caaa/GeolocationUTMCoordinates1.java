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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeolocationUTMCoordinates1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeolocationUTMCoordinates1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UTMZone" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *         &lt;element name="UTMEstwrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *         &lt;element name="UTMNrthwrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeolocationUTMCoordinates1", propOrder = {
    "utmZone",
    "utmEstwrd",
    "utmNrthwrd"
})
public class GeolocationUTMCoordinates1 {

    @XmlElement(name = "UTMZone", required = true)
    protected String utmZone;
    @XmlElement(name = "UTMEstwrd", required = true)
    protected String utmEstwrd;
    @XmlElement(name = "UTMNrthwrd", required = true)
    protected String utmNrthwrd;

    /**
     * Obtiene el valor de la propiedad utmZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMZone() {
        return utmZone;
    }

    /**
     * Define el valor de la propiedad utmZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMZone(String value) {
        this.utmZone = value;
    }

    /**
     * Obtiene el valor de la propiedad utmEstwrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMEstwrd() {
        return utmEstwrd;
    }

    /**
     * Define el valor de la propiedad utmEstwrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMEstwrd(String value) {
        this.utmEstwrd = value;
    }

    /**
     * Obtiene el valor de la propiedad utmNrthwrd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTMNrthwrd() {
        return utmNrthwrd;
    }

    /**
     * Define el valor de la propiedad utmNrthwrd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTMNrthwrd(String value) {
        this.utmNrthwrd = value;
    }

}
