//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DebitAuthorisationConfirmation3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DebitAuthorisationConfirmation3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DbtAuthstn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}TrueFalseIndicator"/&gt;
 *         &lt;element name="AmtToDbt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="ValDtToDbt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max52Text" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationConfirmation3", propOrder = {
    "dbtAuthstn",
    "amtToDbt",
    "acct",
    "valDtToDbt",
    "cmonTxId",
    "rsn"
})
public class DebitAuthorisationConfirmation3 {

    @XmlElement(name = "DbtAuthstn")
    protected boolean dbtAuthstn;
    @XmlElement(name = "AmtToDbt")
    protected ActiveCurrencyAndAmount amtToDbt;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "ValDtToDbt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDtToDbt;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Obtiene el valor de la propiedad dbtAuthstn.
     * 
     */
    public boolean isDbtAuthstn() {
        return dbtAuthstn;
    }

    /**
     * Define el valor de la propiedad dbtAuthstn.
     * 
     */
    public void setDbtAuthstn(boolean value) {
        this.dbtAuthstn = value;
    }

    /**
     * Obtiene el valor de la propiedad amtToDbt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Define el valor de la propiedad amtToDbt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmtToDbt(ActiveCurrencyAndAmount value) {
        this.amtToDbt = value;
    }

    /**
     * Obtiene el valor de la propiedad acct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Define el valor de la propiedad acct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setAcct(CashAccount40 value) {
        this.acct = value;
    }

    /**
     * Obtiene el valor de la propiedad valDtToDbt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Define el valor de la propiedad valDtToDbt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDtToDbt(XMLGregorianCalendar value) {
        this.valDtToDbt = value;
    }

    /**
     * Obtiene el valor de la propiedad cmonTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Define el valor de la propiedad cmonTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad rsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Define el valor de la propiedad rsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

}
