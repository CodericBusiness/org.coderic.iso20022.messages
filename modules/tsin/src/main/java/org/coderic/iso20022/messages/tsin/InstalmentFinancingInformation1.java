//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InstalmentFinancingInformation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InstalmentFinancingInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InstlmtSeqId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max70Text"/&gt;
 *         &lt;element name="InstlmtTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="InstlmtFincgRslt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingResult1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstalmentFinancingInformation1", propOrder = {
    "instlmtSeqId",
    "instlmtTtlAmt",
    "instlmtFincgRslt"
})
public class InstalmentFinancingInformation1 {

    @XmlElement(name = "InstlmtSeqId", required = true)
    protected String instlmtSeqId;
    @XmlElement(name = "InstlmtTtlAmt", required = true)
    protected ActiveCurrencyAndAmount instlmtTtlAmt;
    @XmlElement(name = "InstlmtFincgRslt", required = true)
    protected FinancingResult1 instlmtFincgRslt;

    /**
     * Obtiene el valor de la propiedad instlmtSeqId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtSeqId() {
        return instlmtSeqId;
    }

    /**
     * Define el valor de la propiedad instlmtSeqId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstlmtSeqId(String value) {
        this.instlmtSeqId = value;
    }

    /**
     * Obtiene el valor de la propiedad instlmtTtlAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getInstlmtTtlAmt() {
        return instlmtTtlAmt;
    }

    /**
     * Define el valor de la propiedad instlmtTtlAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setInstlmtTtlAmt(ActiveCurrencyAndAmount value) {
        this.instlmtTtlAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad instlmtFincgRslt.
     * 
     * @return
     *     possible object is
     *     {@link FinancingResult1 }
     *     
     */
    public FinancingResult1 getInstlmtFincgRslt() {
        return instlmtFincgRslt;
    }

    /**
     * Define el valor de la propiedad instlmtFincgRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingResult1 }
     *     
     */
    public void setInstlmtFincgRslt(FinancingResult1 value) {
        this.instlmtFincgRslt = value;
    }

}
