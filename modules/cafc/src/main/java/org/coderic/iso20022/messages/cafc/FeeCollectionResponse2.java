//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FeeCollectionResponse2 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FeeCollectionResponse2"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Environment23"/&gt;
 *         &lt;element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Context16" minOccurs="0"/&gt;
 *         &lt;element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Transaction156"/&gt;
 *         &lt;element name="PrcgRslt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ProcessingResult19"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeCollectionResponse2", propOrder = {
    "envt",
    "cntxt",
    "tx",
    "prcgRslt",
    "splmtryData"
})
public class FeeCollectionResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected Environment23 envt;
    @XmlElement(name = "Cntxt")
    protected Context16 cntxt;
    @XmlElement(name = "Tx", required = true)
    protected Transaction156 tx;
    @XmlElement(name = "PrcgRslt", required = true)
    protected ProcessingResult19 prcgRslt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad envt.
     * 
     * @return
     *     possible object is
     *     {@link Environment23 }
     *     
     */
    public Environment23 getEnvt() {
        return envt;
    }

    /**
     * Define el valor de la propiedad envt.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment23 }
     *     
     */
    public void setEnvt(Environment23 value) {
        this.envt = value;
    }

    /**
     * Obtiene el valor de la propiedad cntxt.
     * 
     * @return
     *     possible object is
     *     {@link Context16 }
     *     
     */
    public Context16 getCntxt() {
        return cntxt;
    }

    /**
     * Define el valor de la propiedad cntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link Context16 }
     *     
     */
    public void setCntxt(Context16 value) {
        this.cntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad tx.
     * 
     * @return
     *     possible object is
     *     {@link Transaction156 }
     *     
     */
    public Transaction156 getTx() {
        return tx;
    }

    /**
     * Define el valor de la propiedad tx.
     * 
     * @param value
     *     allowed object is
     *     {@link Transaction156 }
     *     
     */
    public void setTx(Transaction156 value) {
        this.tx = value;
    }

    /**
     * Obtiene el valor de la propiedad prcgRslt.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResult19 }
     *     
     */
    public ProcessingResult19 getPrcgRslt() {
        return prcgRslt;
    }

    /**
     * Define el valor de la propiedad prcgRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResult19 }
     *     
     */
    public void setPrcgRslt(ProcessingResult19 value) {
        this.prcgRslt = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
    }

}
