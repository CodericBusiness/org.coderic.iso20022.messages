//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DateFormat42Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DateFormat42Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="YrMnth" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}ISOYearMonth"/&gt;
 *         &lt;element name="YrMnthDay" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}ISODate"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat42Choice", propOrder = {
    "yrMnth",
    "yrMnthDay"
})
public class DateFormat42Choice {

    @XmlElement(name = "YrMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar yrMnth;
    @XmlElement(name = "YrMnthDay")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar yrMnthDay;

    /**
     * Obtiene el valor de la propiedad yrMnth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrMnth() {
        return yrMnth;
    }

    /**
     * Define el valor de la propiedad yrMnth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYrMnth(XMLGregorianCalendar value) {
        this.yrMnth = value;
    }

    /**
     * Obtiene el valor de la propiedad yrMnthDay.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYrMnthDay() {
        return yrMnthDay;
    }

    /**
     * Define el valor de la propiedad yrMnthDay.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYrMnthDay(XMLGregorianCalendar value) {
        this.yrMnthDay = value;
    }

}
