//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Party52Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Party52Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}OrganisationIdentification39"/&gt;
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PersonIdentification18"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party52Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party52Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification39 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentification18 prvtId;

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public OrganisationIdentification39 getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification39 }
     *     
     */
    public void setOrgId(OrganisationIdentification39 value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad prvtId.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification18 }
     *     
     */
    public PersonIdentification18 getPrvtId() {
        return prvtId;
    }

    /**
     * Define el valor de la propiedad prvtId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification18 }
     *     
     */
    public void setPrvtId(PersonIdentification18 value) {
        this.prvtId = value;
    }

}
