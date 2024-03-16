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
 * <p>Clase Java para Undertaking8 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Undertaking8"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text"/&gt;
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyIdentification43"/&gt;
 *         &lt;element name="ApplcntRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="BnfcryRefNb" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Undertaking8", propOrder = {
    "id",
    "issr",
    "applcntRefNb",
    "bnfcryRefNb"
})
public class Undertaking8 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Issr", required = true)
    protected PartyIdentification43 issr;
    @XmlElement(name = "ApplcntRefNb")
    protected String applcntRefNb;
    @XmlElement(name = "BnfcryRefNb")
    protected String bnfcryRefNb;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad issr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getIssr() {
        return issr;
    }

    /**
     * Define el valor de la propiedad issr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public void setIssr(PartyIdentification43 value) {
        this.issr = value;
    }

    /**
     * Obtiene el valor de la propiedad applcntRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplcntRefNb() {
        return applcntRefNb;
    }

    /**
     * Define el valor de la propiedad applcntRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplcntRefNb(String value) {
        this.applcntRefNb = value;
    }

    /**
     * Obtiene el valor de la propiedad bnfcryRefNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfcryRefNb() {
        return bnfcryRefNb;
    }

    /**
     * Define el valor de la propiedad bnfcryRefNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfcryRefNb(String value) {
        this.bnfcryRefNb = value;
    }

}
