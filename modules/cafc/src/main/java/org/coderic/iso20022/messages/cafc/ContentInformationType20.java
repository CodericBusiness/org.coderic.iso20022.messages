//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContentInformationType20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContentInformationType20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MACData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}MACData1"/&gt;
 *         &lt;element name="MAC" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max8HexBinaryText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentInformationType20", propOrder = {
    "macData",
    "mac"
})
public class ContentInformationType20 {

    @XmlElement(name = "MACData", required = true)
    protected MACData1 macData;
    @XmlElement(name = "MAC", required = true)
    protected String mac;

    /**
     * Obtiene el valor de la propiedad macData.
     * 
     * @return
     *     possible object is
     *     {@link MACData1 }
     *     
     */
    public MACData1 getMACData() {
        return macData;
    }

    /**
     * Define el valor de la propiedad macData.
     * 
     * @param value
     *     allowed object is
     *     {@link MACData1 }
     *     
     */
    public void setMACData(MACData1 value) {
        this.macData = value;
    }

    /**
     * Obtiene el valor de la propiedad mac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAC() {
        return mac;
    }

    /**
     * Define el valor de la propiedad mac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAC(String value) {
        this.mac = value;
    }

}
