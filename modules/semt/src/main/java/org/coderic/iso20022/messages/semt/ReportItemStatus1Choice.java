//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportItemStatus1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ReportItemStatus1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}NoReasonCode"/&gt;
 *         &lt;element name="AccptdWthXcptn" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemStatus1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:semt.042.001.01}ReportItemStatus1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportItemStatus1Choice", propOrder = {
    "accptd",
    "accptdWthXcptn",
    "rjctd"
})
public class ReportItemStatus1Choice {

    @XmlElement(name = "Accptd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode accptd;
    @XmlElement(name = "AccptdWthXcptn")
    protected List<ReportItemStatus1> accptdWthXcptn;
    @XmlElement(name = "Rjctd")
    protected ReportItemStatus1 rjctd;

    /**
     * Obtiene el valor de la propiedad accptd.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getAccptd() {
        return accptd;
    }

    /**
     * Define el valor de la propiedad accptd.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setAccptd(NoReasonCode value) {
        this.accptd = value;
    }

    /**
     * Gets the value of the accptdWthXcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accptdWthXcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccptdWthXcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportItemStatus1 }
     * 
     * 
     */
    public List<ReportItemStatus1> getAccptdWthXcptn() {
        if (accptdWthXcptn == null) {
            accptdWthXcptn = new ArrayList<ReportItemStatus1>();
        }
        return this.accptdWthXcptn;
    }

    /**
     * Obtiene el valor de la propiedad rjctd.
     * 
     * @return
     *     possible object is
     *     {@link ReportItemStatus1 }
     *     
     */
    public ReportItemStatus1 getRjctd() {
        return rjctd;
    }

    /**
     * Define el valor de la propiedad rjctd.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportItemStatus1 }
     *     
     */
    public void setRjctd(ReportItemStatus1 value) {
        this.rjctd = value;
    }

}
