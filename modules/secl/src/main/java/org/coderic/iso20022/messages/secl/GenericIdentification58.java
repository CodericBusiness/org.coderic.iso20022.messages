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
 * <p>Clase Java para GenericIdentification58 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GenericIdentification58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}GenericIdentification40"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericIdentification58", propOrder = {
    "id",
    "tp"
})
public class GenericIdentification58 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Tp", required = true)
    protected GenericIdentification40 tp;

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

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification40 }
     *     
     */
    public GenericIdentification40 getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification40 }
     *     
     */
    public void setTp(GenericIdentification40 value) {
        this.tp = value;
    }

}