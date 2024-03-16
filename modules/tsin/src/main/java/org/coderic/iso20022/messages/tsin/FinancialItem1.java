//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancialItem1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialItem1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItmCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancialItemParameters1"/&gt;
 *         &lt;element name="FinDocRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}CreditDebitCode"/&gt;
 *         &lt;element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}InvoiceTotals1"/&gt;
 *         &lt;element name="DueAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="InstlmtInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Instalment2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max2000Text" minOccurs="0"/&gt;
 *         &lt;element name="AssoctdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ValidationStatusInformation1" minOccurs="0"/&gt;
 *         &lt;element name="FincgSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingInformationAndStatus1" minOccurs="0"/&gt;
 *         &lt;element name="PrtryDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}SupplementaryData1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialItem1", propOrder = {
    "itmCntxt",
    "finDocRef",
    "cdtDbtInd",
    "ttlAmt",
    "dueAmt",
    "instlmtInf",
    "addtlInf",
    "assoctdDoc",
    "vldtnStsInf",
    "fincgSts",
    "prtryDtls"
})
public class FinancialItem1 {

    @XmlElement(name = "ItmCntxt", required = true)
    protected FinancialItemParameters1 itmCntxt;
    @XmlElementRef(name = "FinDocRef", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> finDocRef;
    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "TtlAmt", required = true)
    protected InvoiceTotals1 ttlAmt;
    @XmlElement(name = "DueAmt")
    protected ActiveCurrencyAndAmount dueAmt;
    @XmlElement(name = "InstlmtInf")
    protected List<Instalment2> instlmtInf;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "FincgSts")
    protected FinancingInformationAndStatus1 fincgSts;
    @XmlElement(name = "PrtryDtls")
    protected SupplementaryData1 prtryDtls;

    /**
     * Obtiene el valor de la propiedad itmCntxt.
     * 
     * @return
     *     possible object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public FinancialItemParameters1 getItmCntxt() {
        return itmCntxt;
    }

    /**
     * Define el valor de la propiedad itmCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public void setItmCntxt(FinancialItemParameters1 value) {
        this.itmCntxt = value;
    }

    /**
     * Gets the value of the finDocRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the finDocRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinDocRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getFinDocRef() {
        if (finDocRef == null) {
            finDocRef = new ArrayList<JAXBElement<Object>>();
        }
        return this.finDocRef;
    }

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
     * Obtiene el valor de la propiedad ttlAmt.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public InvoiceTotals1 getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Define el valor de la propiedad ttlAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public void setTtlAmt(InvoiceTotals1 value) {
        this.ttlAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dueAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDueAmt() {
        return dueAmt;
    }

    /**
     * Define el valor de la propiedad dueAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDueAmt(ActiveCurrencyAndAmount value) {
        this.dueAmt = value;
    }

    /**
     * Gets the value of the instlmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the instlmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment2 }
     * 
     * 
     */
    public List<Instalment2> getInstlmtInf() {
        if (instlmtInf == null) {
            instlmtInf = new ArrayList<Instalment2>();
        }
        return this.instlmtInf;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<JAXBElement<Object>>();
        }
        return this.assoctdDoc;
    }

    /**
     * Obtiene el valor de la propiedad vldtnStsInf.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Define el valor de la propiedad vldtnStsInf.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public void setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
    }

    /**
     * Obtiene el valor de la propiedad fincgSts.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingInformationAndStatus1 getFincgSts() {
        return fincgSts;
    }

    /**
     * Define el valor de la propiedad fincgSts.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public void setFincgSts(FinancingInformationAndStatus1 value) {
        this.fincgSts = value;
    }

    /**
     * Obtiene el valor de la propiedad prtryDtls.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getPrtryDtls() {
        return prtryDtls;
    }

    /**
     * Define el valor de la propiedad prtryDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setPrtryDtls(SupplementaryData1 value) {
        this.prtryDtls = value;
    }

}
