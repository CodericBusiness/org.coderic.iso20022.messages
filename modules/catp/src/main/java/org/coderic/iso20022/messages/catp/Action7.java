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
 * <p>Clase Java para Action7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Action7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ActionType6Code"/&gt;
 *         &lt;element name="MsgToPres" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ActionMessage4" minOccurs="0"/&gt;
 *         &lt;element name="ReqToPrfrm" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}MessageFunction11Code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action7", propOrder = {
    "actnTp",
    "msgToPres",
    "reqToPrfrm"
})
public class Action7 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType6Code actnTp;
    @XmlElement(name = "MsgToPres")
    protected ActionMessage4 msgToPres;
    @XmlElement(name = "ReqToPrfrm")
    @XmlSchemaType(name = "string")
    protected MessageFunction11Code reqToPrfrm;

    /**
     * Obtiene el valor de la propiedad actnTp.
     * 
     * @return
     *     possible object is
     *     {@link ActionType6Code }
     *     
     */
    public ActionType6Code getActnTp() {
        return actnTp;
    }

    /**
     * Define el valor de la propiedad actnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType6Code }
     *     
     */
    public void setActnTp(ActionType6Code value) {
        this.actnTp = value;
    }

    /**
     * Obtiene el valor de la propiedad msgToPres.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage4 }
     *     
     */
    public ActionMessage4 getMsgToPres() {
        return msgToPres;
    }

    /**
     * Define el valor de la propiedad msgToPres.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage4 }
     *     
     */
    public void setMsgToPres(ActionMessage4 value) {
        this.msgToPres = value;
    }

    /**
     * Obtiene el valor de la propiedad reqToPrfrm.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction11Code }
     *     
     */
    public MessageFunction11Code getReqToPrfrm() {
        return reqToPrfrm;
    }

    /**
     * Define el valor de la propiedad reqToPrfrm.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction11Code }
     *     
     */
    public void setReqToPrfrm(MessageFunction11Code value) {
        this.reqToPrfrm = value;
    }

}
