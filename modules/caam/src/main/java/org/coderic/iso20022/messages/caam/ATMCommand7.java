//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMCommand7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ATMCommand7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMCommand4Code"/&gt;
 *         &lt;element name="Urgcy" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}TMSContactLevel2Code"/&gt;
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="CmdId" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMCommandIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="CmdParams" type="{urn:iso:std:iso:20022:tech:xsd:caam.012.001.01}ATMCommandParameters1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand7", propOrder = {
    "tp",
    "urgcy",
    "dtTm",
    "cmdId",
    "cmdParams"
})
public class ATMCommand7 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand4Code tp;
    @XmlElement(name = "Urgcy", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel2Code urgcy;
    @XmlElement(name = "DtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "CmdParams")
    protected ATMCommandParameters1Choice cmdParams;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand4Code }
     *     
     */
    public ATMCommand4Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand4Code }
     *     
     */
    public void setTp(ATMCommand4Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad urgcy.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public TMSContactLevel2Code getUrgcy() {
        return urgcy;
    }

    /**
     * Define el valor de la propiedad urgcy.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public void setUrgcy(TMSContactLevel2Code value) {
        this.urgcy = value;
    }

    /**
     * Obtiene el valor de la propiedad dtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Define el valor de la propiedad dtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad cmdId.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Define el valor de la propiedad cmdId.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public void setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
    }

    /**
     * Obtiene el valor de la propiedad cmdParams.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandParameters1Choice }
     *     
     */
    public ATMCommandParameters1Choice getCmdParams() {
        return cmdParams;
    }

    /**
     * Define el valor de la propiedad cmdParams.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandParameters1Choice }
     *     
     */
    public void setCmdParams(ATMCommandParameters1Choice value) {
        this.cmdParams = value;
    }

}
