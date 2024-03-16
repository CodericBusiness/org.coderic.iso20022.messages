//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:33 PM COT 
//


package org.coderic.iso20022.messages.reda;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestDetails28 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestDetails28"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rmvl" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}RemovalTypeAndReason1"/&gt;
 *         &lt;element name="FinInstrmAndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}RemovalProcessing2Choice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}CollateralParties4" minOccurs="0"/&gt;
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}SecuritiesAccount19" minOccurs="0"/&gt;
 *         &lt;element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}BlockChainAddressWallet3" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Reference21" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails28", propOrder = {
    "rmvl",
    "finInstrmAndAttrbts",
    "ctrPty",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "ref"
})
public class RequestDetails28 {

    @XmlElement(name = "Rmvl", required = true)
    protected RemovalTypeAndReason1 rmvl;
    @XmlElement(name = "FinInstrmAndAttrbts")
    protected List<RemovalProcessing2Choice> finInstrmAndAttrbts;
    @XmlElement(name = "CtrPty")
    protected CollateralParties4 ctrPty;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "Ref")
    protected Reference21 ref;

    /**
     * Obtiene el valor de la propiedad rmvl.
     * 
     * @return
     *     possible object is
     *     {@link RemovalTypeAndReason1 }
     *     
     */
    public RemovalTypeAndReason1 getRmvl() {
        return rmvl;
    }

    /**
     * Define el valor de la propiedad rmvl.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovalTypeAndReason1 }
     *     
     */
    public void setRmvl(RemovalTypeAndReason1 value) {
        this.rmvl = value;
    }

    /**
     * Gets the value of the finInstrmAndAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmAndAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAndAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemovalProcessing2Choice }
     * 
     * 
     */
    public List<RemovalProcessing2Choice> getFinInstrmAndAttrbts() {
        if (finInstrmAndAttrbts == null) {
            finInstrmAndAttrbts = new ArrayList<RemovalProcessing2Choice>();
        }
        return this.finInstrmAndAttrbts;
    }

    /**
     * Obtiene el valor de la propiedad ctrPty.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties4 }
     *     
     */
    public CollateralParties4 getCtrPty() {
        return ctrPty;
    }

    /**
     * Define el valor de la propiedad ctrPty.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties4 }
     *     
     */
    public void setCtrPty(CollateralParties4 value) {
        this.ctrPty = value;
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
     * Obtiene el valor de la propiedad blckChainAdrOrWllt.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Define el valor de la propiedad blckChainAdrOrWllt.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link Reference21 }
     *     
     */
    public Reference21 getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference21 }
     *     
     */
    public void setRef(Reference21 value) {
        this.ref = value;
    }

}
