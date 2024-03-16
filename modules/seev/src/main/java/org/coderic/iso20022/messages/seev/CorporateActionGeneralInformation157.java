//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorporateActionGeneralInformation157 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionGeneralInformation157"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}Max35Text"/&gt;
 *         &lt;element name="OffclCorpActnEvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CorporateActionEventType85Choice"/&gt;
 *         &lt;element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}SecurityIdentification19" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionGeneralInformation157", propOrder = {
    "corpActnEvtId",
    "offclCorpActnEvtId",
    "evtTp",
    "finInstrmId"
})
public class CorporateActionGeneralInformation157 {

    @XmlElement(name = "CorpActnEvtId", required = true)
    protected String corpActnEvtId;
    @XmlElement(name = "OffclCorpActnEvtId")
    protected String offclCorpActnEvtId;
    @XmlElement(name = "EvtTp", required = true)
    protected CorporateActionEventType85Choice evtTp;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;

    /**
     * Obtiene el valor de la propiedad corpActnEvtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpActnEvtId() {
        return corpActnEvtId;
    }

    /**
     * Define el valor de la propiedad corpActnEvtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpActnEvtId(String value) {
        this.corpActnEvtId = value;
    }

    /**
     * Obtiene el valor de la propiedad offclCorpActnEvtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffclCorpActnEvtId() {
        return offclCorpActnEvtId;
    }

    /**
     * Define el valor de la propiedad offclCorpActnEvtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffclCorpActnEvtId(String value) {
        this.offclCorpActnEvtId = value;
    }

    /**
     * Obtiene el valor de la propiedad evtTp.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType85Choice }
     *     
     */
    public CorporateActionEventType85Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Define el valor de la propiedad evtTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType85Choice }
     *     
     */
    public void setEvtTp(CorporateActionEventType85Choice value) {
        this.evtTp = value;
    }

    /**
     * Obtiene el valor de la propiedad finInstrmId.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Define el valor de la propiedad finInstrmId.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

}
