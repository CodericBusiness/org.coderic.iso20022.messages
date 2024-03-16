//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlgorithmAndDigest1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlgorithmAndDigest1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Algorithm5Code"/&gt;
 *         &lt;element name="Dgst" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max140Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlgorithmAndDigest1", propOrder = {
    "dgstAlgo",
    "dgst"
})
public class AlgorithmAndDigest1 {

    @XmlElement(name = "DgstAlgo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm5Code dgstAlgo;
    @XmlElement(name = "Dgst", required = true)
    protected String dgst;

    /**
     * Obtiene el valor de la propiedad dgstAlgo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm5Code }
     *     
     */
    public Algorithm5Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Define el valor de la propiedad dgstAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm5Code }
     *     
     */
    public void setDgstAlgo(Algorithm5Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad dgst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDgst() {
        return dgst;
    }

    /**
     * Define el valor de la propiedad dgst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDgst(String value) {
        this.dgst = value;
    }

}
