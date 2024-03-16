//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MACData1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MACData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ctrl" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Exact1HexBinaryText"/&gt;
 *         &lt;element name="KeySetIdr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max8NumericText"/&gt;
 *         &lt;element name="DrvdInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max32HexBinaryText" minOccurs="0"/&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max2NumericText"/&gt;
 *         &lt;element name="KeyLngth" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max4NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyIndx" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max5NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PddgMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="InitlstnVctr" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max32HexBinaryText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MACData1", propOrder = {
    "ctrl",
    "keySetIdr",
    "drvdInf",
    "algo",
    "keyLngth",
    "keyPrtcn",
    "keyIndx",
    "pddgMtd",
    "initlstnVctr"
})
public class MACData1 {

    @XmlElement(name = "Ctrl", required = true)
    protected String ctrl;
    @XmlElement(name = "KeySetIdr", required = true)
    protected String keySetIdr;
    @XmlElement(name = "DrvdInf")
    protected String drvdInf;
    @XmlElement(name = "Algo", required = true)
    protected String algo;
    @XmlElement(name = "KeyLngth")
    protected String keyLngth;
    @XmlElement(name = "KeyPrtcn")
    protected String keyPrtcn;
    @XmlElement(name = "KeyIndx")
    protected String keyIndx;
    @XmlElement(name = "PddgMtd")
    protected String pddgMtd;
    @XmlElement(name = "InitlstnVctr")
    protected String initlstnVctr;

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
     * Obtiene el valor de la propiedad pddgMtd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPddgMtd() {
        return pddgMtd;
    }

    /**
     * Define el valor de la propiedad pddgMtd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPddgMtd(String value) {
        this.pddgMtd = value;
    }

    /**
     * Obtiene el valor de la propiedad initlstnVctr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitlstnVctr() {
        return initlstnVctr;
    }

    /**
     * Define el valor de la propiedad initlstnVctr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitlstnVctr(String value) {
        this.initlstnVctr = value;
    }

}
