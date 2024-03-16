//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BatchManagementInformation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BatchManagementInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ColltnId" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="BtchId" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text"/&gt;
 *         &lt;element name="MsgSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="MsgChcksmInptVal" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max140Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchManagementInformation1", propOrder = {
    "colltnId",
    "btchId",
    "msgSeqNb",
    "msgChcksmInptVal"
})
public class BatchManagementInformation1 {

    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId", required = true)
    protected String btchId;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "MsgChcksmInptVal")
    protected byte[] msgChcksmInptVal;

    /**
     * Obtiene el valor de la propiedad colltnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColltnId() {
        return colltnId;
    }

    /**
     * Define el valor de la propiedad colltnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColltnId(String value) {
        this.colltnId = value;
    }

    /**
     * Obtiene el valor de la propiedad btchId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Define el valor de la propiedad btchId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtchId(String value) {
        this.btchId = value;
    }

    /**
     * Obtiene el valor de la propiedad msgSeqNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Define el valor de la propiedad msgSeqNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSeqNb(String value) {
        this.msgSeqNb = value;
    }

    /**
     * Obtiene el valor de la propiedad msgChcksmInptVal.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgChcksmInptVal() {
        return msgChcksmInptVal;
    }

    /**
     * Define el valor de la propiedad msgChcksmInptVal.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgChcksmInptVal(byte[] value) {
        this.msgChcksmInptVal = value;
    }

}
