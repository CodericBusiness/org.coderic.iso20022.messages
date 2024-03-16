//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:22 PM COT 
//


package org.coderic.iso20022.messages.pacs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MultilateralSettlementRequestV02 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultilateralSettlementRequestV02"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}GroupHeader104"/&gt;
 *         &lt;element name="SttlmReq" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}MultilateralSettlementRequest3" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pacs.029.001.02}SupplementaryData1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultilateralSettlementRequestV02", propOrder = {
    "grpHdr",
    "sttlmReq",
    "splmtryData"
})
public class MultilateralSettlementRequestV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader104 grpHdr;
    @XmlElement(name = "SttlmReq", required = true)
    protected List<MultilateralSettlementRequest3> sttlmReq;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Obtiene el valor de la propiedad grpHdr.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader104 }
     *     
     */
    public GroupHeader104 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Define el valor de la propiedad grpHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader104 }
     *     
     */
    public void setGrpHdr(GroupHeader104 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the sttlmReq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmReq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmReq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilateralSettlementRequest3 }
     * 
     * 
     */
    public List<MultilateralSettlementRequest3> getSttlmReq() {
        if (sttlmReq == null) {
            sttlmReq = new ArrayList<MultilateralSettlementRequest3>();
        }
        return this.sttlmReq;
    }

    /**
     * Obtiene el valor de la propiedad splmtryData.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Define el valor de la propiedad splmtryData.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
    }

}
