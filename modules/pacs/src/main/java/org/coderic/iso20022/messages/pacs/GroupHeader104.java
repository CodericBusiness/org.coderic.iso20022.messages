//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:22 PM COT 
//


package org.coderic.iso20022.messages.pacs;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para GroupHeader104 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GroupHeader104"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Max35Text"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}ISODateTime"/&gt;
 *         &lt;element name="NbOfSttlmReqs" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}Max15NumericText"/&gt;
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="SttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}SettlementInstruction14" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader104", propOrder = {
    "msgId",
    "creDtTm",
    "nbOfSttlmReqs",
    "ctrlSum",
    "sttlmInf"
})
public class GroupHeader104 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NbOfSttlmReqs", required = true)
    protected String nbOfSttlmReqs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "SttlmInf")
    protected SettlementInstruction14 sttlmInf;

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
     * Obtiene el valor de la propiedad nbOfSttlmReqs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfSttlmReqs() {
        return nbOfSttlmReqs;
    }

    /**
     * Define el valor de la propiedad nbOfSttlmReqs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfSttlmReqs(String value) {
        this.nbOfSttlmReqs = value;
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
     * Obtiene el valor de la propiedad sttlmInf.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction14 }
     *     
     */
    public SettlementInstruction14 getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Define el valor de la propiedad sttlmInf.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction14 }
     *     
     */
    public void setSttlmInf(SettlementInstruction14 value) {
        this.sttlmInf = value;
    }

}
