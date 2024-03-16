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
 * <p>Clase Java para OrderData3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderData3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdrIdData" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderIdentification2"/&gt;
 *         &lt;element name="AuctnData" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}AuctionData2" minOccurs="0"/&gt;
 *         &lt;element name="OrdrData" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderData4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderData3", propOrder = {
    "ordrIdData",
    "auctnData",
    "ordrData"
})
public class OrderData3 {

    @XmlElement(name = "OrdrIdData", required = true)
    protected OrderIdentification2 ordrIdData;
    @XmlElement(name = "AuctnData")
    protected AuctionData2 auctnData;
    @XmlElement(name = "OrdrData")
    protected OrderData4 ordrData;

    /**
     * Obtiene el valor de la propiedad ordrIdData.
     * 
     * @return
     *     possible object is
     *     {@link OrderIdentification2 }
     *     
     */
    public OrderIdentification2 getOrdrIdData() {
        return ordrIdData;
    }

    /**
     * Define el valor de la propiedad ordrIdData.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIdentification2 }
     *     
     */
    public void setOrdrIdData(OrderIdentification2 value) {
        this.ordrIdData = value;
    }

    /**
     * Obtiene el valor de la propiedad auctnData.
     * 
     * @return
     *     possible object is
     *     {@link AuctionData2 }
     *     
     */
    public AuctionData2 getAuctnData() {
        return auctnData;
    }

    /**
     * Define el valor de la propiedad auctnData.
     * 
     * @param value
     *     allowed object is
     *     {@link AuctionData2 }
     *     
     */
    public void setAuctnData(AuctionData2 value) {
        this.auctnData = value;
    }

    /**
     * Obtiene el valor de la propiedad ordrData.
     * 
     * @return
     *     possible object is
     *     {@link OrderData4 }
     *     
     */
    public OrderData4 getOrdrData() {
        return ordrData;
    }

    /**
     * Define el valor de la propiedad ordrData.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderData4 }
     *     
     */
    public void setOrdrData(OrderData4 value) {
        this.ordrData = value;
    }

}
