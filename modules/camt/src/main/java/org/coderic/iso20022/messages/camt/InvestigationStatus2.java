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
 * <p>Clase Java para InvestigationStatus2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationStatus2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ExternalInvestigationStatus1Code"/&gt;
 *         &lt;element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationStatusReason1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationStatus2", propOrder = {
    "sts",
    "stsRsn"
})
public class InvestigationStatus2 {

    @XmlElement(name = "Sts", required = true)
    protected String sts;
    @XmlElement(name = "StsRsn")
    protected InvestigationStatusReason1Choice stsRsn;

    /**
     * Obtiene el valor de la propiedad sts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Define el valor de la propiedad sts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSts(String value) {
        this.sts = value;
    }

    /**
     * Obtiene el valor de la propiedad stsRsn.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatusReason1Choice }
     *     
     */
    public InvestigationStatusReason1Choice getStsRsn() {
        return stsRsn;
    }

    /**
     * Define el valor de la propiedad stsRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatusReason1Choice }
     *     
     */
    public void setStsRsn(InvestigationStatusReason1Choice value) {
        this.stsRsn = value;
    }

}
