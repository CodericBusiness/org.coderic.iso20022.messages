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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardPaymentEnvironment80 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardPaymentEnvironment80"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Acqrr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Acquirer10" minOccurs="0"/&gt;
 *         &lt;element name="SvcPrvdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Acquirer10" minOccurs="0"/&gt;
 *         &lt;element name="Mrchnt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Organisation41" minOccurs="0"/&gt;
 *         &lt;element name="POI" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PointOfInteraction14" minOccurs="0"/&gt;
 *         &lt;element name="Card" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}PaymentCard35" minOccurs="0"/&gt;
 *         &lt;element name="Chck" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Check1" minOccurs="0"/&gt;
 *         &lt;element name="StordValAcct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}StoredValueAccount2" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LltyAcct" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}LoyaltyAccount3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CstmrDvc" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CustomerDevice3" minOccurs="0"/&gt;
 *         &lt;element name="Wllt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CustomerDevice3" minOccurs="0"/&gt;
 *         &lt;element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Token1" minOccurs="0"/&gt;
 *         &lt;element name="MrchntTkn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}MerchantToken2" minOccurs="0"/&gt;
 *         &lt;element name="Crdhldr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Cardholder21" minOccurs="0"/&gt;
 *         &lt;element name="PrtctdCrdhldrData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ContentInformationType40" minOccurs="0"/&gt;
 *         &lt;element name="SaleEnvt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}RetailerSaleEnvironment2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentEnvironment80", propOrder = {
    "acqrr",
    "svcPrvdr",
    "mrchnt",
    "poi",
    "card",
    "chck",
    "stordValAcct",
    "lltyAcct",
    "cstmrDvc",
    "wllt",
    "pmtTkn",
    "mrchntTkn",
    "crdhldr",
    "prtctdCrdhldrData",
    "saleEnvt"
})
public class CardPaymentEnvironment80 {

    @XmlElement(name = "Acqrr")
    protected Acquirer10 acqrr;
    @XmlElement(name = "SvcPrvdr")
    protected Acquirer10 svcPrvdr;
    @XmlElement(name = "Mrchnt")
    protected Organisation41 mrchnt;
    @XmlElement(name = "POI")
    protected PointOfInteraction14 poi;
    @XmlElement(name = "Card")
    protected PaymentCard35 card;
    @XmlElement(name = "Chck")
    protected Check1 chck;
    @XmlElement(name = "StordValAcct")
    protected List<StoredValueAccount2> stordValAcct;
    @XmlElement(name = "LltyAcct")
    protected List<LoyaltyAccount3> lltyAcct;
    @XmlElement(name = "CstmrDvc")
    protected CustomerDevice3 cstmrDvc;
    @XmlElement(name = "Wllt")
    protected CustomerDevice3 wllt;
    @XmlElement(name = "PmtTkn")
    protected Token1 pmtTkn;
    @XmlElement(name = "MrchntTkn")
    protected MerchantToken2 mrchntTkn;
    @XmlElement(name = "Crdhldr")
    protected Cardholder21 crdhldr;
    @XmlElement(name = "PrtctdCrdhldrData")
    protected ContentInformationType40 prtctdCrdhldrData;
    @XmlElement(name = "SaleEnvt")
    protected RetailerSaleEnvironment2 saleEnvt;

    /**
     * Obtiene el valor de la propiedad acqrr.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getAcqrr() {
        return acqrr;
    }

    /**
     * Define el valor de la propiedad acqrr.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setAcqrr(Acquirer10 value) {
        this.acqrr = value;
    }

    /**
     * Obtiene el valor de la propiedad svcPrvdr.
     * 
     * @return
     *     possible object is
     *     {@link Acquirer10 }
     *     
     */
    public Acquirer10 getSvcPrvdr() {
        return svcPrvdr;
    }

    /**
     * Define el valor de la propiedad svcPrvdr.
     * 
     * @param value
     *     allowed object is
     *     {@link Acquirer10 }
     *     
     */
    public void setSvcPrvdr(Acquirer10 value) {
        this.svcPrvdr = value;
    }

    /**
     * Obtiene el valor de la propiedad mrchnt.
     * 
     * @return
     *     possible object is
     *     {@link Organisation41 }
     *     
     */
    public Organisation41 getMrchnt() {
        return mrchnt;
    }

    /**
     * Define el valor de la propiedad mrchnt.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation41 }
     *     
     */
    public void setMrchnt(Organisation41 value) {
        this.mrchnt = value;
    }

