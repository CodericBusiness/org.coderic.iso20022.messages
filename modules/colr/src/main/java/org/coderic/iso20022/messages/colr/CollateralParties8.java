//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:12 PM COT 
//


package org.coderic.iso20022.messages.colr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CollateralParties8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CollateralParties8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}PartyIdentificationAndAccount202"/&gt;
 *         &lt;element name="ClntPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}PartyIdentificationAndAccount193" minOccurs="0"/&gt;
 *         &lt;element name="PtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}PartyIdentificationAndAccount203"/&gt;
 *         &lt;element name="ClntPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}PartyIdentificationAndAccount193" minOccurs="0"/&gt;
 *         &lt;element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}PartyIdentification136" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties8", propOrder = {
    "ptyA",
    "clntPtyA",
    "ptyB",
    "clntPtyB",
    "trptyAgt"
})
public class CollateralParties8 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentificationAndAccount202 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentificationAndAccount193 clntPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentificationAndAccount203 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentificationAndAccount193 clntPtyB;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification136 trptyAgt;

    /**
     * Obtiene el valor de la propiedad ptyA.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public PartyIdentificationAndAccount202 getPtyA() {
        return ptyA;
    }

    /**
     * Define el valor de la propiedad ptyA.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public void setPtyA(PartyIdentificationAndAccount202 value) {
        this.ptyA = value;
    }

    /**
     * Obtiene el valor de la propiedad clntPtyA.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount193 }
     *     
     */
    public PartyIdentificationAndAccount193 getClntPtyA() {
        return clntPtyA;
    }

    /**
     * Define el valor de la propiedad clntPtyA.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount193 }
     *     
     */
    public void setClntPtyA(PartyIdentificationAndAccount193 value) {
        this.clntPtyA = value;
    }

    /**
     * Obtiene el valor de la propiedad ptyB.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public PartyIdentificationAndAccount203 getPtyB() {
        return ptyB;
    }

    /**
     * Define el valor de la propiedad ptyB.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public void setPtyB(PartyIdentificationAndAccount203 value) {
        this.ptyB = value;
    }

    /**
     * Obtiene el valor de la propiedad clntPtyB.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount193 }
     *     
     */
    public PartyIdentificationAndAccount193 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Define el valor de la propiedad clntPtyB.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount193 }
     *     
     */
    public void setClntPtyB(PartyIdentificationAndAccount193 value) {
        this.clntPtyB = value;
    }

    /**
     * Obtiene el valor de la propiedad trptyAgt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Define el valor de la propiedad trptyAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setTrptyAgt(PartyIdentification136 value) {
        this.trptyAgt = value;
    }

}
