//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:33 PM COT 
//


package org.coderic.iso20022.messages.reda;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TripartyCollateralUnilateralRemovalRequestV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TripartyCollateralUnilateralRemovalRequestV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Pagination1"/&gt;
 *         &lt;element name="RmvlReqId" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}Max35Text"/&gt;
 *         &lt;element name="PtyA" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232"/&gt;
 *         &lt;element name="ClntPtyA" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}PartyIdentification232" minOccurs="0"/&gt;
 *         &lt;element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}CollateralRole1Code"/&gt;
 *         &lt;element name="ReqDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}RequestDetails28"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:reda.074.001.01}SupplementaryData1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralUnilateralRemovalRequestV01", propOrder = {
    "pgntn",
    "rmvlReqId",
    "ptyA",
    "clntPtyA",
    "collSd",
    "reqDtls",
    "splmtryData"
})
public class TripartyCollateralUnilateralRemovalRequestV01 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "RmvlReqId", required = true)
    protected String rmvlReqId;
    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification232 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentification232 clntPtyA;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ReqDtls", required = true)
    protected RequestDetails28 reqDtls;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Obtiene el valor de la propiedad pgntn.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Define el valor de la propiedad pgntn.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Obtiene el valor de la propiedad rmvlReqId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmvlReqId() {
        return rmvlReqId;
    }

    /**
     * Define el valor de la propiedad rmvlReqId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmvlReqId(String value) {
        this.rmvlReqId = value;
    }

    /**
     * Obtiene el valor de la propiedad ptyA.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyA() {
        return ptyA;
    }

    /**
     * Define el valor de la propiedad ptyA.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setPtyA(PartyIdentification232 value) {
        this.ptyA = value;
    }

    /**
     * Obtiene el valor de la propiedad clntPtyA.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyA() {
        return clntPtyA;
    }

    /**
     * Define el valor de la propiedad clntPtyA.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setClntPtyA(PartyIdentification232 value) {
        this.clntPtyA = value;
    }

    /**
     * Obtiene el valor de la propiedad collSd.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Define el valor de la propiedad collSd.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Obtiene el valor de la propiedad reqDtls.
     * 
     * @return
     *     possible object is
     *     {@link RequestDetails28 }
     *     
     */
    public RequestDetails28 getReqDtls() {
        return reqDtls;
    }

    /**
     * Define el valor de la propiedad reqDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestDetails28 }
     *     
     */
    public void setReqDtls(RequestDetails28 value) {
        this.reqDtls = value;
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
