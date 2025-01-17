//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:06 PM COT 
//


package org.coderic.iso20022.messages.reda;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CollateralParties4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CollateralParties4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232"/&gt;
 *         &lt;element name="ClntPtyB" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232" minOccurs="0"/&gt;
 *         &lt;element name="ElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}GenericIdentification37" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties4", propOrder = {
    "ptyB",
    "clntPtyB",
    "elgbltySetPrfl"
})
public class CollateralParties4 {

    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification232 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentification232 clntPtyB;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification37 elgbltySetPrfl;

    /**
     * Obtiene el valor de la propiedad ptyB.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyB() {
        return ptyB;
    }

    /**
     * Define el valor de la propiedad ptyB.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setPtyB(PartyIdentification232 value) {
        this.ptyB = value;
    }

    /**
     * Obtiene el valor de la propiedad clntPtyB.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Define el valor de la propiedad clntPtyB.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setClntPtyB(PartyIdentification232 value) {
        this.clntPtyB = value;
    }

    /**
     * Obtiene el valor de la propiedad elgbltySetPrfl.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Define el valor de la propiedad elgbltySetPrfl.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setElgbltySetPrfl(GenericIdentification37 value) {
        this.elgbltySetPrfl = value;
    }

}
