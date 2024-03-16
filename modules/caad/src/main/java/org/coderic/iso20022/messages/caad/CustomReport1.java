//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CustomReport1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CustomReport1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Environment33"/&gt;
 *         &lt;element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Context17" minOccurs="0"/&gt;
 *         &lt;element name="Rpt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ReportData6"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomReport1", propOrder = {
    "envt",
    "cntxt",
    "rpt",
    "splmtryData"
})
public class CustomReport1 {

    @XmlElement(name = "Envt", required = true)
    protected Environment33 envt;
    @XmlElement(name = "Cntxt")
    protected Context17 cntxt;
    @XmlElement(name = "Rpt", required = true)
    protected ReportData6 rpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad envt.
     * 
     * @return
     *     possible object is
     *     {@link Environment33 }
     *     
     */
    public Environment33 getEnvt() {
        return envt;
    }

    /**
     * Define el valor de la propiedad envt.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment33 }
     *     
     */
    public void setEnvt(Environment33 value) {
        this.envt = value;
    }

    /**
     * Obtiene el valor de la propiedad cntxt.
     * 
     * @return
     *     possible object is
     *     {@link Context17 }
     *     
     */
    public Context17 getCntxt() {
        return cntxt;
    }

    /**
     * Define el valor de la propiedad cntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link Context17 }
     *     
     */
    public void setCntxt(Context17 value) {
        this.cntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad rpt.
     * 
     * @return
     *     possible object is
     *     {@link ReportData6 }
     *     
     */
    public ReportData6 getRpt() {
        return rpt;
    }

    /**
     * Define el valor de la propiedad rpt.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportData6 }
     *     
     */
    public void setRpt(ReportData6 value) {
        this.rpt = value;
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
