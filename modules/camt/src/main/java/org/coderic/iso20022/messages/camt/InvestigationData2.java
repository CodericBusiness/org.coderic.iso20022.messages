//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestigationData2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationData2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlInvstgtnSeq" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Max3Number" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlInvstgtnRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationReason1Choice" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlInvstgtnRsnSubTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationReasonSubType1Choice" minOccurs="0"/&gt;
 *         &lt;element name="RspnData" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationDataRecord1Choice"/&gt;
 *         &lt;element name="RltdInvstgtnData" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}RelatedInvestigationData1" minOccurs="0"/&gt;
 *         &lt;element name="NclsdFile" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Document12" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RltdFileData" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}FileData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RspnOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}Party40Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationData2", propOrder = {
    "orgnlInvstgtnSeq",
    "orgnlInvstgtnRsn",
    "orgnlInvstgtnRsnSubTp",
    "rspnData",
    "rltdInvstgtnData",
    "nclsdFile",
    "rltdFileData",
    "rspnOrgtr"
})
public class InvestigationData2 {

    @XmlElement(name = "OrgnlInvstgtnSeq")
    protected BigDecimal orgnlInvstgtnSeq;
    @XmlElement(name = "OrgnlInvstgtnRsn")
    protected InvestigationReason1Choice orgnlInvstgtnRsn;
    @XmlElement(name = "OrgnlInvstgtnRsnSubTp")
    protected InvestigationReasonSubType1Choice orgnlInvstgtnRsnSubTp;
    @XmlElement(name = "RspnData", required = true)
    protected InvestigationDataRecord1Choice rspnData;
    @XmlElement(name = "RltdInvstgtnData")
    protected RelatedInvestigationData1 rltdInvstgtnData;
    @XmlElement(name = "NclsdFile")
    protected List<Document12> nclsdFile;
    @XmlElement(name = "RltdFileData")
    protected List<FileData1> rltdFileData;
    @XmlElement(name = "RspnOrgtr")
    protected Party40Choice rspnOrgtr;

    /**
     * Obtiene el valor de la propiedad orgnlInvstgtnSeq.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlInvstgtnSeq() {
        return orgnlInvstgtnSeq;
    }

    /**
     * Define el valor de la propiedad orgnlInvstgtnSeq.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgnlInvstgtnSeq(BigDecimal value) {
        this.orgnlInvstgtnSeq = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlInvstgtnRsn.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationReason1Choice }
     *     
     */
    public InvestigationReason1Choice getOrgnlInvstgtnRsn() {
        return orgnlInvstgtnRsn;
    }

    /**
     * Define el valor de la propiedad orgnlInvstgtnRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationReason1Choice }
     *     
     */
    public void setOrgnlInvstgtnRsn(InvestigationReason1Choice value) {
        this.orgnlInvstgtnRsn = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlInvstgtnRsnSubTp.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationReasonSubType1Choice }
     *     
     */
    public InvestigationReasonSubType1Choice getOrgnlInvstgtnRsnSubTp() {
        return orgnlInvstgtnRsnSubTp;
    }

    /**
     * Define el valor de la propiedad orgnlInvstgtnRsnSubTp.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationReasonSubType1Choice }
     *     
     */
    public void setOrgnlInvstgtnRsnSubTp(InvestigationReasonSubType1Choice value) {
        this.orgnlInvstgtnRsnSubTp = value;
    }

    /**
     * Obtiene el valor de la propiedad rspnData.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationDataRecord1Choice }
     *     
     */
    public InvestigationDataRecord1Choice getRspnData() {
        return rspnData;
    }

    /**
     * Define el valor de la propiedad rspnData.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationDataRecord1Choice }
     *     
     */
    public void setRspnData(InvestigationDataRecord1Choice value) {
        this.rspnData = value;
    }

    /**
     * Obtiene el valor de la propiedad rltdInvstgtnData.
     * 
     * @return
     *     possible object is
     *     {@link RelatedInvestigationData1 }
     *     
     */
    public RelatedInvestigationData1 getRltdInvstgtnData() {
        return rltdInvstgtnData;
    }

    /**
     * Define el valor de la propiedad rltdInvstgtnData.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedInvestigationData1 }
     *     
     */
    public void setRltdInvstgtnData(RelatedInvestigationData1 value) {
        this.rltdInvstgtnData = value;
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
     * {@link Document12 }
     * 
     * 
     */
    public List<Document12> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document12>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the rltdFileData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltdFileData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdFileData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileData1 }
     * 
     * 
     */
    public List<FileData1> getRltdFileData() {
        if (rltdFileData == null) {
            rltdFileData = new ArrayList<FileData1>();
        }
        return this.rltdFileData;
    }

    /**
     * Obtiene el valor de la propiedad rspnOrgtr.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRspnOrgtr() {
        return rspnOrgtr;
    }

    /**
     * Define el valor de la propiedad rspnOrgtr.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setRspnOrgtr(Party40Choice value) {
        this.rspnOrgtr = value;
    }

}
