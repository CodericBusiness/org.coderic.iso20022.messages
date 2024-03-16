//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DateFormat58Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateFormat58Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DtOrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}DateAndDateTime2Choice"/&gt;
 *         &lt;element name="DtCd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}DateType1Code"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat58Choice", propOrder = {
    "dtOrDtTm",
    "dtCd"
})
public class DateFormat58Choice {

    @XmlElement(name = "DtOrDtTm")
    protected DateAndDateTime2Choice dtOrDtTm;
    @XmlElement(name = "DtCd")
    @XmlSchemaType(name = "string")
    protected DateType1Code dtCd;

    /**
     * Obtiene el valor de la propiedad dtOrDtTm.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDtOrDtTm() {
        return dtOrDtTm;
    }

    /**
     * Define el valor de la propiedad dtOrDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDtOrDtTm(DateAndDateTime2Choice value) {
        this.dtOrDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad dtCd.
     * 
     * @return
     *     possible object is
     *     {@link DateType1Code }
     *     
     */
    public DateType1Code getDtCd() {
        return dtCd;
    }

    /**
     * Define el valor de la propiedad dtCd.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType1Code }
     *     
     */
    public void setDtCd(DateType1Code value) {
        this.dtCd = value;
    }

}
