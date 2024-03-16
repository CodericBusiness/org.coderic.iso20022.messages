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
 * <p>Clase Java para UnderlyingData2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UnderlyingData2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Initn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UnderlyingPaymentInstruction8"/&gt;
 *         &lt;element name="IntrBk" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UnderlyingPaymentTransaction7"/&gt;
 *         &lt;element name="StmtNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UnderlyingStatementEntry5"/&gt;
 *         &lt;element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}CashAccount40"/&gt;
 *         &lt;element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}GenericIdentification1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingData2Choice", propOrder = {
    "initn",
    "intrBk",
    "stmtNtry",
    "acct",
    "othr"
})
public class UnderlyingData2Choice {

    @XmlElement(name = "Initn")
    protected UnderlyingPaymentInstruction8 initn;
    @XmlElement(name = "IntrBk")
    protected UnderlyingPaymentTransaction7 intrBk;
    @XmlElement(name = "StmtNtry")
    protected UnderlyingStatementEntry5 stmtNtry;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "Othr")
    protected GenericIdentification1 othr;

    /**
     * Obtiene el valor de la propiedad initn.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentInstruction8 }
     *     
     */
    public UnderlyingPaymentInstruction8 getInitn() {
        return initn;
    }

    /**
     * Define el valor de la propiedad initn.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentInstruction8 }
     *     
     */
    public void setInitn(UnderlyingPaymentInstruction8 value) {
        this.initn = value;
    }

    /**
     * Obtiene el valor de la propiedad intrBk.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingPaymentTransaction7 }
     *     
     */
    public UnderlyingPaymentTransaction7 getIntrBk() {
        return intrBk;
    }

    /**
     * Define el valor de la propiedad intrBk.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingPaymentTransaction7 }
     *     
     */
    public void setIntrBk(UnderlyingPaymentTransaction7 value) {
        this.intrBk = value;
    }

    /**
     * Obtiene el valor de la propiedad stmtNtry.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingStatementEntry5 }
     *     
     */
    public UnderlyingStatementEntry5 getStmtNtry() {
        return stmtNtry;
    }

    /**
     * Define el valor de la propiedad stmtNtry.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingStatementEntry5 }
     *     
     */
    public void setStmtNtry(UnderlyingStatementEntry5 value) {
        this.stmtNtry = value;
    }

    /**
     * Obtiene el valor de la propiedad acct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Define el valor de la propiedad acct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setAcct(CashAccount40 value) {
        this.acct = value;
    }

    /**
     * Obtiene el valor de la propiedad othr.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getOthr() {
        return othr;
    }

    /**
     * Define el valor de la propiedad othr.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setOthr(GenericIdentification1 value) {
        this.othr = value;
    }

}
