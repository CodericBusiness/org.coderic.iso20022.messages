//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CancelledStatusReason12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CancelledStatusReason12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RsnCd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CancelledReason9Choice"/&gt;
 *         &lt;element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}Max210Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelledStatusReason12", propOrder = {
    "rsnCd",
    "addtlRsnInf"
})
public class CancelledStatusReason12 {

    @XmlElement(name = "RsnCd", required = true)
    protected CancelledReason9Choice rsnCd;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Obtiene el valor de la propiedad rsnCd.
     * 
     * @return
     *     possible object is
     *     {@link CancelledReason9Choice }
     *     
     */
    public CancelledReason9Choice getRsnCd() {
        return rsnCd;
    }

    /**
     * Define el valor de la propiedad rsnCd.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledReason9Choice }
     *     
     */
    public void setRsnCd(CancelledReason9Choice value) {
        this.rsnCd = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlRsnInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Define el valor de la propiedad addtlRsnInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

}
