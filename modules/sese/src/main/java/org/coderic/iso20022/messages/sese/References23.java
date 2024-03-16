//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:51 PM COT 
//


package org.coderic.iso20022.messages.sese;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para References23 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="References23"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PrcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CmonId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}Max52Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References23", propOrder = {
    "acctOwnrTxId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "prcrTxId",
    "poolId",
    "cmonId",
    "tradId"
})
public class References23 {

    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "PoolId")
    protected String poolId;
    @XmlElement(name = "CmonId")
    protected String cmonId;
    @XmlElement(name = "TradId")
    protected String tradId;

    /**
     * Obtiene el valor de la propiedad acctOwnrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Define el valor de la propiedad acctOwnrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad acctSvcrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Define el valor de la propiedad acctSvcrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad mktInfrstrctrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Define el valor de la propiedad mktInfrstrctrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad prcrTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Define el valor de la propiedad prcrTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcrTxId(String value) {
        this.prcrTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad poolId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Define el valor de la propiedad poolId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

    /**
     * Obtiene el valor de la propiedad cmonId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonId() {
        return cmonId;
    }

    /**
     * Define el valor de la propiedad cmonId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonId(String value) {
        this.cmonId = value;
    }

    /**
     * Obtiene el valor de la propiedad tradId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Define el valor de la propiedad tradId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradId(String value) {
        this.tradId = value;
    }

}
