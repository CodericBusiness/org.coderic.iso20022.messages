//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para GovernanceRules2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="GovernanceRules2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="RuleId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}GovernanceIdentification1Choice"/&gt;
 *         &lt;element name="AplblLaw" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Location1" minOccurs="0"/&gt;
 *         &lt;element name="Jursdctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Location1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GovernanceRules2", propOrder = {
    "id",
    "ruleId",
    "aplblLaw",
    "jursdctn"
})
public class GovernanceRules2 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "RuleId", required = true)
    protected GovernanceIdentification1Choice ruleId;
    @XmlElement(name = "AplblLaw")
    protected Location1 aplblLaw;
    @XmlElement(name = "Jursdctn")
    protected List<Location1> jursdctn;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad ruleId.
     * 
     * @return
     *     possible object is
     *     {@link GovernanceIdentification1Choice }
     *     
     */
    public GovernanceIdentification1Choice getRuleId() {
        return ruleId;
    }

    /**
     * Define el valor de la propiedad ruleId.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernanceIdentification1Choice }
     *     
     */
    public void setRuleId(GovernanceIdentification1Choice value) {
        this.ruleId = value;
    }

    /**
     * Obtiene el valor de la propiedad aplblLaw.
     * 
     * @return
     *     possible object is
     *     {@link Location1 }
     *     
     */
    public Location1 getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Define el valor de la propiedad aplblLaw.
     * 
     * @param value
     *     allowed object is
     *     {@link Location1 }
     *     
     */
    public void setAplblLaw(Location1 value) {
        this.aplblLaw = value;
    }

    /**
     * Gets the value of the jursdctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the jursdctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJursdctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location1 }
     * 
     * 
     */
    public List<Location1> getJursdctn() {
        if (jursdctn == null) {
            jursdctn = new ArrayList<Location1>();
        }
        return this.jursdctn;
    }

}
