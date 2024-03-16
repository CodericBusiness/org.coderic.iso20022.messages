//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMCommandIdentification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMCommandIdentification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orgn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Prcr" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandIdentification1", propOrder = {
    "orgn",
    "ref",
    "prcr"
})
public class ATMCommandIdentification1 {

    @XmlElement(name = "Orgn")
    protected String orgn;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Prcr")
    protected String prcr;

    /**
     * Obtiene el valor de la propiedad orgn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgn() {
        return orgn;
    }

    /**
     * Define el valor de la propiedad orgn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgn(String value) {
        this.orgn = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad prcr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcr() {
        return prcr;
    }

    /**
     * Define el valor de la propiedad prcr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcr(String value) {
        this.prcr = value;
    }

}
