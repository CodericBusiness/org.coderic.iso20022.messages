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
 * <p>Clase Java para InvestigationRequestAction1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationRequestAction1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationRequestAction1Choice"/&gt;
 *         &lt;element name="ActnRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationActionReason1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationRequestAction1", propOrder = {
    "actn",
    "actnRsn"
})
public class InvestigationRequestAction1 {

    @XmlElement(name = "Actn", required = true)
    protected InvestigationRequestAction1Choice actn;
    @XmlElement(name = "ActnRsn")
    protected InvestigationActionReason1 actnRsn;

    /**
     * Obtiene el valor de la propiedad actn.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequestAction1Choice }
     *     
     */
    public InvestigationRequestAction1Choice getActn() {
        return actn;
    }

    /**
     * Define el valor de la propiedad actn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequestAction1Choice }
     *     
     */
    public void setActn(InvestigationRequestAction1Choice value) {
        this.actn = value;
    }

    /**
     * Obtiene el valor de la propiedad actnRsn.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationActionReason1 }
     *     
     */
    public InvestigationActionReason1 getActnRsn() {
        return actnRsn;
    }

    /**
     * Define el valor de la propiedad actnRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationActionReason1 }
     *     
     */
    public void setActnRsn(InvestigationActionReason1 value) {
        this.actnRsn = value;
    }

}
