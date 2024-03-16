//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TerminalHosting1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TerminalHosting1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ctgy" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}TransactionEnvironment3Code" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalHosting1", propOrder = {
    "ctgy",
    "id"
})
public class TerminalHosting1 {

    @XmlElement(name = "Ctgy")
    @XmlSchemaType(name = "string")
    protected TransactionEnvironment3Code ctgy;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Obtiene el valor de la propiedad ctgy.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEnvironment3Code }
     *     
     */
    public TransactionEnvironment3Code getCtgy() {
        return ctgy;
    }

    /**
     * Define el valor de la propiedad ctgy.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEnvironment3Code }
     *     
     */
    public void setCtgy(TransactionEnvironment3Code value) {
        this.ctgy = value;
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
