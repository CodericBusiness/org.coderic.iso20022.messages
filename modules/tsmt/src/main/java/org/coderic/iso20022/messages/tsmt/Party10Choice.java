//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:35 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Party10Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Party10Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}OrganisationIdentification7"/&gt;
 *         &lt;element name="PrvtId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}PersonIdentification5"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party10Choice", propOrder = {
    "orgId",
    "prvtId"
})
public class Party10Choice {

    @XmlElement(name = "OrgId")
    protected OrganisationIdentification7 orgId;
    @XmlElement(name = "PrvtId")
    protected PersonIdentification5 prvtId;

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification7 }
     *     
     */
    public OrganisationIdentification7 getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification7 }
     *     
     */
    public void setOrgId(OrganisationIdentification7 value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad prvtId.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification5 }
     *     
     */
    public PersonIdentification5 getPrvtId() {
        return prvtId;
    }

    /**
     * Define el valor de la propiedad prvtId.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification5 }
     *     
     */
    public void setPrvtId(PersonIdentification5 value) {
        this.prvtId = value;
    }

}
