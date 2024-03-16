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
 * <p>Clase Java para NetworkParameters9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NetworkParameters9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NtwkTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}NetworkType1Code"/&gt;
 *         &lt;element name="AdrVal" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max500Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters9", propOrder = {
    "ntwkTp",
    "adrVal"
})
public class NetworkParameters9 {

    @XmlElement(name = "NtwkTp", required = true)
    @XmlSchemaType(name = "string")
    protected NetworkType1Code ntwkTp;
    @XmlElement(name = "AdrVal", required = true)
    protected String adrVal;

    /**
     * Obtiene el valor de la propiedad ntwkTp.
     * 
     * @return
     *     possible object is
     *     {@link NetworkType1Code }
     *     
     */
    public NetworkType1Code getNtwkTp() {
        return ntwkTp;
    }

    /**
     * Define el valor de la propiedad ntwkTp.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkType1Code }
     *     
     */
    public void setNtwkTp(NetworkType1Code value) {
        this.ntwkTp = value;
    }

    /**
     * Obtiene el valor de la propiedad adrVal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdrVal() {
        return adrVal;
    }

    /**
     * Define el valor de la propiedad adrVal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdrVal(String value) {
        this.adrVal = value;
    }

}
