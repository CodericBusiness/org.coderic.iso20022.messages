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
 * <p>Clase Java para AddressVerification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressVerification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdrDgts" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max5NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PstlCdDgts" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max5NumericText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressVerification1", propOrder = {
    "adrDgts",
    "pstlCdDgts"
})
public class AddressVerification1 {

    @XmlElement(name = "AdrDgts")
    protected String adrDgts;
    @XmlElement(name = "PstlCdDgts")
    protected String pstlCdDgts;

    /**
     * Obtiene el valor de la propiedad adrDgts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrDgts() {
        return adrDgts;
    }

    /**
     * Define el valor de la propiedad adrDgts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrDgts(String value) {
        this.adrDgts = value;
    }

    /**
     * Obtiene el valor de la propiedad pstlCdDgts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstlCdDgts() {
        return pstlCdDgts;
    }

    /**
     * Define el valor de la propiedad pstlCdDgts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstlCdDgts(String value) {
        this.pstlCdDgts = value;
    }

}
