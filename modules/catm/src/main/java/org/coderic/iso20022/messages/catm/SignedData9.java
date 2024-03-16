//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SignedData9 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SignedData9"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Number" minOccurs="0"/&gt;
 *         &lt;element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}AlgorithmIdentification36" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NcpsltdCntt" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}EncapsulatedContent3" minOccurs="0"/&gt;
 *         &lt;element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max5000Binary" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sgnr" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Signer8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedData9", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "cert",
    "sgnr"
})
public class SignedData9 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo")
    protected List<AlgorithmIdentification36> dgstAlgo;
    @XmlElement(name = "NcpsltdCntt")
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "Sgnr")
    protected List<Signer8> sgnr;

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
     * Gets the value of the dgstAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dgstAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgstAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentification36 }
     * 
     * 
     */
    public List<AlgorithmIdentification36> getDgstAlgo() {
        if (dgstAlgo == null) {
            dgstAlgo = new ArrayList<AlgorithmIdentification36>();
        }
        return this.dgstAlgo;
    }

    /**
     * Obtiene el valor de la propiedad ncpsltdCntt.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Define el valor de la propiedad ncpsltdCntt.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public void setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
    }

    /**
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<byte[]>();
        }
        return this.cert;
    }

    /**
     * Gets the value of the sgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sgnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signer8 }
     * 
     * 
     */
    public List<Signer8> getSgnr() {
        if (sgnr == null) {
            sgnr = new ArrayList<Signer8>();
        }
        return this.sgnr;
    }

}
