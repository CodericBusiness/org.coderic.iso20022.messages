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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomerDevice4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomerDevice4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dvc" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Device2" minOccurs="0"/&gt;
 *         &lt;element name="DvcId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}DeviceIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="OprgSys" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}DeviceOperatingSystem1" minOccurs="0"/&gt;
 *         &lt;element name="Prvdr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDevice4", propOrder = {
    "dvc",
    "dvcId",
    "oprgSys",
    "prvdr",
    "addtlData"
})
public class CustomerDevice4 {

    @XmlElement(name = "Dvc")
    protected Device2 dvc;
    @XmlElement(name = "DvcId")
    protected DeviceIdentification1 dvcId;
    @XmlElement(name = "OprgSys")
    protected DeviceOperatingSystem1 oprgSys;
    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Obtiene el valor de la propiedad dvc.
     * 
     * @return
     *     possible object is
     *     {@link Device2 }
     *     
     */
    public Device2 getDvc() {
        return dvc;
    }

    /**
     * Define el valor de la propiedad dvc.
     * 
     * @param value
     *     allowed object is
     *     {@link Device2 }
     *     
     */
    public void setDvc(Device2 value) {
        this.dvc = value;
    }

    /**
     * Obtiene el valor de la propiedad dvcId.
     * 
     * @return
     *     possible object is
     *     {@link DeviceIdentification1 }
     *     
     */
    public DeviceIdentification1 getDvcId() {
        return dvcId;
    }

    /**
     * Define el valor de la propiedad dvcId.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceIdentification1 }
     *     
     */
    public void setDvcId(DeviceIdentification1 value) {
        this.dvcId = value;
    }

    /**
     * Obtiene el valor de la propiedad oprgSys.
     * 
     * @return
     *     possible object is
     *     {@link DeviceOperatingSystem1 }
     *     
     */
    public DeviceOperatingSystem1 getOprgSys() {
        return oprgSys;
    }

    /**
     * Define el valor de la propiedad oprgSys.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceOperatingSystem1 }
     *     
     */
    public void setOprgSys(DeviceOperatingSystem1 value) {
        this.oprgSys = value;
    }

    /**
     * Obtiene el valor de la propiedad prvdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Define el valor de la propiedad prvdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdr(String value) {
        this.prvdr = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<AdditionalData1>();
        }
        return this.addtlData;
    }

}
