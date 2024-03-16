//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMTransaction24 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMTransaction24"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}TransactionIdentifier1"/&gt;
 *         &lt;element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CdtrLabl" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DbtrLabl" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TrfIdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="PmtRef" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ResponseType7"/&gt;
 *         &lt;element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Action7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcctFr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}CardAccount13" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdAcctFr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType10" minOccurs="0"/&gt;
 *         &lt;element name="AcctTo" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}CardAccount13" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdAcctTo" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType10" minOccurs="0"/&gt;
 *         &lt;element name="TtlAuthrsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}AmountAndCurrency1"/&gt;
 *         &lt;element name="TtlReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ImpliedCurrencyAndAmount" minOccurs="0"/&gt;
 *         &lt;element name="DtldReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}DetailedAmount17" minOccurs="0"/&gt;
 *         &lt;element name="AddtlChrg" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}DetailedAmount18" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Lmts" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMTransactionAmounts6" minOccurs="0"/&gt;
 *         &lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="PropsdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="InstntTrfPrgm" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RcrngTrf" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}RecurringTransaction3" minOccurs="0"/&gt;
 *         &lt;element name="AuthstnRslt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}AuthorisationResult13" minOccurs="0"/&gt;
 *         &lt;element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max10000Binary" minOccurs="0"/&gt;
 *         &lt;element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMCommand7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction24", propOrder = {
    "txId",
    "rcncltnId",
    "cdtrLabl",
    "dbtrLabl",
    "trfIdr",
    "pmtRef",
    "txRspn",
    "actn",
    "acctFr",
    "prtctdAcctFr",
    "acctTo",
    "prtctdAcctTo",
    "ttlAuthrsdAmt",
    "ttlReqdAmt",
    "dtldReqdAmt",
    "addtlChrg",
    "lmts",
    "reqdExctnDt",
    "propsdExctnDt",
    "instntTrfPrgm",
    "rcrngTrf",
    "authstnRslt",
    "iccRltdData",
    "cmd"
})
public class ATMTransaction24 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId")
    protected String rcncltnId;
    @XmlElement(name = "CdtrLabl")
    protected String cdtrLabl;
    @XmlElement(name = "DbtrLabl")
    protected String dbtrLabl;
    @XmlElement(name = "TrfIdr")
    protected String trfIdr;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType7 txRspn;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;
    @XmlElement(name = "AcctFr")
    protected CardAccount13 acctFr;
    @XmlElement(name = "PrtctdAcctFr")
    protected ContentInformationType10 prtctdAcctFr;
    @XmlElement(name = "AcctTo")
    protected List<CardAccount13> acctTo;
    @XmlElement(name = "PrtctdAcctTo")
    protected ContentInformationType10 prtctdAcctTo;
    @XmlElement(name = "TtlAuthrsdAmt", required = true)
    protected AmountAndCurrency1 ttlAuthrsdAmt;
    @XmlElement(name = "TtlReqdAmt")
    protected BigDecimal ttlReqdAmt;
    @XmlElement(name = "DtldReqdAmt")
    protected DetailedAmount17 dtldReqdAmt;
    @XmlElement(name = "AddtlChrg")
    protected List<DetailedAmount18> addtlChrg;
    @XmlElement(name = "Lmts")
    protected ATMTransactionAmounts6 lmts;
    @XmlElement(name = "ReqdExctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdExctnDt;
    @XmlElement(name = "PropsdExctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar propsdExctnDt;
    @XmlElement(name = "InstntTrfPrgm")
    protected String instntTrfPrgm;
    @XmlElement(name = "RcrngTrf")
    protected RecurringTransaction3 rcrngTrf;
    @XmlElement(name = "AuthstnRslt")
    protected AuthorisationResult13 authstnRslt;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

    /**
     * Obtiene el valor de la propiedad txId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Define el valor de la propiedad txId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Obtiene el valor de la propiedad rcncltnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Define el valor de la propiedad rcncltnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcncltnId(String value) {
        this.rcncltnId = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrLabl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrLabl() {
        return cdtrLabl;
    }

    /**
     * Define el valor de la propiedad cdtrLabl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrLabl(String value) {
        this.cdtrLabl = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtrLabl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrLabl() {
        return dbtrLabl;
    }

    /**
     * Define el valor de la propiedad dbtrLabl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrLabl(String value) {
        this.dbtrLabl = value;
    }

    /**
     * Obtiene el valor de la propiedad trfIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfIdr() {
        return trfIdr;
    }

    /**
     * Define el valor de la propiedad trfIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfIdr(String value) {
        this.trfIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Define el valor de la propiedad pmtRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtRef(String value) {
        this.pmtRef = value;
    }

    /**
     * Obtiene el valor de la propiedad txRspn.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getTxRspn() {
        return txRspn;
    }

    /**
     * Define el valor de la propiedad txRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public void setTxRspn(ResponseType7 value) {
        this.txRspn = value;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action7>();
        }
        return this.actn;
    }

    /**
     * Obtiene el valor de la propiedad acctFr.
     * 
     * @return
     *     possible object is
     *     {@link CardAccount13 }
     *     
     */
    public CardAccount13 getAcctFr() {
        return acctFr;
    }

    /**
     * Define el valor de la propiedad acctFr.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccount13 }
     *     
     */
    public void setAcctFr(CardAccount13 value) {
        this.acctFr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdAcctFr.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctFr() {
        return prtctdAcctFr;
    }

    /**
     * Define el valor de la propiedad prtctdAcctFr.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAcctFr(ContentInformationType10 value) {
        this.prtctdAcctFr = value;
    }

    /**
     * Gets the value of the acctTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the acctTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardAccount13 }
     * 
     * 
     */
    public List<CardAccount13> getAcctTo() {
        if (acctTo == null) {
            acctTo = new ArrayList<CardAccount13>();
        }
        return this.acctTo;
    }

    /**
     * Obtiene el valor de la propiedad prtctdAcctTo.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdAcctTo() {
        return prtctdAcctTo;
    }

    /**
     * Define el valor de la propiedad prtctdAcctTo.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdAcctTo(ContentInformationType10 value) {
        this.prtctdAcctTo = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlAuthrsdAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public AmountAndCurrency1 getTtlAuthrsdAmt() {
        return ttlAuthrsdAmt;
    }

    /**
     * Define el valor de la propiedad ttlAuthrsdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndCurrency1 }
     *     
     */
    public void setTtlAuthrsdAmt(AmountAndCurrency1 value) {
        this.ttlAuthrsdAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlReqdAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlReqdAmt() {
        return ttlReqdAmt;
    }

    /**
     * Define el valor de la propiedad ttlReqdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlReqdAmt(BigDecimal value) {
        this.ttlReqdAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad dtldReqdAmt.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount17 }
     *     
     */
    public DetailedAmount17 getDtldReqdAmt() {
        return dtldReqdAmt;
    }

    /**
     * Define el valor de la propiedad dtldReqdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount17 }
     *     
     */
    public void setDtldReqdAmt(DetailedAmount17 value) {
        this.dtldReqdAmt = value;
    }

    /**
     * Gets the value of the addtlChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     */
    public List<DetailedAmount18> getAddtlChrg() {
        if (addtlChrg == null) {
            addtlChrg = new ArrayList<DetailedAmount18>();
        }
        return this.addtlChrg;
    }

    /**
     * Obtiene el valor de la propiedad lmts.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public ATMTransactionAmounts6 getLmts() {
        return lmts;
    }

    /**
     * Define el valor de la propiedad lmts.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransactionAmounts6 }
     *     
     */
    public void setLmts(ATMTransactionAmounts6 value) {
        this.lmts = value;
    }

    /**
     * Obtiene el valor de la propiedad reqdExctnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Define el valor de la propiedad reqdExctnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdExctnDt(XMLGregorianCalendar value) {
        this.reqdExctnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad propsdExctnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPropsdExctnDt() {
        return propsdExctnDt;
    }

    /**
     * Define el valor de la propiedad propsdExctnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPropsdExctnDt(XMLGregorianCalendar value) {
        this.propsdExctnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad instntTrfPrgm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstntTrfPrgm() {
        return instntTrfPrgm;
    }

    /**
     * Define el valor de la propiedad instntTrfPrgm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstntTrfPrgm(String value) {
        this.instntTrfPrgm = value;
    }

    /**
     * Obtiene el valor de la propiedad rcrngTrf.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction3 }
     *     
     */
    public RecurringTransaction3 getRcrngTrf() {
        return rcrngTrf;
    }

    /**
     * Define el valor de la propiedad rcrngTrf.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction3 }
     *     
     */
    public void setRcrngTrf(RecurringTransaction3 value) {
        this.rcrngTrf = value;
    }

    /**
     * Obtiene el valor de la propiedad authstnRslt.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult13 }
     *     
     */
    public AuthorisationResult13 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Define el valor de la propiedad authstnRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult13 }
     *     
     */
    public void setAuthstnRslt(AuthorisationResult13 value) {
        this.authstnRslt = value;
    }

    /**
     * Obtiene el valor de la propiedad iccRltdData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Define el valor de la propiedad iccRltdData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand7 }
     * 
     * 
     */
    public List<ATMCommand7> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<ATMCommand7>();
        }
        return this.cmd;
    }

}
