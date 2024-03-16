//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuthorisationResult13 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuthorisationResult13"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthstnNtty" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}PartyType16Code" minOccurs="0"/&gt;
 *         &lt;element name="AuthstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ResponseType7"/&gt;
 *         &lt;element name="RspnTrac" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ResponseType8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AuthstnCd" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Min6Max8Text" minOccurs="0"/&gt;
 *         &lt;element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Action7" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult13", propOrder = {
    "authstnNtty",
    "authstnRspn",
    "rspnTrac",
    "authstnCd",
    "actn"
})
public class AuthorisationResult13 {

    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType16Code authstnNtty;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected ResponseType7 authstnRspn;
    @XmlElement(name = "RspnTrac")
    protected List<ResponseType8> rspnTrac;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;

    /**
     * Obtiene el valor de la propiedad authstnNtty.
     * 
     * @return
     *     possible object is
     *     {@link PartyType16Code }
     *     
     */
    public PartyType16Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Define el valor de la propiedad authstnNtty.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType16Code }
     *     
     */
    public void setAuthstnNtty(PartyType16Code value) {
        this.authstnNtty = value;
    }

    /**
     * Obtiene el valor de la propiedad authstnRspn.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Define el valor de la propiedad authstnRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public void setAuthstnRspn(ResponseType7 value) {
        this.authstnRspn = value;
    }

    /**
     * Gets the value of the rspnTrac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rspnTrac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnTrac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType8 }
     * 
     * 
     */
    public List<ResponseType8> getRspnTrac() {
        if (rspnTrac == null) {
            rspnTrac = new ArrayList<ResponseType8>();
        }
        return this.rspnTrac;
    }

    /**
     * Obtiene el valor de la propiedad authstnCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnCd() {
        return authstnCd;
    }

    /**
     * Define el valor de la propiedad authstnCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthstnCd(String value) {
        this.authstnCd = value;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<Action7>();
        }
        return this.actn;
    }

}
