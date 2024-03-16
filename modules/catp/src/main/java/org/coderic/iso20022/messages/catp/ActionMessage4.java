//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActionMessage4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActionMessage4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}OutputFormat2Code" minOccurs="0"/&gt;
 *         &lt;element name="Msg" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max20000Text" minOccurs="0"/&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Dvc" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMDevice1Code" minOccurs="0"/&gt;
 *         &lt;element name="MsgCnttSgntr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Max35Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage4", propOrder = {
    "frmt",
    "msg",
    "ref",
    "dvc",
    "msgCnttSgntr"
})
public class ActionMessage4 {

    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat2Code frmt;
    @XmlElement(name = "Msg")
    protected String msg;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Dvc")
    @XmlSchemaType(name = "string")
    protected ATMDevice1Code dvc;
    @XmlElement(name = "MsgCnttSgntr")
    protected byte[] msgCnttSgntr;

    /**
     * Obtiene el valor de la propiedad frmt.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat2Code }
     *     
     */
    public OutputFormat2Code getFrmt() {
        return frmt;
    }

    /**
     * Define el valor de la propiedad frmt.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat2Code }
     *     
     */
    public void setFrmt(OutputFormat2Code value) {
        this.frmt = value;
    }

    /**
     * Obtiene el valor de la propiedad msg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Define el valor de la propiedad msg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad dvc.
     * 
     * @return
     *     possible object is
     *     {@link ATMDevice1Code }
     *     
     */
    public ATMDevice1Code getDvc() {
        return dvc;
    }

    /**
     * Define el valor de la propiedad dvc.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDevice1Code }
     *     
     */
    public void setDvc(ATMDevice1Code value) {
        this.dvc = value;
    }

    /**
     * Obtiene el valor de la propiedad msgCnttSgntr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Define el valor de la propiedad msgCnttSgntr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgCnttSgntr(byte[] value) {
        this.msgCnttSgntr = value;
    }

}
