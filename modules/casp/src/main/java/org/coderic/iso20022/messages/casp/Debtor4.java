//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Debtor4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Debtor4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PartyIdentification178Choice" minOccurs="0"/&gt;
 *         &lt;element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CashAccountIdentification7Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Debtor4", propOrder = {
    "dbtr",
    "acctId"
})
public class Debtor4 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentification178Choice dbtr;
    @XmlElement(name = "AcctId")
    protected CashAccountIdentification7Choice acctId;

    /**
     * Obtiene el valor de la propiedad dbtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getDbtr() {
        return dbtr;
    }

    /**
     * Define el valor de la propiedad dbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setDbtr(PartyIdentification178Choice value) {
        this.dbtr = value;
    }

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification7Choice }
     *     
     */
    public CashAccountIdentification7Choice getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification7Choice }
     *     
     */
    public void setAcctId(CashAccountIdentification7Choice value) {
        this.acctId = value;
    }

}
