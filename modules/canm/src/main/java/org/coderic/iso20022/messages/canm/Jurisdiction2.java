//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Jurisdiction2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Jurisdiction2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DmstInd" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="DmstQlfctn" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Jurisdiction2", propOrder = {
    "dmstInd",
    "dmstQlfctn"
})
public class Jurisdiction2 {

    @XmlElement(name = "DmstInd")
    protected Boolean dmstInd;
    @XmlElement(name = "DmstQlfctn")
    protected String dmstQlfctn;

    /**
     * Obtiene el valor de la propiedad dmstInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDmstInd() {
        return dmstInd;
    }

    /**
     * Define el valor de la propiedad dmstInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDmstInd(Boolean value) {
        this.dmstInd = value;
    }

    /**
     * Obtiene el valor de la propiedad dmstQlfctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDmstQlfctn() {
        return dmstQlfctn;
    }

    /**
     * Define el valor de la propiedad dmstQlfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDmstQlfctn(String value) {
        this.dmstQlfctn = value;
    }

}
