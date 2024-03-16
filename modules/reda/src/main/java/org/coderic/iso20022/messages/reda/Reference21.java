//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:33 PM COT 
//


package org.coderic.iso20022.messages.reda;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Reference21 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Reference21"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SndrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RcvrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SndrCollCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RcvrCollCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max52Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference21", propOrder = {
    "sndrCollTxId",
    "rcvrCollTxId",
    "sndrCollCtrctId",
    "rcvrCollCtrctId",
    "cmonTxId"
})
public class Reference21 {

    @XmlElement(name = "SndrCollTxId")
    protected String sndrCollTxId;
    @XmlElement(name = "RcvrCollTxId")
    protected String rcvrCollTxId;
    @XmlElement(name = "SndrCollCtrctId")
    protected String sndrCollCtrctId;
    @XmlElement(name = "RcvrCollCtrctId")
    protected String rcvrCollCtrctId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;

    /**
     * Obtiene el valor de la propiedad sndrCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCollTxId() {
        return sndrCollTxId;
    }

    /**
     * Define el valor de la propiedad sndrCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrCollTxId(String value) {
        this.sndrCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvrCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCollTxId() {
        return rcvrCollTxId;
    }

    /**
     * Define el valor de la propiedad rcvrCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrCollTxId(String value) {
        this.rcvrCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad sndrCollCtrctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrCollCtrctId() {
        return sndrCollCtrctId;
    }

    /**
     * Define el valor de la propiedad sndrCollCtrctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrCollCtrctId(String value) {
        this.sndrCollCtrctId = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvrCollCtrctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrCollCtrctId() {
        return rcvrCollCtrctId;
    }

    /**
     * Define el valor de la propiedad rcvrCollCtrctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrCollCtrctId(String value) {
        this.rcvrCollCtrctId = value;
    }

    /**
     * Obtiene el valor de la propiedad cmonTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Define el valor de la propiedad cmonTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

}
