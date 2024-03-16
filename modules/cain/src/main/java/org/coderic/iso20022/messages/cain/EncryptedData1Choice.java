//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptedData1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncryptedData1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="BinryData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max100KBinary"/&gt;
 *         &lt;element name="HexBinryVal" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max9999HexBinaryText"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedData1Choice", propOrder = {
    "binryData",
    "hexBinryVal"
})
public class EncryptedData1Choice {

    @XmlElement(name = "BinryData")
    protected byte[] binryData;
    @XmlElement(name = "HexBinryVal")
    protected String hexBinryVal;

    /**
     * Obtiene el valor de la propiedad binryData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinryData() {
        return binryData;
    }

    /**
     * Define el valor de la propiedad binryData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinryData(byte[] value) {
        this.binryData = value;
    }

    /**
     * Obtiene el valor de la propiedad hexBinryVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexBinryVal() {
        return hexBinryVal;
    }

    /**
     * Define el valor de la propiedad hexBinryVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHexBinryVal(String value) {
        this.hexBinryVal = value;
    }

}
