//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestmentAccount58 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestmentAccount58"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text"/&gt;
 *         &lt;element name="AcctNm" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AcctDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="OwnrId" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}PartyIdentification113" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}PartyIdentification113" minOccurs="0"/&gt;
 *         &lt;element name="OrdrOrgtrElgblty" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}OrderOriginatorEligibility1Code" minOccurs="0"/&gt;
 *         &lt;element name="SubAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}SubAccount6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccount58", propOrder = {
    "acctId",
    "acctNm",
    "acctDsgnt",
    "ownrId",
    "acctSvcr",
    "ordrOrgtrElgblty",
    "subAcctDtls"
})
public class InvestmentAccount58 {

    @XmlElement(name = "AcctId", required = true)
    protected String acctId;
    @XmlElement(name = "AcctNm")
    protected String acctNm;
    @XmlElement(name = "AcctDsgnt")
    protected String acctDsgnt;
    @XmlElement(name = "OwnrId")
    protected List<PartyIdentification113> ownrId;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification113 acctSvcr;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected OrderOriginatorEligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "SubAcctDtls")
    protected SubAccount6 subAcctDtls;

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNm() {
        return acctNm;
    }

    /**
     * Define el valor de la propiedad acctNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNm(String value) {
        this.acctNm = value;
    }

    /**
     * Obtiene el valor de la propiedad acctDsgnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctDsgnt() {
        return acctDsgnt;
    }

    /**
     * Define el valor de la propiedad acctDsgnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctDsgnt(String value) {
        this.acctDsgnt = value;
    }

    /**
     * Gets the value of the ownrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ownrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification113 }
     * 
     * 
     */
    public List<PartyIdentification113> getOwnrId() {
        if (ownrId == null) {
            ownrId = new ArrayList<PartyIdentification113>();
        }
        return this.ownrId;
    }

    /**
     * Obtiene el valor de la propiedad acctSvcr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Define el valor de la propiedad acctSvcr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setAcctSvcr(PartyIdentification113 value) {
        this.acctSvcr = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrOrgtrElgblty.
     * 
     * @return
     *     possible object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public OrderOriginatorEligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Define el valor de la propiedad ordrOrgtrElgblty.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public void setOrdrOrgtrElgblty(OrderOriginatorEligibility1Code value) {
        this.ordrOrgtrElgblty = value;
    }

    /**
     * Obtiene el valor de la propiedad subAcctDtls.
     * 
     * @return
     *     possible object is
     *     {@link SubAccount6 }
     *     
     */
    public SubAccount6 getSubAcctDtls() {
        return subAcctDtls;
    }

    /**
     * Define el valor de la propiedad subAcctDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link SubAccount6 }
     *     
     */
    public void setSubAcctDtls(SubAccount6 value) {
        this.subAcctDtls = value;
    }

}
