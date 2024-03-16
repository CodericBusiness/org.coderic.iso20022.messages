//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para KeyExchangeData1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KeyExchangeData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ctrl" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Exact1HexBinaryText" minOccurs="0"/&gt;
 *         &lt;element name="KeySetIdr" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max8NumericText" minOccurs="0"/&gt;
 *         &lt;element name="DrvdInf" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max32HexBinaryText" minOccurs="0"/&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyLngth" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max4NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyIndx" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max5NumericText" minOccurs="0"/&gt;
 *         &lt;element name="NcrptdData" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max9999HexBinaryText" minOccurs="0"/&gt;
 *         &lt;element name="KeyChcksmVal" type="{urn:iso:std:iso:20022:tech:xsd:canm.004.001.03}Max9999HexBinaryText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyExchangeData1", propOrder = {
    "ctrl",
    "keySetIdr",
    "drvdInf",
    "algo",
    "keyLngth",
    "keyPrtcn",
    "keyIndx",
    "ncrptdData",
    "keyChcksmVal"
})
public class KeyExchangeData1 {

    @XmlElement(name = "Ctrl")
    protected String ctrl;
    @XmlElement(name = "KeySetIdr")
    protected String keySetIdr;
    @XmlElement(name = "DrvdInf")
    protected String drvdInf;
    @XmlElement(name = "Algo")
    protected String algo;
    @XmlElement(name = "KeyLngth")
    protected String keyLngth;
    @XmlElement(name = "KeyPrtcn")
    protected String keyPrtcn;
    @XmlElement(name = "KeyIndx")
    protected String keyIndx;
    @XmlElement(name = "NcrptdData")
    protected String ncrptdData;
    @XmlElement(name = "KeyChcksmVal")
    protected String keyChcksmVal;

    /**
     * Obtiene el valor de la propiedad ctrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrl() {
        return ctrl;
    }

    /**
     * Define el valor de la propiedad ctrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrl(String value) {
        this.ctrl = value;
    }

    /**
     * Obtiene el valor de la propiedad keySetIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySetIdr() {
        return keySetIdr;
    }

    /**
     * Define el valor de la propiedad keySetIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySetIdr(String value) {
        this.keySetIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad drvdInf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvdInf() {
        return drvdInf;
    }

    /**
     * Define el valor de la propiedad drvdInf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvdInf(String value) {
        this.drvdInf = value;
    }

    /**
     * Obtiene el valor de la propiedad algo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * Define el valor de la propiedad algo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgo(String value) {
        this.algo = value;
    }

    /**
     * Obtiene el valor de la propiedad keyLngth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLngth() {
        return keyLngth;
    }

    /**
     * Define el valor de la propiedad keyLngth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLngth(String value) {
        this.keyLngth = value;
    }

    /**
     * Obtiene el valor de la propiedad keyPrtcn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPrtcn() {
        return keyPrtcn;
    }

    /**
     * Define el valor de la propiedad keyPrtcn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPrtcn(String value) {
        this.keyPrtcn = value;
    }

    /**
     * Obtiene el valor de la propiedad keyIndx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyIndx() {
        return keyIndx;
    }

    /**
     * Define el valor de la propiedad keyIndx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyIndx(String value) {
        this.keyIndx = value;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdData.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Define el valor de la propiedad ncrptdData.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcrptdData(String value) {
        this.ncrptdData = value;
    }

    /**
     * Obtiene el valor de la propiedad keyChcksmVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyChcksmVal() {
        return keyChcksmVal;
    }

    /**
     * Define el valor de la propiedad keyChcksmVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyChcksmVal(String value) {
        this.keyChcksmVal = value;
    }

}
