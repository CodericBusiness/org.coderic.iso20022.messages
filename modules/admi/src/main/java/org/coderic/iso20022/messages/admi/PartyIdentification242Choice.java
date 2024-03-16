//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:51 PM COT 
//


package org.coderic.iso20022.messages.admi;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentification242Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification242Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}NameAndAddress8"/&gt;
 *         &lt;element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}PartyIdentification265"/&gt;
 *         &lt;element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}PartyIdentification266"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification242Choice", propOrder = {
    "nmAndAdr",
    "anyBIC",
    "ptyId"
})
public class PartyIdentification242Choice {

    @XmlElement(name = "NmAndAdr")
    protected NameAndAddress8 nmAndAdr;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification265 anyBIC;
    @XmlElement(name = "PtyId")
    protected PartyIdentification266 ptyId;

    /**
     * Obtiene el valor de la propiedad nmAndAdr.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress8 }
     *     
     */
    public NameAndAddress8 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Define el valor de la propiedad nmAndAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress8 }
     *     
     */
    public void setNmAndAdr(NameAndAddress8 value) {
        this.nmAndAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad anyBIC.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification265 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Define el valor de la propiedad anyBIC.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification265 }
     *     
     */
    public void setAnyBIC(PartyIdentification265 value) {
        this.anyBIC = value;
    }

    /**
     * Obtiene el valor de la propiedad ptyId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification266 }
     *     
     */
    public PartyIdentification266 getPtyId() {
        return ptyId;
    }

    /**
     * Define el valor de la propiedad ptyId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification266 }
     *     
     */
    public void setPtyId(PartyIdentification266 value) {
        this.ptyId = value;
    }

}
