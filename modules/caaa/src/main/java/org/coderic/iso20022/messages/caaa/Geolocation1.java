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
 * <p>Clase Java para Geolocation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Geolocation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeogcCordints" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}GeolocationGeographicCoordinates1" minOccurs="0"/&gt;
 *         &lt;element name="UTMCordints" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}GeolocationUTMCoordinates1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geolocation1", propOrder = {
    "geogcCordints",
    "utmCordints"
})
public class Geolocation1 {

    @XmlElement(name = "GeogcCordints")
    protected GeolocationGeographicCoordinates1 geogcCordints;
    @XmlElement(name = "UTMCordints")
    protected GeolocationUTMCoordinates1 utmCordints;

    /**
     * Obtiene el valor de la propiedad geogcCordints.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationGeographicCoordinates1 }
     *     
     */
    public GeolocationGeographicCoordinates1 getGeogcCordints() {
        return geogcCordints;
    }

    /**
     * Define el valor de la propiedad geogcCordints.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationGeographicCoordinates1 }
     *     
     */
    public void setGeogcCordints(GeolocationGeographicCoordinates1 value) {
        this.geogcCordints = value;
    }

    /**
     * Obtiene el valor de la propiedad utmCordints.
     * 
     * @return
     *     possible object is
     *     {@link GeolocationUTMCoordinates1 }
     *     
     */
    public GeolocationUTMCoordinates1 getUTMCordints() {
        return utmCordints;
    }

    /**
     * Define el valor de la propiedad utmCordints.
     * 
     * @param value
     *     allowed object is
     *     {@link GeolocationUTMCoordinates1 }
     *     
     */
    public void setUTMCordints(GeolocationUTMCoordinates1 value) {
        this.utmCordints = value;
    }

}
