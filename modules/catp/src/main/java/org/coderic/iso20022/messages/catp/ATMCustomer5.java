//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMCustomer5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMCustomer5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Prfl" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMCustomerProfile2" minOccurs="0"/&gt;
 *         &lt;element name="AuthntcnRslt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}TransactionVerificationResult5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCustomer5", propOrder = {
    "prfl",
    "authntcnRslt"
})
public class ATMCustomer5 {

    @XmlElement(name = "Prfl")
    protected ATMCustomerProfile2 prfl;
    @XmlElement(name = "AuthntcnRslt")
    protected List<TransactionVerificationResult5> authntcnRslt;

    /**
     * Obtiene el valor de la propiedad prfl.
     * 
     * @return
     *     possible object is
     *     {@link ATMCustomerProfile2 }
     *     
     */
    public ATMCustomerProfile2 getPrfl() {
        return prfl;
    }

    /**
     * Define el valor de la propiedad prfl.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCustomerProfile2 }
     *     
     */
    public void setPrfl(ATMCustomerProfile2 value) {
        this.prfl = value;
    }

    /**
     * Gets the value of the authntcnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authntcnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult5 }
     * 
     * 
     */
    public List<TransactionVerificationResult5> getAuthntcnRslt() {
        if (authntcnRslt == null) {
            authntcnRslt = new ArrayList<TransactionVerificationResult5>();
        }
        return this.authntcnRslt;
    }

}
