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
 * <p>Clase Java para EncryptedContent4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncryptedContent4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ContentType2Code"/&gt;
 *         &lt;element name="CnttNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AlgorithmIdentification24" minOccurs="0"/&gt;
 *         &lt;element name="NcrptdData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max100KBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedContent4", propOrder = {
    "cnttTp",
    "cnttNcrptnAlgo",
    "ncrptdData"
})
public class EncryptedContent4 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "CnttNcrptnAlgo")
    protected AlgorithmIdentification24 cnttNcrptnAlgo;
    @XmlElement(name = "NcrptdData", required = true)
    protected byte[] ncrptdData;

    /**
     * Obtiene el valor de la propiedad cnttTp.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Define el valor de la propiedad cnttTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public void setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cnttNcrptnAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification24 }
     *     
     */
    public AlgorithmIdentification24 getCnttNcrptnAlgo() {
        return cnttNcrptnAlgo;
    }

    /**
     * Define el valor de la propiedad cnttNcrptnAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification24 }
     *     
     */
    public void setCnttNcrptnAlgo(AlgorithmIdentification24 value) {
        this.cnttNcrptnAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Define el valor de la propiedad ncrptdData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNcrptdData(byte[] value) {
        this.ncrptdData = value;
    }

}
