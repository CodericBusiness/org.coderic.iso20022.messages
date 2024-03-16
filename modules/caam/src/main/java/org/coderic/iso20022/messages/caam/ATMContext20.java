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
 * <p>Clase Java para ATMContext20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMContext20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SsnRef" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Svc" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMService24"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMContext20", propOrder = {
    "ssnRef",
    "svc"
})
public class ATMContext20 {

    @XmlElement(name = "SsnRef")
    protected String ssnRef;
    @XmlElement(name = "Svc", required = true)
    protected ATMService24 svc;

    /**
     * Obtiene el valor de la propiedad ssnRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnRef() {
        return ssnRef;
    }

    /**
     * Define el valor de la propiedad ssnRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnRef(String value) {
        this.ssnRef = value;
    }

    /**
     * Obtiene el valor de la propiedad svc.
     * 
     * @return
     *     possible object is
     *     {@link ATMService24 }
     *     
     */
    public ATMService24 getSvc() {
        return svc;
    }

    /**
     * Define el valor de la propiedad svc.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMService24 }
     *     
     */
    public void setSvc(ATMService24 value) {
        this.svc = value;
    }

}
