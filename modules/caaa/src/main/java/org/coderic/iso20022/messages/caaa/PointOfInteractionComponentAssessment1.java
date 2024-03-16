//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PointOfInteractionComponentAssessment1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionComponentAssessment1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}POIComponentAssessment1Code"/&gt;
 *         &lt;element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponentAssessment1", propOrder = {
    "tp",
    "assgnr",
    "dlvryDt",
    "xprtnDt",
    "nb"
})
public class PointOfInteractionComponentAssessment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentAssessment1Code tp;
    @XmlElement(name = "Assgnr", required = true)
    protected List<String> assgnr;
    @XmlElement(name = "DlvryDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dlvryDt;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "Nb", required = true)
    protected String nb;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentAssessment1Code }
     *     
     */
    public POIComponentAssessment1Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentAssessment1Code }
     *     
     */
    public void setTp(POIComponentAssessment1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the assgnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssgnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAssgnr() {
        if (assgnr == null) {
            assgnr = new ArrayList<String>();
        }
        return this.assgnr;
    }

    /**
     * Obtiene el valor de la propiedad dlvryDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Define el valor de la propiedad dlvryDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDlvryDt(XMLGregorianCalendar value) {
        this.dlvryDt = value;
    }

    /**
     * Obtiene el valor de la propiedad xprtnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Define el valor de la propiedad xprtnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
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

}
