//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PointOfInteraction14 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteraction14"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}GenericIdentification177"/&gt;
 *         &lt;element name="SysNm" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="GrpId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Cpblties" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PointOfInteractionCapabilities9" minOccurs="0"/&gt;
 *         &lt;element name="TmZone" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Max70Text" minOccurs="0"/&gt;
 *         &lt;element name="TermnlIntgtn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}LocationCategory3Code" minOccurs="0"/&gt;
 *         &lt;element name="Cmpnt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}PointOfInteractionComponent15" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteraction14", propOrder = {
    "id",
    "sysNm",
    "grpId",
    "cpblties",
    "tmZone",
    "termnlIntgtn",
    "cmpnt"
})
public class PointOfInteraction14 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification177 id;
    @XmlElement(name = "SysNm")
    protected String sysNm;
    @XmlElement(name = "GrpId")
    protected String grpId;
    @XmlElement(name = "Cpblties")
    protected PointOfInteractionCapabilities9 cpblties;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected LocationCategory3Code termnlIntgtn;
    @XmlElement(name = "Cmpnt")
    protected List<PointOfInteractionComponent15> cmpnt;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setId(GenericIdentification177 value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad sysNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysNm() {
        return sysNm;
    }

    /**
     * Define el valor de la propiedad sysNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysNm(String value) {
        this.sysNm = value;
    }

    /**
     * Obtiene el valor de la propiedad grpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Define el valor de la propiedad grpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpId(String value) {
        this.grpId = value;
    }

    /**
     * Obtiene el valor de la propiedad cpblties.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public PointOfInteractionCapabilities9 getCpblties() {
        return cpblties;
    }

    /**
     * Define el valor de la propiedad cpblties.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionCapabilities9 }
     *     
     */
    public void setCpblties(PointOfInteractionCapabilities9 value) {
        this.cpblties = value;
    }

    /**
     * Obtiene el valor de la propiedad tmZone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Define el valor de la propiedad tmZone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmZone(String value) {
        this.tmZone = value;
    }

    /**
     * Obtiene el valor de la propiedad termnlIntgtn.
     * 
     * @return
     *     possible object is
     *     {@link LocationCategory3Code }
     *     
     */
    public LocationCategory3Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Define el valor de la propiedad termnlIntgtn.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCategory3Code }
     *     
     */
    public void setTermnlIntgtn(LocationCategory3Code value) {
        this.termnlIntgtn = value;
    }

    /**
     * Gets the value of the cmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent15 }
     * 
     * 
     */
    public List<PointOfInteractionComponent15> getCmpnt() {
        if (cmpnt == null) {
            cmpnt = new ArrayList<PointOfInteractionComponent15>();
        }
        return this.cmpnt;
    }

}
