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
 * <p>Clase Java para InvestigationResponse3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationResponse3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text"/&gt;
 *         &lt;element name="RspndrInvstgtnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="InvstgtnSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationStatus2"/&gt;
 *         &lt;element name="NxtRspndr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Party40Choice" minOccurs="0"/&gt;
 *         &lt;element name="InvstgtnData" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationData2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResponse3", propOrder = {
    "msgId",
    "rspndrInvstgtnId",
    "invstgtnSts",
    "nxtRspndr",
    "invstgtnData"
})
public class InvestigationResponse3 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "RspndrInvstgtnId")
    protected String rspndrInvstgtnId;
    @XmlElement(name = "InvstgtnSts", required = true)
    protected InvestigationStatus2 invstgtnSts;
    @XmlElement(name = "NxtRspndr")
    protected Party40Choice nxtRspndr;
    @XmlElement(name = "InvstgtnData")
    protected List<InvestigationData2> invstgtnData;

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
     * Obtiene el valor de la propiedad invstgtnSts.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus2 }
     *     
     */
    public InvestigationStatus2 getInvstgtnSts() {
        return invstgtnSts;
    }

    /**
     * Define el valor de la propiedad invstgtnSts.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus2 }
     *     
     */
    public void setInvstgtnSts(InvestigationStatus2 value) {
        this.invstgtnSts = value;
    }

    /**
     * Obtiene el valor de la propiedad nxtRspndr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getNxtRspndr() {
        return nxtRspndr;
    }

    /**
     * Define el valor de la propiedad nxtRspndr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setNxtRspndr(Party40Choice value) {
        this.nxtRspndr = value;
    }

    /**
     * Gets the value of the invstgtnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the invstgtnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstgtnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigationData2 }
     * 
     * 
     */
    public List<InvestigationData2> getInvstgtnData() {
        if (invstgtnData == null) {
            invstgtnData = new ArrayList<InvestigationData2>();
        }
        return this.invstgtnData;
    }

}
