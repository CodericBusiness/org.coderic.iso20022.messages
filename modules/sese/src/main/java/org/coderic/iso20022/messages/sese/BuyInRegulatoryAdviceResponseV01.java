//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:51 PM COT 
//


package org.coderic.iso20022.messages.sese;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BuyInRegulatoryAdviceResponseV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BuyInRegulatoryAdviceResponseV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvcRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Identification14"/&gt;
 *         &lt;element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}PartyIdentification144" minOccurs="0"/&gt;
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}SecuritiesAccount19" minOccurs="0"/&gt;
 *         &lt;element name="BuyInAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}BuyInAdviceDetails1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}ProcessingStatus79Choice"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInRegulatoryAdviceResponseV01", propOrder = {
    "advcRef",
    "acctOwnr",
    "sfkpgAcct",
    "buyInAttrbts",
    "prcgSts",
    "splmtryData"
})
public class BuyInRegulatoryAdviceResponseV01 {

    @XmlElement(name = "AdvcRef", required = true)
    protected Identification14 advcRef;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification144 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BuyInAttrbts")
    protected List<BuyInAdviceDetails1> buyInAttrbts;
    @XmlElement(name = "PrcgSts", required = true)
    protected ProcessingStatus79Choice prcgSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad advcRef.
     * 
     * @return
     *     possible object is
     *     {@link Identification14 }
     *     
     */
    public Identification14 getAdvcRef() {
        return advcRef;
    }

    /**
     * Define el valor de la propiedad advcRef.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification14 }
     *     
     */
    public void setAdvcRef(Identification14 value) {
        this.advcRef = value;
    }

    /**
     * Obtiene el valor de la propiedad acctOwnr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification144 }
     *     
     */
    public PartyIdentification144 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Define el valor de la propiedad acctOwnr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification144 }
     *     
     */
    public void setAcctOwnr(PartyIdentification144 value) {
        this.acctOwnr = value;
    }

    /**
     * Obtiene el valor de la propiedad sfkpgAcct.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Define el valor de la propiedad sfkpgAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the buyInAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the buyInAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyInAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyInAdviceDetails1 }
     * 
     * 
     */
    public List<BuyInAdviceDetails1> getBuyInAttrbts() {
        if (buyInAttrbts == null) {
            buyInAttrbts = new ArrayList<BuyInAdviceDetails1>();
        }
        return this.buyInAttrbts;
    }

    /**
     * Obtiene el valor de la propiedad prcgSts.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus79Choice }
     *     
     */
    public ProcessingStatus79Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Define el valor de la propiedad prcgSts.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus79Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus79Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
