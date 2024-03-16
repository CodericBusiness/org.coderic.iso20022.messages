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
 * <p>Clase Java para SettlementService4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SettlementService4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SttlmSvcApld" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SettlementServiceMode1" minOccurs="0"/&gt;
 *         &lt;element name="SttlmSvcDts" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SettlementServiceDate2" minOccurs="0"/&gt;
 *         &lt;element name="SttlmRptgNtty" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SettlementReportingEntity1" minOccurs="0"/&gt;
 *         &lt;element name="AddtlSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementService4", propOrder = {
    "sttlmSvcApld",
    "sttlmSvcDts",
    "sttlmRptgNtty",
    "addtlSttlmInf"
})
public class SettlementService4 {

    @XmlElement(name = "SttlmSvcApld")
    protected SettlementServiceMode1 sttlmSvcApld;
    @XmlElement(name = "SttlmSvcDts")
    protected SettlementServiceDate2 sttlmSvcDts;
    @XmlElement(name = "SttlmRptgNtty")
    protected SettlementReportingEntity1 sttlmRptgNtty;
    @XmlElement(name = "AddtlSttlmInf")
    protected List<AdditionalData1> addtlSttlmInf;

    /**
     * Obtiene el valor de la propiedad sttlmSvcApld.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public SettlementServiceMode1 getSttlmSvcApld() {
        return sttlmSvcApld;
    }

    /**
     * Define el valor de la propiedad sttlmSvcApld.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceMode1 }
     *     
     */
    public void setSttlmSvcApld(SettlementServiceMode1 value) {
        this.sttlmSvcApld = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmSvcDts.
     * 
     * @return
     *     possible object is
     *     {@link SettlementServiceDate2 }
     *     
     */
    public SettlementServiceDate2 getSttlmSvcDts() {
        return sttlmSvcDts;
    }

    /**
     * Define el valor de la propiedad sttlmSvcDts.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementServiceDate2 }
     *     
     */
    public void setSttlmSvcDts(SettlementServiceDate2 value) {
        this.sttlmSvcDts = value;
    }

    /**
     * Obtiene el valor de la propiedad sttlmRptgNtty.
     * 
     * @return
     *     possible object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public SettlementReportingEntity1 getSttlmRptgNtty() {
        return sttlmRptgNtty;
    }

    /**
     * Define el valor de la propiedad sttlmRptgNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementReportingEntity1 }
     *     
     */
    public void setSttlmRptgNtty(SettlementReportingEntity1 value) {
        this.sttlmRptgNtty = value;
    }

    /**
     * Gets the value of the addtlSttlmInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlSttlmInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSttlmInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlSttlmInf() {
        if (addtlSttlmInf == null) {
            addtlSttlmInf = new ArrayList<AdditionalData1>();
        }
        return this.addtlSttlmInf;
    }

}
