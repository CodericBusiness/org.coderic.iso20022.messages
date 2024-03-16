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
 * <p>Clase Java para CardPaymentContext30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardPaymentContext30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PaymentContext29" minOccurs="0"/&gt;
 *         &lt;element name="SaleCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SaleContext4" minOccurs="0"/&gt;
 *         &lt;element name="DrctDbtCntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDirectDebit2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentContext30", propOrder = {
    "pmtCntxt",
    "saleCntxt",
    "drctDbtCntxt"
})
public class CardPaymentContext30 {

    @XmlElement(name = "PmtCntxt")
    protected PaymentContext29 pmtCntxt;
    @XmlElement(name = "SaleCntxt")
    protected SaleContext4 saleCntxt;
    @XmlElement(name = "DrctDbtCntxt")
    protected CardDirectDebit2 drctDbtCntxt;

    /**
     * Obtiene el valor de la propiedad pmtCntxt.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext29 }
     *     
     */
    public PaymentContext29 getPmtCntxt() {
        return pmtCntxt;
    }

    /**
     * Define el valor de la propiedad pmtCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext29 }
     *     
     */
    public void setPmtCntxt(PaymentContext29 value) {
        this.pmtCntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad saleCntxt.
     * 
     * @return
     *     possible object is
     *     {@link SaleContext4 }
     *     
     */
    public SaleContext4 getSaleCntxt() {
        return saleCntxt;
    }

    /**
     * Define el valor de la propiedad saleCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleContext4 }
     *     
     */
    public void setSaleCntxt(SaleContext4 value) {
        this.saleCntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad drctDbtCntxt.
     * 
     * @return
     *     possible object is
     *     {@link CardDirectDebit2 }
     *     
     */
    public CardDirectDebit2 getDrctDbtCntxt() {
        return drctDbtCntxt;
    }

    /**
     * Define el valor de la propiedad drctDbtCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDirectDebit2 }
     *     
     */
    public void setDrctDbtCntxt(CardDirectDebit2 value) {
        this.drctDbtCntxt = value;
    }

}
