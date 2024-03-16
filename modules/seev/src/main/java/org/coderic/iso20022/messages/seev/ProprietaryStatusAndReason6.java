//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProprietaryStatusAndReason6 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProprietaryStatusAndReason6"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}GenericIdentification30"/&gt;
 *         &lt;element name="PrtryRsn" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ProprietaryReason4" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryStatusAndReason6", propOrder = {
    "prtrySts",
    "prtryRsn"
})
public class ProprietaryStatusAndReason6 {

    @XmlElement(name = "PrtrySts", required = true)
    protected GenericIdentification30 prtrySts;
    @XmlElement(name = "PrtryRsn")
    protected List<ProprietaryReason4> prtryRsn;

    /**
     * Obtiene el valor de la propiedad prtrySts.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Define el valor de la propiedad prtrySts.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtrySts(GenericIdentification30 value) {
        this.prtrySts = value;
    }

    /**
     * Gets the value of the prtryRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the prtryRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtryRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProprietaryReason4 }
     * 
     * 
     */
    public List<ProprietaryReason4> getPrtryRsn() {
        if (prtryRsn == null) {
            prtryRsn = new ArrayList<ProprietaryReason4>();
        }
        return this.prtryRsn;
    }

}
