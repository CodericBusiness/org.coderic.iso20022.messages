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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InputResult6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InputResult6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DvcTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}SaleCapabilities2Code"/&gt;
 *         &lt;element name="InfQlfr" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}InformationQualify1Code"/&gt;
 *         &lt;element name="InptRsltData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}InputResultData6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResult6", propOrder = {
    "dvcTp",
    "infQlfr",
    "inptRsltData"
})
public class InputResult6 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected SaleCapabilities2Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "InptRsltData", required = true)
    protected InputResultData6 inptRsltData;

    /**
     * Obtiene el valor de la propiedad dvcTp.
     * 
     * @return
     *     possible object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public SaleCapabilities2Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Define el valor de la propiedad dvcTp.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleCapabilities2Code }
     *     
     */
    public void setDvcTp(SaleCapabilities2Code value) {
        this.dvcTp = value;
    }

    /**
     * Obtiene el valor de la propiedad infQlfr.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Define el valor de la propiedad infQlfr.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public void setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
    }

    /**
     * Obtiene el valor de la propiedad inptRsltData.
     * 
     * @return
     *     possible object is
     *     {@link InputResultData6 }
     *     
     */
    public InputResultData6 getInptRsltData() {
        return inptRsltData;
    }

    /**
     * Define el valor de la propiedad inptRsltData.
     * 
     * @param value
     *     allowed object is
     *     {@link InputResultData6 }
     *     
     */
    public void setInptRsltData(InputResultData6 value) {
        this.inptRsltData = value;
    }

}
