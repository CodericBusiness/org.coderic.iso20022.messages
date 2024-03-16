//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatePeriod5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatePeriod5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CurValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ISODate"/&gt;
 *         &lt;element name="ReqdValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ISODate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriod5", propOrder = {
    "curValDt",
    "reqdValDt"
})
public class DatePeriod5 {

    @XmlElement(name = "CurValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar curValDt;
    @XmlElement(name = "ReqdValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdValDt;

    /**
     * Obtiene el valor de la propiedad curValDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurValDt() {
        return curValDt;
    }

    /**
     * Define el valor de la propiedad curValDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurValDt(XMLGregorianCalendar value) {
        this.curValDt = value;
    }

    /**
     * Obtiene el valor de la propiedad reqdValDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdValDt() {
        return reqdValDt;
    }

    /**
     * Define el valor de la propiedad reqdValDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdValDt(XMLGregorianCalendar value) {
        this.reqdValDt = value;
    }

}
