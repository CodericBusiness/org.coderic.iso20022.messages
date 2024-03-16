//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementParties2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementParties2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DlvrgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}DeliveringPartiesAndAccount7" minOccurs="0"/&gt;
 *         &lt;element name="RcvgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReceivingPartiesAndAccount7" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties2Choice", propOrder = {
    "dlvrgSttlmPties",
    "rcvgSttlmPties"
})
public class SettlementParties2Choice {

    @XmlElement(name = "DlvrgSttlmPties")
    protected DeliveringPartiesAndAccount7 dlvrgSttlmPties;
    @XmlElement(name = "RcvgSttlmPties")
    protected ReceivingPartiesAndAccount7 rcvgSttlmPties;

    /**
     * Obtiene el valor de la propiedad dlvrgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount7 }
     *     
     */
    public DeliveringPartiesAndAccount7 getDlvrgSttlmPties() {
        return dlvrgSttlmPties;
    }

    /**
     * Define el valor de la propiedad dlvrgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount7 }
     *     
     */
    public void setDlvrgSttlmPties(DeliveringPartiesAndAccount7 value) {
        this.dlvrgSttlmPties = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvgSttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingPartiesAndAccount7 }
     *     
     */
    public ReceivingPartiesAndAccount7 getRcvgSttlmPties() {
        return rcvgSttlmPties;
    }

    /**
     * Define el valor de la propiedad rcvgSttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingPartiesAndAccount7 }
     *     
     */
    public void setRcvgSttlmPties(ReceivingPartiesAndAccount7 value) {
        this.rcvgSttlmPties = value;
    }

}
