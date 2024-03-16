//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingDateDetails1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancingDateDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CdtDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *         &lt;element name="DbtDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingDateDetails1", propOrder = {
    "bookDt",
    "cdtDt",
    "dbtDt"
})
public class FinancingDateDetails1 {

    @XmlElement(name = "BookDt")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> bookDt;
    @XmlElement(name = "CdtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cdtDt;
    @XmlElement(name = "DbtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dbtDt;

    /**
     * Gets the value of the bookDt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bookDt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookDt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     */
    public List<XMLGregorianCalendar> getBookDt() {
        if (bookDt == null) {
            bookDt = new ArrayList<XMLGregorianCalendar>();
        }
        return this.bookDt;
    }

    /**
     * Obtiene el valor de la propiedad cdtDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCdtDt() {
        return cdtDt;
    }

    /**
     * Define el valor de la propiedad cdtDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCdtDt(XMLGregorianCalendar value) {
        this.cdtDt = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDbtDt() {
        return dbtDt;
    }

    /**
     * Define el valor de la propiedad dbtDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDbtDt(XMLGregorianCalendar value) {
        this.dbtDt = value;
    }

}
