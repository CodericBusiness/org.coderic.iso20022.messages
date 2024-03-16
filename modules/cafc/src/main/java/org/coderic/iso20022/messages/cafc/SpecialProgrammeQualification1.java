//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SpecialProgrammeQualification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecialProgrammeQualification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Prgrmm" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Dtl" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SpecialProgrammeDetails1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialProgrammeQualification1", propOrder = {
    "prgrmm",
    "dtl"
})
public class SpecialProgrammeQualification1 {

    @XmlElement(name = "Prgrmm")
    protected String prgrmm;
    @XmlElement(name = "Dtl")
    protected List<SpecialProgrammeDetails1> dtl;

    /**
     * Obtiene el valor de la propiedad prgrmm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmm() {
        return prgrmm;
    }

    /**
     * Define el valor de la propiedad prgrmm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgrmm(String value) {
        this.prgrmm = value;
    }

    /**
     * Gets the value of the dtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProgrammeDetails1 }
     * 
     * 
     */
    public List<SpecialProgrammeDetails1> getDtl() {
        if (dtl == null) {
            dtl = new ArrayList<SpecialProgrammeDetails1>();
        }
        return this.dtl;
    }

}
