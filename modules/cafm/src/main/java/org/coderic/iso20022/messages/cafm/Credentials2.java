//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Credentials2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Credentials2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdCd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Identification3Code"/&gt;
 *         &lt;element name="OthrIdCd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="IdVal" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max70Text"/&gt;
 *         &lt;element name="IdXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOYearMonth" minOccurs="0"/&gt;
 *         &lt;element name="AssgnrAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Authority1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credentials2", propOrder = {
    "idCd",
    "othrIdCd",
    "idVal",
    "idXpryDt",
    "assgnrAuthrty"
})
public class Credentials2 {

    @XmlElement(name = "IdCd", required = true)
    @XmlSchemaType(name = "string")
    protected Identification3Code idCd;
    @XmlElement(name = "OthrIdCd")
    protected String othrIdCd;
    @XmlElement(name = "IdVal", required = true)
    protected String idVal;
    @XmlElement(name = "IdXpryDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar idXpryDt;
    @XmlElement(name = "AssgnrAuthrty")
    protected Authority1 assgnrAuthrty;

    /**
     * Obtiene el valor de la propiedad idCd.
     * 
     * @return
     *     possible object is
     *     {@link Identification3Code }
     *     
     */
    public Identification3Code getIdCd() {
        return idCd;
    }

    /**
     * Define el valor de la propiedad idCd.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification3Code }
     *     
     */
    public void setIdCd(Identification3Code value) {
        this.idCd = value;
    }

    /**
     * Obtiene el valor de la propiedad othrIdCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrIdCd() {
        return othrIdCd;
    }

    /**
     * Define el valor de la propiedad othrIdCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrIdCd(String value) {
        this.othrIdCd = value;
    }

    /**
     * Obtiene el valor de la propiedad idVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVal() {
        return idVal;
    }

    /**
     * Define el valor de la propiedad idVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVal(String value) {
        this.idVal = value;
    }

    /**
     * Obtiene el valor de la propiedad idXpryDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdXpryDt() {
        return idXpryDt;
    }

    /**
     * Define el valor de la propiedad idXpryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdXpryDt(XMLGregorianCalendar value) {
        this.idXpryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad assgnrAuthrty.
     * 
     * @return
     *     possible object is
     *     {@link Authority1 }
     *     
     */
    public Authority1 getAssgnrAuthrty() {
        return assgnrAuthrty;
    }

    /**
     * Define el valor de la propiedad assgnrAuthrty.
     * 
     * @param value
     *     allowed object is
     *     {@link Authority1 }
     *     
     */
    public void setAssgnrAuthrty(Authority1 value) {
        this.assgnrAuthrty = value;
    }

}
