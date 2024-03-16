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
 * <p>Clase Java para DateFormat11Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateFormat11Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DateAndDateTimeChoice"/&gt;
 *         &lt;element name="DtCd" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DateCode3Choice"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat11Choice", propOrder = {
    "dt",
    "dtCd"
})
public class DateFormat11Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTimeChoice dt;
    @XmlElement(name = "DtCd")
    protected DateCode3Choice dtCd;

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDt() {
        return dt;
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setDt(DateAndDateTimeChoice value) {
        this.dt = value;
    }

    /**
     * Obtiene el valor de la propiedad dtCd.
     * 
     * @return
     *     possible object is
     *     {@link DateCode3Choice }
     *     
     */
    public DateCode3Choice getDtCd() {
        return dtCd;
    }

    /**
     * Define el valor de la propiedad dtCd.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCode3Choice }
     *     
     */
    public void setDtCd(DateCode3Choice value) {
        this.dtCd = value;
    }

}
