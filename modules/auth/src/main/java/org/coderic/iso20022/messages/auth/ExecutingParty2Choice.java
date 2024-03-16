//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExecutingParty2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExecutingParty2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Prsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}GenericPersonIdentification1"/&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max50Text"/&gt;
 *         &lt;element name="Clnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}NoReasonCode"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutingParty2Choice", propOrder = {
    "prsn",
    "algo",
    "clnt"
})
public class ExecutingParty2Choice {

    @XmlElement(name = "Prsn")
    protected GenericPersonIdentification1 prsn;
    @XmlElement(name = "Algo")
    protected String algo;
    @XmlElement(name = "Clnt")
    @XmlSchemaType(name = "string")
    protected NoReasonCode clnt;

    /**
     * Obtiene el valor de la propiedad prsn.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public GenericPersonIdentification1 getPrsn() {
        return prsn;
    }

    /**
     * Define el valor de la propiedad prsn.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public void setPrsn(GenericPersonIdentification1 value) {
        this.prsn = value;
    }

    /**
     * Obtiene el valor de la propiedad algo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * Define el valor de la propiedad algo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgo(String value) {
        this.algo = value;
    }

    /**
     * Obtiene el valor de la propiedad clnt.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getClnt() {
        return clnt;
    }

    /**
     * Define el valor de la propiedad clnt.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setClnt(NoReasonCode value) {
        this.clnt = value;
    }

}
