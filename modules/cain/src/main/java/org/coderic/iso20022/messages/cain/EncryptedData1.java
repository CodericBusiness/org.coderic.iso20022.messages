//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptedData1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncryptedData1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ctrl" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Exact1HexBinaryText" minOccurs="0"/&gt;
 *         &lt;element name="KeySetIdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max8NumericText" minOccurs="0"/&gt;
 *         &lt;element name="DrvdInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max32HexBinaryText" minOccurs="0"/&gt;
 *         &lt;element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyLngth" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max4NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="KeyIndx" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max5NumericText" minOccurs="0"/&gt;
 *         &lt;element name="PddgMtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="NcrptdDataFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}Max2NumericText" minOccurs="0"/&gt;
 *         &lt;element name="NcrptdDataElmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.028.001.02}EncryptedDataElement1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedData1", propOrder = {
    "ctrl",
    "keySetIdr",
    "drvdInf",
    "algo",
    "keyLngth",
    "keyPrtcn",
    "keyIndx",
    "pddgMtd",
    "ncrptdDataFrmt",
    "ncrptdDataElmt"
})
public class EncryptedData1 {

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
    @XmlElement(name = "PddgMtd")
    protected String pddgMtd;
    @XmlElement(name = "NcrptdDataFrmt")
    protected String ncrptdDataFrmt;
    @XmlElement(name = "NcrptdDataElmt", required = true)
    protected List<EncryptedDataElement1> ncrptdDataElmt;

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
     * Obtiene el valor de la propiedad ncrptdDataFrmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcrptdDataFrmt() {
        return ncrptdDataFrmt;
    }

    /**
     * Define el valor de la propiedad ncrptdDataFrmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcrptdDataFrmt(String value) {
        this.ncrptdDataFrmt = value;
    }

    /**
     * Gets the value of the ncrptdDataElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ncrptdDataElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptdDataElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedDataElement1 }
     * 
     * 
     */
    public List<EncryptedDataElement1> getNcrptdDataElmt() {
        if (ncrptdDataElmt == null) {
            ncrptdDataElmt = new ArrayList<EncryptedDataElement1>();
        }
        return this.ncrptdDataElmt;
    }

}
