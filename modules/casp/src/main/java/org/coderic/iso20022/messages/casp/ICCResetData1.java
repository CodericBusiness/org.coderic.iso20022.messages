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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ICCResetData1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ICCResetData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATRVal" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max140Binary" minOccurs="0"/&gt;
 *         &lt;element name="CardSts" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICCResetData1", propOrder = {
    "atrVal",
    "cardSts"
})
public class ICCResetData1 {

    @XmlElement(name = "ATRVal")
    protected byte[] atrVal;
    @XmlElement(name = "CardSts")
    protected byte[] cardSts;

    /**
     * Obtiene el valor de la propiedad atrVal.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getATRVal() {
        return atrVal;
    }

    /**
     * Define el valor de la propiedad atrVal.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setATRVal(byte[] value) {
        this.atrVal = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSts.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getCardSts() {
        return cardSts;
    }

    /**
     * Define el valor de la propiedad cardSts.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setCardSts(byte[] value) {
        this.cardSts = value;
    }

}
