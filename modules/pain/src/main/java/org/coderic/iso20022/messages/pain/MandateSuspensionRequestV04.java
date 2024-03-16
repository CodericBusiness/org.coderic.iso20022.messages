//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MandateSuspensionRequestV04 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MandateSuspensionRequestV04"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}GroupHeader110"/&gt;
 *         &lt;element name="UndrlygSspnsnDtls" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateSuspension4" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateSuspensionRequestV04", propOrder = {
    "grpHdr",
    "undrlygSspnsnDtls",
    "splmtryData"
})
public class MandateSuspensionRequestV04 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader110 grpHdr;
    @XmlElement(name = "UndrlygSspnsnDtls", required = true)
    protected List<MandateSuspension4> undrlygSspnsnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad grpHdr.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader110 }
     *     
     */
    public GroupHeader110 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Define el valor de la propiedad grpHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader110 }
     *     
     */
    public void setGrpHdr(GroupHeader110 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the undrlygSspnsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygSspnsnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSspnsnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateSuspension4 }
     * 
     * 
     */
    public List<MandateSuspension4> getUndrlygSspnsnDtls() {
        if (undrlygSspnsnDtls == null) {
            undrlygSspnsnDtls = new ArrayList<MandateSuspension4>();
        }
        return this.undrlygSspnsnDtls;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
