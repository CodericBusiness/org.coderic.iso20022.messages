//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:45 PM COT 
//


package org.coderic.iso20022.messages.acmt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AccountSwitchDetails1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AccountSwitchDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnqRefNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}Max35Text"/&gt;
 *         &lt;element name="RtgUnqRefNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}Max35Text"/&gt;
 *         &lt;element name="SwtchRcvdDtTm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="SwtchDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="SwtchTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}SwitchType1Code"/&gt;
 *         &lt;element name="SwtchSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}SwitchStatus1Code" minOccurs="0"/&gt;
 *         &lt;element name="BalTrfWndw" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}BalanceTransferWindow1Code" minOccurs="0"/&gt;
 *         &lt;element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.037.001.02}ResponseDetails1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchDetails1", propOrder = {
    "unqRefNb",
    "rtgUnqRefNb",
    "swtchRcvdDtTm",
    "swtchDt",
    "swtchTp",
    "swtchSts",
    "balTrfWndw",
    "rspn"
})
public class AccountSwitchDetails1 {

    @XmlElement(name = "UnqRefNb", required = true)
    protected String unqRefNb;
    @XmlElement(name = "RtgUnqRefNb", required = true)
    protected String rtgUnqRefNb;
    @XmlElement(name = "SwtchRcvdDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar swtchRcvdDtTm;
    @XmlElement(name = "SwtchDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar swtchDt;
    @XmlElement(name = "SwtchTp", required = true)
    @XmlSchemaType(name = "string")
    protected SwitchType1Code swtchTp;
    @XmlElement(name = "SwtchSts")
    @XmlSchemaType(name = "string")
    protected SwitchStatus1Code swtchSts;
    @XmlElement(name = "BalTrfWndw")
    @XmlSchemaType(name = "string")
    protected BalanceTransferWindow1Code balTrfWndw;
    @XmlElement(name = "Rspn")
    protected List<ResponseDetails1> rspn;

    /**
     * Obtiene el valor de la propiedad unqRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqRefNb() {
        return unqRefNb;
    }

    /**
     * Define el valor de la propiedad unqRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqRefNb(String value) {
        this.unqRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad rtgUnqRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgUnqRefNb() {
        return rtgUnqRefNb;
    }

    /**
     * Define el valor de la propiedad rtgUnqRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtgUnqRefNb(String value) {
        this.rtgUnqRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad swtchRcvdDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSwtchRcvdDtTm() {
        return swtchRcvdDtTm;
    }

    /**
     * Define el valor de la propiedad swtchRcvdDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSwtchRcvdDtTm(XMLGregorianCalendar value) {
        this.swtchRcvdDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad swtchDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSwtchDt() {
        return swtchDt;
    }

    /**
     * Define el valor de la propiedad swtchDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSwtchDt(XMLGregorianCalendar value) {
        this.swtchDt = value;
    }

    /**
     * Obtiene el valor de la propiedad swtchTp.
     * 
     * @return
     *     possible object is
     *     {@link SwitchType1Code }
     *     
     */
    public SwitchType1Code getSwtchTp() {
        return swtchTp;
    }

    /**
     * Define el valor de la propiedad swtchTp.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchType1Code }
     *     
     */
    public void setSwtchTp(SwitchType1Code value) {
        this.swtchTp = value;
    }

    /**
     * Obtiene el valor de la propiedad swtchSts.
     * 
     * @return
     *     possible object is
     *     {@link SwitchStatus1Code }
     *     
     */
    public SwitchStatus1Code getSwtchSts() {
        return swtchSts;
    }

    /**
     * Define el valor de la propiedad swtchSts.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchStatus1Code }
     *     
     */
    public void setSwtchSts(SwitchStatus1Code value) {
        this.swtchSts = value;
    }

    /**
     * Obtiene el valor de la propiedad balTrfWndw.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferWindow1Code }
     *     
     */
    public BalanceTransferWindow1Code getBalTrfWndw() {
        return balTrfWndw;
    }

    /**
     * Define el valor de la propiedad balTrfWndw.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferWindow1Code }
     *     
     */
    public void setBalTrfWndw(BalanceTransferWindow1Code value) {
        this.balTrfWndw = value;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDetails1 }
     * 
     * 
     */
    public List<ResponseDetails1> getRspn() {
        if (rspn == null) {
            rspn = new ArrayList<ResponseDetails1>();
        }
        return this.rspn;
    }

}
