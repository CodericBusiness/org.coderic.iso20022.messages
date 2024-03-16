//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Traceability4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Traceability4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RlayId" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}GenericIdentification77"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TracDtTmIn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ISODateTime"/&gt;
 *         &lt;element name="TracDtTmOut" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ISODateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability4", propOrder = {
    "rlayId",
    "seqNb",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability4 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification77 rlayId;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "TracDtTmIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmIn;
    @XmlElement(name = "TracDtTmOut", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmOut;

    /**
     * Obtiene el valor de la propiedad rlayId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification77 }
     *     
     */
    public GenericIdentification77 getRlayId() {
        return rlayId;
    }

    /**
     * Define el valor de la propiedad rlayId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification77 }
     *     
     */
    public void setRlayId(GenericIdentification77 value) {
        this.rlayId = value;
    }

    /**
     * Obtiene el valor de la propiedad seqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Define el valor de la propiedad seqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
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
