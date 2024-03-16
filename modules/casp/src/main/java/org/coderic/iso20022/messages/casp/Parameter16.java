//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Parameter16 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Parameter16"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Algorithm26Code" minOccurs="0"/&gt;
 *         &lt;element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}AlgorithmIdentification34" minOccurs="0"/&gt;
 *         &lt;element name="SaltLngth" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Number" minOccurs="0"/&gt;
 *         &lt;element name="TrlrFld" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Number" minOccurs="0"/&gt;
 *         &lt;element name="OIDCrvNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max140Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter16", propOrder = {
    "dgstAlgo",
    "mskGnrtrAlgo",
    "saltLngth",
    "trlrFld",
    "oidCrvNm"
})
public class Parameter16 {

    @XmlElement(name = "DgstAlgo")
    @XmlSchemaType(name = "string")
    protected Algorithm26Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo")
    protected AlgorithmIdentification34 mskGnrtrAlgo;
    @XmlElement(name = "SaltLngth")
    protected BigDecimal saltLngth;
    @XmlElement(name = "TrlrFld")
    protected BigDecimal trlrFld;
    @XmlElement(name = "OIDCrvNm")
    protected String oidCrvNm;

    /**
     * Obtiene el valor de la propiedad dgstAlgo.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm26Code }
     *     
     */
    public Algorithm26Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Define el valor de la propiedad dgstAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm26Code }
     *     
     */
    public void setDgstAlgo(Algorithm26Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad mskGnrtrAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification34 }
     *     
     */
    public AlgorithmIdentification34 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Define el valor de la propiedad mskGnrtrAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification34 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification34 value) {
        this.mskGnrtrAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad saltLngth.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaltLngth() {
        return saltLngth;
    }

    /**
     * Define el valor de la propiedad saltLngth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaltLngth(BigDecimal value) {
        this.saltLngth = value;
    }

    /**
     * Obtiene el valor de la propiedad trlrFld.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrlrFld() {
        return trlrFld;
    }

    /**
     * Define el valor de la propiedad trlrFld.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrlrFld(BigDecimal value) {
        this.trlrFld = value;
    }

    /**
     * Obtiene el valor de la propiedad oidCrvNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIDCrvNm() {
        return oidCrvNm;
    }

    /**
     * Define el valor de la propiedad oidCrvNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIDCrvNm(String value) {
        this.oidCrvNm = value;
    }

}
