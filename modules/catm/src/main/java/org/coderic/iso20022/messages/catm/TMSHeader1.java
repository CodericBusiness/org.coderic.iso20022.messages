//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TMSHeader1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TMSHeader1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DwnldTrf" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}TrueFalseIndicator"/&gt;
 *         &lt;element name="FrmtVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Max6Text"/&gt;
 *         &lt;element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Number"/&gt;
 *         &lt;element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}ISODateTime"/&gt;
 *         &lt;element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}GenericIdentification176"/&gt;
 *         &lt;element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}GenericIdentification177" minOccurs="0"/&gt;
 *         &lt;element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:catm.008.001.07}Traceability8" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMSHeader1", propOrder = {
    "dwnldTrf",
    "frmtVrsn",
    "xchgId",
    "creDtTm",
    "initgPty",
    "rcptPty",
    "tracblt"
})
public class TMSHeader1 {

    @XmlElement(name = "DwnldTrf")
    protected boolean dwnldTrf;
    @XmlElement(name = "FrmtVrsn", required = true)
    protected String frmtVrsn;
    @XmlElement(name = "XchgId", required = true)
    protected BigDecimal xchgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification176 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification177 rcptPty;
    @XmlElement(name = "Tracblt")
    protected List<Traceability8> tracblt;

    /**
     * Obtiene el valor de la propiedad dwnldTrf.
     * 
     */
    public boolean isDwnldTrf() {
        return dwnldTrf;
    }

    /**
     * Define el valor de la propiedad dwnldTrf.
     * 
     */
    public void setDwnldTrf(boolean value) {
        this.dwnldTrf = value;
    }

    /**
     * Obtiene el valor de la propiedad frmtVrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmtVrsn() {
        return frmtVrsn;
    }

    /**
     * Define el valor de la propiedad frmtVrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmtVrsn(String value) {
        this.frmtVrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad xchgId.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgId() {
        return xchgId;
    }

    /**
     * Define el valor de la propiedad xchgId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgId(BigDecimal value) {
        this.xchgId = value;
    }

    /**
     * Obtiene el valor de la propiedad creDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Define el valor de la propiedad creDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Obtiene el valor de la propiedad initgPty.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getInitgPty() {
        return initgPty;
    }

    /**
     * Define el valor de la propiedad initgPty.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setInitgPty(GenericIdentification176 value) {
        this.initgPty = value;
    }

    /**
     * Obtiene el valor de la propiedad rcptPty.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getRcptPty() {
        return rcptPty;
    }

    /**
     * Define el valor de la propiedad rcptPty.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setRcptPty(GenericIdentification177 value) {
        this.rcptPty = value;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability8 }
     * 
     * 
     */
    public List<Traceability8> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<Traceability8>();
        }
        return this.tracblt;
    }

}
