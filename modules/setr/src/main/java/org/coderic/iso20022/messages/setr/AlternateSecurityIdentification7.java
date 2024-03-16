//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlternateSecurityIdentification7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlternateSecurityIdentification7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text"/&gt;
 *         &lt;element name="IdSrc" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}IdentificationSource1Choice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateSecurityIdentification7", propOrder = {
    "id",
    "idSrc"
})
public class AlternateSecurityIdentification7 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IdSrc", required = true)
    protected IdentificationSource1Choice idSrc;

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
     * Obtiene el valor de la propiedad idSrc.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationSource1Choice }
     *     
     */
    public IdentificationSource1Choice getIdSrc() {
        return idSrc;
    }

    /**
     * Define el valor de la propiedad idSrc.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationSource1Choice }
     *     
     */
    public void setIdSrc(IdentificationSource1Choice value) {
        this.idSrc = value;
    }

}
