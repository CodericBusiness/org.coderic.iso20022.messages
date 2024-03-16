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
 * <p>Clase Java para Document12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DocumentType1Choice"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text"/&gt;
 *         &lt;element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DateAndDateTime2Choice"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="LangCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DocumentFormat1Choice"/&gt;
 *         &lt;element name="FileNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}PartyAndSignature3" minOccurs="0"/&gt;
 *         &lt;element name="Nclsr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max10MbBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document12", propOrder = {
    "tp",
    "id",
    "isseDt",
    "nm",
    "langCd",
    "frmt",
    "fileNm",
    "dgtlSgntr",
    "nclsr"
})
public class Document12 {

    @XmlElement(name = "Tp", required = true)
    protected DocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsseDt", required = true)
    protected DateAndDateTime2Choice isseDt;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "Frmt", required = true)
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature3 dgtlSgntr;
    @XmlElement(name = "Nclsr", required = true)
    protected byte[] nclsr;

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
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad langCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Define el valor de la propiedad langCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
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
     * Obtiene el valor de la propiedad dgtlSgntr.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature3 }
     *     
     */
    public PartyAndSignature3 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Define el valor de la propiedad dgtlSgntr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature3 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature3 value) {
        this.dgtlSgntr = value;
    }

    /**
     * Obtiene el valor de la propiedad nclsr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNclsr() {
        return nclsr;
    }

    /**
     * Define el valor de la propiedad nclsr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNclsr(byte[] value) {
        this.nclsr = value;
    }

}
