//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrackData2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrackData2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrckNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="TrckFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrackFormat1Code" minOccurs="0"/&gt;
 *         &lt;element name="TrckVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max140Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackData2", propOrder = {
    "trckNb",
    "trckFrmt",
    "trckVal"
})
public class TrackData2 {

    @XmlElement(name = "TrckNb")
    protected BigDecimal trckNb;
    @XmlElement(name = "TrckFrmt")
    @XmlSchemaType(name = "string")
    protected TrackFormat1Code trckFrmt;
    @XmlElement(name = "TrckVal", required = true)
    protected String trckVal;

    /**
     * Obtiene el valor de la propiedad trckNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrckNb() {
        return trckNb;
    }

    /**
     * Define el valor de la propiedad trckNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrckNb(BigDecimal value) {
        this.trckNb = value;
    }

    /**
     * Obtiene el valor de la propiedad trckFrmt.
     * 
     * @return
     *     possible object is
     *     {@link TrackFormat1Code }
     *     
     */
    public TrackFormat1Code getTrckFrmt() {
        return trckFrmt;
    }

    /**
     * Define el valor de la propiedad trckFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackFormat1Code }
     *     
     */
    public void setTrckFrmt(TrackFormat1Code value) {
        this.trckFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad trckVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckVal() {
        return trckVal;
    }

    /**
     * Define el valor de la propiedad trckVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckVal(String value) {
        this.trckVal = value;
    }

}
