//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:39 PM COT 
//


package org.coderic.iso20022.messages.tsrv;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BranchData2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BranchData2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PostalAddress6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BranchData2", propOrder = {
    "id",
    "nm",
    "pstlAdr"
})
public class BranchData2 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress6 pstlAdr;

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
     * Obtiene el valor de la propiedad nm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Define el valor de la propiedad nm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Obtiene el valor de la propiedad pstlAdr.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Define el valor de la propiedad pstlAdr.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setPstlAdr(PostalAddress6 value) {
        this.pstlAdr = value;
    }

}
