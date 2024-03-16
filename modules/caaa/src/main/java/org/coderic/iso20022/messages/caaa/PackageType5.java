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
 * <p>Clase Java para PackageType5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PackageType5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackgId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}GenericIdentification176" minOccurs="0"/&gt;
 *         &lt;element name="PackgLngth" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="OffsetStart" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="OffsetEnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PositiveNumber" minOccurs="0"/&gt;
 *         &lt;element name="PackgBlck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ExternallyDefinedData5" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType5", propOrder = {
    "packgId",
    "packgLngth",
    "offsetStart",
    "offsetEnd",
    "packgBlck"
})
public class PackageType5 {

    @XmlElement(name = "PackgId")
    protected GenericIdentification176 packgId;
    @XmlElement(name = "PackgLngth")
    protected BigDecimal packgLngth;
    @XmlElement(name = "OffsetStart")
    protected BigDecimal offsetStart;
    @XmlElement(name = "OffsetEnd")
    protected BigDecimal offsetEnd;
    @XmlElement(name = "PackgBlck")
    protected List<ExternallyDefinedData5> packgBlck;

    /**
     * Obtiene el valor de la propiedad packgId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPackgId() {
        return packgId;
    }

    /**
     * Define el valor de la propiedad packgId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setPackgId(GenericIdentification176 value) {
        this.packgId = value;
    }

    /**
     * Obtiene el valor de la propiedad packgLngth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPackgLngth() {
        return packgLngth;
    }

    /**
     * Define el valor de la propiedad packgLngth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPackgLngth(BigDecimal value) {
        this.packgLngth = value;
    }

    /**
     * Obtiene el valor de la propiedad offsetStart.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetStart() {
        return offsetStart;
    }

    /**
     * Define el valor de la propiedad offsetStart.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetStart(BigDecimal value) {
        this.offsetStart = value;
    }

    /**
     * Obtiene el valor de la propiedad offsetEnd.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetEnd() {
        return offsetEnd;
    }

    /**
     * Define el valor de la propiedad offsetEnd.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetEnd(BigDecimal value) {
        this.offsetEnd = value;
    }

    /**
     * Gets the value of the packgBlck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packgBlck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackgBlck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData5 }
     * 
     * 
     */
    public List<ExternallyDefinedData5> getPackgBlck() {
        if (packgBlck == null) {
            packgBlck = new ArrayList<ExternallyDefinedData5>();
        }
        return this.packgBlck;
    }

}
