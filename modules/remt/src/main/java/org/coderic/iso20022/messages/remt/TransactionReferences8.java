//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:36 PM COT 
//


package org.coderic.iso20022.messages.remt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionReferences8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionReferences8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text"/&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}UUIDv4Identifier" minOccurs="0"/&gt;
 *         &lt;element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}PartyIdentification272" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReferences8", propOrder = {
    "pmtInfId",
    "instrId",
    "endToEndId",
    "txId",
    "uetr",
    "mndtId",
    "cdtrSchmeId"
})
public class TransactionReferences8 {

    @XmlElement(name = "PmtInfId")
    protected String pmtInfId;
    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "EndToEndId", required = true)
    protected String endToEndId;
    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "UETR")
    protected String uetr;
    @XmlElement(name = "MndtId")
    protected String mndtId;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification272 cdtrSchmeId;

    /**
     * Obtiene el valor de la propiedad pmtInfId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInfId() {
        return pmtInfId;
    }

    /**
     * Define el valor de la propiedad pmtInfId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtInfId(String value) {
        this.pmtInfId = value;
    }

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
     * Obtiene el valor de la propiedad endToEndId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Define el valor de la propiedad endToEndId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad uetr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * Define el valor de la propiedad uetr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUETR(String value) {
        this.uetr = value;
    }

    /**
     * Obtiene el valor de la propiedad mndtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Define el valor de la propiedad mndtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrSchmeId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Define el valor de la propiedad cdtrSchmeId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setCdtrSchmeId(PartyIdentification272 value) {
        this.cdtrSchmeId = value;
    }

}
