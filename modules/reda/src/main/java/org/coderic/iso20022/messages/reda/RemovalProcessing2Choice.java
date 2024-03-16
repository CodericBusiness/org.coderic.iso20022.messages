//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:33 PM COT 
//


package org.coderic.iso20022.messages.reda;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemovalProcessing2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemovalProcessing2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}SecurityIdentification19"/&gt;
 *         &lt;element name="IndxId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}GenericIdentification37"/&gt;
 *         &lt;element name="IssrCtry" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}CountryCode"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemovalProcessing2Choice", propOrder = {
    "finInstrmId",
    "indxId",
    "issrCtry"
})
public class RemovalProcessing2Choice {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "IndxId")
    protected GenericIdentification37 indxId;
    @XmlElement(name = "IssrCtry")
    protected String issrCtry;

    /**
     * Obtiene el valor de la propiedad finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Define el valor de la propiedad finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Obtiene el valor de la propiedad indxId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getIndxId() {
        return indxId;
    }

    /**
     * Define el valor de la propiedad indxId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setIndxId(GenericIdentification37 value) {
        this.indxId = value;
    }

    /**
     * Obtiene el valor de la propiedad issrCtry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCtry() {
        return issrCtry;
    }

    /**
     * Define el valor de la propiedad issrCtry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrCtry(String value) {
        this.issrCtry = value;
    }

}
