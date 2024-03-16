//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SingleQualifiedPartyIdentification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SingleQualifiedPartyIdentification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasePty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}TradeParty1"/&gt;
 *         &lt;element name="RltvIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleQualifiedPartyIdentification1", propOrder = {
    "basePty",
    "rltvIdr"
})
public class SingleQualifiedPartyIdentification1 {

    @XmlElement(name = "BasePty", required = true)
    protected TradeParty1 basePty;
    @XmlElement(name = "RltvIdr")
    protected List<String> rltvIdr;

    /**
     * Obtiene el valor de la propiedad basePty.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty1 }
     *     
     */
    public TradeParty1 getBasePty() {
        return basePty;
    }

    /**
     * Define el valor de la propiedad basePty.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty1 }
     *     
     */
    public void setBasePty(TradeParty1 value) {
        this.basePty = value;
    }

    /**
     * Gets the value of the rltvIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltvIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltvIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRltvIdr() {
        if (rltvIdr == null) {
            rltvIdr = new ArrayList<String>();
        }
        return this.rltvIdr;
    }

}
