//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CertificateManagementResponseV07 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificateManagementResponseV07"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}TMSHeader1"/&gt;
 *         &lt;element name="CertMgmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}CertificateManagementResponse3"/&gt;
 *         &lt;element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}ContentInformationType38" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateManagementResponseV07", propOrder = {
    "hdr",
    "certMgmtRspn",
    "sctyTrlr"
})
public class CertificateManagementResponseV07 {

    @XmlElement(name = "Hdr", required = true)
    protected TMSHeader1 hdr;
    @XmlElement(name = "CertMgmtRspn", required = true)
    protected CertificateManagementResponse3 certMgmtRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType38 sctyTrlr;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link TMSHeader1 }
     *     
     */
    public TMSHeader1 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSHeader1 }
     *     
     */
    public void setHdr(TMSHeader1 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad certMgmtRspn.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementResponse3 }
     *     
     */
    public CertificateManagementResponse3 getCertMgmtRspn() {
        return certMgmtRspn;
    }

    /**
     * Define el valor de la propiedad certMgmtRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementResponse3 }
     *     
     */
    public void setCertMgmtRspn(CertificateManagementResponse3 value) {
        this.certMgmtRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad sctyTrlr.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType38 }
     *     
     */
    public ContentInformationType38 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Define el valor de la propiedad sctyTrlr.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType38 }
     *     
     */
    public void setSctyTrlr(ContentInformationType38 value) {
        this.sctyTrlr = value;
    }

}
