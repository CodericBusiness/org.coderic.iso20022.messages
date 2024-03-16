//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMExceptionAcknowledgement1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMExceptionAcknowledgement1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATM" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}AutomatedTellerMachine3"/&gt;
 *         &lt;element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMContext20"/&gt;
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMTransaction28"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMExceptionAcknowledgement1", propOrder = {
    "atm",
    "cntxt",
    "tx"
})
public class ATMExceptionAcknowledgement1 {

    @XmlElement(name = "ATM", required = true)
    protected AutomatedTellerMachine3 atm;
    @XmlElement(name = "Cntxt", required = true)
    protected ATMContext20 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected ATMTransaction28 tx;

    /**
     * Obtiene el valor de la propiedad atm.
     * 
     * @return
     *     possible object is
     *     {@link AutomatedTellerMachine3 }
     *     
     */
    public AutomatedTellerMachine3 getATM() {
        return atm;
    }

    /**
     * Define el valor de la propiedad atm.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomatedTellerMachine3 }
     *     
     */
    public void setATM(AutomatedTellerMachine3 value) {
        this.atm = value;
    }

    /**
     * Obtiene el valor de la propiedad cntxt.
     * 
     * @return
     *     possible object is
     *     {@link ATMContext20 }
     *     
     */
    public ATMContext20 getCntxt() {
        return cntxt;
    }

    /**
     * Define el valor de la propiedad cntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMContext20 }
     *     
     */
    public void setCntxt(ATMContext20 value) {
        this.cntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad tx.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransaction28 }
     *     
     */
    public ATMTransaction28 getTx() {
        return tx;
    }

    /**
     * Define el valor de la propiedad tx.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransaction28 }
     *     
     */
    public void setTx(ATMTransaction28 value) {
        this.tx = value;
    }

}
