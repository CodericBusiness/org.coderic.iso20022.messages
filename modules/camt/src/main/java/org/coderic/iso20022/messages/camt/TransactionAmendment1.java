//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionAmendment1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionAmendment1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pth" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max2048Text" minOccurs="0"/&gt;
 *         &lt;element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}TransactionAmendment1Choice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmendment1", propOrder = {
    "pth",
    "rcrd"
})
public class TransactionAmendment1 {

    @XmlElement(name = "Pth")
    protected String pth;
    @XmlElement(name = "Rcrd", required = true)
    protected TransactionAmendment1Choice rcrd;

    /**
     * Obtiene el valor de la propiedad pth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPth() {
        return pth;
    }

    /**
     * Define el valor de la propiedad pth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPth(String value) {
        this.pth = value;
    }

    /**
     * Obtiene el valor de la propiedad rcrd.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAmendment1Choice }
     *     
     */
    public TransactionAmendment1Choice getRcrd() {
        return rcrd;
    }

    /**
     * Define el valor de la propiedad rcrd.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAmendment1Choice }
     *     
     */
    public void setRcrd(TransactionAmendment1Choice value) {
        this.rcrd = value;
    }

}
