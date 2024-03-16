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
 * <p>Clase Java para RemittanceLocationAdviceV03 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RemittanceLocationAdviceV03"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GrpHdr" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}GroupHeader122"/&gt;
 *         &lt;element name="RmtLctn" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}RemittanceLocation10" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:remt.002.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemittanceLocationAdviceV03", propOrder = {
    "grpHdr",
    "rmtLctn",
    "splmtryData"
})
public class RemittanceLocationAdviceV03 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader122 grpHdr;
    @XmlElement(name = "RmtLctn", required = true)
    protected List<RemittanceLocation10> rmtLctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad grpHdr.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader122 }
     *     
     */
    public GroupHeader122 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Define el valor de la propiedad grpHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader122 }
     *     
     */
    public void setGrpHdr(GroupHeader122 value) {
        this.grpHdr = value;
    }

    /**
     * Gets the value of the rmtLctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rmtLctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRmtLctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLocation10 }
     * 
     * 
     */
    public List<RemittanceLocation10> getRmtLctn() {
        if (rmtLctn == null) {
            rmtLctn = new ArrayList<RemittanceLocation10>();
        }
        return this.rmtLctn;
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
