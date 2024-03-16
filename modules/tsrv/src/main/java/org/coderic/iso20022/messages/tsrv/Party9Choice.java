//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:07 PM COT 
//


package org.coderic.iso20022.messages.tsrv;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Party9Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Party9Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyIdentification42"/&gt;
 *         &lt;element name="FIId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}BranchAndFinancialInstitutionIdentification5"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party9Choice", propOrder = {
    "orgId",
    "fiId"
})
public class Party9Choice {

    @XmlElement(name = "OrgId")
    protected PartyIdentification42 orgId;
    @XmlElement(name = "FIId")
    protected BranchAndFinancialInstitutionIdentification5 fiId;

    /**
     * Obtiene el valor de la propiedad orgId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification42 }
     *     
     */
    public PartyIdentification42 getOrgId() {
        return orgId;
    }

    /**
     * Define el valor de la propiedad orgId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification42 }
     *     
     */
    public void setOrgId(PartyIdentification42 value) {
        this.orgId = value;
    }

    /**
     * Obtiene el valor de la propiedad fiId.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getFIId() {
        return fiId;
    }

    /**
     * Define el valor de la propiedad fiId.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setFIId(BranchAndFinancialInstitutionIdentification5 value) {
        this.fiId = value;
    }

}
