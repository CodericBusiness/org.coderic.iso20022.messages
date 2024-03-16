//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NumberOfItemsPerStatus1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NumberOfItemsPerStatus1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemStatus1Code"/&gt;
 *         &lt;element name="NbOfItms" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}Max15NumericText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberOfItemsPerStatus1", propOrder = {
    "sts",
    "nbOfItms"
})
public class NumberOfItemsPerStatus1 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected ReportItemStatus1Code sts;
    @XmlElement(name = "NbOfItms", required = true)
    protected String nbOfItms;

    /**
     * Obtiene el valor de la propiedad sts.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemStatus1Code }
     *     
     */
    public ReportItemStatus1Code getSts() {
        return sts;
    }

    /**
     * Define el valor de la propiedad sts.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemStatus1Code }
     *     
     */
    public void setSts(ReportItemStatus1Code value) {
        this.sts = value;
    }

    /**
     * Obtiene el valor de la propiedad nbOfItms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfItms() {
        return nbOfItms;
    }

    /**
     * Define el valor de la propiedad nbOfItms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfItms(String value) {
        this.nbOfItms = value;
    }

}
