//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:51 PM COT 
//


package org.coderic.iso20022.messages.admi;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RequestDetails30 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RequestDetails30"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max35Text"/&gt;
 *         &lt;element name="RqstrId" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}PartyIdentification242Choice" minOccurs="0"/&gt;
 *         &lt;element name="AddtlReqInf" type="{urn:iso:std:iso:20022:tech:xsd:admi.017.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails30", propOrder = {
    "tp",
    "rqstrId",
    "addtlReqInf"
})
public class RequestDetails30 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "RqstrId")
    protected PartyIdentification242Choice rqstrId;
    @XmlElement(name = "AddtlReqInf")
    protected List<String> addtlReqInf;

    /**
     * Obtiene el valor de la propiedad tp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Define el valor de la propiedad tp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Obtiene el valor de la propiedad rqstrId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getRqstrId() {
        return rqstrId;
    }

    /**
     * Define el valor de la propiedad rqstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setRqstrId(PartyIdentification242Choice value) {
        this.rqstrId = value;
    }

    /**
     * Gets the value of the addtlReqInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addtlReqInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlReqInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAddtlReqInf() {
        if (addtlReqInf == null) {
            addtlReqInf = new ArrayList<String>();
        }
        return this.addtlReqInf;
    }

}
