//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentCard35 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentCard35"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrtctdCardData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ContentInformationType40" minOccurs="0"/&gt;
 *         &lt;element name="PrvtCardData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max100KBinary" minOccurs="0"/&gt;
 *         &lt;element name="PlainCardData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PlainCardData22" minOccurs="0"/&gt;
 *         &lt;element name="PmtAcctRef" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="MskdPAN" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max30Text" minOccurs="0"/&gt;
 *         &lt;element name="IssrBIN" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="CardCtryCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max3Text" minOccurs="0"/&gt;
 *         &lt;element name="CardCcyCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Exact3AlphaNumericText" minOccurs="0"/&gt;
 *         &lt;element name="CardPdctPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CardBrnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CardPdctTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardProductType1Code" minOccurs="0"/&gt;
 *         &lt;element name="CardPdctSubTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="IntrnlCard" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AllwdPdct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SvcOptn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlCardData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max70Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCard35", propOrder = {
    "prtctdCardData",
    "prvtCardData",
    "plainCardData",
    "pmtAcctRef",
    "mskdPAN",
    "issrBIN",
    "cardCtryCd",
    "cardCcyCd",
    "cardPdctPrfl",
    "cardBrnd",
    "cardPdctTp",
    "cardPdctSubTp",
    "intrnlCard",
    "allwdPdct",
    "svcOptn",
    "addtlCardData"
})
public class PaymentCard35 {

    @XmlElement(name = "PrtctdCardData")
    protected ContentInformationType40 prtctdCardData;
    @XmlElement(name = "PrvtCardData")
    protected byte[] prvtCardData;
    @XmlElement(name = "PlainCardData")
    protected PlainCardData22 plainCardData;
    @XmlElement(name = "PmtAcctRef")
    protected String pmtAcctRef;
    @XmlElement(name = "MskdPAN")
    protected String mskdPAN;
    @XmlElement(name = "IssrBIN")
    protected String issrBIN;
    @XmlElement(name = "CardCtryCd")
    protected String cardCtryCd;
    @XmlElement(name = "CardCcyCd")
    protected String cardCcyCd;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardPdctTp")
    @XmlSchemaType(name = "string")
    protected CardProductType1Code cardPdctTp;
    @XmlElement(name = "CardPdctSubTp")
    protected String cardPdctSubTp;
    @XmlElement(name = "IntrnlCard")
    protected Boolean intrnlCard;
    @XmlElement(name = "AllwdPdct")
    protected List<String> allwdPdct;
    @XmlElement(name = "SvcOptn")
    protected String svcOptn;
    @XmlElement(name = "AddtlCardData")
    protected String addtlCardData;

    /**
     * Obtiene el valor de la propiedad prtctdCardData.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType40 }
     *     
     */
    public ContentInformationType40 getPrtctdCardData() {
        return prtctdCardData;
    }

    /**
     * Define el valor de la propiedad prtctdCardData.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType40 }
     *     
     */
    public void setPrtctdCardData(ContentInformationType40 value) {
        this.prtctdCardData = value;
    }

    /**
     * Obtiene el valor de la propiedad prvtCardData.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPrvtCardData() {
        return prvtCardData;
    }

    /**
     * Define el valor de la propiedad prvtCardData.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPrvtCardData(byte[] value) {
        this.prvtCardData = value;
    }

    /**
     * Obtiene el valor de la propiedad plainCardData.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData22 }
     *     
     */
    public PlainCardData22 getPlainCardData() {
        return plainCardData;
    }

    /**
     * Define el valor de la propiedad plainCardData.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData22 }
     *     
     */
    public void setPlainCardData(PlainCardData22 value) {
        this.plainCardData = value;
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
     * Obtiene el valor de la propiedad mskdPAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMskdPAN() {
        return mskdPAN;
    }

    /**
     * Define el valor de la propiedad mskdPAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMskdPAN(String value) {
        this.mskdPAN = value;
    }

    /**
     * Obtiene el valor de la propiedad issrBIN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrBIN() {
        return issrBIN;
    }

    /**
     * Define el valor de la propiedad issrBIN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrBIN(String value) {
        this.issrBIN = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCtryCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCtryCd() {
        return cardCtryCd;
    }

    /**
     * Define el valor de la propiedad cardCtryCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCtryCd(String value) {
        this.cardCtryCd = value;
    }

    /**
     * Obtiene el valor de la propiedad cardCcyCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCcyCd() {
        return cardCcyCd;
    }

    /**
     * Define el valor de la propiedad cardCcyCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCcyCd(String value) {
        this.cardCcyCd = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPdctPrfl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctPrfl() {
        return cardPdctPrfl;
    }

    /**
     * Define el valor de la propiedad cardPdctPrfl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPdctPrfl(String value) {
        this.cardPdctPrfl = value;
    }

    /**
     * Obtiene el valor de la propiedad cardBrnd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrnd() {
        return cardBrnd;
    }

    /**
     * Define el valor de la propiedad cardBrnd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrnd(String value) {
        this.cardBrnd = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPdctTp.
     * 
     * @return
     *     possible object is
     *     {@link CardProductType1Code }
     *     
     */
    public CardProductType1Code getCardPdctTp() {
        return cardPdctTp;
    }

    /**
     * Define el valor de la propiedad cardPdctTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CardProductType1Code }
     *     
     */
    public void setCardPdctTp(CardProductType1Code value) {
        this.cardPdctTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cardPdctSubTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctSubTp() {
        return cardPdctSubTp;
    }

    /**
     * Define el valor de la propiedad cardPdctSubTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPdctSubTp(String value) {
        this.cardPdctSubTp = value;
    }

    /**
     * Obtiene el valor de la propiedad intrnlCard.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrnlCard() {
        return intrnlCard;
    }

    /**
     * Define el valor de la propiedad intrnlCard.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrnlCard(Boolean value) {
        this.intrnlCard = value;
    }

    /**
     * Gets the value of the allwdPdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the allwdPdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAllwdPdct() {
        if (allwdPdct == null) {
            allwdPdct = new ArrayList<String>();
        }
        return this.allwdPdct;
    }

    /**
     * Obtiene el valor de la propiedad svcOptn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcOptn() {
        return svcOptn;
    }

    /**
     * Define el valor de la propiedad svcOptn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcOptn(String value) {
        this.svcOptn = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlCardData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlCardData() {
        return addtlCardData;
    }

    /**
     * Define el valor de la propiedad addtlCardData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlCardData(String value) {
        this.addtlCardData = value;
    }

}
