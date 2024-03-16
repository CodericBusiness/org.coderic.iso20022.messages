//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Terminal4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Terminal4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TermnlId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TerminalIdentification3"/&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TerminalType1Code" minOccurs="0"/&gt;
 *         &lt;element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Cpblties" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Capabilities2" minOccurs="0"/&gt;
 *         &lt;element name="TermnlIntgtn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TerminalIntegrationCategory1Code" minOccurs="0"/&gt;
 *         &lt;element name="GeogcLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}GeographicPointInDecimalDegrees" minOccurs="0"/&gt;
 *         &lt;element name="OutdrInd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="OffPrmissInd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="OnBrdInd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}TrueFalseIndicator" minOccurs="0"/&gt;
 *         &lt;element name="POICmpnt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PointOfInteractionComponent13" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal4", propOrder = {
    "termnlId",
    "tp",
    "othrTp",
    "cpblties",
    "termnlIntgtn",
    "geogcLctn",
    "outdrInd",
    "offPrmissInd",
    "onBrdInd",
    "poiCmpnt"
})
public class Terminal4 {

    @XmlElement(name = "TermnlId", required = true)
    protected TerminalIdentification3 termnlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TerminalType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Cpblties")
    protected Capabilities2 cpblties;
    @XmlElement(name = "TermnlIntgtn")
    @XmlSchemaType(name = "string")
    protected TerminalIntegrationCategory1Code termnlIntgtn;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "OutdrInd")
    protected Boolean outdrInd;
    @XmlElement(name = "OffPrmissInd")
    protected Boolean offPrmissInd;
    @XmlElement(name = "OnBrdInd")
    protected Boolean onBrdInd;
    @XmlElement(name = "POICmpnt")
    protected List<PointOfInteractionComponent13> poiCmpnt;

    /**
     * Obtiene el valor de la propiedad termnlId.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public TerminalIdentification3 getTermnlId() {
        return termnlId;
    }

    /**
     * Define el valor de la propiedad termnlId.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIdentification3 }
     *     
     */
    public void setTermnlId(TerminalIdentification3 value) {
        this.termnlId = value;
    }

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link TerminalType1Code }
     *     
     */
    public TerminalType1Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalType1Code }
     *     
     */
    public void setTp(TerminalType1Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad othrTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Define el valor de la propiedad othrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cpblties.
     * 
     * @return
     *     possible object is
     *     {@link Capabilities2 }
     *     
     */
    public Capabilities2 getCpblties() {
        return cpblties;
    }

    /**
     * Define el valor de la propiedad cpblties.
     * 
     * @param value
     *     allowed object is
     *     {@link Capabilities2 }
     *     
     */
    public void setCpblties(Capabilities2 value) {
        this.cpblties = value;
    }

    /**
     * Obtiene el valor de la propiedad termnlIntgtn.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public TerminalIntegrationCategory1Code getTermnlIntgtn() {
        return termnlIntgtn;
    }

    /**
     * Define el valor de la propiedad termnlIntgtn.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public void setTermnlIntgtn(TerminalIntegrationCategory1Code value) {
        this.termnlIntgtn = value;
    }

    /**
     * Obtiene el valor de la propiedad geogcLctn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Define el valor de la propiedad geogcLctn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeogcLctn(String value) {
        this.geogcLctn = value;
    }

    /**
     * Obtiene el valor de la propiedad outdrInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdrInd() {
        return outdrInd;
    }

    /**
     * Define el valor de la propiedad outdrInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutdrInd(Boolean value) {
        this.outdrInd = value;
    }

    /**
     * Obtiene el valor de la propiedad offPrmissInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffPrmissInd() {
        return offPrmissInd;
    }

    /**
     * Define el valor de la propiedad offPrmissInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffPrmissInd(Boolean value) {
        this.offPrmissInd = value;
    }

    /**
     * Obtiene el valor de la propiedad onBrdInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBrdInd() {
        return onBrdInd;
    }

    /**
     * Define el valor de la propiedad onBrdInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnBrdInd(Boolean value) {
        this.onBrdInd = value;
    }

    /**
     * Gets the value of the poiCmpnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the poiCmpnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOICmpnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponent13 }
     * 
     * 
     */
    public List<PointOfInteractionComponent13> getPOICmpnt() {
        if (poiCmpnt == null) {
            poiCmpnt = new ArrayList<PointOfInteractionComponent13>();
        }
        return this.poiCmpnt;
    }

}
