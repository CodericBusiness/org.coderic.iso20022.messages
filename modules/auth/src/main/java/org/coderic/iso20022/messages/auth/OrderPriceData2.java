//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderPriceData2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderPriceData2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LmtPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice2Choice" minOccurs="0"/&gt;
 *         &lt;element name="StopPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice2Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlLmtPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice2Choice" minOccurs="0"/&gt;
 *         &lt;element name="PggdPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice2Choice" minOccurs="0"/&gt;
 *         &lt;element name="CcyScndLeg" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderPriceData2", propOrder = {
    "lmtPric",
    "stopPric",
    "addtlLmtPric",
    "pggdPric",
    "ccyScndLeg"
})
public class OrderPriceData2 {

    @XmlElement(name = "LmtPric")
    protected SecuritiesTransactionPrice2Choice lmtPric;
    @XmlElement(name = "StopPric")
    protected SecuritiesTransactionPrice2Choice stopPric;
    @XmlElement(name = "AddtlLmtPric")
    protected SecuritiesTransactionPrice2Choice addtlLmtPric;
    @XmlElement(name = "PggdPric")
    protected SecuritiesTransactionPrice2Choice pggdPric;
    @XmlElement(name = "CcyScndLeg")
    protected String ccyScndLeg;

    /**
     * Obtiene el valor de la propiedad lmtPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getLmtPric() {
        return lmtPric;
    }

    /**
     * Define el valor de la propiedad lmtPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setLmtPric(SecuritiesTransactionPrice2Choice value) {
        this.lmtPric = value;
    }

    /**
     * Obtiene el valor de la propiedad stopPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getStopPric() {
        return stopPric;
    }

    /**
     * Define el valor de la propiedad stopPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setStopPric(SecuritiesTransactionPrice2Choice value) {
        this.stopPric = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlLmtPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getAddtlLmtPric() {
        return addtlLmtPric;
    }

    /**
     * Define el valor de la propiedad addtlLmtPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setAddtlLmtPric(SecuritiesTransactionPrice2Choice value) {
        this.addtlLmtPric = value;
    }

    /**
     * Obtiene el valor de la propiedad pggdPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPggdPric() {
        return pggdPric;
    }

    /**
     * Define el valor de la propiedad pggdPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setPggdPric(SecuritiesTransactionPrice2Choice value) {
        this.pggdPric = value;
    }

    /**
     * Obtiene el valor de la propiedad ccyScndLeg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyScndLeg() {
        return ccyScndLeg;
    }

    /**
     * Define el valor de la propiedad ccyScndLeg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyScndLeg(String value) {
        this.ccyScndLeg = value;
    }

}
