//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyIdentificationAndAccount31 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyIdentificationAndAccount31"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentification33Choice"/&gt;
 *         &lt;element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}AlternatePartyIdentification4" minOccurs="0"/&gt;
 *         &lt;element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyTextInformation1" minOccurs="0"/&gt;
 *         &lt;element name="ClrAcct" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}SecuritiesAccount18" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount31", propOrder = {
    "id",
    "altrnId",
    "addtlInf",
    "clrAcct"
})
public class PartyIdentificationAndAccount31 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification33Choice id;
    @XmlElement(name = "AltrnId")
    protected AlternatePartyIdentification4 altrnId;
    @XmlElement(name = "AddtlInf")
    protected PartyTextInformation1 addtlInf;
    @XmlElement(name = "ClrAcct")
    protected SecuritiesAccount18 clrAcct;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public void setId(PartyIdentification33Choice value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad altrnId.
     * 
     * @return
     *     possible object is
     *     {@link AlternatePartyIdentification4 }
     *     
     */
    public AlternatePartyIdentification4 getAltrnId() {
        return altrnId;
    }

    /**
     * Define el valor de la propiedad altrnId.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternatePartyIdentification4 }
     *     
     */
    public void setAltrnId(AlternatePartyIdentification4 value) {
        this.altrnId = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlInf.
     * 
     * @return
     *     possible object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public PartyTextInformation1 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Define el valor de la propiedad addtlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTextInformation1 }
     *     
     */
    public void setAddtlInf(PartyTextInformation1 value) {
        this.addtlInf = value;
    }

    /**
     * Obtiene el valor de la propiedad clrAcct.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public SecuritiesAccount18 getClrAcct() {
        return clrAcct;
    }

    /**
     * Define el valor de la propiedad clrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount18 }
     *     
     */
    public void setClrAcct(SecuritiesAccount18 value) {
        this.clrAcct = value;
    }

}
