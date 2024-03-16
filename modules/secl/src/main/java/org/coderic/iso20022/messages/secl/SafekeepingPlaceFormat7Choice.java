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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SafekeepingPlaceFormat7Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SafekeepingPlaceFormat7Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SafekeepingPlaceTypeAndText1"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}CountryCode"/&gt;
 *         &lt;element name="TpAndId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SafekeepingPlaceTypeAndAnyBICIdentifier1"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}GenericIdentification58"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SafekeepingPlaceFormat7Choice", propOrder = {
    "id",
    "ctry",
    "tpAndId",
    "prtry"
})
public class SafekeepingPlaceFormat7Choice {

    @XmlElement(name = "Id")
    protected SafekeepingPlaceTypeAndText1 id;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "TpAndId")
    protected SafekeepingPlaceTypeAndAnyBICIdentifier1 tpAndId;
    @XmlElement(name = "Prtry")
    protected GenericIdentification58 prtry;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndText1 }
     *     
     */
    public SafekeepingPlaceTypeAndText1 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndText1 }
     *     
     */
    public void setId(SafekeepingPlaceTypeAndText1 value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Obtiene el valor de la propiedad tpAndId.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     *     
     */
    public SafekeepingPlaceTypeAndAnyBICIdentifier1 getTpAndId() {
        return tpAndId;
    }

    /**
     * Define el valor de la propiedad tpAndId.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceTypeAndAnyBICIdentifier1 }
     *     
     */
    public void setTpAndId(SafekeepingPlaceTypeAndAnyBICIdentifier1 value) {
        this.tpAndId = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification58 }
     *     
     */
    public GenericIdentification58 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification58 }
     *     
     */
    public void setPrtry(GenericIdentification58 value) {
        this.prtry = value;
    }

}
