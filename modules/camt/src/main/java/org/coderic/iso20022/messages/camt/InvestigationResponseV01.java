//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestigationResponseV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InvestigationResponseV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvstgtnRspn" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationResponse3"/&gt;
 *         &lt;element name="OrgnlInvstgtnReq" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}InvestigationRequest3"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.111.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResponseV01", propOrder = {
    "invstgtnRspn",
    "orgnlInvstgtnReq",
    "splmtryData"
})
public class InvestigationResponseV01 {

    @XmlElement(name = "InvstgtnRspn", required = true)
    protected InvestigationResponse3 invstgtnRspn;
    @XmlElement(name = "OrgnlInvstgtnReq", required = true)
    protected InvestigationRequest3 orgnlInvstgtnReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad invstgtnRspn.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationResponse3 }
     *     
     */
    public InvestigationResponse3 getInvstgtnRspn() {
        return invstgtnRspn;
    }

    /**
     * Define el valor de la propiedad invstgtnRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationResponse3 }
     *     
     */
    public void setInvstgtnRspn(InvestigationResponse3 value) {
        this.invstgtnRspn = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlInvstgtnReq.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequest3 }
     *     
     */
    public InvestigationRequest3 getOrgnlInvstgtnReq() {
        return orgnlInvstgtnReq;
    }

    /**
     * Define el valor de la propiedad orgnlInvstgtnReq.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequest3 }
     *     
     */
    public void setOrgnlInvstgtnReq(InvestigationRequest3 value) {
        this.orgnlInvstgtnReq = value;
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
