//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Traceability9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Traceability9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RlayId" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}GenericIdentification183"/&gt;
 *         &lt;element name="TracDtTmIn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="TracDtTmOut" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}ISODateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability9", propOrder = {
    "rlayId",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability9 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification183 rlayId;
    @XmlElement(name = "TracDtTmIn")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmIn;
    @XmlElement(name = "TracDtTmOut")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmOut;

    /**
     * Obtiene el valor de la propiedad rlayId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification183 }
     *     
     */
    public GenericIdentification183 getRlayId() {
        return rlayId;
    }

    /**
     * Define el valor de la propiedad rlayId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification183 }
     *     
     */
    public void setRlayId(GenericIdentification183 value) {
        this.rlayId = value;
    }

    /**
     * Obtiene el valor de la propiedad tracDtTmIn.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmIn() {
        return tracDtTmIn;
    }

    /**
     * Define el valor de la propiedad tracDtTmIn.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTracDtTmIn(XMLGregorianCalendar value) {
        this.tracDtTmIn = value;
    }

    /**
     * Obtiene el valor de la propiedad tracDtTmOut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmOut() {
        return tracDtTmOut;
    }

    /**
     * Define el valor de la propiedad tracDtTmOut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTracDtTmOut(XMLGregorianCalendar value) {
        this.tracDtTmOut = value;
    }

}
