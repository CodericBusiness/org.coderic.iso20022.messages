//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Cardholder19 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Cardholder19"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CrdhldrNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardholderName3" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Credentials2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Address2" minOccurs="0"/&gt;
 *         &lt;element name="CtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Contact1" minOccurs="0"/&gt;
 *         &lt;element name="DtOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="HghValCstmrInd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}LocalData7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder19", propOrder = {
    "crdhldrNm",
    "id",
    "adr",
    "ctctInf",
    "dtOfBirth",
    "hghValCstmrInd",
    "addtlData",
    "lclData"
})
public class Cardholder19 {

    @XmlElement(name = "CrdhldrNm")
    protected CardholderName3 crdhldrNm;
    @XmlElement(name = "Id")
    protected List<Credentials2> id;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "CtctInf")
    protected Contact1 ctctInf;
    @XmlElement(name = "DtOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "HghValCstmrInd")
    protected Boolean hghValCstmrInd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData7 lclData;

    /**
     * Obtiene el valor de la propiedad crdhldrNm.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Define el valor de la propiedad crdhldrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public void setCrdhldrNm(CardholderName3 value) {
        this.crdhldrNm = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credentials2 }
     * 
     * 
     */
    public List<Credentials2> getId() {
        if (id == null) {
            id = new ArrayList<Credentials2>();
        }
        return this.id;
    }

    /**
     * Obtiene el valor de la propiedad adr.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Define el valor de la propiedad adr.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Obtiene el valor de la propiedad ctctInf.
     * 
     * @return
     *     possible object is
     *     {@link Contact1 }
     *     
     */
    public Contact1 getCtctInf() {
        return ctctInf;
    }

    /**
     * Define el valor de la propiedad ctctInf.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact1 }
     *     
     */
    public void setCtctInf(Contact1 value) {
        this.ctctInf = value;
    }

    /**
     * Obtiene el valor de la propiedad dtOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Define el valor de la propiedad dtOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfBirth(XMLGregorianCalendar value) {
        this.dtOfBirth = value;
    }

    /**
     * Obtiene el valor de la propiedad hghValCstmrInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHghValCstmrInd() {
        return hghValCstmrInd;
    }

    /**
     * Define el valor de la propiedad hghValCstmrInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHghValCstmrInd(Boolean value) {
        this.hghValCstmrInd = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
    }

    /**
     * Obtiene el valor de la propiedad lclData.
     * 
     * @return
     *     possible object is
     *     {@link LocalData7 }
     *     
     */
    public LocalData7 getLclData() {
        return lclData;
    }

    /**
     * Define el valor de la propiedad lclData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData7 }
     *     
     */
    public void setLclData(LocalData7 value) {
        this.lclData = value;
    }

}
