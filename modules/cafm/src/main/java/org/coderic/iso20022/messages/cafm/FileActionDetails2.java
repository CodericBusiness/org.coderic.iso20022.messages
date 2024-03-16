//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileActionDetails2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileActionDetails2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}OutputFormat5Code" minOccurs="0"/&gt;
 *         &lt;element name="DataRcrd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}DataRecord1Choice"/&gt;
 *         &lt;element name="ActnDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="FileSctyCd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileActionDetails2", propOrder = {
    "fileNm",
    "frmt",
    "dataRcrd",
    "actnDt",
    "fileSctyCd"
})
public class FileActionDetails2 {

    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat5Code frmt;
    @XmlElement(name = "DataRcrd", required = true)
    protected DataRecord1Choice dataRcrd;
    @XmlElement(name = "ActnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actnDt;
    @XmlElement(name = "FileSctyCd")
    protected String fileSctyCd;

    /**
     * Obtiene el valor de la propiedad fileNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNm() {
        return fileNm;
    }

    /**
     * Define el valor de la propiedad fileNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNm(String value) {
        this.fileNm = value;
    }

    /**
     * Obtiene el valor de la propiedad frmt.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat5Code }
     *     
     */
    public OutputFormat5Code getFrmt() {
        return frmt;
    }

    /**
     * Define el valor de la propiedad frmt.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat5Code }
     *     
     */
    public void setFrmt(OutputFormat5Code value) {
        this.frmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dataRcrd.
     * 
     * @return
     *     possible object is
     *     {@link DataRecord1Choice }
     *     
     */
    public DataRecord1Choice getDataRcrd() {
        return dataRcrd;
    }

    /**
     * Define el valor de la propiedad dataRcrd.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRecord1Choice }
     *     
     */
    public void setDataRcrd(DataRecord1Choice value) {
        this.dataRcrd = value;
    }

    /**
     * Obtiene el valor de la propiedad actnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActnDt() {
        return actnDt;
    }

    /**
     * Define el valor de la propiedad actnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActnDt(XMLGregorianCalendar value) {
        this.actnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad fileSctyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSctyCd() {
        return fileSctyCd;
    }

    /**
     * Define el valor de la propiedad fileSctyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSctyCd(String value) {
        this.fileSctyCd = value;
    }

}
