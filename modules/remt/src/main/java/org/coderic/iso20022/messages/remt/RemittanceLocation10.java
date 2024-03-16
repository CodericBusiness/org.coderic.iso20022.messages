//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:36 PM COT 
//


package org.coderic.iso20022.messages.remt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RemittanceLocation10 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocation10"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RmtId" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="RmtLctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}RemittanceLocationData2" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Refs" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}TransactionReferences8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocation10", propOrder = {
    "rmtId",
    "rmtLctnDtls",
    "refs"
})
public class RemittanceLocation10 {

    @XmlElement(name = "RmtId")
    protected String rmtId;
    @XmlElement(name = "RmtLctnDtls", required = true)
    protected List<RemittanceLocationData2> rmtLctnDtls;
    @XmlElement(name = "Refs", required = true)
    protected TransactionReferences8 refs;

    /**
     * Obtiene el valor de la propiedad rmtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmtId() {
        return rmtId;
    }

    /**
     * Define el valor de la propiedad rmtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmtId(String value) {
        this.rmtId = value;
    }

    /**
     * Gets the value of the rmtLctnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rmtLctnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtLctnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocationData2 }
     * 
     * 
     */
    public List<RemittanceLocationData2> getRmtLctnDtls() {
        if (rmtLctnDtls == null) {
            rmtLctnDtls = new ArrayList<RemittanceLocationData2>();
        }
        return this.rmtLctnDtls;
    }

    /**
     * Obtiene el valor de la propiedad refs.
     * 
     * @return
     *     possible object is
     *     {@link TransactionReferences8 }
     *     
     */
    public TransactionReferences8 getRefs() {
        return refs;
    }

    /**
     * Define el valor de la propiedad refs.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionReferences8 }
     *     
     */
    public void setRefs(TransactionReferences8 value) {
        this.refs = value;
    }

}
