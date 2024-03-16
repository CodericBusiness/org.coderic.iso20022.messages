//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderClassification2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderClassification2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdrTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max50Text" minOccurs="0"/&gt;
 *         &lt;element name="OrdrTpClssfctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderType3Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderClassification2", propOrder = {
    "ordrTp",
    "ordrTpClssfctn"
})
public class OrderClassification2 {

    @XmlElement(name = "OrdrTp")
    protected String ordrTp;
    @XmlElement(name = "OrdrTpClssfctn")
    @XmlSchemaType(name = "string")
    protected OrderType3Code ordrTpClssfctn;

    /**
     * Obtiene el valor de la propiedad ordrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrTp() {
        return ordrTp;
    }

    /**
     * Define el valor de la propiedad ordrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrTp(String value) {
        this.ordrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrTpClssfctn.
     * 
     * @return
     *     possible object is
     *     {@link OrderType3Code }
     *     
     */
    public OrderType3Code getOrdrTpClssfctn() {
        return ordrTpClssfctn;
    }

    /**
     * Define el valor de la propiedad ordrTpClssfctn.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType3Code }
     *     
     */
    public void setOrdrTpClssfctn(OrderType3Code value) {
        this.ordrTpClssfctn = value;
    }

}
