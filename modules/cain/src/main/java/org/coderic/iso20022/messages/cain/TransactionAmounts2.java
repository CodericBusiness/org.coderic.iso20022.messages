//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionAmounts2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionAmounts2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmtQlfr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}TypeOfAmount22Code" minOccurs="0"/&gt;
 *         &lt;element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}TransactionAmount1"/&gt;
 *         &lt;element name="CrdhldrBllgAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Amount15" minOccurs="0"/&gt;
 *         &lt;element name="RcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Amount15" minOccurs="0"/&gt;
 *         &lt;element name="DtldAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}DetailedAmount22" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlTxAmts" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}OriginalTransactionAmount2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmounts2", propOrder = {
    "amtQlfr",
    "txAmt",
    "crdhldrBllgAmt",
    "rcncltnAmt",
    "dtldAmt",
    "orgnlTxAmts"
})
public class TransactionAmounts2 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount22Code amtQlfr;
    @XmlElement(name = "TxAmt", required = true)
    protected TransactionAmount1 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount15 crdhldrBllgAmt;
    @XmlElement(name = "RcncltnAmt")
    protected Amount15 rcncltnAmt;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount22> dtldAmt;
    @XmlElement(name = "OrgnlTxAmts")
    protected OriginalTransactionAmount2 orgnlTxAmts;

    /**
     * Obtiene el valor de la propiedad amtQlfr.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public TypeOfAmount22Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Define el valor de la propiedad amtQlfr.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public void setAmtQlfr(TypeOfAmount22Code value) {
        this.amtQlfr = value;
    }

    /**
     * Obtiene el valor de la propiedad txAmt.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmount1 }
     *     
     */
    public TransactionAmount1 getTxAmt() {
        return txAmt;
    }

    /**
     * Define el valor de la propiedad txAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmount1 }
     *     
     */
    public void setTxAmt(TransactionAmount1 value) {
        this.txAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad crdhldrBllgAmt.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Define el valor de la propiedad crdhldrBllgAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public void setCrdhldrBllgAmt(Amount15 value) {
        this.crdhldrBllgAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad rcncltnAmt.
     * 
     * @return
     *     possible object is
     *     {@link Amount15 }
     *     
     */
    public Amount15 getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Define el valor de la propiedad rcncltnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount15 }
     *     
     */
    public void setRcncltnAmt(Amount15 value) {
        this.rcncltnAmt = value;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtldAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount22 }
     * 
     * 
     */
    public List<DetailedAmount22> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<DetailedAmount22>();
        }
        return this.dtldAmt;
    }

    /**
     * Obtiene el valor de la propiedad orgnlTxAmts.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionAmount2 }
     *     
     */
    public OriginalTransactionAmount2 getOrgnlTxAmts() {
        return orgnlTxAmts;
    }

    /**
     * Define el valor de la propiedad orgnlTxAmts.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionAmount2 }
     *     
     */
    public void setOrgnlTxAmts(OriginalTransactionAmount2 value) {
        this.orgnlTxAmts = value;
    }

}
