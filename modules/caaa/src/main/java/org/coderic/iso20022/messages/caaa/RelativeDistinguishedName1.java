//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RelativeDistinguishedName1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RelativeDistinguishedName1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AttrTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AttributeType1Code"/&gt;
 *         &lt;element name="AttrVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max140Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeDistinguishedName1", propOrder = {
    "attrTp",
    "attrVal"
})
public class RelativeDistinguishedName1 {

    @XmlElement(name = "AttrTp", required = true)
    @XmlSchemaType(name = "string")
    protected AttributeType1Code attrTp;
    @XmlElement(name = "AttrVal", required = true)
    protected String attrVal;

    /**
     * Obtiene el valor de la propiedad attrTp.
     * 
     * @return
     *     possible object is
     *     {@link AttributeType1Code }
     *     
     */
    public AttributeType1Code getAttrTp() {
        return attrTp;
    }

    /**
     * Define el valor de la propiedad attrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeType1Code }
     *     
     */
    public void setAttrTp(AttributeType1Code value) {
        this.attrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad attrVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrVal() {
        return attrVal;
    }

    /**
     * Define el valor de la propiedad attrVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrVal(String value) {
        this.attrVal = value;
    }

}
