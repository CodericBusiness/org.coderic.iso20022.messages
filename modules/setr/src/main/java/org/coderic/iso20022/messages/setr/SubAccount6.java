//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SubAccount6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SubAccount6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Chrtc" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubAccount6", propOrder = {
    "id",
    "nm",
    "chrtc",
    "acctDsgnt"
})
public class SubAccount6 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Chrtc")
    protected String chrtc;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad chrtc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrtc() {
        return chrtc;
    }

    /**
     * Define el valor de la propiedad chrtc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrtc(String value) {
        this.chrtc = value;
    }

    /**
     * Obtiene el valor de la propiedad acctDsgnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Define el valor de la propiedad acctDsgnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDsgnt(String value) {
        this.acctDsgnt = value;
    }

}
