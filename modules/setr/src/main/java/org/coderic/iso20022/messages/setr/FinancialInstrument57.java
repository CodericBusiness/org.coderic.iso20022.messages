//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancialInstrument57 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialInstrument57"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}SecurityIdentification25Choice"/&gt;
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max350Text" minOccurs="0"/&gt;
 *         &lt;element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryId" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ClssTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="SctiesForm" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}FormOfSecurity1Code" minOccurs="0"/&gt;
 *         &lt;element name="DstrbtnPlcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}DistributionPolicy1Code" minOccurs="0"/&gt;
 *         &lt;element name="PdctGrp" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Max140Text" minOccurs="0"/&gt;
 *         &lt;element name="SrsId" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}Series1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument57", propOrder = {
    "id",
    "nm",
    "shrtNm",
    "splmtryId",
    "clssTp",
    "sctiesForm",
    "dstrbtnPlcy",
    "pdctGrp",
    "srsId"
})
public class FinancialInstrument57 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification25Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "PdctGrp")
    protected String pdctGrp;
    @XmlElement(name = "SrsId")
    protected Series1 srsId;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public void setId(SecurityIdentification25Choice value) {
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
     * Obtiene el valor de la propiedad shrtNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Define el valor de la propiedad shrtNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

    /**
     * Obtiene el valor de la propiedad splmtryId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Define el valor de la propiedad splmtryId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplmtryId(String value) {
        this.splmtryId = value;
    }

    /**
     * Obtiene el valor de la propiedad clssTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Define el valor de la propiedad clssTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssTp(String value) {
        this.clssTp = value;
    }

    /**
     * Obtiene el valor de la propiedad sctiesForm.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Define el valor de la propiedad sctiesForm.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public void setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
    }

    /**
     * Obtiene el valor de la propiedad dstrbtnPlcy.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Define el valor de la propiedad dstrbtnPlcy.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public void setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
    }

    /**
     * Obtiene el valor de la propiedad pdctGrp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctGrp() {
        return pdctGrp;
    }

    /**
     * Define el valor de la propiedad pdctGrp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctGrp(String value) {
        this.pdctGrp = value;
    }

    /**
     * Obtiene el valor de la propiedad srsId.
     * 
     * @return
     *     possible object is
     *     {@link Series1 }
     *     
     */
    public Series1 getSrsId() {
        return srsId;
    }

    /**
     * Define el valor de la propiedad srsId.
     * 
     * @param value
     *     allowed object is
     *     {@link Series1 }
     *     
     */
    public void setSrsId(Series1 value) {
        this.srsId = value;
    }

}
