//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileData1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DocumentType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text"/&gt;
 *         &lt;element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DateAndDateTime2Choice" minOccurs="0"/&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DocumentFormat1Choice" minOccurs="0"/&gt;
 *         &lt;element name="FileNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="NtwkRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="FileLctnElctrncAdr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max2048Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileData1", propOrder = {
    "tp",
    "id",
    "isseDt",
    "frmt",
    "fileNm",
    "ntwkRef",
    "fileLctnElctrncAdr"
})
public class FileData1 {

    @XmlElement(name = "Tp")
    protected DocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsseDt")
    protected DateAndDateTime2Choice isseDt;
    @XmlElement(name = "Frmt")
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "NtwkRef")
    protected String ntwkRef;
    @XmlElement(name = "FileLctnElctrncAdr")
    protected String fileLctnElctrncAdr;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1Choice }
     *     
     */
    public DocumentType1Choice getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1Choice }
     *     
     */
    public void setTp(DocumentType1Choice value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad isseDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Define el valor de la propiedad isseDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setIsseDt(DateAndDateTime2Choice value) {
        this.isseDt = value;
    }

    /**
     * Obtiene el valor de la propiedad frmt.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public DocumentFormat1Choice getFrmt() {
        return frmt;
    }

    /**
     * Define el valor de la propiedad frmt.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public void setFrmt(DocumentFormat1Choice value) {
        this.frmt = value;
    }

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
     * Obtiene el valor de la propiedad ntwkRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtwkRef() {
        return ntwkRef;
    }

    /**
     * Define el valor de la propiedad ntwkRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtwkRef(String value) {
        this.ntwkRef = value;
    }

    /**
     * Obtiene el valor de la propiedad fileLctnElctrncAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileLctnElctrncAdr() {
        return fileLctnElctrncAdr;
    }

    /**
     * Define el valor de la propiedad fileLctnElctrncAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileLctnElctrncAdr(String value) {
        this.fileLctnElctrncAdr = value;
    }

}
