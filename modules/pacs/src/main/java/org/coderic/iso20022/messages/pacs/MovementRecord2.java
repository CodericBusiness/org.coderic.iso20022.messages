//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:22 PM COT 
//


package org.coderic.iso20022.messages.pacs;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MovementRecord2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MovementRecord2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Max35Text"/&gt;
 *         &lt;element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}AmountAndDirection5"/&gt;
 *         &lt;element name="SttlmAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="SttlmAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="Ptcpt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="PtcptAcct" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MovementRecord2", propOrder = {
    "id",
    "seqNb",
    "amt",
    "sttlmAgt",
    "sttlmAgtAcct",
    "ptcpt",
    "ptcptAcct",
    "ref"
})
public class MovementRecord2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection5 amt;
    @XmlElement(name = "SttlmAgt")
    protected PartyIdentification272 sttlmAgt;
    @XmlElement(name = "SttlmAgtAcct")
    protected CashAccount40 sttlmAgtAcct;
    @XmlElement(name = "Ptcpt")
    protected PartyIdentification272 ptcpt;
    @XmlElement(name = "PtcptAcct")
    protected CashAccount40 ptcptAcct;
    @XmlElement(name = "Ref")
    protected String ref;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad seqNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Define el valor de la propiedad seqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setAmt(AmountAndDirection5 value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmAgt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getSttlmAgt() {
        return sttlmAgt;
    }

    /**
     * Define el valor de la propiedad sttlmAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setSttlmAgt(PartyIdentification272 value) {
        this.sttlmAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmAgtAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getSttlmAgtAcct() {
        return sttlmAgtAcct;
    }

    /**
     * Define el valor de la propiedad sttlmAgtAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setSttlmAgtAcct(CashAccount40 value) {
        this.sttlmAgtAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad ptcpt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getPtcpt() {
        return ptcpt;
    }

    /**
     * Define el valor de la propiedad ptcpt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setPtcpt(PartyIdentification272 value) {
        this.ptcpt = value;
    }

    /**
     * Obtiene el valor de la propiedad ptcptAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPtcptAcct() {
        return ptcptAcct;
    }

    /**
     * Define el valor de la propiedad ptcptAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setPtcptAcct(CashAccount40 value) {
        this.ptcptAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
