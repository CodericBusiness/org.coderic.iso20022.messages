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
 * <p>Clase Java para Customer7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Customer7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CstmrId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CstmrDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CardholderName3" minOccurs="0"/&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Address2" minOccurs="0"/&gt;
 *         &lt;element name="CtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Contact6" minOccurs="0"/&gt;
 *         &lt;element name="Crdntls" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Credentials2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Ntlty" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOMax3ACountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CtryOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISOMax3ACountryCode" minOccurs="0"/&gt;
 *         &lt;element name="DtOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}LocalData3" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer7", propOrder = {
    "cstmrId",
    "cstmrDsgnt",
    "nm",
    "adr",
    "ctctInf",
    "crdntls",
    "ntlty",
    "ctryOfBirth",
    "dtOfBirth",
    "lclData",
    "addtlData"
})
public class Customer7 {

    @XmlElement(name = "CstmrId")
    protected String cstmrId;
    @XmlElement(name = "CstmrDsgnt")
    protected String cstmrDsgnt;
    @XmlElement(name = "Nm")
    protected CardholderName3 nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "CtctInf")
    protected Contact6 ctctInf;
    @XmlElement(name = "Crdntls")
    protected List<Credentials2> crdntls;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "DtOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "LclData")
    protected LocalData3 lclData;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad cstmrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrId() {
        return cstmrId;
    }

    /**
     * Define el valor de la propiedad cstmrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrId(String value) {
        this.cstmrId = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmrDsgnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrDsgnt() {
        return cstmrDsgnt;
    }

    /**
     * Define el valor de la propiedad cstmrDsgnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrDsgnt(String value) {
        this.cstmrDsgnt = value;
    }

    /**
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public void setNm(CardholderName3 value) {
        this.nm = value;
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
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtctInf() {
        return ctctInf;
    }

    /**
     * Define el valor de la propiedad ctctInf.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public void setCtctInf(Contact6 value) {
        this.ctctInf = value;
    }

    /**
     * Gets the value of the crdntls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crdntls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdntls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credentials2 }
     * 
     * 
     */
    public List<Credentials2> getCrdntls() {
        if (crdntls == null) {
            crdntls = new ArrayList<Credentials2>();
        }
        return this.crdntls;
    }

    /**
     * Obtiene el valor de la propiedad ntlty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Define el valor de la propiedad ntlty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlty(String value) {
        this.ntlty = value;
    }

    /**
     * Obtiene el valor de la propiedad ctryOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    /**
     * Define el valor de la propiedad ctryOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
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
     * Obtiene el valor de la propiedad lclData.
     * 
     * @return
     *     possible object is
     *     {@link LocalData3 }
     *     
     */
    public LocalData3 getLclData() {
        return lclData;
    }

    /**
     * Define el valor de la propiedad lclData.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData3 }
     *     
     */
    public void setLclData(LocalData3 value) {
        this.lclData = value;
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

}
