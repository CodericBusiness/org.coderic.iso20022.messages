//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingResult1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancingResult1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FincgReqSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}RequestStatus1Code"/&gt;
 *         &lt;element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}StatusReason4Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlStsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max105Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FincdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingRateOrAmountChoice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingResult1", propOrder = {
    "fincgReqSts",
    "stsRsn",
    "addtlStsRsnInf",
    "fincdAmt"
})
public class FinancingResult1 {

    @XmlElement(name = "FincgReqSts", required = true)
    @XmlSchemaType(name = "string")
    protected RequestStatus1Code fincgReqSts;
    @XmlElement(name = "StsRsn")
    protected StatusReason4Choice stsRsn;
    @XmlElement(name = "AddtlStsRsnInf")
    protected List<String> addtlStsRsnInf;
    @XmlElement(name = "FincdAmt")
    protected FinancingRateOrAmountChoice fincdAmt;

    /**
     * Obtiene el valor de la propiedad fincgReqSts.
     * 
     * @return
     *     possible object is
     *     {@link RequestStatus1Code }
     *     
     */
    public RequestStatus1Code getFincgReqSts() {
        return fincgReqSts;
    }

    /**
     * Define el valor de la propiedad fincgReqSts.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestStatus1Code }
     *     
     */
    public void setFincgReqSts(RequestStatus1Code value) {
        this.fincgReqSts = value;
    }

    /**
     * Obtiene el valor de la propiedad stsRsn.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason4Choice }
     *     
     */
    public StatusReason4Choice getStsRsn() {
        return stsRsn;
    }

    /**
     * Define el valor de la propiedad stsRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason4Choice }
     *     
     */
    public void setStsRsn(StatusReason4Choice value) {
        this.stsRsn = value;
    }

    /**
     * Gets the value of the addtlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlStsRsnInf() {
        if (addtlStsRsnInf == null) {
            addtlStsRsnInf = new ArrayList<String>();
        }
        return this.addtlStsRsnInf;
    }

    /**
     * Obtiene el valor de la propiedad fincdAmt.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getFincdAmt() {
        return fincdAmt;
    }

    /**
     * Define el valor de la propiedad fincdAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public void setFincdAmt(FinancingRateOrAmountChoice value) {
        this.fincdAmt = value;
    }

}
