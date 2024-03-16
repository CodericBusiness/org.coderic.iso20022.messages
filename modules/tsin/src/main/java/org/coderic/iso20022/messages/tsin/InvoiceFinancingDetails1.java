//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvoiceFinancingDetails1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFinancingDetails1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrgnlInvcInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}OriginalInvoiceInformation1"/&gt;
 *         &lt;element name="Spplr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}PartyIdentification8" minOccurs="0"/&gt;
 *         &lt;element name="InvcFincgRslt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}FinancingResult1"/&gt;
 *         &lt;element name="InstlmtFincgInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}InstalmentFinancingInformation1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFinancingDetails1", propOrder = {
    "orgnlInvcInf",
    "spplr",
    "invcFincgRslt",
    "instlmtFincgInf"
})
public class InvoiceFinancingDetails1 {

    @XmlElement(name = "OrgnlInvcInf", required = true)
    protected OriginalInvoiceInformation1 orgnlInvcInf;
    @XmlElement(name = "Spplr")
    protected PartyIdentification8 spplr;
    @XmlElement(name = "InvcFincgRslt", required = true)
    protected FinancingResult1 invcFincgRslt;
    @XmlElement(name = "InstlmtFincgInf")
    protected List<InstalmentFinancingInformation1> instlmtFincgInf;

    /**
     * Obtiene el valor de la propiedad orgnlInvcInf.
     * 
     * @return
     *     possible object is
     *     {@link OriginalInvoiceInformation1 }
     *     
     */
    public OriginalInvoiceInformation1 getOrgnlInvcInf() {
        return orgnlInvcInf;
    }

    /**
     * Define el valor de la propiedad orgnlInvcInf.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalInvoiceInformation1 }
     *     
     */
    public void setOrgnlInvcInf(OriginalInvoiceInformation1 value) {
        this.orgnlInvcInf = value;
    }

    /**
     * Obtiene el valor de la propiedad spplr.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8 }
     *     
     */
    public PartyIdentification8 getSpplr() {
        return spplr;
    }

    /**
     * Define el valor de la propiedad spplr.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8 }
     *     
     */
    public void setSpplr(PartyIdentification8 value) {
        this.spplr = value;
    }

    /**
     * Obtiene el valor de la propiedad invcFincgRslt.
     * 
     * @return
     *     possible object is
     *     {@link FinancingResult1 }
     *     
     */
    public FinancingResult1 getInvcFincgRslt() {
        return invcFincgRslt;
    }

    /**
     * Define el valor de la propiedad invcFincgRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingResult1 }
     *     
     */
    public void setInvcFincgRslt(FinancingResult1 value) {
        this.invcFincgRslt = value;
    }

    /**
     * Gets the value of the instlmtFincgInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the instlmtFincgInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtFincgInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentFinancingInformation1 }
     * 
     * 
     */
    public List<InstalmentFinancingInformation1> getInstlmtFincgInf() {
        if (instlmtFincgInf == null) {
            instlmtFincgInf = new ArrayList<InstalmentFinancingInformation1>();
        }
        return this.instlmtFincgInf;
    }

}
