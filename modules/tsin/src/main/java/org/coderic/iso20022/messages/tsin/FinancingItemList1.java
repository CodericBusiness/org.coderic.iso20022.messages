//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingItemList1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancingItemList1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max35Text"/&gt;
 *         &lt;element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *         &lt;element name="RltdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AmtCutOffDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Assgne" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;element name="Assgnr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;element name="NtfctnInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingNotificationParties1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FinItm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancialItem1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ItmCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max15NumericText"/&gt;
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="TtlReqAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ActiveCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="TtlReqFincg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingRateOrAmountChoice" minOccurs="0"/&gt;
 *         &lt;element name="AgrdRate" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}AgreedRate1" minOccurs="0"/&gt;
 *         &lt;element name="FincgInstlmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Instalment2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max2000Text" minOccurs="0"/&gt;
 *         &lt;element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ValidationStatusInformation1" minOccurs="0"/&gt;
 *         &lt;element name="FincgSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingInformationAndStatus1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingItemList1", propOrder = {
    "idr",
    "isseDt",
    "rltdDoc",
    "amtCutOffDt",
    "assgne",
    "assgnr",
    "ntfctnInf",
    "finItm",
    "itmCnt",
    "ctrlSum",
    "ttlReqAmt",
    "ttlReqFincg",
    "agrdRate",
    "fincgInstlmt",
    "addtlInf",
    "vldtnStsInf",
    "fincgSts"
})
public class FinancingItemList1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "AmtCutOffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar amtCutOffDt;
    @XmlElement(name = "Assgne", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgne;
    @XmlElement(name = "Assgnr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgnr;
    @XmlElement(name = "NtfctnInf")
    protected List<FinancingNotificationParties1> ntfctnInf;
    @XmlElement(name = "FinItm")
    protected List<FinancialItem1> finItm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "TtlReqAmt")
    protected ActiveCurrencyAndAmount ttlReqAmt;
    @XmlElement(name = "TtlReqFincg")
    protected FinancingRateOrAmountChoice ttlReqFincg;
    @XmlElement(name = "AgrdRate")
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "FincgInstlmt")
    protected List<Instalment2> fincgInstlmt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "FincgSts")
    protected FinancingInformationAndStatus1 fincgSts;

    /**
     * Obtiene el valor de la propiedad idr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Define el valor de la propiedad idr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

    /**
     * Obtiene el valor de la propiedad isseDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Define el valor de la propiedad isseDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the rltdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRltdDoc() {
        if (rltdDoc == null) {
            rltdDoc = new ArrayList<JAXBElement<Object>>();
        }
        return this.rltdDoc;
    }

    /**
     * Obtiene el valor de la propiedad amtCutOffDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmtCutOffDt() {
        return amtCutOffDt;
    }

    /**
     * Define el valor de la propiedad amtCutOffDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmtCutOffDt(XMLGregorianCalendar value) {
        this.amtCutOffDt = value;
    }

    /**
     * Obtiene el valor de la propiedad assgne.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssgne() {
        return assgne;
    }

    /**
     * Define el valor de la propiedad assgne.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssgne(Object value) {
        this.assgne = value;
    }

    /**
     * Obtiene el valor de la propiedad assgnr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssgnr() {
        return assgnr;
    }

    /**
     * Define el valor de la propiedad assgnr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssgnr(Object value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the ntfctnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ntfctnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingNotificationParties1 }
     * 
     * 
     */
    public List<FinancingNotificationParties1> getNtfctnInf() {
        if (ntfctnInf == null) {
            ntfctnInf = new ArrayList<FinancingNotificationParties1>();
        }
        return this.ntfctnInf;
    }

    /**
     * Gets the value of the finItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the finItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialItem1 }
     * 
     * 
     */
    public List<FinancialItem1> getFinItm() {
        if (finItm == null) {
            finItm = new ArrayList<FinancialItem1>();
        }
        return this.finItm;
    }

    /**
     * Obtiene el valor de la propiedad itmCnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Define el valor de la propiedad itmCnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmCnt(String value) {
        this.itmCnt = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrlSum.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Define el valor de la propiedad ctrlSum.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlReqAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlReqAmt() {
        return ttlReqAmt;
    }

    /**
     * Define el valor de la propiedad ttlReqAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlReqAmt(ActiveCurrencyAndAmount value) {
        this.ttlReqAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlReqFincg.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getTtlReqFincg() {
        return ttlReqFincg;
    }

    /**
     * Define el valor de la propiedad ttlReqFincg.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public void setTtlReqFincg(FinancingRateOrAmountChoice value) {
        this.ttlReqFincg = value;
    }

    /**
     * Obtiene el valor de la propiedad agrdRate.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Define el valor de la propiedad agrdRate.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public void setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
    }

    /**
     * Gets the value of the fincgInstlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fincgInstlmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFincgInstlmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment2 }
     * 
     * 
     */
    public List<Instalment2> getFincgInstlmt() {
        if (fincgInstlmt == null) {
            fincgInstlmt = new ArrayList<Instalment2>();
        }
        return this.fincgInstlmt;
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

}
