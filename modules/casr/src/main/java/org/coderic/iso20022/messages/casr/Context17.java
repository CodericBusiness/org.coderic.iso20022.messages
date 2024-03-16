//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Context17 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Context17"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}TransactionContext10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Context17", propOrder = {
    "txCntxt"
})
public class Context17 {

    @XmlElement(name = "TxCntxt")
    protected TransactionContext10 txCntxt;

    /**
     * Obtiene el valor de la propiedad txCntxt.
     * 
     * @return
     *     possible object is
     *     {@link TransactionContext10 }
     *     
     */
    public TransactionContext10 getTxCntxt() {
        return txCntxt;
    }

    /**
     * Define el valor de la propiedad txCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionContext10 }
     *     
     */
    public void setTxCntxt(TransactionContext10 value) {
        this.txCntxt = value;
    }

}
