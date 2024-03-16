//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Series1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Series1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SrsDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}DateFormat42Choice" minOccurs="0"/&gt;
 *         &lt;element name="SrsNm" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Series1", propOrder = {
    "srsDt",
    "srsNm"
})
public class Series1 {

    @XmlElement(name = "SrsDt")
    protected DateFormat42Choice srsDt;
    @XmlElement(name = "SrsNm")
    protected String srsNm;

    /**
     * Obtiene el valor de la propiedad srsDt.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat42Choice }
     *     
     */
    public DateFormat42Choice getSrsDt() {
        return srsDt;
    }

    /**
     * Define el valor de la propiedad srsDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat42Choice }
     *     
     */
    public void setSrsDt(DateFormat42Choice value) {
        this.srsDt = value;
    }

    /**
     * Obtiene el valor de la propiedad srsNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsNm() {
        return srsNm;
    }

    /**
     * Define el valor de la propiedad srsNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsNm(String value) {
        this.srsNm = value;
    }

}
