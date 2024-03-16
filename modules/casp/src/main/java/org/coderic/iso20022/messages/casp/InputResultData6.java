//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InputResultData6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InputResultData6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InptCmd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}InputCommand1Code"/&gt;
 *         &lt;element name="ConfdFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="FctnKey" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Number" minOccurs="0"/&gt;
 *         &lt;element name="InptMsg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max20000Text" minOccurs="0"/&gt;
 *         &lt;element name="Pwd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}ContentInformationType39" minOccurs="0"/&gt;
 *         &lt;element name="ImgCaptrdSgntr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}CapturedSignature1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResultData6", propOrder = {
    "inptCmd",
    "confdFlg",
    "fctnKey",
    "inptMsg",
    "pwd",
    "imgCaptrdSgntr"
})
public class InputResultData6 {

    @XmlElement(name = "InptCmd", required = true)
    @XmlSchemaType(name = "string")
    protected InputCommand1Code inptCmd;
    @XmlElement(name = "ConfdFlg")
    protected Boolean confdFlg;
    @XmlElement(name = "FctnKey")
    protected BigDecimal fctnKey;
    @XmlElement(name = "InptMsg")
    protected String inptMsg;
    @XmlElement(name = "Pwd")
    protected ContentInformationType39 pwd;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;

    /**
     * Obtiene el valor de la propiedad inptCmd.
     * 
     * @return
     *     possible object is
     *     {@link InputCommand1Code }
     *     
     */
    public InputCommand1Code getInptCmd() {
        return inptCmd;
    }

    /**
     * Define el valor de la propiedad inptCmd.
     * 
     * @param value
     *     allowed object is
     *     {@link InputCommand1Code }
     *     
     */
    public void setInptCmd(InputCommand1Code value) {
        this.inptCmd = value;
    }

    /**
     * Obtiene el valor de la propiedad confdFlg.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfdFlg() {
        return confdFlg;
    }

    /**
     * Define el valor de la propiedad confdFlg.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfdFlg(Boolean value) {
        this.confdFlg = value;
    }

    /**
     * Obtiene el valor de la propiedad fctnKey.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctnKey() {
        return fctnKey;
    }

    /**
     * Define el valor de la propiedad fctnKey.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFctnKey(BigDecimal value) {
        this.fctnKey = value;
    }

    /**
     * Obtiene el valor de la propiedad inptMsg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptMsg() {
        return inptMsg;
    }

    /**
     * Define el valor de la propiedad inptMsg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInptMsg(String value) {
        this.inptMsg = value;
    }

    /**
     * Obtiene el valor de la propiedad pwd.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType39 }
     *     
     */
    public ContentInformationType39 getPwd() {
        return pwd;
    }

    /**
     * Define el valor de la propiedad pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType39 }
     *     
     */
    public void setPwd(ContentInformationType39 value) {
        this.pwd = value;
    }

    /**
     * Obtiene el valor de la propiedad imgCaptrdSgntr.
     * 
     * @return
     *     possible object is
     *     {@link CapturedSignature1 }
     *     
     */
    public CapturedSignature1 getImgCaptrdSgntr() {
        return imgCaptrdSgntr;
    }

    /**
     * Define el valor de la propiedad imgCaptrdSgntr.
     * 
     * @param value
     *     allowed object is
     *     {@link CapturedSignature1 }
     *     
     */
    public void setImgCaptrdSgntr(CapturedSignature1 value) {
        this.imgCaptrdSgntr = value;
    }

}
