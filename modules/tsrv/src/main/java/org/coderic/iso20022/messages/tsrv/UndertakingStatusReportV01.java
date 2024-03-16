//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:07 PM COT 
//


package org.coderic.iso20022.messages.tsrv;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UndertakingStatusReportV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UndertakingStatusReportV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UdrtkgStsRptDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}UndertakingStatusAdvice1"/&gt;
 *         &lt;element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyAndSignature2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingStatusReportV01", propOrder = {
    "udrtkgStsRptDtls",
    "dgtlSgntr"
})
public class UndertakingStatusReportV01 {

    @XmlElement(name = "UdrtkgStsRptDtls", required = true)
    protected UndertakingStatusAdvice1 udrtkgStsRptDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Obtiene el valor de la propiedad udrtkgStsRptDtls.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatusAdvice1 }
     *     
     */
    public UndertakingStatusAdvice1 getUdrtkgStsRptDtls() {
        return udrtkgStsRptDtls;
    }

    /**
     * Define el valor de la propiedad udrtkgStsRptDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatusAdvice1 }
     *     
     */
    public void setUdrtkgStsRptDtls(UndertakingStatusAdvice1 value) {
        this.udrtkgStsRptDtls = value;
    }

    /**
     * Obtiene el valor de la propiedad dgtlSgntr.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Define el valor de la propiedad dgtlSgntr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
    }

}
