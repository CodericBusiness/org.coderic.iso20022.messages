//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestigationDataRecord1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationDataRecord1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DbtAuthstn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DebitAuthorisationConfirmation3"/&gt;
 *         &lt;element name="Compstn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}CompensationResponse1"/&gt;
 *         &lt;element name="Valtn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}AdjustmentCompensation1"/&gt;
 *         &lt;element name="Conf" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}BookingConfirmation1"/&gt;
 *         &lt;element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}PaymentTransactionStatus1"/&gt;
 *         &lt;element name="TxData" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}TransactionAmendment1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RspnNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max500Text"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationDataRecord1Choice", propOrder = {
    "dbtAuthstn",
    "compstn",
    "valtn",
    "conf",
    "txSts",
    "txData",
    "rspnNrrtv"
})
public class InvestigationDataRecord1Choice {

    @XmlElement(name = "DbtAuthstn")
    protected DebitAuthorisationConfirmation3 dbtAuthstn;
    @XmlElement(name = "Compstn")
    protected CompensationResponse1 compstn;
    @XmlElement(name = "Valtn")
    protected AdjustmentCompensation1 valtn;
    @XmlElement(name = "Conf")
    protected BookingConfirmation1 conf;
    @XmlElement(name = "TxSts")
    protected PaymentTransactionStatus1 txSts;
    @XmlElement(name = "TxData")
    protected List<TransactionAmendment1> txData;
    @XmlElement(name = "RspnNrrtv")
    protected String rspnNrrtv;

    /**
     * Obtiene el valor de la propiedad dbtAuthstn.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorisationConfirmation3 }
     *     
     */
    public DebitAuthorisationConfirmation3 getDbtAuthstn() {
        return dbtAuthstn;
    }

    /**
     * Define el valor de la propiedad dbtAuthstn.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorisationConfirmation3 }
     *     
     */
    public void setDbtAuthstn(DebitAuthorisationConfirmation3 value) {
        this.dbtAuthstn = value;
    }

    /**
     * Obtiene el valor de la propiedad compstn.
     * 
     * @return
     *     possible object is
     *     {@link CompensationResponse1 }
     *     
     */
    public CompensationResponse1 getCompstn() {
        return compstn;
    }

    /**
     * Define el valor de la propiedad compstn.
     * 
     * @param value
     *     allowed object is
     *     {@link CompensationResponse1 }
     *     
     */
    public void setCompstn(CompensationResponse1 value) {
        this.compstn = value;
    }

    /**
     * Obtiene el valor de la propiedad valtn.
     * 
     * @return
     *     possible object is
     *     {@link AdjustmentCompensation1 }
     *     
     */
    public AdjustmentCompensation1 getValtn() {
        return valtn;
    }

    /**
     * Define el valor de la propiedad valtn.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustmentCompensation1 }
     *     
     */
    public void setValtn(AdjustmentCompensation1 value) {
        this.valtn = value;
    }

    /**
     * Obtiene el valor de la propiedad conf.
     * 
     * @return
     *     possible object is
     *     {@link BookingConfirmation1 }
     *     
     */
    public BookingConfirmation1 getConf() {
        return conf;
    }

    /**
     * Define el valor de la propiedad conf.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingConfirmation1 }
     *     
     */
    public void setConf(BookingConfirmation1 value) {
        this.conf = value;
    }

    /**
     * Obtiene el valor de la propiedad txSts.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransactionStatus1 }
     *     
     */
    public PaymentTransactionStatus1 getTxSts() {
        return txSts;
    }

    /**
     * Define el valor de la propiedad txSts.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransactionStatus1 }
     *     
     */
    public void setTxSts(PaymentTransactionStatus1 value) {
        this.txSts = value;
    }

    /**
     * Gets the value of the txData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the txData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionAmendment1 }
     * 
     * 
     */
    public List<TransactionAmendment1> getTxData() {
        if (txData == null) {
            txData = new ArrayList<TransactionAmendment1>();
        }
        return this.txData;
    }

    /**
     * Obtiene el valor de la propiedad rspnNrrtv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspnNrrtv() {
        return rspnNrrtv;
    }

    /**
     * Define el valor de la propiedad rspnNrrtv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspnNrrtv(String value) {
        this.rspnNrrtv = value;
    }

}
