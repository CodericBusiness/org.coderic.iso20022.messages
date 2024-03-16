//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DigestedData6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DigestedData6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AlgorithmIdentification36"/&gt;
 *         &lt;element name="NcpsltdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}EncapsulatedContent3"/&gt;
 *         &lt;element name="Dgst" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max140Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigestedData6", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "dgst"
})
public class DigestedData6 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification36 dgstAlgo;
    @XmlElement(name = "NcpsltdCntt", required = true)
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "Dgst", required = true)
    protected byte[] dgst;

    /**
     * Obtiene el valor de la propiedad vrsn.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Define el valor de la propiedad vrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad dgstAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification36 }
     *     
     */
    public AlgorithmIdentification36 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Define el valor de la propiedad dgstAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification36 }
     *     
     */
    public void setDgstAlgo(AlgorithmIdentification36 value) {
        this.dgstAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad ncpsltdCntt.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Define el valor de la propiedad ncpsltdCntt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public void setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
    }

    /**
     * Obtiene el valor de la propiedad dgst.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDgst() {
        return dgst;
    }

    /**
     * Define el valor de la propiedad dgst.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDgst(byte[] value) {
        this.dgst = value;
    }

}
