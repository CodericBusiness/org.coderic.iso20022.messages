//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 08:18:25 PM COT 
//


package org.coderic.iso20022.externalcodes.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountIdentification26 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountIdentification26"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SimpleIdentificationInformation4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification26", propOrder = {
    "prtry"
})
public class AccountIdentification26 {

    @XmlElement(name = "Prtry", required = true)
    protected SimpleIdentificationInformation4 prtry;

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation4 }
     *     
     */
    public SimpleIdentificationInformation4 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation4 }
     *     
     */
    public void setPrtry(SimpleIdentificationInformation4 value) {
        this.prtry = value;
    }

}