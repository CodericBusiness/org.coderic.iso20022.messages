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
 * <p>Clase Java para OrderRestriction1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderRestriction1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrdrRstrctnCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderRestrictionType1Code"/&gt;
 *         &lt;element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}GenericIdentification30"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRestriction1Choice", propOrder = {
    "ordrRstrctnCd",
    "prtry"
})
public class OrderRestriction1Choice {

    @XmlElement(name = "OrdrRstrctnCd")
    @XmlSchemaType(name = "string")
    protected OrderRestrictionType1Code ordrRstrctnCd;
    @XmlElement(name = "Prtry")
    protected GenericIdentification30 prtry;

    /**
     * Obtiene el valor de la propiedad ordrRstrctnCd.
     * 
     * @return
     *     possible object is
     *     {@link OrderRestrictionType1Code }
     *     
     */
    public OrderRestrictionType1Code getOrdrRstrctnCd() {
        return ordrRstrctnCd;
    }

    /**
     * Define el valor de la propiedad ordrRstrctnCd.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRestrictionType1Code }
     *     
     */
    public void setOrdrRstrctnCd(OrderRestrictionType1Code value) {
        this.ordrRstrctnCd = value;
    }

    /**
     * Obtiene el valor de la propiedad prtry.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtry() {
        return prtry;
    }

    /**
     * Define el valor de la propiedad prtry.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtry(GenericIdentification30 value) {
        this.prtry = value;
    }

}
