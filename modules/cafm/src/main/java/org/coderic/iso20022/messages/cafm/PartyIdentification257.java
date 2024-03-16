//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentification257 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentification257"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FI" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}FinancialInstitution7" minOccurs="0"/&gt;
 *         &lt;element name="Cstmr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Customer7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification257", propOrder = {
    "fi",
    "cstmr"
})
public class PartyIdentification257 {

    @XmlElement(name = "FI")
    protected FinancialInstitution7 fi;
    @XmlElement(name = "Cstmr")
    protected Customer7 cstmr;

    /**
     * Obtiene el valor de la propiedad fi.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution7 }
     *     
     */
    public FinancialInstitution7 getFI() {
        return fi;
    }

    /**
     * Define el valor de la propiedad fi.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution7 }
     *     
     */
    public void setFI(FinancialInstitution7 value) {
        this.fi = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmr.
     * 
     * @return
     *     possible object is
     *     {@link Customer7 }
     *     
     */
    public Customer7 getCstmr() {
        return cstmr;
    }

    /**
     * Define el valor de la propiedad cstmr.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer7 }
     *     
     */
    public void setCstmr(Customer7 value) {
        this.cstmr = value;
    }

}
