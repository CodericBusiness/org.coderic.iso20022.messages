//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MemoryCharacteristics1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MemoryCharacteristics1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *         &lt;element name="TtlSz" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}DecimalNumber"/&gt;
 *         &lt;element name="FreeSz" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}DecimalNumber"/&gt;
 *         &lt;element name="Unit" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}MemoryUnit1Code"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemoryCharacteristics1", propOrder = {
    "id",
    "ttlSz",
    "freeSz",
    "unit"
})
public class MemoryCharacteristics1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "TtlSz", required = true)
    protected BigDecimal ttlSz;
    @XmlElement(name = "FreeSz", required = true)
    protected BigDecimal freeSz;
    @XmlElement(name = "Unit", required = true)
    @XmlSchemaType(name = "string")
    protected MemoryUnit1Code unit;

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
     * Obtiene el valor de la propiedad ttlSz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlSz() {
        return ttlSz;
    }

    /**
     * Define el valor de la propiedad ttlSz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlSz(BigDecimal value) {
        this.ttlSz = value;
    }

    /**
     * Obtiene el valor de la propiedad freeSz.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFreeSz() {
        return freeSz;
    }

    /**
     * Define el valor de la propiedad freeSz.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFreeSz(BigDecimal value) {
        this.freeSz = value;
    }

    /**
     * Obtiene el valor de la propiedad unit.
     * 
     * @return
     *     possible object is
     *     {@link MemoryUnit1Code }
     *     
     */
    public MemoryUnit1Code getUnit() {
        return unit;
    }

    /**
     * Define el valor de la propiedad unit.
     * 
     * @param value
     *     allowed object is
     *     {@link MemoryUnit1Code }
     *     
     */
    public void setUnit(MemoryUnit1Code value) {
        this.unit = value;
    }

}
