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
 * <p>Clase Java para CardData10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardData10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PAN" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max19NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdPANInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="CardSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Min2Max3NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PmtAcctRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PANAcctRg" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max19NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CardPrtflIdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCardData" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardData10", propOrder = {
    "pan",
    "prtctdPANInd",
    "cardSeqNb",
    "pmtAcctRef",
    "panAcctRg",
    "cardPrtflIdr",
    "addtlCardData"
})
public class CardData10 {

    @XmlElement(name = "PAN")
    protected String pan;
    @XmlElement(name = "PrtctdPANInd")
    protected Boolean prtctdPANInd;
    @XmlElement(name = "CardSeqNb")
    protected String cardSeqNb;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "PANAcctRg")
    protected String panAcctRg;
    @XmlElement(name = "CardPrtflIdr")
    protected String cardPrtflIdr;
    @XmlElement(name = "AddtlCardData")
    protected List<AdditionalData1> addtlCardData;

    /**
     * Obtiene el valor de la propiedad pan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Define el valor de la propiedad pan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdPANInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtctdPANInd() {
        return prtctdPANInd;
    }

    /**
     * Define el valor de la propiedad prtctdPANInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrtctdPANInd(Boolean value) {
        this.prtctdPANInd = value;
    }

    /**
     * Obtiene el valor de la propiedad cardSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Define el valor de la propiedad cardSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNb(String value) {
        this.cardSeqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtAcctRef.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtAcctRef() {
        return pmtAcctRef;
    }

    /**
     * Define el valor de la propiedad pmtAcctRef.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtAcctRef(String value) {
        this.pmtAcctRef = value;
    }

    /**
     * Obtiene el valor de la propiedad panAcctRg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPANAcctRg() {
        return panAcctRg;
    }

    /**
     * Define el valor de la propiedad panAcctRg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPANAcctRg(String value) {
        this.panAcctRg = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPrtflIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPrtflIdr() {
        return cardPrtflIdr;
    }

    /**
     * Define el valor de la propiedad cardPrtflIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPrtflIdr(String value) {
        this.cardPrtflIdr = value;
    }

    /**
     * Gets the value of the addtlCardData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlCardData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCardData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlCardData() {
        if (addtlCardData == null) {
            addtlCardData = new ArrayList<AdditionalData1>();
        }
        return this.addtlCardData;
    }

}
