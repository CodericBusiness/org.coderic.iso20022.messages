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
 * <p>Clase Java para DateOrDateTimePeriod3Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateOrDateTimePeriod3Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Period4Choice"/&gt;
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Period8Choice"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriod3Choice", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriod3Choice {

    @XmlElement(name = "Dt")
    protected Period4Choice dt;
    @XmlElement(name = "DtTm")
    protected Period8Choice dtTm;

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getDt() {
        return dt;
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setDt(Period4Choice value) {
        this.dt = value;
    }

    /**
     * Obtiene el valor de la propiedad dtTm.
     * 
     * @return
     *     possible object is
     *     {@link Period8Choice }
     *     
     */
    public Period8Choice getDtTm() {
        return dtTm;
    }

    /**
     * Define el valor de la propiedad dtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link Period8Choice }
     *     
     */
    public void setDtTm(Period8Choice value) {
        this.dtTm = value;
    }

}
