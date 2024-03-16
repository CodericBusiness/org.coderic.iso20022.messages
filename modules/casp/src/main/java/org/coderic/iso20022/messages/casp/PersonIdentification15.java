//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PersonIdentification15 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonIdentification15"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DrvrLicNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DrvrLicLctn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DrvrLicNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DrvrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CstmrNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SclSctyNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AlnRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PsptNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="IdntyCardNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MplyrIdNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MplyeeIdNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="JobNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Dept" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EmailAdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max256Text" minOccurs="0"/&gt;
 *         &lt;element name="DtAndPlcOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}DateAndPlaceOfBirth1" minOccurs="0"/&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}GenericIdentification4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification15", propOrder = {
    "drvrLicNb",
    "drvrLicLctn",
    "drvrLicNm",
    "drvrId",
    "cstmrNb",
    "sclSctyNb",
    "alnRegnNb",
    "psptNb",
    "taxIdNb",
    "idntyCardNb",
    "mplyrIdNb",
    "mplyeeIdNb",
    "jobNb",
    "dept",
    "emailAdr",
    "dtAndPlcOfBirth",
    "othr"
})
public class PersonIdentification15 {

    @XmlElement(name = "DrvrLicNb")
    protected String drvrLicNb;
    @XmlElement(name = "DrvrLicLctn")
    protected String drvrLicLctn;
    @XmlElement(name = "DrvrLicNm")
    protected String drvrLicNm;
    @XmlElement(name = "DrvrId")
    protected String drvrId;
    @XmlElement(name = "CstmrNb")
    protected String cstmrNb;
    @XmlElement(name = "SclSctyNb")
    protected String sclSctyNb;
    @XmlElement(name = "AlnRegnNb")
    protected String alnRegnNb;
    @XmlElement(name = "PsptNb")
    protected String psptNb;
    @XmlElement(name = "TaxIdNb")
    protected String taxIdNb;
    @XmlElement(name = "IdntyCardNb")
    protected String idntyCardNb;
    @XmlElement(name = "MplyrIdNb")
    protected String mplyrIdNb;
    @XmlElement(name = "MplyeeIdNb")
    protected String mplyeeIdNb;
    @XmlElement(name = "JobNb")
    protected String jobNb;
    @XmlElement(name = "Dept")
    protected String dept;
    @XmlElement(name = "EmailAdr")
    protected String emailAdr;
    @XmlElement(name = "DtAndPlcOfBirth")
    protected DateAndPlaceOfBirth1 dtAndPlcOfBirth;
    @XmlElement(name = "Othr")
    protected List<GenericIdentification4> othr;

    /**
     * Obtiene el valor de la propiedad drvrLicNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicNb() {
        return drvrLicNb;
    }

    /**
     * Define el valor de la propiedad drvrLicNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrLicNb(String value) {
        this.drvrLicNb = value;
    }

    /**
     * Obtiene el valor de la propiedad drvrLicLctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicLctn() {
        return drvrLicLctn;
    }

    /**
     * Define el valor de la propiedad drvrLicLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrLicLctn(String value) {
        this.drvrLicLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad drvrLicNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrLicNm() {
        return drvrLicNm;
    }

    /**
     * Define el valor de la propiedad drvrLicNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrLicNm(String value) {
        this.drvrLicNm = value;
    }

    /**
     * Obtiene el valor de la propiedad drvrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrId() {
        return drvrId;
    }

    /**
     * Define el valor de la propiedad drvrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvrId(String value) {
        this.drvrId = value;
    }

    /**
     * Obtiene el valor de la propiedad cstmrNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrNb() {
        return cstmrNb;
    }

    /**
     * Define el valor de la propiedad cstmrNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrNb(String value) {
        this.cstmrNb = value;
    }

    /**
     * Obtiene el valor de la propiedad sclSctyNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSclSctyNb() {
        return sclSctyNb;
    }

    /**
     * Define el valor de la propiedad sclSctyNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSclSctyNb(String value) {
        this.sclSctyNb = value;
    }

    /**
     * Obtiene el valor de la propiedad alnRegnNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlnRegnNb() {
        return alnRegnNb;
    }

    /**
     * Define el valor de la propiedad alnRegnNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlnRegnNb(String value) {
        this.alnRegnNb = value;
    }

    /**
     * Obtiene el valor de la propiedad psptNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPsptNb() {
        return psptNb;
    }

    /**
     * Define el valor de la propiedad psptNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPsptNb(String value) {
        this.psptNb = value;
    }

    /**
     * Obtiene el valor de la propiedad taxIdNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIdNb() {
        return taxIdNb;
    }

    /**
     * Define el valor de la propiedad taxIdNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIdNb(String value) {
        this.taxIdNb = value;
    }

    /**
     * Obtiene el valor de la propiedad idntyCardNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdntyCardNb() {
        return idntyCardNb;
    }

    /**
     * Define el valor de la propiedad idntyCardNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdntyCardNb(String value) {
        this.idntyCardNb = value;
    }

    /**
     * Obtiene el valor de la propiedad mplyrIdNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyrIdNb() {
        return mplyrIdNb;
    }

    /**
     * Define el valor de la propiedad mplyrIdNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyrIdNb(String value) {
        this.mplyrIdNb = value;
    }

    /**
     * Obtiene el valor de la propiedad mplyeeIdNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMplyeeIdNb() {
        return mplyeeIdNb;
    }

    /**
     * Define el valor de la propiedad mplyeeIdNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMplyeeIdNb(String value) {
        this.mplyeeIdNb = value;
    }

    /**
     * Obtiene el valor de la propiedad jobNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobNb() {
        return jobNb;
    }

    /**
     * Define el valor de la propiedad jobNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobNb(String value) {
        this.jobNb = value;
    }

    /**
     * Obtiene el valor de la propiedad dept.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDept() {
        return dept;
    }

    /**
     * Define el valor de la propiedad dept.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDept(String value) {
        this.dept = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAdr() {
        return emailAdr;
    }

    /**
     * Define el valor de la propiedad emailAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAdr(String value) {
        this.emailAdr = value;
    }

    /**
     * Obtiene el valor de la propiedad dtAndPlcOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link DateAndPlaceOfBirth1 }
     *     
     */
    public DateAndPlaceOfBirth1 getDtAndPlcOfBirth() {
        return dtAndPlcOfBirth;
    }

    /**
     * Define el valor de la propiedad dtAndPlcOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndPlaceOfBirth1 }
     *     
     */
    public void setDtAndPlcOfBirth(DateAndPlaceOfBirth1 value) {
        this.dtAndPlcOfBirth = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification4 }
     * 
     * 
     */
    public List<GenericIdentification4> getOthr() {
        if (othr == null) {
            othr = new ArrayList<GenericIdentification4>();
        }
        return this.othr;
    }

}
