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
 * <p>Clase Java para Instalment2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Instalment2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeqId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max70Text"/&gt;
 *         &lt;element name="PmtDueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *         &lt;element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="PmtInstrm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}PaymentMeans1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instalment2", propOrder = {
    "seqId",
    "pmtDueDt",
    "amt",
    "pmtInstrm"
})
public class Instalment2 {

    @XmlElement(name = "SeqId", required = true)
    protected String seqId;
    @XmlElement(name = "PmtDueDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "PmtInstrm")
    protected PaymentMeans1 pmtInstrm;

    /**
     * Obtiene el valor de la propiedad seqId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqId() {
        return seqId;
    }

    /**
     * Define el valor de la propiedad seqId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqId(String value) {
        this.seqId = value;
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

    /**
     * Obtiene el valor de la propiedad amt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Define el valor de la propiedad amt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtInstrm.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeans1 }
     *     
     */
    public PaymentMeans1 getPmtInstrm() {
        return pmtInstrm;
    }

    /**
     * Define el valor de la propiedad pmtInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeans1 }
     *     
     */
    public void setPmtInstrm(PaymentMeans1 value) {
        this.pmtInstrm = value;
    }

}
