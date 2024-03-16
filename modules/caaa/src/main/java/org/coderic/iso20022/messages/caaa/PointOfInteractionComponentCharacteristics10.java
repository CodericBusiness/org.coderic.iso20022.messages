//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PointOfInteractionComponentCharacteristics10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionComponentCharacteristics10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mmry" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}MemoryCharacteristics1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Com" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CommunicationCharacteristics5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SctyAccsMdls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="SbcbrIdntyMdls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="SctyElmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CryptographicKey18" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentCharacteristics10", propOrder = {
    "mmry",
    "com",
    "sctyAccsMdls",
    "sbcbrIdntyMdls",
    "sctyElmt"
})
public class PointOfInteractionComponentCharacteristics10 {

    @XmlElement(name = "Mmry")
    protected List<MemoryCharacteristics1> mmry;
    @XmlElement(name = "Com")
    protected List<CommunicationCharacteristics5> com;
    @XmlElement(name = "SctyAccsMdls")
    protected BigDecimal sctyAccsMdls;
    @XmlElement(name = "SbcbrIdntyMdls")
    protected BigDecimal sbcbrIdntyMdls;
    @XmlElement(name = "SctyElmt")
    protected List<CryptographicKey18> sctyElmt;

    /**
     * Gets the value of the mmry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mmry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMmry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MemoryCharacteristics1 }
     * 
     * 
     */
    public List<MemoryCharacteristics1> getMmry() {
        if (mmry == null) {
            mmry = new ArrayList<MemoryCharacteristics1>();
        }
        return this.mmry;
    }

    /**
     * Gets the value of the com property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the com property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationCharacteristics5 }
     * 
     * 
     */
    public List<CommunicationCharacteristics5> getCom() {
        if (com == null) {
            com = new ArrayList<CommunicationCharacteristics5>();
        }
        return this.com;
    }

    /**
     * Obtiene el valor de la propiedad sctyAccsMdls.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSctyAccsMdls() {
        return sctyAccsMdls;
    }

    /**
     * Define el valor de la propiedad sctyAccsMdls.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSctyAccsMdls(BigDecimal value) {
        this.sctyAccsMdls = value;
    }

    /**
     * Obtiene el valor de la propiedad sbcbrIdntyMdls.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbcbrIdntyMdls() {
        return sbcbrIdntyMdls;
    }

    /**
     * Define el valor de la propiedad sbcbrIdntyMdls.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSbcbrIdntyMdls(BigDecimal value) {
        this.sbcbrIdntyMdls = value;
    }

    /**
     * Gets the value of the sctyElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sctyElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey18 }
     * 
     * 
     */
    public List<CryptographicKey18> getSctyElmt() {
        if (sctyElmt == null) {
            sctyElmt = new ArrayList<CryptographicKey18>();
        }
        return this.sctyElmt;
    }

}
