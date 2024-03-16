//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportItem1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportItem1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}SecuritiesAccount19"/&gt;
 *         &lt;element name="AcctLvl" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}HoldingAccountLevel1Code"/&gt;
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}SecurityIdentification19" minOccurs="0"/&gt;
 *         &lt;element name="ItmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ISODate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItem1", propOrder = {
    "acctId",
    "acctLvl",
    "finInstrmId",
    "itmDt"
})
public class ReportItem1 {

    @XmlElement(name = "AcctId", required = true)
    protected SecuritiesAccount19 acctId;
    @XmlElement(name = "AcctLvl", required = true)
    @XmlSchemaType(name = "string")
    protected HoldingAccountLevel1Code acctLvl;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "ItmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itmDt;

    /**
     * Obtiene el valor de la propiedad acctId.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getAcctId() {
        return acctId;
    }

    /**
     * Define el valor de la propiedad acctId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setAcctId(SecuritiesAccount19 value) {
        this.acctId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctLvl.
     * 
     * @return
     *     possible object is
     *     {@link HoldingAccountLevel1Code }
     *     
     */
    public HoldingAccountLevel1Code getAcctLvl() {
        return acctLvl;
    }

    /**
     * Define el valor de la propiedad acctLvl.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldingAccountLevel1Code }
     *     
     */
    public void setAcctLvl(HoldingAccountLevel1Code value) {
        this.acctLvl = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Define el valor de la propiedad finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Obtiene el valor de la propiedad itmDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItmDt() {
        return itmDt;
    }

    /**
     * Define el valor de la propiedad itmDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItmDt(XMLGregorianCalendar value) {
        this.itmDt = value;
    }

}
