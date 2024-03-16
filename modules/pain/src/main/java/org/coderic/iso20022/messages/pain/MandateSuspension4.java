//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:28 PM COT 
//


package org.coderic.iso20022.messages.pain;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MandateSuspension4 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MandateSuspension4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SspnsnReqId" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}Max35Text"/&gt;
 *         &lt;element name="OrgnlMsgInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}OriginalMessageInformation1" minOccurs="0"/&gt;
 *         &lt;element name="SspnsnRsn" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}MandateSuspensionReason3"/&gt;
 *         &lt;element name="OrgnlMndt" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}OriginalMandate10Choice"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.018.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateSuspension4", propOrder = {
    "sspnsnReqId",
    "orgnlMsgInf",
    "sspnsnRsn",
    "orgnlMndt",
    "splmtryData"
})
public class MandateSuspension4 {

    @XmlElement(name = "SspnsnReqId", required = true)
    protected String sspnsnReqId;
    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "SspnsnRsn", required = true)
    protected MandateSuspensionReason3 sspnsnRsn;
    @XmlElement(name = "OrgnlMndt", required = true)
    protected OriginalMandate10Choice orgnlMndt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad sspnsnReqId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSspnsnReqId() {
        return sspnsnReqId;
    }

    /**
     * Define el valor de la propiedad sspnsnReqId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSspnsnReqId(String value) {
        this.sspnsnReqId = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlMsgInf.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public OriginalMessageInformation1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Define el valor de la propiedad orgnlMsgInf.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public void setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
    }

    /**
     * Obtiene el valor de la propiedad sspnsnRsn.
     * 
     * @return
     *     possible object is
     *     {@link MandateSuspensionReason3 }
     *     
     */
    public MandateSuspensionReason3 getSspnsnRsn() {
        return sspnsnRsn;
    }

    /**
     * Define el valor de la propiedad sspnsnRsn.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateSuspensionReason3 }
     *     
     */
    public void setSspnsnRsn(MandateSuspensionReason3 value) {
        this.sspnsnRsn = value;
    }

    /**
     * Obtiene el valor de la propiedad orgnlMndt.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMandate10Choice }
     *     
     */
    public OriginalMandate10Choice getOrgnlMndt() {
        return orgnlMndt;
    }

    /**
     * Define el valor de la propiedad orgnlMndt.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMandate10Choice }
     *     
     */
    public void setOrgnlMndt(OriginalMandate10Choice value) {
        this.orgnlMndt = value;
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
