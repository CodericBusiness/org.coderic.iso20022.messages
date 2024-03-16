//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NetworkParameters7 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NetworkParameters7"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}NetworkParameters9" maxOccurs="unbounded"/&gt;
 *         &lt;element name="UsrNm" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AccsCd" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max35Binary" minOccurs="0"/&gt;
 *         &lt;element name="SvrCert" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SvrCertIdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max140Binary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClntCert" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters7", propOrder = {
    "adr",
    "usrNm",
    "accsCd",
    "svrCert",
    "svrCertIdr",
    "clntCert",
    "sctyPrfl"
})
public class NetworkParameters7 {

    @XmlElement(name = "Adr", required = true)
    protected List<NetworkParameters9> adr;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected byte[] accsCd;
    @XmlElement(name = "SvrCert")
    protected List<byte[]> svrCert;
    @XmlElement(name = "SvrCertIdr")
    protected List<byte[]> svrCertIdr;
    @XmlElement(name = "ClntCert")
    protected List<byte[]> clntCert;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;

    /**
     * Gets the value of the adr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the adr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkParameters9 }
     * 
     * 
     */
    public List<NetworkParameters9> getAdr() {
        if (adr == null) {
            adr = new ArrayList<NetworkParameters9>();
        }
        return this.adr;
    }

    /**
     * Obtiene el valor de la propiedad usrNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Define el valor de la propiedad usrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrNm(String value) {
        this.usrNm = value;
    }

    /**
     * Obtiene el valor de la propiedad accsCd.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccsCd() {
        return accsCd;
    }

    /**
     * Define el valor de la propiedad accsCd.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAccsCd(byte[] value) {
        this.accsCd = value;
    }

    /**
     * Gets the value of the svrCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the svrCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getSvrCert() {
        if (svrCert == null) {
            svrCert = new ArrayList<byte[]>();
        }
        return this.svrCert;
    }

    /**
     * Gets the value of the svrCertIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the svrCertIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCertIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getSvrCertIdr() {
        if (svrCertIdr == null) {
            svrCertIdr = new ArrayList<byte[]>();
        }
        return this.svrCertIdr;
    }

    /**
     * Gets the value of the clntCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clntCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getClntCert() {
        if (clntCert == null) {
            clntCert = new ArrayList<byte[]>();
        }
        return this.clntCert;
    }

    /**
     * Obtiene el valor de la propiedad sctyPrfl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Define el valor de la propiedad sctyPrfl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyPrfl(String value) {
        this.sctyPrfl = value;
    }

}
