//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuctionData2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuctionData2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradgPhs" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max50Text" minOccurs="0"/&gt;
 *         &lt;element name="IndctvAuctnPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice21Choice" minOccurs="0"/&gt;
 *         &lt;element name="IndctvAuctnVol" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}FinancialInstrumentQuantity25Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuctionData2", propOrder = {
    "tradgPhs",
    "indctvAuctnPric",
    "indctvAuctnVol"
})
public class AuctionData2 {

    @XmlElement(name = "TradgPhs")
    protected String tradgPhs;
    @XmlElement(name = "IndctvAuctnPric")
    protected SecuritiesTransactionPrice21Choice indctvAuctnPric;
    @XmlElement(name = "IndctvAuctnVol")
    protected FinancialInstrumentQuantity25Choice indctvAuctnVol;

    /**
     * Obtiene el valor de la propiedad tradgPhs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgPhs() {
        return tradgPhs;
    }

    /**
     * Define el valor de la propiedad tradgPhs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgPhs(String value) {
        this.tradgPhs = value;
    }

    /**
     * Obtiene el valor de la propiedad indctvAuctnPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice21Choice }
     *     
     */
    public SecuritiesTransactionPrice21Choice getIndctvAuctnPric() {
        return indctvAuctnPric;
    }

    /**
     * Define el valor de la propiedad indctvAuctnPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice21Choice }
     *     
     */
    public void setIndctvAuctnPric(SecuritiesTransactionPrice21Choice value) {
        this.indctvAuctnPric = value;
    }

    /**
     * Obtiene el valor de la propiedad indctvAuctnVol.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public FinancialInstrumentQuantity25Choice getIndctvAuctnVol() {
        return indctvAuctnVol;
    }

    /**
     * Define el valor de la propiedad indctvAuctnVol.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity25Choice }
     *     
     */
    public void setIndctvAuctnVol(FinancialInstrumentQuantity25Choice value) {
        this.indctvAuctnVol = value;
    }

}
