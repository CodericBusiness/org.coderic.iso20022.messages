//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CertificateManagementResponse3 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificateManagementResponse3"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}GenericIdentification176"/&gt;
 *         &lt;element name="TMId" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}GenericIdentification176" minOccurs="0"/&gt;
 *         &lt;element name="CertSvc" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}CardPaymentServiceType10Code"/&gt;
 *         &lt;element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}ResponseType6"/&gt;
 *         &lt;element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="POIChllngVal" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max140Binary"/&gt;
 *         &lt;element name="TMSDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}ISODateTime"/&gt;
 *         &lt;element name="ClntCert" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max3000Binary" minOccurs="0"/&gt;
 *         &lt;element name="ClntCertPth" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SvrCertPth" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementResponse3", propOrder = {
    "poiId",
    "tmId",
    "certSvc",
    "rslt",
    "sctyPrfl",
    "poiChllngVal",
    "tmsDtTm",
    "clntCert",
    "clntCertPth",
    "svrCertPth"
})
public class CertificateManagementResponse3 {

    @XmlElement(name = "POIId", required = true)
    protected GenericIdentification176 poiId;
    @XmlElement(name = "TMId")
    protected GenericIdentification176 tmId;
    @XmlElement(name = "CertSvc", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType10Code certSvc;
    @XmlElement(name = "Rslt", required = true)
    protected ResponseType6 rslt;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "POIChllngVal", required = true)
    protected byte[] poiChllngVal;
    @XmlElement(name = "TMSDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmsDtTm;
    @XmlElement(name = "ClntCert")
    protected byte[] clntCert;
    @XmlElement(name = "ClntCertPth")
    protected List<byte[]> clntCertPth;
    @XmlElement(name = "SvrCertPth")
    protected List<byte[]> svrCertPth;

    /**
     * Obtiene el valor de la propiedad poiId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getPOIId() {
        return poiId;
    }

    /**
     * Define el valor de la propiedad poiId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setPOIId(GenericIdentification176 value) {
        this.poiId = value;
    }

    /**
     * Obtiene el valor de la propiedad tmId.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getTMId() {
        return tmId;
    }

    /**
     * Define el valor de la propiedad tmId.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setTMId(GenericIdentification176 value) {
        this.tmId = value;
    }

    /**
     * Obtiene el valor de la propiedad certSvc.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType10Code }
     *     
     */
    public CardPaymentServiceType10Code getCertSvc() {
        return certSvc;
    }

    /**
     * Define el valor de la propiedad certSvc.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType10Code }
     *     
     */
    public void setCertSvc(CardPaymentServiceType10Code value) {
        this.certSvc = value;
    }

    /**
     * Obtiene el valor de la propiedad rslt.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType6 }
     *     
     */
    public ResponseType6 getRslt() {
        return rslt;
    }

    /**
     * Define el valor de la propiedad rslt.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType6 }
     *     
     */
    public void setRslt(ResponseType6 value) {
        this.rslt = value;
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

    /**
     * Obtiene el valor de la propiedad poiChllngVal.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPOIChllngVal() {
        return poiChllngVal;
    }

    /**
     * Define el valor de la propiedad poiChllngVal.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPOIChllngVal(byte[] value) {
        this.poiChllngVal = value;
    }

    /**
     * Obtiene el valor de la propiedad tmsDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTMSDtTm() {
        return tmsDtTm;
    }

    /**
     * Define el valor de la propiedad tmsDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTMSDtTm(XMLGregorianCalendar value) {
        this.tmsDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad clntCert.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClntCert() {
        return clntCert;
    }

    /**
     * Define el valor de la propiedad clntCert.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setClntCert(byte[] value) {
        this.clntCert = value;
    }

    /**
     * Gets the value of the clntCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clntCertPth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntCertPth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getClntCertPth() {
        if (clntCertPth == null) {
            clntCertPth = new ArrayList<byte[]>();
        }
        return this.clntCertPth;
    }

    /**
     * Gets the value of the svrCertPth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the svrCertPth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCertPth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getSvrCertPth() {
        if (svrCertPth == null) {
            svrCertPth = new ArrayList<byte[]>();
        }
        return this.svrCertPth;
    }

}
