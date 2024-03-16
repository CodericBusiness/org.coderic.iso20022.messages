//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Reference19 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Reference19"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TradLegNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NetPosId" type="{urn:iso:std:iso:20022:tech:xsd:secl.010.001.03}Max35Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference19", propOrder = {
    "tradLegNtfctnId",
    "netPosId"
})
public class Reference19 {

    @XmlElement(name = "TradLegNtfctnId")
    protected List<String> tradLegNtfctnId;
    @XmlElement(name = "NetPosId")
    protected String netPosId;

    /**
     * Gets the value of the tradLegNtfctnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tradLegNtfctnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradLegNtfctnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradLegNtfctnId() {
        if (tradLegNtfctnId == null) {
            tradLegNtfctnId = new ArrayList<String>();
        }
        return this.tradLegNtfctnId;
    }

    /**
     * Obtiene el valor de la propiedad netPosId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPosId() {
        return netPosId;
    }

    /**
     * Define el valor de la propiedad netPosId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetPosId(String value) {
        this.netPosId = value;
    }

}
