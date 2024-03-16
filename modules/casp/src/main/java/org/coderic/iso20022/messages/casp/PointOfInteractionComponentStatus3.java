//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PointOfInteractionComponentStatus3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionComponentStatus3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}POIComponentStatus1Code" minOccurs="0"/&gt;
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ISODate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentStatus3", propOrder = {
    "vrsnNb",
    "sts",
    "xpryDt"
})
public class PointOfInteractionComponentStatus3 {

    @XmlElement(name = "VrsnNb")
    protected String vrsnNb;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected POIComponentStatus1Code sts;
    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;

    /**
     * Obtiene el valor de la propiedad vrsnNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Define el valor de la propiedad vrsnNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsnNb(String value) {
        this.vrsnNb = value;
    }

    /**
     * Obtiene el valor de la propiedad sts.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentStatus1Code }
     *     
     */
    public POIComponentStatus1Code getSts() {
        return sts;
    }

    /**
     * Define el valor de la propiedad sts.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentStatus1Code }
     *     
     */
    public void setSts(POIComponentStatus1Code value) {
        this.sts = value;
    }

    /**
     * Obtiene el valor de la propiedad xpryDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Define el valor de la propiedad xpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

}
