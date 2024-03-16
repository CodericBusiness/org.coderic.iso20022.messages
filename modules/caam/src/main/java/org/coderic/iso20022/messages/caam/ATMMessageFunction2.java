//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMMessageFunction2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMMessageFunction2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fctn" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}MessageFunction11Code"/&gt;
 *         &lt;element name="ATMSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="HstSvcCd" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMMessageFunction2", propOrder = {
    "fctn",
    "atmSvcCd",
    "hstSvcCd"
})
public class ATMMessageFunction2 {

    @XmlElement(name = "Fctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction11Code fctn;
    @XmlElement(name = "ATMSvcCd")
    protected String atmSvcCd;
    @XmlElement(name = "HstSvcCd")
    protected String hstSvcCd;

    /**
     * Obtiene el valor de la propiedad fctn.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction11Code }
     *     
     */
    public MessageFunction11Code getFctn() {
        return fctn;
    }

    /**
     * Define el valor de la propiedad fctn.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction11Code }
     *     
     */
    public void setFctn(MessageFunction11Code value) {
        this.fctn = value;
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

}
