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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionContext10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionContext10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardPrgrmmApld" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardProgrammeMode3" minOccurs="0"/&gt;
 *         &lt;element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Jurisdiction2" minOccurs="0"/&gt;
 *         &lt;element name="SttlmSvc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}SettlementService4" minOccurs="0"/&gt;
 *         &lt;element name="Rcncltn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Reconciliation3" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionContext10", propOrder = {
    "cardPrgrmmApld",
    "jursdctn",
    "sttlmSvc",
    "rcncltn",
    "addtlData"
})
public class TransactionContext10 {

    @XmlElement(name = "CardPrgrmmApld")
    protected CardProgrammeMode3 cardPrgrmmApld;
    @XmlElement(name = "Jursdctn")
    protected Jurisdiction2 jursdctn;
    @XmlElement(name = "SttlmSvc")
    protected SettlementService4 sttlmSvc;
    @XmlElement(name = "Rcncltn")
    protected Reconciliation3 rcncltn;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad cardPrgrmmApld.
     * 
     * @return
     *     possible object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public CardProgrammeMode3 getCardPrgrmmApld() {
        return cardPrgrmmApld;
    }

    /**
     * Define el valor de la propiedad cardPrgrmmApld.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProgrammeMode3 }
     *     
     */
    public void setCardPrgrmmApld(CardProgrammeMode3 value) {
        this.cardPrgrmmApld = value;
    }

    /**
     * Obtiene el valor de la propiedad jursdctn.
     * 
     * @return
     *     possible object is
     *     {@link Jurisdiction2 }
     *     
     */
    public Jurisdiction2 getJursdctn() {
        return jursdctn;
    }

    /**
     * Define el valor de la propiedad jursdctn.
     * 
     * @param value
     *     allowed object is
     *     {@link Jurisdiction2 }
     *     
     */
    public void setJursdctn(Jurisdiction2 value) {
        this.jursdctn = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmSvc.
     * 
     * @return
     *     possible object is
     *     {@link SettlementService4 }
     *     
     */
    public SettlementService4 getSttlmSvc() {
        return sttlmSvc;
    }

    /**
     * Define el valor de la propiedad sttlmSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementService4 }
     *     
     */
    public void setSttlmSvc(SettlementService4 value) {
        this.sttlmSvc = value;
    }

    /**
     * Obtiene el valor de la propiedad rcncltn.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation3 }
     *     
     */
    public Reconciliation3 getRcncltn() {
        return rcncltn;
    }

    /**
     * Define el valor de la propiedad rcncltn.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation3 }
     *     
     */
    public void setRcncltn(Reconciliation3 value) {
        this.rcncltn = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
    }

}
