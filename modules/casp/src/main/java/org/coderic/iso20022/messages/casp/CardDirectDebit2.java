//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardDirectDebit2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardDirectDebit2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DbtrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Debtor4" minOccurs="0"/&gt;
 *         &lt;element name="CdtrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Creditor4"/&gt;
 *         &lt;element name="MndtRltdInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}MandateRelatedInformation13"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDirectDebit2", propOrder = {
    "dbtrId",
    "cdtrId",
    "mndtRltdInf"
})
public class CardDirectDebit2 {

    @XmlElement(name = "DbtrId")
    protected Debtor4 dbtrId;
    @XmlElement(name = "CdtrId", required = true)
    protected Creditor4 cdtrId;
    @XmlElement(name = "MndtRltdInf", required = true)
    protected MandateRelatedInformation13 mndtRltdInf;

    /**
     * Obtiene el valor de la propiedad dbtrId.
     * 
     * @return
     *     possible object is
     *     {@link Debtor4 }
     *     
     */
    public Debtor4 getDbtrId() {
        return dbtrId;
    }

    /**
     * Define el valor de la propiedad dbtrId.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor4 }
     *     
     */
    public void setDbtrId(Debtor4 value) {
        this.dbtrId = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtrId.
     * 
     * @return
     *     possible object is
     *     {@link Creditor4 }
     *     
     */
    public Creditor4 getCdtrId() {
        return cdtrId;
    }

    /**
     * Define el valor de la propiedad cdtrId.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor4 }
     *     
     */
    public void setCdtrId(Creditor4 value) {
        this.cdtrId = value;
    }

    /**
     * Obtiene el valor de la propiedad mndtRltdInf.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation13 }
     *     
     */
    public MandateRelatedInformation13 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Define el valor de la propiedad mndtRltdInf.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation13 }
     *     
     */
    public void setMndtRltdInf(MandateRelatedInformation13 value) {
        this.mndtRltdInf = value;
    }

}
