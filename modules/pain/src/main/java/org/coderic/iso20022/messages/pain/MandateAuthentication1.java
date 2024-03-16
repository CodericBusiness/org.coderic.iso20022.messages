//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MandateAuthentication1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MandateAuthentication1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgAuthntcnCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max16Text" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Chanl" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}AuthenticationChannel1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAuthentication1", propOrder = {
    "msgAuthntcnCd",
    "dt",
    "chanl"
})
public class MandateAuthentication1 {

    @XmlElement(name = "MsgAuthntcnCd")
    protected String msgAuthntcnCd;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Chanl")
    protected AuthenticationChannel1Choice chanl;

    /**
     * Obtiene el valor de la propiedad msgAuthntcnCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgAuthntcnCd() {
        return msgAuthntcnCd;
    }

    /**
     * Define el valor de la propiedad msgAuthntcnCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgAuthntcnCd(String value) {
        this.msgAuthntcnCd = value;
    }

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Obtiene el valor de la propiedad chanl.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationChannel1Choice }
     *     
     */
    public AuthenticationChannel1Choice getChanl() {
        return chanl;
    }

    /**
     * Define el valor de la propiedad chanl.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationChannel1Choice }
     *     
     */
    public void setChanl(AuthenticationChannel1Choice value) {
        this.chanl = value;
    }

}
