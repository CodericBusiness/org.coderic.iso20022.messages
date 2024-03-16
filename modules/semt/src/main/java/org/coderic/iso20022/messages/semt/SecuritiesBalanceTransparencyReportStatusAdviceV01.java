//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecuritiesBalanceTransparencyReportStatusAdviceV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesBalanceTransparencyReportStatusAdviceV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}MessageIdentification1"/&gt;
 *         &lt;element name="SndrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}PartyIdentification100"/&gt;
 *         &lt;element name="RcvrId" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}PartyIdentification100" minOccurs="0"/&gt;
 *         &lt;element name="RltdStmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}StatementReference1"/&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemStatus1Choice"/&gt;
 *         &lt;element name="NbOfItmsPerSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}NumberOfItemsPerStatus1" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceTransparencyReportStatusAdviceV01", propOrder = {
    "msgId",
    "sndrId",
    "rcvrId",
    "rltdStmt",
    "sts",
    "nbOfItmsPerSts",
    "splmtryData"
})
public class SecuritiesBalanceTransparencyReportStatusAdviceV01 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "SndrId", required = true)
    protected PartyIdentification100 sndrId;
    @XmlElement(name = "RcvrId")
    protected PartyIdentification100 rcvrId;
    @XmlElement(name = "RltdStmt", required = true)
    protected StatementReference1 rltdStmt;
    @XmlElement(name = "Sts", required = true)
    protected ReportItemStatus1Choice sts;
    @XmlElement(name = "NbOfItmsPerSts")
    protected List<NumberOfItemsPerStatus1> nbOfItmsPerSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad msgId.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Define el valor de la propiedad msgId.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Obtiene el valor de la propiedad sndrId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getSndrId() {
        return sndrId;
    }

    /**
     * Define el valor de la propiedad sndrId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setSndrId(PartyIdentification100 value) {
        this.sndrId = value;
    }

    /**
     * Obtiene el valor de la propiedad rcvrId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getRcvrId() {
        return rcvrId;
    }

    /**
     * Define el valor de la propiedad rcvrId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public void setRcvrId(PartyIdentification100 value) {
        this.rcvrId = value;
    }

    /**
     * Obtiene el valor de la propiedad rltdStmt.
     * 
     * @return
     *     possible object is
     *     {@link StatementReference1 }
     *     
     */
    public StatementReference1 getRltdStmt() {
        return rltdStmt;
    }

    /**
     * Define el valor de la propiedad rltdStmt.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementReference1 }
     *     
     */
    public void setRltdStmt(StatementReference1 value) {
        this.rltdStmt = value;
    }

    /**
     * Obtiene el valor de la propiedad sts.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemStatus1Choice }
     *     
     */
    public ReportItemStatus1Choice getSts() {
        return sts;
    }

    /**
     * Define el valor de la propiedad sts.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemStatus1Choice }
     *     
     */
    public void setSts(ReportItemStatus1Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the nbOfItmsPerSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nbOfItmsPerSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNbOfItmsPerSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumberOfItemsPerStatus1 }
     * 
     * 
     */
    public List<NumberOfItemsPerStatus1> getNbOfItmsPerSts() {
        if (nbOfItmsPerSts == null) {
            nbOfItmsPerSts = new ArrayList<NumberOfItemsPerStatus1>();
        }
        return this.nbOfItmsPerSts;
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
