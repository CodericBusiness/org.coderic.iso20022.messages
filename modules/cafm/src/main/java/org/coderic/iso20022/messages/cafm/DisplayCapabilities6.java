//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DisplayCapabilities6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DisplayCapabilities6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}UserInterface1Code"/&gt;
 *         &lt;element name="AvlblFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}OutputFormat1Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NbOfLines" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="LineWidth" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="AvlblLang" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}LanguageCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayCapabilities6", propOrder = {
    "dstn",
    "avlblFrmt",
    "nbOfLines",
    "lineWidth",
    "avlblLang"
})
public class DisplayCapabilities6 {

    @XmlElement(name = "Dstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface1Code dstn;
    @XmlElement(name = "AvlblFrmt")
    @XmlSchemaType(name = "string")
    protected List<OutputFormat1Code> avlblFrmt;
    @XmlElement(name = "NbOfLines")
    protected BigDecimal nbOfLines;
    @XmlElement(name = "LineWidth")
    protected BigDecimal lineWidth;
    @XmlElement(name = "AvlblLang")
    protected List<String> avlblLang;

    /**
     * Obtiene el valor de la propiedad dstn.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface1Code }
     *     
     */
    public UserInterface1Code getDstn() {
        return dstn;
    }

    /**
     * Define el valor de la propiedad dstn.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface1Code }
     *     
     */
    public void setDstn(UserInterface1Code value) {
        this.dstn = value;
    }

    /**
     * Gets the value of the avlblFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the avlblFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutputFormat1Code }
     * 
     * 
     */
    public List<OutputFormat1Code> getAvlblFrmt() {
        if (avlblFrmt == null) {
            avlblFrmt = new ArrayList<OutputFormat1Code>();
        }
        return this.avlblFrmt;
    }

    /**
     * Obtiene el valor de la propiedad nbOfLines.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfLines() {
        return nbOfLines;
    }

    /**
     * Define el valor de la propiedad nbOfLines.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfLines(BigDecimal value) {
        this.nbOfLines = value;
    }

    /**
     * Obtiene el valor de la propiedad lineWidth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLineWidth() {
        return lineWidth;
    }

    /**
     * Define el valor de la propiedad lineWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLineWidth(BigDecimal value) {
        this.lineWidth = value;
    }

    /**
     * Gets the value of the avlblLang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the avlblLang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlblLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAvlblLang() {
        if (avlblLang == null) {
            avlblLang = new ArrayList<String>();
        }
        return this.avlblLang;
    }

}
