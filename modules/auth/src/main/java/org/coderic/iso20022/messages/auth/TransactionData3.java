//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionData3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionData3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice4Choice" minOccurs="0"/&gt;
 *         &lt;element name="TraddQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *         &lt;element name="PssvOrAggrssvInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}PassiveOrAgressiveType1Code" minOccurs="0"/&gt;
 *         &lt;element name="StrtgyLkdOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max50Text" minOccurs="0"/&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max52Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionData3", propOrder = {
    "txPric",
    "traddQty",
    "pssvOrAggrssvInd",
    "strtgyLkdOrdrId",
    "txId"
})
public class TransactionData3 {

    @XmlElement(name = "TxPric")
    protected SecuritiesTransactionPrice4Choice txPric;
    @XmlElement(name = "TraddQty")
    protected FinancialInstrumentQuantity25Choice traddQty;
    @XmlElement(name = "PssvOrAggrssvInd")
    @XmlSchemaType(name = "string")
    protected PassiveOrAgressiveType1Code pssvOrAggrssvInd;
    @XmlElement(name = "StrtgyLkdOrdrId")
    protected String strtgyLkdOrdrId;
    @XmlElement(name = "TxId")
    protected String txId;

    /**
     * Obtiene el valor de la propiedad txPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public SecuritiesTransactionPrice4Choice getTxPric() {
        return txPric;
    }

    /**
     * Define el valor de la propiedad txPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice4Choice }
     *     
     */
    public void setTxPric(SecuritiesTransactionPrice4Choice value) {
        this.txPric = value;
    }

    /**
     * Obtiene el valor de la propiedad traddQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getTraddQty() {
        return traddQty;
    }

    /**
     * Define el valor de la propiedad traddQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setTraddQty(FinancialInstrumentQuantity25Choice value) {
        this.traddQty = value;
    }

    /**
     * Obtiene el valor de la propiedad pssvOrAggrssvInd.
     * 
     * @return
     *     possible object is
     *     {@link PassiveOrAgressiveType1Code }
     *     
     */
    public PassiveOrAgressiveType1Code getPssvOrAggrssvInd() {
        return pssvOrAggrssvInd;
    }

    /**
     * Define el valor de la propiedad pssvOrAggrssvInd.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveOrAgressiveType1Code }
     *     
     */
    public void setPssvOrAggrssvInd(PassiveOrAgressiveType1Code value) {
        this.pssvOrAggrssvInd = value;
    }

    /**
     * Obtiene el valor de la propiedad strtgyLkdOrdrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtgyLkdOrdrId() {
        return strtgyLkdOrdrId;
    }

    /**
     * Define el valor de la propiedad strtgyLkdOrdrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtgyLkdOrdrId(String value) {
        this.strtgyLkdOrdrId = value;
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

}
