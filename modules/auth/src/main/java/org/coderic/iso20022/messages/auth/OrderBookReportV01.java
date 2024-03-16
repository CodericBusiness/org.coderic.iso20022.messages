//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderBookReportV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrderBookReportV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RptHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesMarketReportHeader3"/&gt;
 *         &lt;element name="OrdrRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}OrderReport2Choice" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderBookReportV01", propOrder = {
    "rptHdr",
    "ordrRpt",
    "splmtryData"
})
public class OrderBookReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SecuritiesMarketReportHeader3 rptHdr;
    @XmlElement(name = "OrdrRpt", required = true)
    protected List<OrderReport2Choice> ordrRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad rptHdr.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMarketReportHeader3 }
     *     
     */
    public SecuritiesMarketReportHeader3 getRptHdr() {
        return rptHdr;
    }

    /**
     * Define el valor de la propiedad rptHdr.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMarketReportHeader3 }
     *     
     */
    public void setRptHdr(SecuritiesMarketReportHeader3 value) {
        this.rptHdr = value;
    }

    /**
     * Gets the value of the ordrRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ordrRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderReport2Choice }
     * 
     * 
     */
    public List<OrderReport2Choice> getOrdrRpt() {
        if (ordrRpt == null) {
            ordrRpt = new ArrayList<OrderReport2Choice>();
        }
        return this.ordrRpt;
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
