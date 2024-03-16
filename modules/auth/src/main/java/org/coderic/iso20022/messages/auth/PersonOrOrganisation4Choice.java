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
 * <p>Clase Java para PersonOrOrganisation4Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonOrOrganisation4Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}LEIIdentifier"/&gt;
 *         &lt;element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}GenericPersonIdentification1"/&gt;
 *         &lt;element name="XcptnId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}PartyExceptionType1Code"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonOrOrganisation4Choice", propOrder = {
    "lei",
    "prsn",
    "xcptnId"
})
public class PersonOrOrganisation4Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "Prsn")
    protected GenericPersonIdentification1 prsn;
    @XmlElement(name = "XcptnId")
    @XmlSchemaType(name = "string")
    protected PartyExceptionType1Code xcptnId;

    /**
     * Obtiene el valor de la propiedad lei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Define el valor de la propiedad lei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Obtiene el valor de la propiedad prsn.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public GenericPersonIdentification1 getPrsn() {
        return prsn;
    }

    /**
     * Define el valor de la propiedad prsn.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public void setPrsn(GenericPersonIdentification1 value) {
        this.prsn = value;
    }

    /**
     * Obtiene el valor de la propiedad xcptnId.
     * 
     * @return
     *     possible object is
     *     {@link PartyExceptionType1Code }
     *     
     */
    public PartyExceptionType1Code getXcptnId() {
        return xcptnId;
    }

    /**
     * Define el valor de la propiedad xcptnId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyExceptionType1Code }
     *     
     */
    public void setXcptnId(PartyExceptionType1Code value) {
        this.xcptnId = value;
    }

}
