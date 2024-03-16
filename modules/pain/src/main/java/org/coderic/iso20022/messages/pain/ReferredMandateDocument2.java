//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReferredMandateDocument2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReferredMandateDocument2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}DocumentType1" minOccurs="0"/&gt;
 *         &lt;element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CdtrRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}DateAndType1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredMandateDocument2", propOrder = {
    "tp",
    "nb",
    "cdtrRef",
    "rltdDt"
})
public class ReferredMandateDocument2 {

    @XmlElement(name = "Tp")
    protected DocumentType1 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "CdtrRef")
    protected String cdtrRef;
    @XmlElement(name = "RltdDt")
    protected DateAndType1 rltdDt;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1 }
     *     
     */
    public DocumentType1 getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1 }
     *     
     */
    public void setTp(DocumentType1 value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad nb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Define el valor de la propiedad nb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrRef() {
        return cdtrRef;
    }

    /**
     * Define el valor de la propiedad cdtrRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrRef(String value) {
        this.cdtrRef = value;
    }

    /**
     * Obtiene el valor de la propiedad rltdDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndType1 }
     *     
     */
    public DateAndType1 getRltdDt() {
        return rltdDt;
    }

    /**
     * Define el valor de la propiedad rltdDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndType1 }
     *     
     */
    public void setRltdDt(DateAndType1 value) {
        this.rltdDt = value;
    }

}
