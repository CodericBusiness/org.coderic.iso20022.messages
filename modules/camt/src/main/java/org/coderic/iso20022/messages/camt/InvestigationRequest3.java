//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestigationRequest3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationRequest3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text"/&gt;
 *         &lt;element name="RqstrInvstgtnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RspndrInvstgtnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EIR" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UUIDv4Identifier" minOccurs="0"/&gt;
 *         &lt;element name="ReqActn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationRequestAction1" minOccurs="0"/&gt;
 *         &lt;element name="InvstgtnTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationType1Choice"/&gt;
 *         &lt;element name="InvstgtnSubTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationSubType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="UndrlygInstrm" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UnderlyingInvestigationInstrument1Choice" minOccurs="0"/&gt;
 *         &lt;element name="Undrlyg" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}UnderlyingData2Choice" minOccurs="0"/&gt;
 *         &lt;element name="Rqstr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Party40Choice"/&gt;
 *         &lt;element name="Rspndr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Party40Choice"/&gt;
 *         &lt;element name="ReqOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Party40Choice" minOccurs="0"/&gt;
 *         &lt;element name="XpctdRspndr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Party40Choice" minOccurs="0"/&gt;
 *         &lt;element name="SvcLvl" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationServiceLevel1Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationRequest3", propOrder = {
    "msgId",
    "rqstrInvstgtnId",
    "rspndrInvstgtnId",
    "eir",
    "reqActn",
    "invstgtnTp",
    "invstgtnSubTp",
    "undrlygInstrm",
    "undrlyg",
    "rqstr",
    "rspndr",
    "reqOrgtr",
    "xpctdRspndr",
    "svcLvl"
})
public class InvestigationRequest3 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "RqstrInvstgtnId")
    protected String rqstrInvstgtnId;
    @XmlElement(name = "RspndrInvstgtnId")
    protected String rspndrInvstgtnId;
    @XmlElement(name = "EIR")
    protected String eir;
    @XmlElement(name = "ReqActn")
    protected InvestigationRequestAction1 reqActn;
    @XmlElement(name = "InvstgtnTp", required = true)
    protected InvestigationType1Choice invstgtnTp;
    @XmlElement(name = "InvstgtnSubTp")
    protected InvestigationSubType1Choice invstgtnSubTp;
    @XmlElement(name = "UndrlygInstrm")
    protected UnderlyingInvestigationInstrument1Choice undrlygInstrm;
    @XmlElement(name = "Undrlyg")
    protected UnderlyingData2Choice undrlyg;
    @XmlElement(name = "Rqstr", required = true)
    protected Party40Choice rqstr;
    @XmlElement(name = "Rspndr", required = true)
    protected Party40Choice rspndr;
    @XmlElement(name = "ReqOrgtr")
    protected Party40Choice reqOrgtr;
    @XmlElement(name = "XpctdRspndr")
    protected Party40Choice xpctdRspndr;
    @XmlElement(name = "SvcLvl")
    protected List<InvestigationServiceLevel1Choice> svcLvl;

    /**
     * Obtiene el valor de la propiedad msgId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Define el valor de la propiedad msgId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Obtiene el valor de la propiedad rqstrInvstgtnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrInvstgtnId() {
        return rqstrInvstgtnId;
    }

    /**
     * Define el valor de la propiedad rqstrInvstgtnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqstrInvstgtnId(String value) {
        this.rqstrInvstgtnId = value;
    }

    /**
     * Obtiene el valor de la propiedad rspndrInvstgtnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndrInvstgtnId() {
        return rspndrInvstgtnId;
    }

    /**
     * Define el valor de la propiedad rspndrInvstgtnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRspndrInvstgtnId(String value) {
        this.rspndrInvstgtnId = value;
    }

    /**
     * Obtiene el valor de la propiedad eir.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIR() {
        return eir;
    }

    /**
     * Define el valor de la propiedad eir.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIR(String value) {
        this.eir = value;
    }

    /**
     * Obtiene el valor de la propiedad reqActn.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequestAction1 }
     *     
     */
    public InvestigationRequestAction1 getReqActn() {
        return reqActn;
    }

    /**
     * Define el valor de la propiedad reqActn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequestAction1 }
     *     
     */
    public void setReqActn(InvestigationRequestAction1 value) {
        this.reqActn = value;
    }

    /**
     * Obtiene el valor de la propiedad invstgtnTp.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationType1Choice }
     *     
     */
    public InvestigationType1Choice getInvstgtnTp() {
        return invstgtnTp;
    }

    /**
     * Define el valor de la propiedad invstgtnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationType1Choice }
     *     
     */
    public void setInvstgtnTp(InvestigationType1Choice value) {
        this.invstgtnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad invstgtnSubTp.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationSubType1Choice }
     *     
     */
    public InvestigationSubType1Choice getInvstgtnSubTp() {
        return invstgtnSubTp;
    }

    /**
     * Define el valor de la propiedad invstgtnSubTp.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationSubType1Choice }
     *     
     */
    public void setInvstgtnSubTp(InvestigationSubType1Choice value) {
        this.invstgtnSubTp = value;
    }

    /**
     * Obtiene el valor de la propiedad undrlygInstrm.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingInvestigationInstrument1Choice }
     *     
     */
    public UnderlyingInvestigationInstrument1Choice getUndrlygInstrm() {
        return undrlygInstrm;
    }

    /**
     * Define el valor de la propiedad undrlygInstrm.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingInvestigationInstrument1Choice }
     *     
     */
    public void setUndrlygInstrm(UnderlyingInvestigationInstrument1Choice value) {
        this.undrlygInstrm = value;
    }

    /**
     * Obtiene el valor de la propiedad undrlyg.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingData2Choice }
     *     
     */
    public UnderlyingData2Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Define el valor de la propiedad undrlyg.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingData2Choice }
     *     
     */
    public void setUndrlyg(UnderlyingData2Choice value) {
        this.undrlyg = value;
    }

    /**
     * Obtiene el valor de la propiedad rqstr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRqstr() {
        return rqstr;
    }

    /**
     * Define el valor de la propiedad rqstr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setRqstr(Party40Choice value) {
        this.rqstr = value;
    }

    /**
     * Obtiene el valor de la propiedad rspndr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRspndr() {
        return rspndr;
    }

    /**
     * Define el valor de la propiedad rspndr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setRspndr(Party40Choice value) {
        this.rspndr = value;
    }

    /**
     * Obtiene el valor de la propiedad reqOrgtr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getReqOrgtr() {
        return reqOrgtr;
    }

    /**
     * Define el valor de la propiedad reqOrgtr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setReqOrgtr(Party40Choice value) {
        this.reqOrgtr = value;
    }

    /**
     * Obtiene el valor de la propiedad xpctdRspndr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getXpctdRspndr() {
        return xpctdRspndr;
    }

    /**
     * Define el valor de la propiedad xpctdRspndr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setXpctdRspndr(Party40Choice value) {
        this.xpctdRspndr = value;
    }

    /**
     * Gets the value of the svcLvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the svcLvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcLvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationServiceLevel1Choice }
     * 
     * 
     */
    public List<InvestigationServiceLevel1Choice> getSvcLvl() {
        if (svcLvl == null) {
            svcLvl = new ArrayList<InvestigationServiceLevel1Choice>();
        }
        return this.svcLvl;
    }

}
