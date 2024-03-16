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
 * <p>Clase Java para KeyTransport10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KeyTransport10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Recipient13Choice"/&gt;
 *         &lt;element name="KeyNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}AlgorithmIdentification35"/&gt;
 *         &lt;element name="NcrptdKey" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max5000Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyTransport10", propOrder = {
    "vrsn",
    "rcptId",
    "keyNcrptnAlgo",
    "ncrptdKey"
})
public class KeyTransport10 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "RcptId", required = true)
    protected Recipient13Choice rcptId;
    @XmlElement(name = "KeyNcrptnAlgo", required = true)
    protected AlgorithmIdentification35 keyNcrptnAlgo;
    @XmlElement(name = "NcrptdKey", required = true)
    protected byte[] ncrptdKey;

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
     * Obtiene el valor de la propiedad rcptId.
     * 
     * @return
     *     possible object is
     *     {@link Recipient13Choice }
     *     
     */
    public Recipient13Choice getRcptId() {
        return rcptId;
    }

    /**
     * Define el valor de la propiedad rcptId.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient13Choice }
     *     
     */
    public void setRcptId(Recipient13Choice value) {
        this.rcptId = value;
    }

    /**
     * Obtiene el valor de la propiedad keyNcrptnAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification35 }
     *     
     */
    public AlgorithmIdentification35 getKeyNcrptnAlgo() {
        return keyNcrptnAlgo;
    }

    /**
     * Define el valor de la propiedad keyNcrptnAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification35 }
     *     
     */
    public void setKeyNcrptnAlgo(AlgorithmIdentification35 value) {
        this.keyNcrptnAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdKey.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdKey() {
        return ncrptdKey;
    }

    /**
     * Define el valor de la propiedad ncrptdKey.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNcrptdKey(byte[] value) {
        this.ncrptdKey = value;
    }

}
