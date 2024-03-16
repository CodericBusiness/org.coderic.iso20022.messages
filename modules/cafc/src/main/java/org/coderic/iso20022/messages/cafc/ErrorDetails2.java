//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ErrorDetails2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ErrorDetails2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MsgErrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}MessageError1Code"/&gt;
 *         &lt;element name="OthrMsgErrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ErrCd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ErrDesc" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max500Text" minOccurs="0"/&gt;
 *         &lt;element name="DataElmtInErr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max4000Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetails2", propOrder = {
    "msgErrTp",
    "othrMsgErrTp",
    "errCd",
    "errDesc",
    "dataElmtInErr"
})
public class ErrorDetails2 {

    @XmlElement(name = "MsgErrTp", required = true)
    @XmlSchemaType(name = "string")
    protected MessageError1Code msgErrTp;
    @XmlElement(name = "OthrMsgErrTp")
    protected String othrMsgErrTp;
    @XmlElement(name = "ErrCd")
    protected String errCd;
    @XmlElement(name = "ErrDesc")
    protected String errDesc;
    @XmlElement(name = "DataElmtInErr")
    protected List<String> dataElmtInErr;

    /**
     * Obtiene el valor de la propiedad msgErrTp.
     * 
     * @return
     *     possible object is
     *     {@link MessageError1Code }
     *     
     */
    public MessageError1Code getMsgErrTp() {
        return msgErrTp;
    }

    /**
     * Define el valor de la propiedad msgErrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageError1Code }
     *     
     */
    public void setMsgErrTp(MessageError1Code value) {
        this.msgErrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrMsgErrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMsgErrTp() {
        return othrMsgErrTp;
    }

    /**
     * Define el valor de la propiedad othrMsgErrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrMsgErrTp(String value) {
        this.othrMsgErrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad errCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * Define el valor de la propiedad errCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCd(String value) {
        this.errCd = value;
    }

    /**
     * Obtiene el valor de la propiedad errDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * Define el valor de la propiedad errDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDesc(String value) {
        this.errDesc = value;
    }

    /**
     * Gets the value of the dataElmtInErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataElmtInErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElmtInErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataElmtInErr() {
        if (dataElmtInErr == null) {
            dataElmtInErr = new ArrayList<String>();
        }
        return this.dataElmtInErr;
    }

}
