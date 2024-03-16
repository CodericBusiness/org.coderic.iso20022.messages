//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Mandate20 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Mandate20"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max35Text"/&gt;
 *         &lt;element name="MndtReqId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Authntcn" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateAuthentication1" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateTypeInformation2" minOccurs="0"/&gt;
 *         &lt;element name="Ocrncs" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateOccurrences5" minOccurs="0"/&gt;
 *         &lt;element name="TrckgInd" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}TrueFalseIndicator"/&gt;
 *         &lt;element name="FrstColltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="ColltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="MaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateAdjustment1" minOccurs="0"/&gt;
 *         &lt;element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateSetupReason1Choice" minOccurs="0"/&gt;
 *         &lt;element name="CdtrSchmeId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PartyIdentification272"/&gt;
 *         &lt;element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}BranchAndFinancialInstitutionIdentification8" minOccurs="0"/&gt;
 *         &lt;element name="UltmtCdtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PartyIdentification272"/&gt;
 *         &lt;element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}CashAccount40" minOccurs="0"/&gt;
 *         &lt;element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}BranchAndFinancialInstitutionIdentification8"/&gt;
 *         &lt;element name="UltmtDbtr" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="MndtRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RfrdDoc" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}ReferredMandateDocument2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mandate20", propOrder = {
    "mndtId",
    "mndtReqId",
    "authntcn",
    "tp",
    "ocrncs",
    "trckgInd",
    "frstColltnAmt",
    "colltnAmt",
    "maxAmt",
    "adjstmnt",
    "rsn",
    "cdtrSchmeId",
    "cdtr",
    "cdtrAcct",
    "cdtrAgt",
    "ultmtCdtr",
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "ultmtDbtr",
    "mndtRef",
    "rfrdDoc"
})
public class Mandate20 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "MndtReqId")
    protected String mndtReqId;
    @XmlElement(name = "Authntcn")
    protected MandateAuthentication1 authntcn;
    @XmlElement(name = "Tp")
    protected MandateTypeInformation2 tp;
    @XmlElement(name = "Ocrncs")
    protected MandateOccurrences5 ocrncs;
    @XmlElement(name = "TrckgInd")
    protected boolean trckgInd;
    @XmlElement(name = "FrstColltnAmt")
    protected ActiveOrHistoricCurrencyAndAmount frstColltnAmt;
    @XmlElement(name = "ColltnAmt")
    protected ActiveOrHistoricCurrencyAndAmount colltnAmt;
    @XmlElement(name = "MaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount maxAmt;
    @XmlElement(name = "Adjstmnt")
    protected MandateAdjustment1 adjstmnt;
    @XmlElement(name = "Rsn")
    protected MandateSetupReason1Choice rsn;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentification272 cdtrSchmeId;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification272 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount40 cdtrAcct;
    @XmlElement(name = "CdtrAgt")
    protected BranchAndFinancialInstitutionIdentification8 cdtrAgt;
    @XmlElement(name = "UltmtCdtr")
    protected PartyIdentification272 ultmtCdtr;
    @XmlElement(name = "Dbtr", required = true)
    protected PartyIdentification272 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount40 dbtrAcct;
    @XmlElement(name = "DbtrAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification8 dbtrAgt;
    @XmlElement(name = "UltmtDbtr")
    protected PartyIdentification272 ultmtDbtr;
    @XmlElement(name = "MndtRef")
    protected String mndtRef;
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredMandateDocument2> rfrdDoc;

    /**
     * Obtiene el valor de la propiedad mndtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Define el valor de la propiedad mndtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

    /**
     * Obtiene el valor de la propiedad mndtReqId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtReqId() {
        return mndtReqId;
    }

    /**
     * Define el valor de la propiedad mndtReqId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtReqId(String value) {
        this.mndtReqId = value;
    }

    /**
     * Obtiene el valor de la propiedad authntcn.
     * 
     * @return
     *     possible object is
     *     {@link MandateAuthentication1 }
     *     
     */
    public MandateAuthentication1 getAuthntcn() {
        return authntcn;
    }

    /**
     * Define el valor de la propiedad authntcn.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAuthentication1 }
     *     
     */
    public void setAuthntcn(MandateAuthentication1 value) {
        this.authntcn = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link MandateTypeInformation2 }
     *     
     */
    public MandateTypeInformation2 getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateTypeInformation2 }
     *     
     */
    public void setTp(MandateTypeInformation2 value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad ocrncs.
     * 
     * @return
     *     possible object is
     *     {@link MandateOccurrences5 }
     *     
     */
    public MandateOccurrences5 getOcrncs() {
        return ocrncs;
    }

    /**
     * Define el valor de la propiedad ocrncs.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateOccurrences5 }
     *     
     */
    public void setOcrncs(MandateOccurrences5 value) {
        this.ocrncs = value;
    }

    /**
     * Obtiene el valor de la propiedad trckgInd.
     * 
     */
    public boolean isTrckgInd() {
        return trckgInd;
    }

    /**
     * Define el valor de la propiedad trckgInd.
     * 
     */
    public void setTrckgInd(boolean value) {
        this.trckgInd = value;
    }

    /**
     * Obtiene el valor de la propiedad frstColltnAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getFrstColltnAmt() {
        return frstColltnAmt;
    }

    /**
     * Define el valor de la propiedad frstColltnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setFrstColltnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.frstColltnAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad colltnAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getColltnAmt() {
        return colltnAmt;
    }

    /**
     * Define el valor de la propiedad colltnAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setColltnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.colltnAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad maxAmt.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMaxAmt() {
        return maxAmt;
    }

    /**
     * Define el valor de la propiedad maxAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.maxAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad adjstmnt.
     * 
     * @return
     *     possible object is
     *     {@link MandateAdjustment1 }
     *     
     */
    public MandateAdjustment1 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Define el valor de la propiedad adjstmnt.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAdjustment1 }
     *     
     */
    public void setAdjstmnt(MandateAdjustment1 value) {
        this.adjstmnt = value;
    }

    /**
     * Obtiene el valor de la propiedad rsn.
     * 
     * @return
     *     possible object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public MandateSetupReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Define el valor de la propiedad rsn.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSetupReason1Choice }
     *     
     */
    public void setRsn(MandateSetupReason1Choice value) {
        this.rsn = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrSchmeId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Define el valor de la propiedad cdtrSchmeId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setCdtrSchmeId(PartyIdentification272 value) {
        this.cdtrSchmeId = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getCdtr() {
        return cdtr;
    }

    /**
     * Define el valor de la propiedad cdtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setCdtr(PartyIdentification272 value) {
        this.cdtr = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Define el valor de la propiedad cdtrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setCdtrAcct(CashAccount40 value) {
        this.cdtrAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrAgt.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Define el valor de la propiedad cdtrAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setCdtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.cdtrAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad ultmtCdtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getUltmtCdtr() {
        return ultmtCdtr;
    }

    /**
     * Define el valor de la propiedad ultmtCdtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setUltmtCdtr(PartyIdentification272 value) {
        this.ultmtCdtr = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getDbtr() {
        return dbtr;
    }

    /**
     * Define el valor de la propiedad dbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setDbtr(PartyIdentification272 value) {
        this.dbtr = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtrAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Define el valor de la propiedad dbtrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setDbtrAcct(CashAccount40 value) {
        this.dbtrAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtrAgt.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Define el valor de la propiedad dbtrAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.dbtrAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad ultmtDbtr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getUltmtDbtr() {
        return ultmtDbtr;
    }

    /**
     * Define el valor de la propiedad ultmtDbtr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setUltmtDbtr(PartyIdentification272 value) {
        this.ultmtDbtr = value;
    }

    /**
     * Obtiene el valor de la propiedad mndtRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtRef() {
        return mndtRef;
    }

    /**
     * Define el valor de la propiedad mndtRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtRef(String value) {
        this.mndtRef = value;
    }

    /**
     * Gets the value of the rfrdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rfrdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredMandateDocument2 }
     * 
     * 
     */
    public List<ReferredMandateDocument2> getRfrdDoc() {
        if (rfrdDoc == null) {
            rfrdDoc = new ArrayList<ReferredMandateDocument2>();
        }
        return this.rfrdDoc;
    }

}
