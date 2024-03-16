//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AdditionalInformation20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AdditionalInformation20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}PartyType22Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrRcpt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Trgt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}UserInterface6Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OthrTrgt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}OutputFormat4Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max20KText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation20", propOrder = {
    "rcpt",
    "othrRcpt",
    "trgt",
    "othrTrgt",
    "frmt",
    "othrFrmt",
    "tp",
    "val"
})
public class AdditionalInformation20 {

    @XmlElement(name = "Rcpt")
    @XmlSchemaType(name = "string")
    protected PartyType22Code rcpt;
    @XmlElement(name = "OthrRcpt")
    protected String othrRcpt;
    @XmlElement(name = "Trgt")
    @XmlSchemaType(name = "string")
    protected List<UserInterface6Code> trgt;
    @XmlElement(name = "OthrTrgt")
    protected String othrTrgt;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Obtiene el valor de la propiedad rcpt.
     * 
     * @return
     *     possible object is
     *     {@link PartyType22Code }
     *     
     */
    public PartyType22Code getRcpt() {
        return rcpt;
    }

    /**
     * Define el valor de la propiedad rcpt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType22Code }
     *     
     */
    public void setRcpt(PartyType22Code value) {
        this.rcpt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrRcpt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcpt() {
        return othrRcpt;
    }

    /**
     * Define el valor de la propiedad othrRcpt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRcpt(String value) {
        this.othrRcpt = value;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the trgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterface6Code }
     * 
     * 
     */
    public List<UserInterface6Code> getTrgt() {
        if (trgt == null) {
            trgt = new ArrayList<UserInterface6Code>();
        }
        return this.trgt;
    }

    /**
     * Obtiene el valor de la propiedad othrTrgt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTrgt() {
        return othrTrgt;
    }

    /**
     * Define el valor de la propiedad othrTrgt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTrgt(String value) {
        this.othrTrgt = value;
    }

    /**
     * Obtiene el valor de la propiedad frmt.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat4Code }
     *     
     */
    public OutputFormat4Code getFrmt() {
        return frmt;
    }

    /**
     * Define el valor de la propiedad frmt.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat4Code }
     *     
     */
    public void setFrmt(OutputFormat4Code value) {
        this.frmt = value;
    }

    /**
     * Obtiene el valor de la propiedad othrFrmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Define el valor de la propiedad othrFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrmt(String value) {
        this.othrFrmt = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad val.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Define el valor de la propiedad val.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
    }

}
