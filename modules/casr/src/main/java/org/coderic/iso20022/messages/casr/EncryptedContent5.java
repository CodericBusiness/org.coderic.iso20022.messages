//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptedContent5 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncryptedContent5"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CnttTp" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}ContentType2Code"/&gt;
 *         &lt;element name="CnttNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}AlgorithmIdentification25"/&gt;
 *         &lt;element name="NcrptdDataElmt" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}EncryptedDataElement1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedContent5", propOrder = {
    "cnttTp",
    "cnttNcrptnAlgo",
    "ncrptdDataElmt"
})
public class EncryptedContent5 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "CnttNcrptnAlgo", required = true)
    protected AlgorithmIdentification25 cnttNcrptnAlgo;
    @XmlElement(name = "NcrptdDataElmt", required = true)
    protected List<EncryptedDataElement1> ncrptdDataElmt;

    /**
     * Obtiene el valor de la propiedad cnttTp.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Define el valor de la propiedad cnttTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public void setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
    }

    /**
     * Obtiene el valor de la propiedad cnttNcrptnAlgo.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification25 }
     *     
     */
    public AlgorithmIdentification25 getCnttNcrptnAlgo() {
        return cnttNcrptnAlgo;
    }

    /**
     * Define el valor de la propiedad cnttNcrptnAlgo.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification25 }
     *     
     */
    public void setCnttNcrptnAlgo(AlgorithmIdentification25 value) {
        this.cnttNcrptnAlgo = value;
    }

    /**
     * Gets the value of the ncrptdDataElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ncrptdDataElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptdDataElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedDataElement1 }
     * 
     * 
     */
    public List<EncryptedDataElement1> getNcrptdDataElmt() {
        if (ncrptdDataElmt == null) {
            ncrptdDataElmt = new ArrayList<EncryptedDataElement1>();
        }
        return this.ncrptdDataElmt;
    }

}
