//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parameter10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parameter10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NcrptnFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}EncryptionFormat2Code" minOccurs="0"/&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Algorithm16Code" minOccurs="0"/&gt;
 *         &lt;element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AlgorithmIdentification18" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter10", propOrder = {
    "ncrptnFrmt",
    "dgstAlgo",
    "mskGnrtrAlgo"
})
public class Parameter10 {

    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptionFormat2Code ncrptnFrmt;
    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm16Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification18 mskGnrtrAlgo;

    /**
     * Obtiene el valor de la propiedad ncrptnFrmt.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionFormat2Code }
     *     
     */
    public EncryptionFormat2Code getNcrptnFrmt() {
        return ncrptnFrmt;
    }

    /**
     * Define el valor de la propiedad ncrptnFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionFormat2Code }
     *     
     */
    public void setNcrptnFrmt(EncryptionFormat2Code value) {
        this.ncrptnFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dgstAlgo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm16Code }
     *     
     */
    public Algorithm16Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Define el valor de la propiedad dgstAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm16Code }
     *     
     */
    public void setDgstAlgo(Algorithm16Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad mskGnrtrAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification18 }
     *     
     */
    public AlgorithmIdentification18 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Define el valor de la propiedad mskGnrtrAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification18 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification18 value) {
        this.mskGnrtrAlgo = value;
    }

}
