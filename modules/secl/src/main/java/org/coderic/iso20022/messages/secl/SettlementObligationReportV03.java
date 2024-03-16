//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementObligationReportV03 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementObligationReportV03"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RptParams" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}ReportParameters4"/&gt;
 *         &lt;element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Pagination"/&gt;
 *         &lt;element name="ClrMmb" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentification35Choice" minOccurs="0"/&gt;
 *         &lt;element name="ClrSgmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentification35Choice" minOccurs="0"/&gt;
 *         &lt;element name="DlvryAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecuritiesAccount19" minOccurs="0"/&gt;
 *         &lt;element name="RptDtls" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Report5" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SettlementParties2Choice" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementObligationReportV03", propOrder = {
    "rptParams",
    "pgntn",
    "clrMmb",
    "clrSgmt",
    "dlvryAcct",
    "rptDtls",
    "sttlmPties",
    "splmtryData"
})
public class SettlementObligationReportV03 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters4 rptParams;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination pgntn;
    @XmlElement(name = "ClrMmb")
    protected PartyIdentification35Choice clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "DlvryAcct")
    protected SecuritiesAccount19 dlvryAcct;
    @XmlElement(name = "RptDtls", required = true)
    protected List<Report5> rptDtls;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties2Choice sttlmPties;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad rptParams.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters4 }
     *     
     */
    public ReportParameters4 getRptParams() {
        return rptParams;
    }

    /**
     * Define el valor de la propiedad rptParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters4 }
     *     
     */
    public void setRptParams(ReportParameters4 value) {
        this.rptParams = value;
    }

    /**
     * Obtiene el valor de la propiedad pgntn.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getPgntn() {
        return pgntn;
    }

    /**
     * Define el valor de la propiedad pgntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setPgntn(Pagination value) {
        this.pgntn = value;
    }

    /**
     * Obtiene el valor de la propiedad clrMmb.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Define el valor de la propiedad clrMmb.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrMmb(PartyIdentification35Choice value) {
        this.clrMmb = value;
    }

    /**
     * Obtiene el valor de la propiedad clrSgmt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Define el valor de la propiedad clrSgmt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dlvryAcct.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getDlvryAcct() {
        return dlvryAcct;
    }

    /**
     * Define el valor de la propiedad dlvryAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setDlvryAcct(SecuritiesAccount19 value) {
        this.dlvryAcct = value;
    }

    /**
     * Gets the value of the rptDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rptDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Report5 }
     * 
     * 
     */
    public List<Report5> getRptDtls() {
        if (rptDtls == null) {
            rptDtls = new ArrayList<Report5>();
        }
        return this.rptDtls;
    }

    /**
     * Obtiene el valor de la propiedad sttlmPties.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties2Choice }
     *     
     */
    public SettlementParties2Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Define el valor de la propiedad sttlmPties.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties2Choice }
     *     
     */
    public void setSttlmPties(SettlementParties2Choice value) {
        this.sttlmPties = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
