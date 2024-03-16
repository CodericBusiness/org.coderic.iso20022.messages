//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:07 PM COT 
//


package org.coderic.iso20022.messages.tsrv;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UndertakingStatusAdvice1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UndertakingStatusAdvice1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyIdentification43"/&gt;
 *         &lt;element name="UdrtkgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Undertaking8" minOccurs="0"/&gt;
 *         &lt;element name="AmdmntSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Number" minOccurs="0"/&gt;
 *         &lt;element name="AdvsgPtyRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CnfrmrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="StsCtgy" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}ExternalUndertakingStatusCategory1Code"/&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}UndertakingStatus3Code"/&gt;
 *         &lt;element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}StatusReasonInformation8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RptdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}ReportedAmount1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlMsgDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}OriginalMessage1" minOccurs="0"/&gt;
 *         &lt;element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Document9" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingStatusAdvice1", propOrder = {
    "initgPty",
    "udrtkgId",
    "amdmntSeqNb",
    "advsgPtyRefNb",
    "cnfrmrRefNb",
    "stsCtgy",
    "sts",
    "stsRsn",
    "rptdAmt",
    "orgnlMsgDtls",
    "nclsdFile",
    "addtlInf"
})
public class UndertakingStatusAdvice1 {

    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification43 initgPty;
    @XmlElement(name = "UdrtkgId")
    protected Undertaking8 udrtkgId;
    @XmlElement(name = "AmdmntSeqNb")
    protected BigDecimal amdmntSeqNb;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;
    @XmlElement(name = "StsCtgy", required = true)
    protected String stsCtgy;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected UndertakingStatus3Code sts;
    @XmlElement(name = "StsRsn")
    protected List<StatusReasonInformation8> stsRsn;
    @XmlElement(name = "RptdAmt")
    protected List<ReportedAmount1> rptdAmt;
    @XmlElement(name = "OrgnlMsgDtls")
    protected OriginalMessage1 orgnlMsgDtls;
    @XmlElement(name = "NclsdFile")
    protected List<Document9> nclsdFile;
    @XmlElement(name = "AddtlInf")
    protected List<String> addtlInf;

    /**
     * Obtiene el valor de la propiedad initgPty.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getInitgPty() {
        return initgPty;
    }

    /**
     * Define el valor de la propiedad initgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setInitgPty(PartyIdentification43 value) {
        this.initgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad udrtkgId.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking8 }
     *     
     */
    public Undertaking8 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Define el valor de la propiedad udrtkgId.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking8 }
     *     
     */
    public void setUdrtkgId(Undertaking8 value) {
        this.udrtkgId = value;
    }

    /**
     * Obtiene el valor de la propiedad amdmntSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmdmntSeqNb() {
        return amdmntSeqNb;
    }

    /**
     * Define el valor de la propiedad amdmntSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmdmntSeqNb(BigDecimal value) {
        this.amdmntSeqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad advsgPtyRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Define el valor de la propiedad advsgPtyRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad cnfrmrRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Define el valor de la propiedad cnfrmrRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad stsCtgy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsCtgy() {
        return stsCtgy;
    }

    /**
     * Define el valor de la propiedad stsCtgy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsCtgy(String value) {
        this.stsCtgy = value;
    }

    /**
     * Obtiene el valor de la propiedad sts.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatus3Code }
     *     
     */
    public UndertakingStatus3Code getSts() {
        return sts;
    }

    /**
     * Define el valor de la propiedad sts.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatus3Code }
     *     
     */
    public void setSts(UndertakingStatus3Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReasonInformation8 }
     * 
     * 
     */
    public List<StatusReasonInformation8> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<StatusReasonInformation8>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the rptdAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rptdAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportedAmount1 }
     * 
     * 
     */
    public List<ReportedAmount1> getRptdAmt() {
        if (rptdAmt == null) {
            rptdAmt = new ArrayList<ReportedAmount1>();
        }
        return this.rptdAmt;
    }

    /**
     * Obtiene el valor de la propiedad orgnlMsgDtls.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessage1 }
     *     
     */
    public OriginalMessage1 getOrgnlMsgDtls() {
        return orgnlMsgDtls;
    }

    /**
     * Define el valor de la propiedad orgnlMsgDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessage1 }
     *     
     */
    public void setOrgnlMsgDtls(OriginalMessage1 value) {
        this.orgnlMsgDtls = value;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document9 }
     * 
     * 
     */
    public List<Document9> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document9>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<String>();
        }
        return this.addtlInf;
    }

}
