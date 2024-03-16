//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para EncapsulatedBusinessMessage1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EncapsulatedBusinessMessage1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}BusinessApplicationHeader1" minOccurs="0"/&gt;
 *         &lt;element name="Prfx" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="Prtl" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}YesNoIndicator"/&gt;
 *         &lt;element name="Msg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}StrictPayload"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncapsulatedBusinessMessage1", propOrder = {
    "hdr",
    "prfx",
    "prtl",
    "msg"
})
public class EncapsulatedBusinessMessage1 {

    @XmlElement(name = "Hdr")
    protected BusinessApplicationHeader1 hdr;
    @XmlElement(name = "Prfx")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String prfx;
    @XmlElement(name = "Prtl")
    protected boolean prtl;
    @XmlElement(name = "Msg", required = true)
    protected StrictPayload msg;

    /**
     * Obtiene el valor de la propiedad hdr.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public BusinessApplicationHeader1 getHdr() {
        return hdr;
    }

    /**
     * Define el valor de la propiedad hdr.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public void setHdr(BusinessApplicationHeader1 value) {
        this.hdr = value;
    }

    /**
     * Obtiene el valor de la propiedad prfx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfx() {
        return prfx;
    }

    /**
     * Define el valor de la propiedad prfx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrfx(String value) {
        this.prfx = value;
    }

    /**
     * Obtiene el valor de la propiedad prtl.
     * 
     */
    public boolean isPrtl() {
        return prtl;
    }

    /**
     * Define el valor de la propiedad prtl.
     * 
     */
    public void setPrtl(boolean value) {
        this.prtl = value;
    }

    /**
     * Obtiene el valor de la propiedad msg.
     * 
     * @return
     *     possible object is
     *     {@link StrictPayload }
     *     
     */
    public StrictPayload getMsg() {
        return msg;
    }

    /**
     * Define el valor de la propiedad msg.
     * 
     * @param value
     *     allowed object is
     *     {@link StrictPayload }
     *     
     */
    public void setMsg(StrictPayload value) {
        this.msg = value;
    }

}
