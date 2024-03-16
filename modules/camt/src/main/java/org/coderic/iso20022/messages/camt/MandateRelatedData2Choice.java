//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MandateRelatedData2Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MandateRelatedData2Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DrctDbtMndt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}MandateRelatedInformation15" minOccurs="0"/&gt;
 *         &lt;element name="CdtTrfMndt" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}CreditTransferMandateData1" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedData2Choice", propOrder = {
    "drctDbtMndt",
    "cdtTrfMndt"
})
public class MandateRelatedData2Choice {

    @XmlElement(name = "DrctDbtMndt")
    protected MandateRelatedInformation15 drctDbtMndt;
    @XmlElement(name = "CdtTrfMndt")
    protected CreditTransferMandateData1 cdtTrfMndt;

    /**
     * Obtiene el valor de la propiedad drctDbtMndt.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation15 }
     *     
     */
    public MandateRelatedInformation15 getDrctDbtMndt() {
        return drctDbtMndt;
    }

    /**
     * Define el valor de la propiedad drctDbtMndt.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation15 }
     *     
     */
    public void setDrctDbtMndt(MandateRelatedInformation15 value) {
        this.drctDbtMndt = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtTrfMndt.
     * 
     * @return
     *     possible object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public CreditTransferMandateData1 getCdtTrfMndt() {
        return cdtTrfMndt;
    }

    /**
     * Define el valor de la propiedad cdtTrfMndt.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditTransferMandateData1 }
     *     
     */
    public void setCdtTrfMndt(CreditTransferMandateData1 value) {
        this.cdtTrfMndt = value;
    }

}
