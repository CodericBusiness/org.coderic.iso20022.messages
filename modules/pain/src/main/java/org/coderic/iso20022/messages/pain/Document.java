//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

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
 *         &lt;element name="MndtSspnsnReq" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateSuspensionRequestV04"/&gt;
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
    "mndtSspnsnReq"
})
public class Document {

    @XmlElement(name = "MndtSspnsnReq", required = true)
    protected MandateSuspensionRequestV04 mndtSspnsnReq;

    /**
     * Obtiene el valor de la propiedad mndtSspnsnReq.
     * 
     * @return
     *     possible object is
     *     {@link MandateSuspensionRequestV04 }
     *     
     */
    public MandateSuspensionRequestV04 getMndtSspnsnReq() {
        return mndtSspnsnReq;
    }

    /**
     * Define el valor de la propiedad mndtSspnsnReq.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSuspensionRequestV04 }
     *     
     */
    public void setMndtSspnsnReq(MandateSuspensionRequestV04 value) {
        this.mndtSspnsnReq = value;
    }

}
