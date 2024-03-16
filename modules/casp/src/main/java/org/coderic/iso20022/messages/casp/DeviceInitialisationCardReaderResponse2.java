//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DeviceInitialisationCardReaderResponse2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeviceInitialisationCardReaderResponse2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDataReading8Code" minOccurs="0"/&gt;
 *         &lt;element name="ICCRstData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ICCResetData1" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max10000Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInitialisationCardReaderResponse2", propOrder = {
    "cardNtryMd",
    "iccRstData",
    "addtlInf"
})
public class DeviceInitialisationCardReaderResponse2 {

    @XmlElement(name = "CardNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardNtryMd;
    @XmlElement(name = "ICCRstData")
    protected ICCResetData1 iccRstData;
    @XmlElement(name = "AddtlInf")
    protected byte[] addtlInf;

    /**
     * Obtiene el valor de la propiedad cardNtryMd.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardNtryMd() {
        return cardNtryMd;
    }

    /**
     * Define el valor de la propiedad cardNtryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setCardNtryMd(CardDataReading8Code value) {
        this.cardNtryMd = value;
    }

    /**
     * Obtiene el valor de la propiedad iccRstData.
     * 
     * @return
     *     possible object is
     *     {@link ICCResetData1 }
     *     
     */
    public ICCResetData1 getICCRstData() {
        return iccRstData;
    }

    /**
     * Define el valor de la propiedad iccRstData.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCResetData1 }
     *     
     */
    public void setICCRstData(ICCResetData1 value) {
        this.iccRstData = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddtlInf(byte[] value) {
        this.addtlInf = value;
    }

}
