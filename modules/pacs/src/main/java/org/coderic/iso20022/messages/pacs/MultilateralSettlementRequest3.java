//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:22 PM COT 
//


package org.coderic.iso20022.messages.pacs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultilateralSettlementRequest3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultilateralSettlementRequest3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Max35Text"/&gt;
 *         &lt;element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Priority3Code" minOccurs="0"/&gt;
 *         &lt;element name="SttlmTmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}SettlementTimeRequest2" minOccurs="0"/&gt;
 *         &lt;element name="SttlmPrty" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Priority3Code" minOccurs="0"/&gt;
 *         &lt;element name="SttlmCycl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="NbOfMvmntRcrds" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="MvmntRcrd" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}MovementRecord2" maxOccurs="unbounded" minOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilateralSettlementRequest3", propOrder = {
    "instrId",
    "instrPrty",
    "sttlmTmReq",
    "sttlmPrty",
    "sttlmCycl",
    "nbOfMvmntRcrds",
    "mvmntRcrd"
})
public class MultilateralSettlementRequest3 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code instrPrty;
    @XmlElement(name = "SttlmTmReq")
    protected SettlementTimeRequest2 sttlmTmReq;
    @XmlElement(name = "SttlmPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code sttlmPrty;
    @XmlElement(name = "SttlmCycl")
    protected String sttlmCycl;
    @XmlElement(name = "NbOfMvmntRcrds")
    protected BigDecimal nbOfMvmntRcrds;
    @XmlElement(name = "MvmntRcrd", required = true)
    protected List<MovementRecord2> mvmntRcrd;

    /**
     * Obtiene el valor de la propiedad instrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Define el valor de la propiedad instrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Obtiene el valor de la propiedad instrPrty.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Define el valor de la propiedad instrPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setInstrPrty(Priority3Code value) {
        this.instrPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmTmReq.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public SettlementTimeRequest2 getSttlmTmReq() {
        return sttlmTmReq;
    }

    /**
     * Define el valor de la propiedad sttlmTmReq.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTimeRequest2 }
     *     
     */
    public void setSttlmTmReq(SettlementTimeRequest2 value) {
        this.sttlmTmReq = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmPrty.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getSttlmPrty() {
        return sttlmPrty;
    }

    /**
     * Define el valor de la propiedad sttlmPrty.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setSttlmPrty(Priority3Code value) {
        this.sttlmPrty = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmCycl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCycl() {
        return sttlmCycl;
    }

    /**
     * Define el valor de la propiedad sttlmCycl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCycl(String value) {
        this.sttlmCycl = value;
    }

    /**
     * Obtiene el valor de la propiedad nbOfMvmntRcrds.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfMvmntRcrds() {
        return nbOfMvmntRcrds;
    }

    /**
     * Define el valor de la propiedad nbOfMvmntRcrds.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfMvmntRcrds(BigDecimal value) {
        this.nbOfMvmntRcrds = value;
    }

    /**
     * Gets the value of the mvmntRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mvmntRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMvmntRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovementRecord2 }
     * 
     * 
     */
    public List<MovementRecord2> getMvmntRcrd() {
        if (mvmntRcrd == null) {
            mvmntRcrd = new ArrayList<MovementRecord2>();
        }
        return this.mvmntRcrd;
    }

}
