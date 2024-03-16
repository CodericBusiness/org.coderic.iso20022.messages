//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SafekeepingPlaceTypeAndAnyBICIdentifier1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SafekeepingPlaceTypeAndAnyBICIdentifier1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SfkpgPlcTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SafekeepingPlace1Code"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AnyBICIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceTypeAndAnyBICIdentifier1", propOrder = {
    "sfkpgPlcTp",
    "id"
})
public class SafekeepingPlaceTypeAndAnyBICIdentifier1 {

    @XmlElement(name = "SfkpgPlcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SafekeepingPlace1Code sfkpgPlcTp;
    @XmlElement(name = "Id", required = true)
    protected String id;

    /**
     * Obtiene el valor de la propiedad sfkpgPlcTp.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public SafekeepingPlace1Code getSfkpgPlcTp() {
        return sfkpgPlcTp;
    }

    /**
     * Define el valor de la propiedad sfkpgPlcTp.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlace1Code }
     *     
     */
    public void setSfkpgPlcTp(SafekeepingPlace1Code value) {
        this.sfkpgPlcTp = value;
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
