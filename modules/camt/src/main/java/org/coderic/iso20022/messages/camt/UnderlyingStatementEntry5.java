//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UnderlyingStatementEntry5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingStatementEntry5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}OriginalGroupInformation29" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlStmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlNtryRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UUIDv4Identifier" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlNtryAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlNtryValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}DateAndDateTime2Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingStatementEntry5", propOrder = {
    "orgnlAcct",
    "orgnlGrpInf",
    "orgnlStmtId",
    "orgnlNtryRef",
    "orgnlUETR",
    "orgnlNtryAmt",
    "orgnlNtryValDt"
})
public class UnderlyingStatementEntry5 {

    @XmlElement(name = "OrgnlAcct")
    protected CashAccount40 orgnlAcct;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "OrgnlStmtId")
    protected String orgnlStmtId;
    @XmlElement(name = "OrgnlNtryRef")
    protected String orgnlNtryRef;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "OrgnlNtryAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlNtryAmt;
    @XmlElement(name = "OrgnlNtryValDt")
    protected DateAndDateTime2Choice orgnlNtryValDt;

    /**
     * Obtiene el valor de la propiedad orgnlAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getOrgnlAcct() {
        return orgnlAcct;
    }

    /**
     * Define el valor de la propiedad orgnlAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setOrgnlAcct(CashAccount40 value) {
        this.orgnlAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlGrpInf.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Define el valor de la propiedad orgnlGrpInf.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlStmtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlStmtId() {
        return orgnlStmtId;
    }

    /**
     * Define el valor de la propiedad orgnlStmtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlStmtId(String value) {
        this.orgnlStmtId = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlNtryRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtryRef() {
        return orgnlNtryRef;
    }

    /**
     * Define el valor de la propiedad orgnlNtryRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlNtryRef(String value) {
        this.orgnlNtryRef = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlUETR.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Define el valor de la propiedad orgnlUETR.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlNtryAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlNtryAmt() {
        return orgnlNtryAmt;
    }

    /**
     * Define el valor de la propiedad orgnlNtryAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOrgnlNtryAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlNtryAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlNtryValDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getOrgnlNtryValDt() {
        return orgnlNtryValDt;
    }

    /**
     * Define el valor de la propiedad orgnlNtryValDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setOrgnlNtryValDt(DateAndDateTime2Choice value) {
        this.orgnlNtryValDt = value;
    }

}
