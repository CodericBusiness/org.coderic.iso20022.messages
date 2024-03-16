//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderInstructionData2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderInstructionData2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuySellInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Side6Code" minOccurs="0"/&gt;
 *         &lt;element name="OrdrVldtySts" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderStatus10Code" minOccurs="0"/&gt;
 *         &lt;element name="OrdrSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderStatus11Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InitlQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *         &lt;element name="RmngQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *         &lt;element name="DispdQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *         &lt;element name="MinAccptblQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *         &lt;element name="MinExctbl" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}MinimumExecutable1" minOccurs="0"/&gt;
 *         &lt;element name="PssvOnlyInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="SlfExctnPrvntn" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="RtgStrtgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max50Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderInstructionData2", propOrder = {
    "buySellInd",
    "ordrVldtySts",
    "ordrSts",
    "initlQty",
    "rmngQty",
    "dispdQty",
    "minAccptblQty",
    "minExctbl",
    "pssvOnlyInd",
    "slfExctnPrvntn",
    "rtgStrtgy"
})
public class OrderInstructionData2 {

    @XmlElement(name = "BuySellInd")
    @XmlSchemaType(name = "string")
    protected Side6Code buySellInd;
    @XmlElement(name = "OrdrVldtySts")
    @XmlSchemaType(name = "string")
    protected OrderStatus10Code ordrVldtySts;
    @XmlElement(name = "OrdrSts")
    @XmlSchemaType(name = "string")
    protected List<OrderStatus11Code> ordrSts;
    @XmlElement(name = "InitlQty")
    protected FinancialInstrumentQuantity25Choice initlQty;
    @XmlElement(name = "RmngQty")
    protected FinancialInstrumentQuantity25Choice rmngQty;
    @XmlElement(name = "DispdQty")
    protected FinancialInstrumentQuantity25Choice dispdQty;
    @XmlElement(name = "MinAccptblQty")
    protected FinancialInstrumentQuantity25Choice minAccptblQty;
    @XmlElement(name = "MinExctbl")
    protected MinimumExecutable1 minExctbl;
    @XmlElement(name = "PssvOnlyInd")
    protected Boolean pssvOnlyInd;
    @XmlElement(name = "SlfExctnPrvntn")
    protected Boolean slfExctnPrvntn;
    @XmlElement(name = "RtgStrtgy")
    protected String rtgStrtgy;

    /**
     * Obtiene el valor de la propiedad buySellInd.
     * 
     * @return
     *     possible object is
     *     {@link Side6Code }
     *     
     */
    public Side6Code getBuySellInd() {
        return buySellInd;
    }

    /**
     * Define el valor de la propiedad buySellInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Side6Code }
     *     
     */
    public void setBuySellInd(Side6Code value) {
        this.buySellInd = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrVldtySts.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus10Code }
     *     
     */
    public OrderStatus10Code getOrdrVldtySts() {
        return ordrVldtySts;
    }

    /**
     * Define el valor de la propiedad ordrVldtySts.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus10Code }
     *     
     */
    public void setOrdrVldtySts(OrderStatus10Code value) {
        this.ordrVldtySts = value;
    }

    /**
     * Gets the value of the ordrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ordrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderStatus11Code }
     * 
     * 
     */
    public List<OrderStatus11Code> getOrdrSts() {
        if (ordrSts == null) {
            ordrSts = new ArrayList<OrderStatus11Code>();
        }
        return this.ordrSts;
    }

    /**
     * Obtiene el valor de la propiedad initlQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getInitlQty() {
        return initlQty;
    }

    /**
     * Define el valor de la propiedad initlQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setInitlQty(FinancialInstrumentQuantity25Choice value) {
        this.initlQty = value;
    }

    /**
     * Obtiene el valor de la propiedad rmngQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getRmngQty() {
        return rmngQty;
    }

    /**
     * Define el valor de la propiedad rmngQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setRmngQty(FinancialInstrumentQuantity25Choice value) {
        this.rmngQty = value;
    }

    /**
     * Obtiene el valor de la propiedad dispdQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getDispdQty() {
        return dispdQty;
    }

    /**
     * Define el valor de la propiedad dispdQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setDispdQty(FinancialInstrumentQuantity25Choice value) {
        this.dispdQty = value;
    }

    /**
     * Obtiene el valor de la propiedad minAccptblQty.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getMinAccptblQty() {
        return minAccptblQty;
    }

    /**
     * Define el valor de la propiedad minAccptblQty.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setMinAccptblQty(FinancialInstrumentQuantity25Choice value) {
        this.minAccptblQty = value;
    }

    /**
     * Obtiene el valor de la propiedad minExctbl.
     * 
     * @return
     *     possible object is
     *     {@link MinimumExecutable1 }
     *     
     */
    public MinimumExecutable1 getMinExctbl() {
        return minExctbl;
    }

    /**
     * Define el valor de la propiedad minExctbl.
     * 
     * @param value
     *     allowed object is
     *     {@link MinimumExecutable1 }
     *     
     */
    public void setMinExctbl(MinimumExecutable1 value) {
        this.minExctbl = value;
    }

    /**
     * Obtiene el valor de la propiedad pssvOnlyInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssvOnlyInd() {
        return pssvOnlyInd;
    }

    /**
     * Define el valor de la propiedad pssvOnlyInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPssvOnlyInd(Boolean value) {
        this.pssvOnlyInd = value;
    }

    /**
     * Obtiene el valor de la propiedad slfExctnPrvntn.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSlfExctnPrvntn() {
        return slfExctnPrvntn;
    }

    /**
     * Define el valor de la propiedad slfExctnPrvntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSlfExctnPrvntn(Boolean value) {
        this.slfExctnPrvntn = value;
    }

    /**
     * Obtiene el valor de la propiedad rtgStrtgy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgStrtgy() {
        return rtgStrtgy;
    }

    /**
     * Define el valor de la propiedad rtgStrtgy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtgStrtgy(String value) {
        this.rtgStrtgy = value;
    }

}
