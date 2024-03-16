//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EnvelopedData11 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EnvelopedData11"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Number" minOccurs="0"/&gt;
 *         &lt;element name="OrgtrInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}OriginatorInformation1" minOccurs="0"/&gt;
 *         &lt;element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}Recipient15Choice" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NcrptdCntt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.06}EncryptedContent7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopedData11", propOrder = {
    "vrsn",
    "orgtrInf",
    "rcpt",
    "ncrptdCntt"
})
public class EnvelopedData11 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "OrgtrInf")
    protected OriginatorInformation1 orgtrInf;
    @XmlElement(name = "Rcpt", required = true)
    protected List<Recipient15Choice> rcpt;
    @XmlElement(name = "NcrptdCntt")
    protected EncryptedContent7 ncrptdCntt;

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
     * Obtiene el valor de la propiedad orgtrInf.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorInformation1 }
     *     
     */
    public OriginatorInformation1 getOrgtrInf() {
        return orgtrInf;
    }

    /**
     * Define el valor de la propiedad orgtrInf.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorInformation1 }
     *     
     */
    public void setOrgtrInf(OriginatorInformation1 value) {
        this.orgtrInf = value;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Recipient15Choice }
     * 
     * 
     */
    public List<Recipient15Choice> getRcpt() {
        if (rcpt == null) {
            rcpt = new ArrayList<Recipient15Choice>();
        }
        return this.rcpt;
    }

    /**
     * Obtiene el valor de la propiedad ncrptdCntt.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedContent7 }
     *     
     */
    public EncryptedContent7 getNcrptdCntt() {
        return ncrptdCntt;
    }

    /**
     * Define el valor de la propiedad ncrptdCntt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedContent7 }
     *     
     */
    public void setNcrptdCntt(EncryptedContent7 value) {
        this.ncrptdCntt = value;
    }

}
