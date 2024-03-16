//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DisputeData3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DisputeData3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PresntmntCycl" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Exact1NumericText" minOccurs="0"/&gt;
 *         &lt;element name="DsptCond" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="DsptSts" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrtlDspt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}YesNoIndicator" minOccurs="0"/&gt;
 *         &lt;element name="DsptRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}DisputeReference1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DcmnttnSts" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlDsptData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}AdditionalData1" minOccurs="0"/&gt;
 *         &lt;element name="DsptRjctRsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChrgbckElgblty" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeData3", propOrder = {
    "presntmntCycl",
    "dsptCond",
    "dsptSts",
    "prtlDspt",
    "dsptRef",
    "dcmnttnSts",
    "addtlDsptData",
    "dsptRjctRsn",
    "chrgbckElgblty"
})
public class DisputeData3 {

    @XmlElement(name = "PresntmntCycl")
    protected String presntmntCycl;
    @XmlElement(name = "DsptCond")
    protected String dsptCond;
    @XmlElement(name = "DsptSts")
    protected String dsptSts;
    @XmlElement(name = "PrtlDspt")
    protected Boolean prtlDspt;
    @XmlElement(name = "DsptRef")
    protected List<DisputeReference1> dsptRef;
    @XmlElement(name = "DcmnttnSts")
    protected String dcmnttnSts;
    @XmlElement(name = "AddtlDsptData")
    protected AdditionalData1 addtlDsptData;
    @XmlElement(name = "DsptRjctRsn")
    protected List<String> dsptRjctRsn;
    @XmlElement(name = "ChrgbckElgblty")
    protected String chrgbckElgblty;

    /**
     * Obtiene el valor de la propiedad presntmntCycl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntCycl() {
        return presntmntCycl;
    }

    /**
     * Define el valor de la propiedad presntmntCycl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntCycl(String value) {
        this.presntmntCycl = value;
    }

    /**
     * Obtiene el valor de la propiedad dsptCond.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptCond() {
        return dsptCond;
    }

    /**
     * Define el valor de la propiedad dsptCond.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsptCond(String value) {
        this.dsptCond = value;
    }

    /**
     * Obtiene el valor de la propiedad dsptSts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsptSts() {
        return dsptSts;
    }

    /**
     * Define el valor de la propiedad dsptSts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsptSts(String value) {
        this.dsptSts = value;
    }

    /**
     * Obtiene el valor de la propiedad prtlDspt.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDspt() {
        return prtlDspt;
    }

    /**
     * Define el valor de la propiedad prtlDspt.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtlDspt(Boolean value) {
        this.prtlDspt = value;
    }

    /**
     * Gets the value of the dsptRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dsptRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisputeReference1 }
     * 
     * 
     */
    public List<DisputeReference1> getDsptRef() {
        if (dsptRef == null) {
            dsptRef = new ArrayList<DisputeReference1>();
        }
        return this.dsptRef;
    }

    /**
     * Obtiene el valor de la propiedad dcmnttnSts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcmnttnSts() {
        return dcmnttnSts;
    }

    /**
     * Define el valor de la propiedad dcmnttnSts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcmnttnSts(String value) {
        this.dcmnttnSts = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlDsptData.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalData1 }
     *     
     */
    public AdditionalData1 getAddtlDsptData() {
        return addtlDsptData;
    }

    /**
     * Define el valor de la propiedad addtlDsptData.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalData1 }
     *     
     */
    public void setAddtlDsptData(AdditionalData1 value) {
        this.addtlDsptData = value;
    }

    /**
     * Gets the value of the dsptRjctRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dsptRjctRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDsptRjctRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDsptRjctRsn() {
        if (dsptRjctRsn == null) {
            dsptRjctRsn = new ArrayList<String>();
        }
        return this.dsptRjctRsn;
    }

    /**
     * Obtiene el valor de la propiedad chrgbckElgblty.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChrgbckElgblty() {
        return chrgbckElgblty;
    }

    /**
     * Define el valor de la propiedad chrgbckElgblty.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChrgbckElgblty(String value) {
        this.chrgbckElgblty = value;
    }

}
