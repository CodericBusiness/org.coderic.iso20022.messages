//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AlternatePartyIdentification4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AlternatePartyIdentification4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdTp" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}IdentificationType6Choice"/&gt;
 *         &lt;element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}CountryCode"/&gt;
 *         &lt;element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternatePartyIdentification4", propOrder = {
    "idTp",
    "ctry",
    "altrnId"
})
public class AlternatePartyIdentification4 {

    @XmlElement(name = "IdTp", required = true)
    protected IdentificationType6Choice idTp;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "AltrnId", required = true)
    protected String altrnId;

    /**
     * Obtiene el valor de la propiedad idTp.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationType6Choice }
     *     
     */
    public IdentificationType6Choice getIdTp() {
        return idTp;
    }

    /**
     * Define el valor de la propiedad idTp.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationType6Choice }
     *     
     */
    public void setIdTp(IdentificationType6Choice value) {
        this.idTp = value;
    }

    /**
     * Obtiene el valor de la propiedad ctry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Define el valor de la propiedad ctry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Obtiene el valor de la propiedad altrnId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrnId() {
        return altrnId;
    }

    /**
     * Define el valor de la propiedad altrnId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltrnId(String value) {
        this.altrnId = value;
    }

}
