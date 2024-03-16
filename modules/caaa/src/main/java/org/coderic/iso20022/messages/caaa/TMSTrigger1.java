//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMSTrigger1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSTrigger1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TMSCtctLvl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TMSContactLevel1Code"/&gt;
 *         &lt;element name="TMSId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TMSCtctDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ISODateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSTrigger1", propOrder = {
    "tmsCtctLvl",
    "tmsId",
    "tmsCtctDtTm"
})
public class TMSTrigger1 {

    @XmlElement(name = "TMSCtctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel1Code tmsCtctLvl;
    @XmlElement(name = "TMSId")
    protected String tmsId;
    @XmlElement(name = "TMSCtctDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmsCtctDtTm;

    /**
     * Obtiene el valor de la propiedad tmsCtctLvl.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel1Code }
     *     
     */
    public TMSContactLevel1Code getTMSCtctLvl() {
        return tmsCtctLvl;
    }

    /**
     * Define el valor de la propiedad tmsCtctLvl.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel1Code }
     *     
     */
    public void setTMSCtctLvl(TMSContactLevel1Code value) {
        this.tmsCtctLvl = value;
    }

    /**
     * Obtiene el valor de la propiedad tmsId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMSId() {
        return tmsId;
    }

    /**
     * Define el valor de la propiedad tmsId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMSId(String value) {
        this.tmsId = value;
    }

    /**
     * Obtiene el valor de la propiedad tmsCtctDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMSCtctDtTm() {
        return tmsCtctDtTm;
    }

    /**
     * Define el valor de la propiedad tmsCtctDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMSCtctDtTm(XMLGregorianCalendar value) {
        this.tmsCtctDtTm = value;
    }

}
