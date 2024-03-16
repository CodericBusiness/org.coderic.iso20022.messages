//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderReport2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderReport2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}NewOrderReport2"/&gt;
 *         &lt;element name="Cxl" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}CancelOrderReport1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderReport2Choice", propOrder = {
    "_new",
    "cxl"
})
public class OrderReport2Choice {

    @XmlElement(name = "New")
    protected NewOrderReport2 _new;
    @XmlElement(name = "Cxl")
    protected CancelOrderReport1 cxl;

    /**
     * Obtiene el valor de la propiedad new.
     * 
     * @return
     *     possible object is
     *     {@link NewOrderReport2 }
     *     
     */
    public NewOrderReport2 getNew() {
        return _new;
    }

    /**
     * Define el valor de la propiedad new.
     * 
     * @param value
     *     allowed object is
     *     {@link NewOrderReport2 }
     *     
     */
    public void setNew(NewOrderReport2 value) {
        this._new = value;
    }

    /**
     * Obtiene el valor de la propiedad cxl.
     * 
     * @return
     *     possible object is
     *     {@link CancelOrderReport1 }
     *     
     */
    public CancelOrderReport1 getCxl() {
        return cxl;
    }

    /**
     * Define el valor de la propiedad cxl.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelOrderReport1 }
     *     
     */
    public void setCxl(CancelOrderReport1 value) {
        this.cxl = value;
    }

}
