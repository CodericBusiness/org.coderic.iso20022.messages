//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingNotificationParties1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancingNotificationParties1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NtifngPty" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;element name="NtfctnRcvr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;element name="AckRcvr" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingNotificationParties1", propOrder = {
    "ntifngPty",
    "ntfctnRcvr",
    "ackRcvr"
})
public class FinancingNotificationParties1 {

    @XmlElement(name = "NtifngPty", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ntifngPty;
    @XmlElement(name = "NtfctnRcvr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ntfctnRcvr;
    @XmlElementRef(name = "AckRcvr", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> ackRcvr;

    /**
     * Obtiene el valor de la propiedad ntifngPty.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Define el valor de la propiedad ntifngPty.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNtifngPty(Object value) {
        this.ntifngPty = value;
    }

    /**
     * Obtiene el valor de la propiedad ntfctnRcvr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNtfctnRcvr() {
        return ntfctnRcvr;
    }

    /**
     * Define el valor de la propiedad ntfctnRcvr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNtfctnRcvr(Object value) {
        this.ntfctnRcvr = value;
    }

    /**
     * Gets the value of the ackRcvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ackRcvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAckRcvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAckRcvr() {
        if (ackRcvr == null) {
            ackRcvr = new ArrayList<JAXBElement<Object>>();
        }
        return this.ackRcvr;
    }

}
