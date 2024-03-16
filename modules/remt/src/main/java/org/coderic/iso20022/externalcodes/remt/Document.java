//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 07:25:33 PM COT 
//


package org.coderic.iso20022.externalcodes.remt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmtLctnAdvc" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}RemittanceLocationAdviceV03"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rmtLctnAdvc"
})
public class Document {

    @XmlElement(name = "RmtLctnAdvc", required = true)
    protected RemittanceLocationAdviceV03 rmtLctnAdvc;

    /**
     * Obtiene el valor de la propiedad rmtLctnAdvc.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceLocationAdviceV03 }
     *     
     */
    public RemittanceLocationAdviceV03 getRmtLctnAdvc() {
        return rmtLctnAdvc;
    }

    /**
     * Define el valor de la propiedad rmtLctnAdvc.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceLocationAdviceV03 }
     *     
     */
    public void setRmtLctnAdvc(RemittanceLocationAdviceV03 value) {
        this.rmtLctnAdvc = value;
    }

}