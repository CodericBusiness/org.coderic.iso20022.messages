//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionTotals12 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionTotals12"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POIGrpId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CardBrnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CardPdctPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ActiveCurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TypeTransactionTotals2Code"/&gt;
 *         &lt;element name="TtlNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}Number"/&gt;
 *         &lt;element name="CmltvAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ImpliedCurrencyAndAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals12", propOrder = {
    "poiGrpId",
    "cardBrnd",
    "cardPdctPrfl",
    "ccy",
    "tp",
    "ttlNb",
    "cmltvAmt"
})
public class TransactionTotals12 {

    @XmlElement(name = "POIGrpId")
    protected String poiGrpId;
    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeTransactionTotals2Code tp;
    @XmlElement(name = "TtlNb", required = true)
    protected BigDecimal ttlNb;
    @XmlElement(name = "CmltvAmt", required = true)
    protected BigDecimal cmltvAmt;

    /**
     * Obtiene el valor de la propiedad poiGrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIGrpId() {
        return poiGrpId;
    }

    /**
     * Define el valor de la propiedad poiGrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIGrpId(String value) {
        this.poiGrpId = value;
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
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionTotals2Code }
     *     
     */
    public TypeTransactionTotals2Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionTotals2Code }
     *     
     */
    public void setTp(TypeTransactionTotals2Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad ttlNb.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNb() {
        return ttlNb;
    }

    /**
     * Define el valor de la propiedad ttlNb.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNb(BigDecimal value) {
        this.ttlNb = value;
    }

    /**
     * Obtiene el valor de la propiedad cmltvAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvAmt() {
        return cmltvAmt;
    }

    /**
     * Define el valor de la propiedad cmltvAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCmltvAmt(BigDecimal value) {
        this.cmltvAmt = value;
    }

}
