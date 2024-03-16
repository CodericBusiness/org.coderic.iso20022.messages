//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyEventAdviceV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartyEventAdviceV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}BusinessLetter1"/&gt;
 *         &lt;element name="EvtNtce" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}EventDescription1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="EvtCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max15NumericText" minOccurs="0"/&gt;
 *         &lt;element name="AttchdMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}EncapsulatedBusinessMessage1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyEventAdviceV01", propOrder = {
    "hdr",
    "evtNtce",
    "evtCnt",
    "attchdMsg"
})
public class PartyEventAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "EvtNtce", required = true)
    protected List<EventDescription1> evtNtce;
    @XmlElement(name = "EvtCnt")
    protected String evtCnt;
    @XmlElement(name = "AttchdMsg")
    protected List<EncapsulatedBusinessMessage1> attchdMsg;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLetter1 }
     *     
     */
    public BusinessLetter1 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLetter1 }
     *     
     */
    public void setHdr(BusinessLetter1 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the evtNtce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the evtNtce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtNtce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDescription1 }
     * 
     * 
     */
    public List<EventDescription1> getEvtNtce() {
        if (evtNtce == null) {
            evtNtce = new ArrayList<EventDescription1>();
        }
        return this.evtNtce;
    }

    /**
     * Obtiene el valor de la propiedad evtCnt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCnt() {
        return evtCnt;
    }

    /**
     * Define el valor de la propiedad evtCnt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtCnt(String value) {
        this.evtCnt = value;
    }

    /**
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attchdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedBusinessMessage1 }
     * 
     * 
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<EncapsulatedBusinessMessage1>();
        }
        return this.attchdMsg;
    }

}
