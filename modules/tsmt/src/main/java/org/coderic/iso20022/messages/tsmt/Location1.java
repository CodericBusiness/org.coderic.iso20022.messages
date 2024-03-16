//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Location1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Location1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CtrySubDvsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}CountrySubdivision1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Txt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location1", propOrder = {
    "ctry",
    "ctrySubDvsn",
    "txt"
})
public class Location1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CtrySubDvsn")
    protected CountrySubdivision1Choice ctrySubDvsn;
    @XmlElement(name = "Txt")
    protected List<String> txt;

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrySubDvsn.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivision1Choice }
     *     
     */
    public CountrySubdivision1Choice getCtrySubDvsn() {
        return ctrySubDvsn;
    }

    /**
     * Define el valor de la propiedad ctrySubDvsn.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivision1Choice }
     *     
     */
    public void setCtrySubDvsn(CountrySubdivision1Choice value) {
        this.ctrySubDvsn = value;
    }

    /**
     * Gets the value of the txt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the txt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTxt() {
        if (txt == null) {
            txt = new ArrayList<String>();
        }
        return this.txt;
    }

}
