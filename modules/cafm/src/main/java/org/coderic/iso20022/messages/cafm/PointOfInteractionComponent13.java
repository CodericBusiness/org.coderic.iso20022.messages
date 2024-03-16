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
 * <p>Clase Java para PointOfInteractionComponent13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PointOfInteractionComponent13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}POIComponentType5Code"/&gt;
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PointOfInteractionComponentIdentification3"/&gt;
 *         &lt;element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PointOfInteractionComponentStatus3" minOccurs="0"/&gt;
 *         &lt;element name="StdCmplc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}GenericIdentification48" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Chrtcs" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PointOfInteractionComponentCharacteristics4" minOccurs="0"/&gt;
 *         &lt;element name="Assmnt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}PointOfInteractionComponentIdentification3" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionComponent13", propOrder = {
    "tp",
    "id",
    "sts",
    "stdCmplc",
    "chrtcs",
    "assmnt"
})
public class PointOfInteractionComponent13 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected POIComponentType5Code tp;
    @XmlElement(name = "Id", required = true)
    protected PointOfInteractionComponentIdentification3 id;
    @XmlElement(name = "Sts")
    protected PointOfInteractionComponentStatus3 sts;
    @XmlElement(name = "StdCmplc")
    protected List<GenericIdentification48> stdCmplc;
    @XmlElement(name = "Chrtcs")
    protected PointOfInteractionComponentCharacteristics4 chrtcs;
    @XmlElement(name = "Assmnt")
    protected List<PointOfInteractionComponentIdentification3> assmnt;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link POIComponentType5Code }
     *     
     */
    public POIComponentType5Code getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link POIComponentType5Code }
     *     
     */
    public void setTp(POIComponentType5Code value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentIdentification3 }
     *     
     */
    public PointOfInteractionComponentIdentification3 getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentIdentification3 }
     *     
     */
    public void setId(PointOfInteractionComponentIdentification3 value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad sts.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentStatus3 }
     *     
     */
    public PointOfInteractionComponentStatus3 getSts() {
        return sts;
    }

    /**
     * Define el valor de la propiedad sts.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentStatus3 }
     *     
     */
    public void setSts(PointOfInteractionComponentStatus3 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stdCmplc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stdCmplc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStdCmplc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification48 }
     * 
     * 
     */
    public List<GenericIdentification48> getStdCmplc() {
        if (stdCmplc == null) {
            stdCmplc = new ArrayList<GenericIdentification48>();
        }
        return this.stdCmplc;
    }

    /**
     * Obtiene el valor de la propiedad chrtcs.
     * 
     * @return
     *     possible object is
     *     {@link PointOfInteractionComponentCharacteristics4 }
     *     
     */
    public PointOfInteractionComponentCharacteristics4 getChrtcs() {
        return chrtcs;
    }

    /**
     * Define el valor de la propiedad chrtcs.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfInteractionComponentCharacteristics4 }
     *     
     */
    public void setChrtcs(PointOfInteractionComponentCharacteristics4 value) {
        this.chrtcs = value;
    }

    /**
     * Gets the value of the assmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the assmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfInteractionComponentIdentification3 }
     * 
     * 
     */
    public List<PointOfInteractionComponentIdentification3> getAssmnt() {
        if (assmnt == null) {
            assmnt = new ArrayList<PointOfInteractionComponentIdentification3>();
        }
        return this.assmnt;
    }

}
