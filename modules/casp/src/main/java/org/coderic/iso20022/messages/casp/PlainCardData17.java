//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PlainCardData17 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PlainCardData17"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAN" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Min8Max28NumericText" minOccurs="0"/&gt;
 *         &lt;element name="Trck1" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max76Text" minOccurs="0"/&gt;
 *         &lt;element name="Trck2" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max37Text" minOccurs="0"/&gt;
 *         &lt;element name="Trck3" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max104Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCardData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CardDataReading5Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData17", propOrder = {
    "pan",
    "trck1",
    "trck2",
    "trck3",
    "addtlCardData",
    "ntryMd"
})
public class PlainCardData17 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "Trck1")
    protected String trck1;
    @XmlElement(name = "Trck2")
    protected String trck2;
    @XmlElement(name = "Trck3")
    protected String trck3;
    @XmlElement(name = "AddtlCardData")
    protected List<String> addtlCardData;
    @XmlElement(name = "NtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code ntryMd;

    /**
     * Obtiene el valor de la propiedad pan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Define el valor de la propiedad pan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Obtiene el valor de la propiedad trck1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck1() {
        return trck1;
    }

    /**
     * Define el valor de la propiedad trck1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck1(String value) {
        this.trck1 = value;
    }

    /**
     * Obtiene el valor de la propiedad trck2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck2() {
        return trck2;
    }

    /**
     * Define el valor de la propiedad trck2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck2(String value) {
        this.trck2 = value;
    }

    /**
     * Obtiene el valor de la propiedad trck3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrck3() {
        return trck3;
    }

    /**
     * Define el valor de la propiedad trck3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrck3(String value) {
        this.trck3 = value;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlCardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlCardData() {
        if (addtlCardData == null) {
            addtlCardData = new ArrayList<String>();
        }
        return this.addtlCardData;
    }

    /**
     * Obtiene el valor de la propiedad ntryMd.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading5Code }
     *     
     */
    public CardDataReading5Code getNtryMd() {
        return ntryMd;
    }

    /**
     * Define el valor de la propiedad ntryMd.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading5Code }
     *     
     */
    public void setNtryMd(CardDataReading5Code value) {
        this.ntryMd = value;
    }

}
