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
 * <p>Clase Java para ReceivingPartiesAndAccount7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReceivingPartiesAndAccount7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentification34Choice"/&gt;
 *         &lt;element name="Pty1" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentificationAndAccount32"/&gt;
 *         &lt;element name="Pty2" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}PartyIdentificationAndAccount32" minOccurs="0"/&gt;
 *         &lt;element name="SctiesSttlmSys" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivingPartiesAndAccount7", propOrder = {
    "dpstry",
    "pty1",
    "pty2",
    "sctiesSttlmSys"
})
public class ReceivingPartiesAndAccount7 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "Pty1", required = true)
    protected PartyIdentificationAndAccount32 pty1;
    @XmlElement(name = "Pty2")
    protected PartyIdentificationAndAccount32 pty2;
    @XmlElement(name = "SctiesSttlmSys")
    protected String sctiesSttlmSys;

    /**
     * Obtiene el valor de la propiedad dpstry.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Define el valor de la propiedad dpstry.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public void setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
    }

    /**
     * Obtiene el valor de la propiedad pty1.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount32 }
     *     
     */
    public PartyIdentificationAndAccount32 getPty1() {
        return pty1;
    }

    /**
     * Define el valor de la propiedad pty1.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount32 }
     *     
     */
    public void setPty1(PartyIdentificationAndAccount32 value) {
        this.pty1 = value;
    }

    /**
     * Obtiene el valor de la propiedad pty2.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount32 }
     *     
     */
    public PartyIdentificationAndAccount32 getPty2() {
        return pty2;
    }

    /**
     * Define el valor de la propiedad pty2.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount32 }
     *     
     */
    public void setPty2(PartyIdentificationAndAccount32 value) {
        this.pty2 = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesSttlmSys.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesSttlmSys() {
        return sctiesSttlmSys;
    }

    /**
     * Define el valor de la propiedad sctiesSttlmSys.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesSttlmSys(String value) {
        this.sctiesSttlmSys = value;
    }

}
