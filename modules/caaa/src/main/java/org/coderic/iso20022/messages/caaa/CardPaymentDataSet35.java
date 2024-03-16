//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardPaymentDataSet35 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardPaymentDataSet35"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxSeqCntr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max9NumericText"/&gt;
 *         &lt;element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ResponseType10"/&gt;
 *         &lt;element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentEnvironment80"/&gt;
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentTransactionAdviceResponse5"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet35", propOrder = {
    "txSeqCntr",
    "txRspn",
    "envt",
    "tx"
})
public class CardPaymentDataSet35 {

    @XmlElement(name = "TxSeqCntr", required = true)
    protected String txSeqCntr;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType10 txRspn;
    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment80 envt;
    @XmlElement(name = "Tx", required = true)
    protected CardPaymentTransactionAdviceResponse5 tx;

    /**
     * Obtiene el valor de la propiedad txSeqCntr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxSeqCntr() {
        return txSeqCntr;
    }

    /**
     * Define el valor de la propiedad txSeqCntr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxSeqCntr(String value) {
        this.txSeqCntr = value;
    }

    /**
     * Obtiene el valor de la propiedad txRspn.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getTxRspn() {
        return txRspn;
    }

    /**
     * Define el valor de la propiedad txRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public void setTxRspn(ResponseType10 value) {
        this.txRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad envt.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public CardPaymentEnvironment80 getEnvt() {
        return envt;
    }

    /**
     * Define el valor de la propiedad envt.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment80 }
     *     
     */
    public void setEnvt(CardPaymentEnvironment80 value) {
        this.envt = value;
    }

    /**
     * Obtiene el valor de la propiedad tx.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransactionAdviceResponse5 }
     *     
     */
    public CardPaymentTransactionAdviceResponse5 getTx() {
        return tx;
    }

    /**
     * Define el valor de la propiedad tx.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransactionAdviceResponse5 }
     *     
     */
    public void setTx(CardPaymentTransactionAdviceResponse5 value) {
        this.tx = value;
    }

}
