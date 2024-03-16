//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:07 PM COT 
//


package org.coderic.iso20022.messages.tsrv;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}UndertakingDocumentType1Choice"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text"/&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}DocumentFormat1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Nclsr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max2MBBinary"/&gt;
 *         &lt;element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyAndSignature2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document9", propOrder = {
    "tp",
    "id",
    "frmt",
    "nclsr",
    "dgtlSgntr"
})
public class Document9 {

    @XmlElement(name = "Tp", required = true)
    protected UndertakingDocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Frmt")
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "Nclsr", required = true)
    protected byte[] nclsr;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingDocumentType1Choice }
     *     
     */
    public UndertakingDocumentType1Choice getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingDocumentType1Choice }
     *     
     */
    public void setTp(UndertakingDocumentType1Choice value) {
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

    /**
     * Obtiene el valor de la propiedad dgtlSgntr.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Define el valor de la propiedad dgtlSgntr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
    }

}
