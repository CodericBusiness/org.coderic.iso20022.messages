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
 * <p>Clase Java para TransactionIdentification12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionIdentification12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SysTracAudtNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max12NumericText"/&gt;
 *         &lt;element name="TrnsmssnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODateTime"/&gt;
 *         &lt;element name="RtrvlRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Exact12Text" minOccurs="0"/&gt;
 *         &lt;element name="LifeCyclTracIdData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TransactionLifeCycleIdentification2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification12", propOrder = {
    "sysTracAudtNb",
    "trnsmssnDtTm",
    "rtrvlRefNb",
    "lifeCyclTracIdData"
})
public class TransactionIdentification12 {

    @XmlElement(name = "SysTracAudtNb", required = true)
    protected String sysTracAudtNb;
    @XmlElement(name = "TrnsmssnDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnsmssnDtTm;
    @XmlElement(name = "RtrvlRefNb")
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclTracIdData")
    protected TransactionLifeCycleIdentification2 lifeCyclTracIdData;

    /**
     * Obtiene el valor de la propiedad sysTracAudtNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTracAudtNb() {
        return sysTracAudtNb;
    }

    /**
     * Define el valor de la propiedad sysTracAudtNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
    }

    /**
     * Obtiene el valor de la propiedad trnsmssnDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnsmssnDtTm() {
        return trnsmssnDtTm;
    }

    /**
     * Define el valor de la propiedad trnsmssnDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnsmssnDtTm(XMLGregorianCalendar value) {
        this.trnsmssnDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad rtrvlRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlRefNb() {
        return rtrvlRefNb;
    }

    /**
     * Define el valor de la propiedad rtrvlRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad lifeCyclTracIdData.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLifeCycleIdentification2 }
     *     
     */
    public TransactionLifeCycleIdentification2 getLifeCyclTracIdData() {
        return lifeCyclTracIdData;
    }

    /**
     * Define el valor de la propiedad lifeCyclTracIdData.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLifeCycleIdentification2 }
     *     
     */
    public void setLifeCyclTracIdData(TransactionLifeCycleIdentification2 value) {
        this.lifeCyclTracIdData = value;
    }

}
