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
 * <p>Clase Java para DeviceSecureInputResponse6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceSecureInputResponse6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrdhldrPIN" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}OnLinePIN11" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSecureInputResponse6", propOrder = {
    "crdhldrPIN"
})
public class DeviceSecureInputResponse6 {

    @XmlElement(name = "CrdhldrPIN")
    protected OnLinePIN11 crdhldrPIN;

    /**
     * Obtiene el valor de la propiedad crdhldrPIN.
     * 
     * @return
     *     possible object is
     *     {@link OnLinePIN11 }
     *     
     */
    public OnLinePIN11 getCrdhldrPIN() {
        return crdhldrPIN;
    }

    /**
     * Define el valor de la propiedad crdhldrPIN.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLinePIN11 }
     *     
     */
    public void setCrdhldrPIN(OnLinePIN11 value) {
        this.crdhldrPIN = value;
    }

}
