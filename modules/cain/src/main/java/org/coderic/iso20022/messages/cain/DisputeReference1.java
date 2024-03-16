//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DisputeReference1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DisputeReference1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssgnrNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyType32Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrAssgnrNtty" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DsptId" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}DisputeIdentification1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeReference1", propOrder = {
    "assgnrNtty",
    "othrAssgnrNtty",
    "dsptId"
})
public class DisputeReference1 {

    @XmlElement(name = "AssgnrNtty")
    @XmlSchemaType(name = "string")
    protected PartyType32Code assgnrNtty;
    @XmlElement(name = "OthrAssgnrNtty")
    protected String othrAssgnrNtty;
    @XmlElement(name = "DsptId", required = true)
    protected List<DisputeIdentification1> dsptId;

    /**
     * Obtiene el valor de la propiedad assgnrNtty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType32Code }
     *     
     */
    public PartyType32Code getAssgnrNtty() {
        return assgnrNtty;
    }

    /**
     * Define el valor de la propiedad assgnrNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType32Code }
     *     
     */
    public void setAssgnrNtty(PartyType32Code value) {
        this.assgnrNtty = value;
    }

    /**
     * Obtiene el valor de la propiedad othrAssgnrNtty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrAssgnrNtty() {
        return othrAssgnrNtty;
    }

    /**
     * Define el valor de la propiedad othrAssgnrNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrAssgnrNtty(String value) {
        this.othrAssgnrNtty = value;
    }

    /**
     * Gets the value of the dsptId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dsptId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeIdentification1 }
     * 
     * 
     */
    public List<DisputeIdentification1> getDsptId() {
        if (dsptId == null) {
            dsptId = new ArrayList<DisputeIdentification1>();
        }
        return this.dsptId;
    }

}
