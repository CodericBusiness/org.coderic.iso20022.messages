//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Signer4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Signer4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Number" minOccurs="0"/&gt;
 *         &lt;element name="SgnrId" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Recipient5Choice" minOccurs="0"/&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AlgorithmIdentification21"/&gt;
 *         &lt;element name="SgndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}GenericInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SgntrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}AlgorithmIdentification20"/&gt;
 *         &lt;element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}Max3000Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signer4", propOrder = {
    "vrsn",
    "sgnrId",
    "dgstAlgo",
    "sgndAttrbts",
    "sgntrAlgo",
    "sgntr"
})
public class Signer4 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SgnrId")
    protected Recipient5Choice sgnrId;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification21 dgstAlgo;
    @XmlElement(name = "SgndAttrbts")
    protected List<GenericInformation1> sgndAttrbts;
    @XmlElement(name = "SgntrAlgo", required = true)
    protected AlgorithmIdentification20 sgntrAlgo;
    @XmlElement(name = "Sgntr", required = true)
    protected byte[] sgntr;

    /**
     * Obtiene el valor de la propiedad vrsn.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Define el valor de la propiedad vrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad sgnrId.
     * 
     * @return
     *     possible object is
     *     {@link Recipient5Choice }
     *     
     */
    public Recipient5Choice getSgnrId() {
        return sgnrId;
    }

    /**
     * Define el valor de la propiedad sgnrId.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient5Choice }
     *     
     */
    public void setSgnrId(Recipient5Choice value) {
        this.sgnrId = value;
    }

    /**
     * Obtiene el valor de la propiedad dgstAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification21 }
     *     
     */
    public AlgorithmIdentification21 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Define el valor de la propiedad dgstAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification21 }
     *     
     */
    public void setDgstAlgo(AlgorithmIdentification21 value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the sgndAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sgndAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgndAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInformation1 }
     * 
     * 
     */
    public List<GenericInformation1> getSgndAttrbts() {
        if (sgndAttrbts == null) {
            sgndAttrbts = new ArrayList<GenericInformation1>();
        }
        return this.sgndAttrbts;
    }

    /**
     * Obtiene el valor de la propiedad sgntrAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification20 }
     *     
     */
    public AlgorithmIdentification20 getSgntrAlgo() {
        return sgntrAlgo;
    }

    /**
     * Define el valor de la propiedad sgntrAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification20 }
     *     
     */
    public void setSgntrAlgo(AlgorithmIdentification20 value) {
        this.sgntrAlgo = value;
    }

    /**
     * Obtiene el valor de la propiedad sgntr.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSgntr() {
        return sgntr;
    }

    /**
     * Define el valor de la propiedad sgntr.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSgntr(byte[] value) {
        this.sgntr = value;
    }

}
