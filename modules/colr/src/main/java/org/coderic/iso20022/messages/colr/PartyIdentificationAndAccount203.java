//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:12 PM COT 
//


package org.coderic.iso20022.messages.colr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentificationAndAccount203 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationAndAccount203"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}PartyIdentification120Choice"/&gt;
 *         &lt;element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}LEIIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}AlternatePartyIdentification7" minOccurs="0"/&gt;
 *         &lt;element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}SecuritiesAccount19" minOccurs="0"/&gt;
 *         &lt;element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}BlockChainAddressWallet3" minOccurs="0"/&gt;
 *         &lt;element name="PtyCpcty" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}TradingPartyCapacity5Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount203", propOrder = {
    "id",
    "lei",
    "altrnId",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "ptyCpcty"
})
public class PartyIdentificationAndAccount203 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification120Choice id;
    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification7 altrnId;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "PtyCpcty")
    protected TradingPartyCapacity5Choice ptyCpcty;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public PartyIdentification120Choice getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification120Choice }
     *     
     */
    public void setId(PartyIdentification120Choice value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad lei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Define el valor de la propiedad lei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Obtiene el valor de la propiedad altrnId.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public AlternatePartyIdentification7 getAltrnId() {
        return altrnId;
    }

    /**
     * Define el valor de la propiedad altrnId.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification7 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification7 value) {
        this.altrnId = value;
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
     * Obtiene el valor de la propiedad ptyCpcty.
     * 
     * @return
     *     possible object is
     *     {@link TradingPartyCapacity5Choice }
     *     
     */
    public TradingPartyCapacity5Choice getPtyCpcty() {
        return ptyCpcty;
    }

    /**
     * Define el valor de la propiedad ptyCpcty.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingPartyCapacity5Choice }
     *     
     */
    public void setPtyCpcty(TradingPartyCapacity5Choice value) {
        this.ptyCpcty = value;
    }

}
