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
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertMgmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}CertificateManagementResponseV07"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "certMgmtRspn"
})
public class Document {

    @XmlElement(name = "CertMgmtRspn", required = true)
    protected CertificateManagementResponseV07 certMgmtRspn;

    /**
     * Obtiene el valor de la propiedad certMgmtRspn.
     * 
     * @return
     *     possible object is
     *     {@link CertificateManagementResponseV07 }
     *     
     */
    public CertificateManagementResponseV07 getCertMgmtRspn() {
        return certMgmtRspn;
    }

    /**
     * Define el valor de la propiedad certMgmtRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateManagementResponseV07 }
     *     
     */
    public void setCertMgmtRspn(CertificateManagementResponseV07 value) {
        this.certMgmtRspn = value;
    }

}
