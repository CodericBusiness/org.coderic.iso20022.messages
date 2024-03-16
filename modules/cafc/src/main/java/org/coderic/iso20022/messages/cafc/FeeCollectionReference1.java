//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeeCollectionReference1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeeCollectionReference1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssgnrNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}PartyType32Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrAssgnrNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="FeeColltnId" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}FeeCollectionIdentification1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeCollectionReference1", propOrder = {
    "assgnrNtty",
    "othrAssgnrNtty",
    "feeColltnId"
})
public class FeeCollectionReference1 {

    @XmlElement(name = "AssgnrNtty")
    @XmlSchemaType(name = "string")
    protected PartyType32Code assgnrNtty;
    @XmlElement(name = "OthrAssgnrNtty")
    protected String othrAssgnrNtty;
    @XmlElement(name = "FeeColltnId", required = true)
    protected List<FeeCollectionIdentification1> feeColltnId;

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
     * Gets the value of the feeColltnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the feeColltnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeColltnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeCollectionIdentification1 }
     * 
     * 
     */
    public List<FeeCollectionIdentification1> getFeeColltnId() {
        if (feeColltnId == null) {
            feeColltnId = new ArrayList<FeeCollectionIdentification1>();
        }
        return this.feeColltnId;
    }

}
