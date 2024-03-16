//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:12 PM COT 
//


package org.coderic.iso20022.messages.colr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransactionIdentifications44 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransactionIdentifications44"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrptyAgtSvcPrvdrCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max35Text"/&gt;
 *         &lt;element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ClntCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ClntCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrPtyCollInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CtrPtyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}Max52Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentifications44", propOrder = {
    "trptyAgtSvcPrvdrCollInstrId",
    "trptyAgtSvcPrvdrCollTxId",
    "clntCollInstrId",
    "clntCollTxId",
    "ctrPtyCollInstrId",
    "ctrPtyCollTxId",
    "cmonTxId"
})
public class TransactionIdentifications44 {

    @XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId", required = true)
    protected String trptyAgtSvcPrvdrCollInstrId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "ClntCollInstrId")
    protected String clntCollInstrId;
    @XmlElement(name = "ClntCollTxId")
    protected String clntCollTxId;
    @XmlElement(name = "CtrPtyCollInstrId")
    protected String ctrPtyCollInstrId;
    @XmlElement(name = "CtrPtyCollTxId")
    protected String ctrPtyCollTxId;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;

    /**
     * Obtiene el valor de la propiedad trptyAgtSvcPrvdrCollInstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollInstrId() {
        return trptyAgtSvcPrvdrCollInstrId;
    }

    /**
     * Define el valor de la propiedad trptyAgtSvcPrvdrCollInstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollInstrId(String value) {
        this.trptyAgtSvcPrvdrCollInstrId = value;
    }

    /**
     * Obtiene el valor de la propiedad trptyAgtSvcPrvdrCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Define el valor de la propiedad trptyAgtSvcPrvdrCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad clntCollInstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollInstrId() {
        return clntCollInstrId;
    }

    /**
     * Define el valor de la propiedad clntCollInstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollInstrId(String value) {
        this.clntCollInstrId = value;
    }

    /**
     * Obtiene el valor de la propiedad clntCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCollTxId() {
        return clntCollTxId;
    }

    /**
     * Define el valor de la propiedad clntCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCollTxId(String value) {
        this.clntCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrPtyCollInstrId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyCollInstrId() {
        return ctrPtyCollInstrId;
    }

    /**
     * Define el valor de la propiedad ctrPtyCollInstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyCollInstrId(String value) {
        this.ctrPtyCollInstrId = value;
    }

    /**
     * Obtiene el valor de la propiedad ctrPtyCollTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyCollTxId() {
        return ctrPtyCollTxId;
    }

    /**
     * Define el valor de la propiedad ctrPtyCollTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyCollTxId(String value) {
        this.ctrPtyCollTxId = value;
    }

    /**
     * Obtiene el valor de la propiedad cmonTxId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Define el valor de la propiedad cmonTxId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

}
