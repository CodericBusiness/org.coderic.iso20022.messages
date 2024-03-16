//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMService24 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMService24"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SvcRef" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ATMSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="HstSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMServiceType10Code"/&gt;
 *         &lt;element name="SvcVarntId" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMService24", propOrder = {
    "svcRef",
    "atmSvcCd",
    "hstSvcCd",
    "svcTp",
    "svcVarntId"
})
public class ATMService24 {

    @XmlElement(name = "SvcRef")
    protected String svcRef;
    @XmlElement(name = "ATMSvcCd")
    protected String atmSvcCd;
    @XmlElement(name = "HstSvcCd")
    protected String hstSvcCd;
    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType10Code svcTp;
    @XmlElement(name = "SvcVarntId")
    protected List<String> svcVarntId;

    /**
     * Obtiene el valor de la propiedad svcRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcRef() {
        return svcRef;
    }

    /**
     * Define el valor de la propiedad svcRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcRef(String value) {
        this.svcRef = value;
    }

    /**
     * Obtiene el valor de la propiedad atmSvcCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMSvcCd() {
        return atmSvcCd;
    }

    /**
     * Define el valor de la propiedad atmSvcCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMSvcCd(String value) {
        this.atmSvcCd = value;
    }

    /**
     * Obtiene el valor de la propiedad hstSvcCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHstSvcCd() {
        return hstSvcCd;
    }

    /**
     * Define el valor de la propiedad hstSvcCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHstSvcCd(String value) {
        this.hstSvcCd = value;
    }

    /**
     * Obtiene el valor de la propiedad svcTp.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType10Code }
     *     
     */
    public ATMServiceType10Code getSvcTp() {
        return svcTp;
    }

    /**
     * Define el valor de la propiedad svcTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType10Code }
     *     
     */
    public void setSvcTp(ATMServiceType10Code value) {
        this.svcTp = value;
    }

    /**
     * Gets the value of the svcVarntId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the svcVarntId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcVarntId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSvcVarntId() {
        if (svcVarntId == null) {
            svcVarntId = new ArrayList<String>();
        }
        return this.svcVarntId;
    }

}
