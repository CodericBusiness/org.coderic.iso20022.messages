//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CommunicationCharacteristics3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CommunicationCharacteristics3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}POICommunicationType2Code"/&gt;
 *         &lt;element name="RmotPty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PartyType7Code" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Actv" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationCharacteristics3", propOrder = {
    "comTp",
    "rmotPty",
    "actv"
})
public class CommunicationCharacteristics3 {

    @XmlElement(name = "ComTp", required = true)
    @XmlSchemaType(name = "string")
    protected POICommunicationType2Code comTp;
    @XmlElement(name = "RmotPty", required = true)
    @XmlSchemaType(name = "string")
    protected List<PartyType7Code> rmotPty;
    @XmlElement(name = "Actv")
    protected boolean actv;

    /**
     * Obtiene el valor de la propiedad comTp.
     * 
     * @return
     *     possible object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public POICommunicationType2Code getComTp() {
        return comTp;
    }

    /**
     * Define el valor de la propiedad comTp.
     * 
     * @param value
     *     allowed object is
     *     {@link POICommunicationType2Code }
     *     
     */
    public void setComTp(POICommunicationType2Code value) {
        this.comTp = value;
    }

    /**
     * Gets the value of the rmotPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rmotPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmotPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType7Code }
     * 
     * 
     */
    public List<PartyType7Code> getRmotPty() {
        if (rmotPty == null) {
            rmotPty = new ArrayList<PartyType7Code>();
        }
        return this.rmotPty;
    }

    /**
     * Obtiene el valor de la propiedad actv.
     * 
     */
    public boolean isActv() {
        return actv;
    }

    /**
     * Define el valor de la propiedad actv.
     * 
     */
    public void setActv(boolean value) {
        this.actv = value;
    }

}
