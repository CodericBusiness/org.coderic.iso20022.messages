//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:51 PM COT 
//


package org.coderic.iso20022.messages.sese;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcessingStatus79Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessingStatus79Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AckdAccptd" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}AcknowledgedAcceptedStatus33Choice"/&gt;
 *         &lt;element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}RejectionOrRepairStatus31Choice"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingStatus79Choice", propOrder = {
    "ackdAccptd",
    "rjctd"
})
public class ProcessingStatus79Choice {

    @XmlElement(name = "AckdAccptd")
    protected AcknowledgedAcceptedStatus33Choice ackdAccptd;
    @XmlElement(name = "Rjctd")
    protected RejectionOrRepairStatus31Choice rjctd;

    /**
     * Obtiene el valor de la propiedad ackdAccptd.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgedAcceptedStatus33Choice }
     *     
     */
    public AcknowledgedAcceptedStatus33Choice getAckdAccptd() {
        return ackdAccptd;
    }

    /**
     * Define el valor de la propiedad ackdAccptd.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgedAcceptedStatus33Choice }
     *     
     */
    public void setAckdAccptd(AcknowledgedAcceptedStatus33Choice value) {
        this.ackdAccptd = value;
    }

    /**
     * Obtiene el valor de la propiedad rjctd.
     * 
     * @return
     *     possible object is
     *     {@link RejectionOrRepairStatus31Choice }
     *     
     */
    public RejectionOrRepairStatus31Choice getRjctd() {
        return rjctd;
    }

    /**
     * Define el valor de la propiedad rjctd.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionOrRepairStatus31Choice }
     *     
     */
    public void setRjctd(RejectionOrRepairStatus31Choice value) {
        this.rjctd = value;
    }

}
