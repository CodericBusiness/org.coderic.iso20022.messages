//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CryptographicKey13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CryptographicKey13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max140Text"/&gt;
 *         &lt;element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Binary" minOccurs="0"/&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max256Text"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}CryptographicKeyType3Code" minOccurs="0"/&gt;
 *         &lt;element name="Fctn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}KeyUsage1Code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ActvtnDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="DeactvtnDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ISODateTime" minOccurs="0"/&gt;
 *         &lt;element name="KeyVal" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}ContentInformationType19" minOccurs="0"/&gt;
 *         &lt;element name="KeyChckVal" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Binary" minOccurs="0"/&gt;
 *         &lt;element name="AddtlMgmtInf" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}GenericInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey13", propOrder = {
    "id",
    "addtlId",
    "vrsn",
    "tp",
    "fctn",
    "actvtnDt",
    "deactvtnDt",
    "keyVal",
    "keyChckVal",
    "addtlMgmtInf"
})
public class CryptographicKey13 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType3Code tp;
    @XmlElement(name = "Fctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> fctn;
    @XmlElement(name = "ActvtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actvtnDt;
    @XmlElement(name = "DeactvtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactvtnDt;
    @XmlElement(name = "KeyVal")
    protected ContentInformationType19 keyVal;
    @XmlElement(name = "KeyChckVal")
    protected byte[] keyChckVal;
    @XmlElement(name = "AddtlMgmtInf")
    protected List<GenericInformation1> addtlMgmtInf;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad addtlId.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlId() {
        return addtlId;
    }

    /**
     * Define el valor de la propiedad addtlId.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddtlId(byte[] value) {
        this.addtlId = value;
    }

    /**
     * Obtiene el valor de la propiedad vrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Define el valor de la propiedad vrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public CryptographicKeyType3Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public void setTp(CryptographicKeyType3Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyUsage1Code }
     * 
     * 
     */
    public List<KeyUsage1Code> getFctn() {
        if (fctn == null) {
            fctn = new ArrayList<KeyUsage1Code>();
        }
        return this.fctn;
    }

    /**
     * Obtiene el valor de la propiedad actvtnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Define el valor de la propiedad actvtnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActvtnDt(XMLGregorianCalendar value) {
        this.actvtnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad deactvtnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactvtnDt() {
        return deactvtnDt;
    }

    /**
     * Define el valor de la propiedad deactvtnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactvtnDt(XMLGregorianCalendar value) {
        this.deactvtnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad keyVal.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType19 }
     *     
     */
    public ContentInformationType19 getKeyVal() {
        return keyVal;
    }

    /**
     * Define el valor de la propiedad keyVal.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType19 }
     *     
     */
    public void setKeyVal(ContentInformationType19 value) {
        this.keyVal = value;
    }

    /**
     * Obtiene el valor de la propiedad keyChckVal.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyChckVal() {
        return keyChckVal;
    }

    /**
     * Define el valor de la propiedad keyChckVal.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyChckVal(byte[] value) {
        this.keyChckVal = value;
    }

    /**
     * Gets the value of the addtlMgmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlMgmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlMgmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInformation1 }
     * 
     * 
     */
    public List<GenericInformation1> getAddtlMgmtInf() {
        if (addtlMgmtInf == null) {
            addtlMgmtInf = new ArrayList<GenericInformation1>();
        }
        return this.addtlMgmtInf;
    }

}
