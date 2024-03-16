//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProcessingResult19 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProcessingResult19"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RspnSrc" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ApprovalEntity2" minOccurs="0"/&gt;
 *         &lt;element name="RsltData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ResultData10"/&gt;
 *         &lt;element name="ErrDtl" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ErrorDetails2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrgnlRsltData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ResultData7" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalInformation30" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult19", propOrder = {
    "rspnSrc",
    "rsltData",
    "errDtl",
    "orgnlRsltData",
    "addtlInf"
})
public class ProcessingResult19 {

    @XmlElement(name = "RspnSrc")
    protected ApprovalEntity2 rspnSrc;
    @XmlElement(name = "RsltData", required = true)
    protected ResultData10 rsltData;
    @XmlElement(name = "ErrDtl")
    protected List<ErrorDetails2> errDtl;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData7 orgnlRsltData;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation30> addtlInf;

    /**
     * Obtiene el valor de la propiedad rspnSrc.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalEntity2 }
     *     
     */
    public ApprovalEntity2 getRspnSrc() {
        return rspnSrc;
    }

    /**
     * Define el valor de la propiedad rspnSrc.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalEntity2 }
     *     
     */
    public void setRspnSrc(ApprovalEntity2 value) {
        this.rspnSrc = value;
    }

    /**
     * Obtiene el valor de la propiedad rsltData.
     * 
     * @return
     *     possible object is
     *     {@link ResultData10 }
     *     
     */
    public ResultData10 getRsltData() {
        return rsltData;
    }

    /**
     * Define el valor de la propiedad rsltData.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData10 }
     *     
     */
    public void setRsltData(ResultData10 value) {
        this.rsltData = value;
    }

    /**
     * Gets the value of the errDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails2 }
     * 
     * 
     */
    public List<ErrorDetails2> getErrDtl() {
        if (errDtl == null) {
            errDtl = new ArrayList<ErrorDetails2>();
        }
        return this.errDtl;
    }

    /**
     * Obtiene el valor de la propiedad orgnlRsltData.
     * 
     * @return
     *     possible object is
     *     {@link ResultData7 }
     *     
     */
    public ResultData7 getOrgnlRsltData() {
        return orgnlRsltData;
    }

    /**
     * Define el valor de la propiedad orgnlRsltData.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData7 }
     *     
     */
    public void setOrgnlRsltData(ResultData7 value) {
        this.orgnlRsltData = value;
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
     * {@link AdditionalInformation30 }
     * 
     * 
     */
    public List<AdditionalInformation30> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation30>();
        }
        return this.addtlInf;
    }

}
