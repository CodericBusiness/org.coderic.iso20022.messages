//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:33 PM COT 
//


package org.coderic.iso20022.messages.reda;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemovalTypeAndReason1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemovalTypeAndReason1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmvlTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Removal1Choice"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}GenericIdentification30" minOccurs="0"/&gt;
 *         &lt;element name="ExclsnPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}DateOrDateTimePeriod3Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovalTypeAndReason1", propOrder = {
    "rmvlTp",
    "rsn",
    "exclsnPrd"
})
public class RemovalTypeAndReason1 {

    @XmlElement(name = "RmvlTp", required = true)
    protected Removal1Choice rmvlTp;
    @XmlElement(name = "Rsn")
    protected GenericIdentification30 rsn;
    @XmlElement(name = "ExclsnPrd")
    protected DateOrDateTimePeriod3Choice exclsnPrd;

    /**
     * Obtiene el valor de la propiedad rmvlTp.
     * 
     * @return
     *     possible object is
     *     {@link Removal1Choice }
     *     
     */
    public Removal1Choice getRmvlTp() {
        return rmvlTp;
    }

    /**
     * Define el valor de la propiedad rmvlTp.
     * 
     * @param value
     *     allowed object is
     *     {@link Removal1Choice }
     *     
     */
    public void setRmvlTp(Removal1Choice value) {
        this.rmvlTp = value;
    }

    /**
     * Obtiene el valor de la propiedad rsn.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getRsn() {
        return rsn;
    }

    /**
     * Define el valor de la propiedad rsn.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setRsn(GenericIdentification30 value) {
        this.rsn = value;
    }

    /**
     * Obtiene el valor de la propiedad exclsnPrd.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod3Choice }
     *     
     */
    public DateOrDateTimePeriod3Choice getExclsnPrd() {
        return exclsnPrd;
    }

    /**
     * Define el valor de la propiedad exclsnPrd.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod3Choice }
     *     
     */
    public void setExclsnPrd(DateOrDateTimePeriod3Choice value) {
        this.exclsnPrd = value;
    }

}
