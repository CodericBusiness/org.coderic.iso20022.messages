//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeviceInputResponse6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceInputResponse6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OutptRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}OutputResult2" minOccurs="0"/&gt;
 *         &lt;element name="InptRslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}InputResult6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInputResponse6", propOrder = {
    "outptRslt",
    "inptRslt"
})
public class DeviceInputResponse6 {

    @XmlElement(name = "OutptRslt")
    protected OutputResult2 outptRslt;
    @XmlElement(name = "InptRslt", required = true)
    protected InputResult6 inptRslt;

    /**
     * Obtiene el valor de la propiedad outptRslt.
     * 
     * @return
     *     possible object is
     *     {@link OutputResult2 }
     *     
     */
    public OutputResult2 getOutptRslt() {
        return outptRslt;
    }

    /**
     * Define el valor de la propiedad outptRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputResult2 }
     *     
     */
    public void setOutptRslt(OutputResult2 value) {
        this.outptRslt = value;
    }

    /**
     * Obtiene el valor de la propiedad inptRslt.
     * 
     * @return
     *     possible object is
     *     {@link InputResult6 }
     *     
     */
    public InputResult6 getInptRslt() {
        return inptRslt;
    }

    /**
     * Define el valor de la propiedad inptRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResult6 }
     *     
     */
    public void setInptRslt(InputResult6 value) {
        this.inptRslt = value;
    }

}
