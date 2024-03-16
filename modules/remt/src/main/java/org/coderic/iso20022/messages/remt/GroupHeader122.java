//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:36 PM COT 
//


package org.coderic.iso20022.messages.remt;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GroupHeader122 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader122"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}ISODateTime"/&gt;
 *         &lt;element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Authorisation1Choice" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="CpyInd" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}CopyDuplicate1Code" minOccurs="0"/&gt;
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}PartyIdentification272"/&gt;
 *         &lt;element name="MsgRcpt" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}PartyIdentification272" minOccurs="0"/&gt;
 *         &lt;element name="FwdgAgt" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}BranchAndFinancialInstitutionIdentification8" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader122", propOrder = {
    "msgId",
    "creDtTm",
    "authstn",
    "cpyInd",
    "initgPty",
    "msgRcpt",
    "fwdgAgt"
})
public class GroupHeader122 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Authstn")
    protected List<Authorisation1Choice> authstn;
    @XmlElement(name = "CpyInd")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyInd;
    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification272 initgPty;
    @XmlElement(name = "MsgRcpt")
    protected PartyIdentification272 msgRcpt;
    @XmlElement(name = "FwdgAgt")
    protected BranchAndFinancialInstitutionIdentification8 fwdgAgt;

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
     * Obtiene el valor de la propiedad creDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Define el valor de la propiedad creDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the authstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the authstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorisation1Choice }
     * 
     * 
     */
    public List<Authorisation1Choice> getAuthstn() {
        if (authstn == null) {
            authstn = new ArrayList<Authorisation1Choice>();
        }
        return this.authstn;
    }

    /**
     * Obtiene el valor de la propiedad cpyInd.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyInd() {
        return cpyInd;
    }

    /**
     * Define el valor de la propiedad cpyInd.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyInd(CopyDuplicate1Code value) {
        this.cpyInd = value;
    }

    /**
     * Obtiene el valor de la propiedad initgPty.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getInitgPty() {
        return initgPty;
    }

    /**
     * Define el valor de la propiedad initgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setInitgPty(PartyIdentification272 value) {
        this.initgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad msgRcpt.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification272 }
     *     
     */
    public PartyIdentification272 getMsgRcpt() {
        return msgRcpt;
    }

    /**
     * Define el valor de la propiedad msgRcpt.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification272 }
     *     
     */
    public void setMsgRcpt(PartyIdentification272 value) {
        this.msgRcpt = value;
    }

    /**
     * Obtiene el valor de la propiedad fwdgAgt.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification8 getFwdgAgt() {
        return fwdgAgt;
    }

    /**
     * Define el valor de la propiedad fwdgAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification8 }
     *     
     */
    public void setFwdgAgt(BranchAndFinancialInstitutionIdentification8 value) {
        this.fwdgAgt = value;
    }

}
