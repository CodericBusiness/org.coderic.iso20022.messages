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
 * <p>Clase Java para TradeParty1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TradeParty1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}PartyIdentification45"/&gt;
 *         &lt;element name="LglOrg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}LegalOrganisation1" minOccurs="0"/&gt;
 *         &lt;element name="TaxPty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}TaxParty3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeParty1", propOrder = {
    "ptyId",
    "lglOrg",
    "taxPty"
})
public class TradeParty1 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification45 ptyId;
    @XmlElement(name = "LglOrg")
    protected LegalOrganisation1 lglOrg;
    @XmlElement(name = "TaxPty")
    protected List<TaxParty3> taxPty;

    /**
     * Obtiene el valor de la propiedad ptyId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification45 }
     *     
     */
    public PartyIdentification45 getPtyId() {
        return ptyId;
    }

    /**
     * Define el valor de la propiedad ptyId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification45 }
     *     
     */
    public void setPtyId(PartyIdentification45 value) {
        this.ptyId = value;
    }

    /**
     * Obtiene el valor de la propiedad lglOrg.
     * 
     * @return
     *     possible object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public LegalOrganisation1 getLglOrg() {
        return lglOrg;
    }

    /**
     * Define el valor de la propiedad lglOrg.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public void setLglOrg(LegalOrganisation1 value) {
        this.lglOrg = value;
    }

    /**
     * Gets the value of the taxPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the taxPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxParty3 }
     * 
     * 
     */
    public List<TaxParty3> getTaxPty() {
        if (taxPty == null) {
            taxPty = new ArrayList<TaxParty3>();
        }
        return this.taxPty;
    }

}
