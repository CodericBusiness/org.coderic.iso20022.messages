//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GeographicLocation1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GeographicLocation1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="GeogcCordints" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}GeographicCoordinates1"/&gt;
 *         &lt;element name="UTMCordints" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}UTMCoordinates1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicLocation1Choice", propOrder = {
    "geogcCordints",
    "utmCordints"
})
public class GeographicLocation1Choice {

    @XmlElement(name = "GeogcCordints")
    protected GeographicCoordinates1 geogcCordints;
    @XmlElement(name = "UTMCordints")
    protected UTMCoordinates1 utmCordints;

    /**
     * Obtiene el valor de la propiedad geogcCordints.
     * 
     * @return
     *     possible object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public GeographicCoordinates1 getGeogcCordints() {
        return geogcCordints;
    }

    /**
     * Define el valor de la propiedad geogcCordints.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicCoordinates1 }
     *     
     */
    public void setGeogcCordints(GeographicCoordinates1 value) {
        this.geogcCordints = value;
    }

    /**
     * Obtiene el valor de la propiedad utmCordints.
     * 
     * @return
     *     possible object is
     *     {@link UTMCoordinates1 }
     *     
     */
    public UTMCoordinates1 getUTMCordints() {
        return utmCordints;
    }

    /**
     * Define el valor de la propiedad utmCordints.
     * 
     * @param value
     *     allowed object is
     *     {@link UTMCoordinates1 }
     *     
     */
    public void setUTMCordints(UTMCoordinates1 value) {
        this.utmCordints = value;
    }

}