    /**
     * Obtiene el valor de la propiedad poi.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteraction14 }
     *     
     */
    public PointOfInteraction14 getPOI() {
        return poi;
    }

    /**
     * Define el valor de la propiedad poi.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteraction14 }
     *     
     */
    public void setPOI(PointOfInteraction14 value) {
        this.poi = value;
    }

    /**
     * Obtiene el valor de la propiedad card.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard35 }
     *     
     */
    public PaymentCard35 getCard() {
        return card;
    }

    /**
     * Define el valor de la propiedad card.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard35 }
     *     
     */
    public void setCard(PaymentCard35 value) {
        this.card = value;
    }

    /**
     * Obtiene el valor de la propiedad chck.
     * 
     * @return
     *     possible object is
     *     {@link Check1 }
     *     
     */
    public Check1 getChck() {
        return chck;
    }

    /**
     * Define el valor de la propiedad chck.
     * 
     * @param value
     *     allowed object is
     *     {@link Check1 }
     *     
     */
    public void setChck(Check1 value) {
        this.chck = value;
    }

    /**
     * Gets the value of the stordValAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stordValAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStordValAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueAccount2 }
     * 
     * 
     */
    public List<StoredValueAccount2> getStordValAcct() {
        if (stordValAcct == null) {
            stordValAcct = new ArrayList<StoredValueAccount2>();
        }
        return this.stordValAcct;
    }

    /**
     * Gets the value of the lltyAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lltyAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLltyAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyAccount3 }
     * 
     * 
     */
    public List<LoyaltyAccount3> getLltyAcct() {
        if (lltyAcct == null) {
            lltyAcct = new ArrayList<LoyaltyAccount3>();
        }
        return this.lltyAcct;
    }

    /**
     * Obtiene el valor de la propiedad cstmrDvc.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getCstmrDvc() {
        return cstmrDvc;
    }

    /**
     * Define el valor de la propiedad cstmrDvc.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public void setCstmrDvc(CustomerDevice3 value) {
        this.cstmrDvc = value;
    }

    /**
     * Obtiene el valor de la propiedad wllt.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDevice3 }
     *     
     */
    public CustomerDevice3 getWllt() {
        return wllt;
    }

    /**
     * Define el valor de la propiedad wllt.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDevice3 }
     *     
     */
    public void setWllt(CustomerDevice3 value) {
        this.wllt = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtTkn.
     * 
     * @return
     *     possible object is
     *     {@link Token1 }
     *     
     */
    public Token1 getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Define el valor de la propiedad pmtTkn.
     * 
     * @param value
     *     allowed object is
     *     {@link Token1 }
     *     
     */
    public void setPmtTkn(Token1 value) {
        this.pmtTkn = value;
    }

    /**
     * Obtiene el valor de la propiedad mrchntTkn.
     * 
     * @return
     *     possible object is
     *     {@link MerchantToken2 }
     *     
     */
    public MerchantToken2 getMrchntTkn() {
        return mrchntTkn;
    }

    /**
     * Define el valor de la propiedad mrchntTkn.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchantToken2 }
     *     
     */
    public void setMrchntTkn(MerchantToken2 value) {
        this.mrchntTkn = value;
    }

    /**
     * Obtiene el valor de la propiedad crdhldr.
     * 
     * @return
     *     possible object is
     *     {@link Cardholder21 }
     *     
     */
    public Cardholder21 getCrdhldr() {
        return crdhldr;
    }

    /**
     * Define el valor de la propiedad crdhldr.
     * 
     * @param value
     *     allowed object is
     *     {@link Cardholder21 }
     *     
     */
    public void setCrdhldr(Cardholder21 value) {
        this.crdhldr = value;
    }

    /**
     * Obtiene el valor de la propiedad prtctdCrdhldrData.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType40 }
     *     
     */
    public ContentInformationType40 getPrtctdCrdhldrData() {
        return prtctdCrdhldrData;
    }

    /**
     * Define el valor de la propiedad prtctdCrdhldrData.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType40 }
     *     
     */
    public void setPrtctdCrdhldrData(ContentInformationType40 value) {
        this.prtctdCrdhldrData = value;
    }

    /**
     * Obtiene el valor de la propiedad saleEnvt.
     * 
     * @return
     *     possible object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public RetailerSaleEnvironment2 getSaleEnvt() {
        return saleEnvt;
    }

    /**
     * Define el valor de la propiedad saleEnvt.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerSaleEnvironment2 }
     *     
     */
    public void setSaleEnvt(RetailerSaleEnvironment2 value) {
        this.saleEnvt = value;
    }

}
