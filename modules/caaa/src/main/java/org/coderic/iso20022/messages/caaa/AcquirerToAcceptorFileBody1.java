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
 * <p>Clase Java para AcquirerToAcceptorFileBody1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcquirerToAcceptorFileBody1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CmpltnAdvcRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AcceptorCompletionAdviceResponse12" minOccurs="0"/&gt;
 *         &lt;element name="CxlRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AcceptorCancellationAdviceResponse12" minOccurs="0"/&gt;
 *         &lt;element name="BtchTrfRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentBatchTransferResponse11" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerToAcceptorFileBody1", propOrder = {
    "cmpltnAdvcRspn",
    "cxlRspn",
    "btchTrfRspn"
})
public class AcquirerToAcceptorFileBody1 {

    @XmlElement(name = "CmpltnAdvcRspn")
    protected AcceptorCompletionAdviceResponse12 cmpltnAdvcRspn;
    @XmlElement(name = "CxlRspn")
    protected AcceptorCancellationAdviceResponse12 cxlRspn;
    @XmlElement(name = "BtchTrfRspn")
    protected CardPaymentBatchTransferResponse11 btchTrfRspn;

    /**
     * Obtiene el valor de la propiedad cmpltnAdvcRspn.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCompletionAdviceResponse12 }
     *     
     */
    public AcceptorCompletionAdviceResponse12 getCmpltnAdvcRspn() {
        return cmpltnAdvcRspn;
    }

    /**
     * Define el valor de la propiedad cmpltnAdvcRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCompletionAdviceResponse12 }
     *     
     */
    public void setCmpltnAdvcRspn(AcceptorCompletionAdviceResponse12 value) {
        this.cmpltnAdvcRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad cxlRspn.
     * 
     * @return
     *     possible object is
     *     {@link AcceptorCancellationAdviceResponse12 }
     *     
     */
    public AcceptorCancellationAdviceResponse12 getCxlRspn() {
        return cxlRspn;
    }

    /**
     * Define el valor de la propiedad cxlRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptorCancellationAdviceResponse12 }
     *     
     */
    public void setCxlRspn(AcceptorCancellationAdviceResponse12 value) {
        this.cxlRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad btchTrfRspn.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentBatchTransferResponse11 }
     *     
     */
    public CardPaymentBatchTransferResponse11 getBtchTrfRspn() {
        return btchTrfRspn;
    }

    /**
     * Define el valor de la propiedad btchTrfRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentBatchTransferResponse11 }
     *     
     */
    public void setBtchTrfRspn(CardPaymentBatchTransferResponse11 value) {
        this.btchTrfRspn = value;
    }

}
