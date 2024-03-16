//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:18 PM COT 
//


package org.coderic.iso20022.messages.head;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ImplementationSpecification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ImplementationSpecification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Regy" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max350Text"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max2048Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImplementationSpecification1", propOrder = {
    "regy",
    "id"
})
public class ImplementationSpecification1 {

    @XmlElement(name = "Regy", required = true)
    protected String regy;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Obtiene el valor de la propiedad regy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegy() {
        return regy;
    }

    /**
     * Define el valor de la propiedad regy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegy(String value) {
        this.regy = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
