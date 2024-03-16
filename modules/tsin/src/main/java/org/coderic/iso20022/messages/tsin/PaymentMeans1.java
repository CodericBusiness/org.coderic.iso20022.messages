//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PaymentMeans1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PaymentMeans1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PmtTp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}PaymentTypeInformation19"/&gt;
 *         &lt;element name="PmtMtdCd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}PaymentMethod4Code"/&gt;
 *         &lt;element name="PyeeCdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}CashAccount16"/&gt;
 *         &lt;element name="PyeeFI" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}BranchAndFinancialInstitutionIdentification4"/&gt;
 *         &lt;element name="PyerDbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}CashAccount16" minOccurs="0"/&gt;
 *         &lt;element name="PyerFI" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}BranchAndFinancialInstitutionIdentification4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMeans1", propOrder = {
    "pmtTp",
    "pmtMtdCd",
    "pyeeCdtrAcct",
    "pyeeFI",
    "pyerDbtrAcct",
    "pyerFI"
})
public class PaymentMeans1 {

    @XmlElement(name = "PmtTp", required = true)
    protected PaymentTypeInformation19 pmtTp;
    @XmlElement(name = "PmtMtdCd", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentMethod4Code pmtMtdCd;
    @XmlElement(name = "PyeeCdtrAcct", required = true)
    protected CashAccount16 pyeeCdtrAcct;
    @XmlElement(name = "PyeeFI", required = true)
    protected BranchAndFinancialInstitutionIdentification4 pyeeFI;
    @XmlElement(name = "PyerDbtrAcct")
    protected CashAccount16 pyerDbtrAcct;
    @XmlElement(name = "PyerFI")
    protected BranchAndFinancialInstitutionIdentification4 pyerFI;

    /**
     * Obtiene el valor de la propiedad pmtTp.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public PaymentTypeInformation19 getPmtTp() {
        return pmtTp;
    }

    /**
     * Define el valor de la propiedad pmtTp.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTypeInformation19 }
     *     
     */
    public void setPmtTp(PaymentTypeInformation19 value) {
        this.pmtTp = value;
    }

    /**
     * Obtiene el valor de la propiedad pmtMtdCd.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public PaymentMethod4Code getPmtMtdCd() {
        return pmtMtdCd;
    }

    /**
     * Define el valor de la propiedad pmtMtdCd.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod4Code }
     *     
     */
    public void setPmtMtdCd(PaymentMethod4Code value) {
        this.pmtMtdCd = value;
    }

    /**
     * Obtiene el valor de la propiedad pyeeCdtrAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPyeeCdtrAcct() {
        return pyeeCdtrAcct;
    }

    /**
     * Define el valor de la propiedad pyeeCdtrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public void setPyeeCdtrAcct(CashAccount16 value) {
        this.pyeeCdtrAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad pyeeFI.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPyeeFI() {
        return pyeeFI;
    }

    /**
     * Define el valor de la propiedad pyeeFI.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public void setPyeeFI(BranchAndFinancialInstitutionIdentification4 value) {
        this.pyeeFI = value;
    }

    /**
     * Obtiene el valor de la propiedad pyerDbtrAcct.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount16 }
     *     
     */
    public CashAccount16 getPyerDbtrAcct() {
        return pyerDbtrAcct;
    }

    /**
     * Define el valor de la propiedad pyerDbtrAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount16 }
     *     
     */
    public void setPyerDbtrAcct(CashAccount16 value) {
        this.pyerDbtrAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad pyerFI.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification4 getPyerFI() {
        return pyerFI;
    }

    /**
     * Define el valor de la propiedad pyerFI.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification4 }
     *     
     */
    public void setPyerFI(BranchAndFinancialInstitutionIdentification4 value) {
        this.pyerFI = value;
    }

}
