//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionLifeCycleIdentification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionLifeCycleIdentification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact15Text"/&gt;
 *         &lt;element name="AuthstnSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PresntmntSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PresntmntSeqCnt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnTkn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLifeCycleIdentification1", propOrder = {
    "id",
    "authstnSeqNb",
    "presntmntSeqNb",
    "presntmntSeqCnt",
    "authntcnTkn"
})
public class TransactionLifeCycleIdentification1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AuthstnSeqNb")
    protected String authstnSeqNb;
    @XmlElement(name = "PresntmntSeqNb")
    protected String presntmntSeqNb;
    @XmlElement(name = "PresntmntSeqCnt")
    protected String presntmntSeqCnt;
    @XmlElement(name = "AuthntcnTkn")
    protected String authntcnTkn;

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
     * Obtiene el valor de la propiedad authstnSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnSeqNb() {
        return authstnSeqNb;
    }

    /**
     * Define el valor de la propiedad authstnSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthstnSeqNb(String value) {
        this.authstnSeqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad presntmntSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqNb() {
        return presntmntSeqNb;
    }

    /**
     * Define el valor de la propiedad presntmntSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntSeqNb(String value) {
        this.presntmntSeqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad presntmntSeqCnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqCnt() {
        return presntmntSeqCnt;
    }

    /**
     * Define el valor de la propiedad presntmntSeqCnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntSeqCnt(String value) {
        this.presntmntSeqCnt = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcnTkn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTkn() {
        return authntcnTkn;
    }

    /**
     * Define el valor de la propiedad authntcnTkn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthntcnTkn(String value) {
        this.authntcnTkn = value;
    }

}
