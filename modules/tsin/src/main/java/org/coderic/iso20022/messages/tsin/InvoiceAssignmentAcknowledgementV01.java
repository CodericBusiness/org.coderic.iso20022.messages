//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceAssignmentAcknowledgementV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceAssignmentAcknowledgementV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}BusinessLetter1"/&gt;
 *         &lt;element name="PmtStsList" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingItemList1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PmtStsCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="ItmCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}DecimalNumber" minOccurs="0"/&gt;
 *         &lt;element name="AttchdMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}EncapsulatedBusinessMessage1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceAssignmentAcknowledgementV01", propOrder = {
    "hdr",
    "pmtStsList",
    "pmtStsCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class InvoiceAssignmentAcknowledgementV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "PmtStsList", required = true)
    protected List<FinancingItemList1> pmtStsList;
    @XmlElement(name = "PmtStsCnt")
    protected String pmtStsCnt;
    @XmlElement(name = "ItmCnt")
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "AttchdMsg")
    protected List<EncapsulatedBusinessMessage1> attchdMsg;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLetter1 }
     *     
     */
    public BusinessLetter1 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLetter1 }
     *     
     */
    public void setHdr(BusinessLetter1 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the pmtStsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pmtStsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtStsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingItemList1 }
     * 
     * 
     */
    public List<FinancingItemList1> getPmtStsList() {
        if (pmtStsList == null) {
            pmtStsList = new ArrayList<FinancingItemList1>();
        }
        return this.pmtStsList;
    }

    /**
     * Obtiene el valor de la propiedad pmtStsCnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStsCnt() {
        return pmtStsCnt;
    }

    /**
     * Define el valor de la propiedad pmtStsCnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtStsCnt(String value) {
        this.pmtStsCnt = value;
    }

    /**
     * Obtiene el valor de la propiedad itmCnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Define el valor de la propiedad itmCnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmCnt(String value) {
        this.itmCnt = value;
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
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attchdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedBusinessMessage1 }
     * 
     * 
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<EncapsulatedBusinessMessage1>();
        }
        return this.attchdMsg;
    }

}
