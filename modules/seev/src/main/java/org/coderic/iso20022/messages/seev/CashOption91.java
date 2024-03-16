//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CashOption91 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CashOption91"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CreditDebitCode"/&gt;
 *         &lt;element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CashAccountIdentification5Choice" minOccurs="0"/&gt;
 *         &lt;element name="GrssCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="NetCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="EntitldAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ActiveCurrencyAndAmount"/&gt;
 *         &lt;element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}RateAndAmountFormat40Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}DateAndDateTime2Choice" minOccurs="0"/&gt;
 *         &lt;element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}DateFormat43Choice"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption91", propOrder = {
    "cdtDbtInd",
    "cshAcctId",
    "grssCshAmt",
    "netCshAmt",
    "entitldAmt",
    "whldgTaxRate",
    "whldgTaxAmt",
    "earlstPmtDt",
    "pmtDt"
})
public class CashOption91 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CshAcctId")
    protected CashAccountIdentification5Choice cshAcctId;
    @XmlElement(name = "GrssCshAmt")
    protected ActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected ActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "EntitldAmt", required = true)
    protected ActiveCurrencyAndAmount entitldAmt;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat40Choice> whldgTaxRate;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateAndDateTime2Choice earlstPmtDt;
    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat43Choice pmtDt;

    /**
     * Obtiene el valor de la propiedad cdtDbtInd.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Define el valor de la propiedad cdtDbtInd.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Obtiene el valor de la propiedad cshAcctId.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Define el valor de la propiedad cshAcctId.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcctId(CashAccountIdentification5Choice value) {
        this.cshAcctId = value;
    }

    /**
     * Obtiene el valor de la propiedad grssCshAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssCshAmt() {
        return grssCshAmt;
    }

    /**
     * Define el valor de la propiedad grssCshAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssCshAmt(ActiveCurrencyAndAmount value) {
        this.grssCshAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad netCshAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Define el valor de la propiedad netCshAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetCshAmt(ActiveCurrencyAndAmount value) {
        this.netCshAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad entitldAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEntitldAmt() {
        return entitldAmt;
    }

    /**
     * Define el valor de la propiedad entitldAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEntitldAmt(ActiveCurrencyAndAmount value) {
        this.entitldAmt = value;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the whldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat40Choice }
     * 
     * 
     */
    public List<RateAndAmountFormat40Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<RateAndAmountFormat40Choice>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Obtiene el valor de la propiedad whldgTaxAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Define el valor de la propiedad whldgTaxAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad earlstPmtDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Define el valor de la propiedad earlstPmtDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setEarlstPmtDt(DateAndDateTime2Choice value) {
        this.earlstPmtDt = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtDt.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Define el valor de la propiedad pmtDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setPmtDt(DateFormat43Choice value) {
        this.pmtDt = value;
    }

}
