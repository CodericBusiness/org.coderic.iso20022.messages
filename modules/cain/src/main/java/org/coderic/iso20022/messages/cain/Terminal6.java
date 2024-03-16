//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Terminal6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Terminal6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TermnlId" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}TerminalIdentification3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal6", propOrder = {
    "termnlId"
})
public class Terminal6 {

    @XmlElement(name = "TermnlId", required = true)
    protected TerminalIdentification3 termnlId;

    /**
     * Obtiene el valor de la propiedad termnlId.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public TerminalIdentification3 getTermnlId() {
        return termnlId;
    }

    /**
     * Define el valor de la propiedad termnlId.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public void setTermnlId(TerminalIdentification3 value) {
        this.termnlId = value;
    }

}
