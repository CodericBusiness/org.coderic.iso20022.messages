//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageAndBusinessReference10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MessageAndBusinessReference10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}References62Choice" minOccurs="0"/&gt;
 *         &lt;element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}AdditionalReference8" minOccurs="0"/&gt;
 *         &lt;element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.058.001.02}InvestmentFundOrder8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAndBusinessReference10", propOrder = {
    "ref",
    "rltdRef",
    "ordrRef"
})
public class MessageAndBusinessReference10 {

    @XmlElement(name = "Ref")
    protected References62Choice ref;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference8 rltdRef;
    @XmlElement(name = "OrdrRef")
    protected List<InvestmentFundOrder8> ordrRef;

    /**
     * Obtiene el valor de la propiedad ref.
     * 
     * @return
     *     possible object is
     *     {@link References62Choice }
     *     
     */
    public References62Choice getRef() {
        return ref;
    }

    /**
     * Define el valor de la propiedad ref.
     * 
     * @param value
     *     allowed object is
     *     {@link References62Choice }
     *     
     */
    public void setRef(References62Choice value) {
        this.ref = value;
    }

    /**
     * Obtiene el valor de la propiedad rltdRef.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference8 }
     *     
     */
    public AdditionalReference8 getRltdRef() {
        return rltdRef;
    }

    /**
     * Define el valor de la propiedad rltdRef.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference8 }
     *     
     */
    public void setRltdRef(AdditionalReference8 value) {
        this.rltdRef = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ordrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundOrder8 }
     * 
     * 
     */
    public List<InvestmentFundOrder8> getOrdrRef() {
        if (ordrRef == null) {
            ordrRef = new ArrayList<InvestmentFundOrder8>();
        }
        return this.ordrRef;
    }

}
