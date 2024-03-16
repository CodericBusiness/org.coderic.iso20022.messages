//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProtectedData1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProtectedData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}ContentType3Code"/&gt;
 *         &lt;element name="EnvlpdData" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}EnvelopedData6" minOccurs="0"/&gt;
 *         &lt;element name="NcrptdData" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}EncryptedData1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectedData1", propOrder = {
    "cnttTp",
    "envlpdData",
    "ncrptdData"
})
public class ProtectedData1 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType3Code cnttTp;
    @XmlElement(name = "EnvlpdData")
    protected EnvelopedData6 envlpdData;
    @XmlElement(name = "NcrptdData")
    protected EncryptedData1 ncrptdData;

    /**
     * Obtiene el valor de la propiedad cnttTp.
     * 
     * @return
     *     possible object is
     *     {@link ContentType3Code }
     *     
     */
    public ContentType3Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Define el valor de la propiedad cnttTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType3Code }
     *     
     */
    public void setCnttTp(ContentType3Code value) {
        this.cnttTp = value;
    }

    /**
     * Obtiene el valor de la propiedad envlpdData.
     * 
     * @return
     *     possible object is
     *     {@link EnvelopedData6 }
     *     
     */
    public EnvelopedData6 getEnvlpdData() {
        return envlpdData;
    }

    /**
     * Define el valor de la propiedad envlpdData.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvelopedData6 }
     *     
     */
    public void setEnvlpdData(EnvelopedData6 value) {
        this.envlpdData = value;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdData.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData1 }
     *     
     */
    public EncryptedData1 getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Define el valor de la propiedad ncrptdData.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData1 }
     *     
     */
    public void setNcrptdData(EncryptedData1 value) {
        this.ncrptdData = value;
    }

}
