//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BranchAndFinancialInstitutionIdentification8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BranchAndFinancialInstitutionIdentification8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FinInstnId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}FinancialInstitutionIdentification23"/&gt;
 *         &lt;element name="BrnchId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}BranchData5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchAndFinancialInstitutionIdentification8", propOrder = {
    "finInstnId",
    "brnchId"
})
public class BranchAndFinancialInstitutionIdentification8 {

    @XmlElement(name = "FinInstnId", required = true)
    protected FinancialInstitutionIdentification23 finInstnId;
    @XmlElement(name = "BrnchId")
    protected BranchData5 brnchId;

    /**
     * Obtiene el valor de la propiedad finInstnId.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification23 }
     *     
     */
    public FinancialInstitutionIdentification23 getFinInstnId() {
        return finInstnId;
    }

    /**
     * Define el valor de la propiedad finInstnId.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification23 }
     *     
     */
    public void setFinInstnId(FinancialInstitutionIdentification23 value) {
        this.finInstnId = value;
    }

    /**
     * Obtiene el valor de la propiedad brnchId.
     * 
     * @return
     *     possible object is
     *     {@link BranchData5 }
     *     
     */
    public BranchData5 getBrnchId() {
        return brnchId;
    }

    /**
     * Define el valor de la propiedad brnchId.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData5 }
     *     
     */
    public void setBrnchId(BranchData5 value) {
        this.brnchId = value;
    }

}
