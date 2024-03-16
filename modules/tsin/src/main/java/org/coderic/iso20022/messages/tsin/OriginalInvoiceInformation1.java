//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OriginalInvoiceInformation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OriginalInvoiceInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max35Text"/&gt;
 *         &lt;element name="TtlInvcAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *         &lt;element name="PmtDueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalInvoiceInformation1", propOrder = {
    "docNb",
    "ttlInvcAmt",
    "isseDt",
    "pmtDueDt"
})
public class OriginalInvoiceInformation1 {

    @XmlElement(name = "DocNb", required = true)
    protected String docNb;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected ActiveCurrencyAndAmount ttlInvcAmt;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "PmtDueDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;

    /**
     * Obtiene el valor de la propiedad docNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Define el valor de la propiedad docNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNb(String value) {
        this.docNb = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlInvcAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Define el valor de la propiedad ttlInvcAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlInvcAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad isseDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Define el valor de la propiedad isseDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtDueDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Define el valor de la propiedad pmtDueDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
    }

}
