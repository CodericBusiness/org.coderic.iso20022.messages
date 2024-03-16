//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NewOrderReport2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NewOrderReport2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}Max140Text"/&gt;
 *         &lt;element name="Ordr" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderData3" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewOrderReport2", propOrder = {
    "rptId",
    "ordr"
})
public class NewOrderReport2 {

    @XmlElement(name = "RptId", required = true)
    protected String rptId;
    @XmlElement(name = "Ordr", required = true)
    protected List<OrderData3> ordr;

    /**
     * Obtiene el valor de la propiedad rptId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Define el valor de la propiedad rptId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptId(String value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the ordr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ordr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderData3 }
     * 
     * 
     */
    public List<OrderData3> getOrdr() {
        if (ordr == null) {
            ordr = new ArrayList<OrderData3>();
        }
        return this.ordr;
    }

}
