//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:13 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementParties4Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementParties4Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DeliveringPartiesAndAccount11" minOccurs="0"/&gt;
 *         &lt;element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReceivingPartiesAndAccount11" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties4Choice", propOrder = {
    "dlvrgSttlmPties",
    "rcvgSttlmPties"
})
public class SettlementParties4Choice {

    @XmlElement(name = "DlvrgSttlmPties")
    protected DeliveringPartiesAndAccount11 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected ReceivingPartiesAndAccount11 rcvgSttlmPties;

    /**
     * Obtiene el valor de la propiedad dlvrgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount11 }
     *     
     */
    public DeliveringPartiesAndAccount11 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Define el valor de la propiedad dlvrgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount11 }
     *     
     */
    public void setDlvrgSttlmPties(DeliveringPartiesAndAccount11 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount11 }
     *     
     */
    public ReceivingPartiesAndAccount11 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Define el valor de la propiedad rcvgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount11 }
     *     
     */
    public void setRcvgSttlmPties(ReceivingPartiesAndAccount11 value) {
        this.rcvgSttlmPties = value;
    }

}
