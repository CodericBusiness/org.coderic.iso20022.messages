//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MarketClaimCancellationRequestStatus1Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MarketClaimCancellationRequestStatus1Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CxlCmpltd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CancelledStatus11Choice"/&gt;
 *         &lt;element name="Accptd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}NoSpecifiedReason1"/&gt;
 *         &lt;element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}RejectedStatus38Choice"/&gt;
 *         &lt;element name="PdgCxl" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}PendingCancellationStatus11Choice"/&gt;
 *         &lt;element name="PrtrySts" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}ProprietaryStatusAndReason6"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCancellationRequestStatus1Choice", propOrder = {
    "cxlCmpltd",
    "accptd",
    "rjctd",
    "pdgCxl",
    "prtrySts"
})
public class MarketClaimCancellationRequestStatus1Choice {

    @XmlElement(name = "CxlCmpltd")
    protected CancelledStatus11Choice cxlCmpltd;
    @XmlElement(name = "Accptd")
    protected NoSpecifiedReason1 accptd;
    @XmlElement(name = "Rjctd")
    protected RejectedStatus38Choice rjctd;
    @XmlElement(name = "PdgCxl")
    protected PendingCancellationStatus11Choice pdgCxl;
    @XmlElement(name = "PrtrySts")
    protected ProprietaryStatusAndReason6 prtrySts;

    /**
     * Obtiene el valor de la propiedad cxlCmpltd.
     * 
     * @return
     *     possible object is
     *     {@link CancelledStatus11Choice }
     *     
     */
    public CancelledStatus11Choice getCxlCmpltd() {
        return cxlCmpltd;
    }

    /**
     * Define el valor de la propiedad cxlCmpltd.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelledStatus11Choice }
     *     
     */
    public void setCxlCmpltd(CancelledStatus11Choice value) {
        this.cxlCmpltd = value;
    }

    /**
     * Obtiene el valor de la propiedad accptd.
     * 
     * @return
     *     possible object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public NoSpecifiedReason1 getAccptd() {
        return accptd;
    }

    /**
     * Define el valor de la propiedad accptd.
     * 
     * @param value
     *     allowed object is
     *     {@link NoSpecifiedReason1 }
     *     
     */
    public void setAccptd(NoSpecifiedReason1 value) {
        this.accptd = value;
    }

    /**
     * Obtiene el valor de la propiedad rjctd.
     * 
     * @return
     *     possible object is
     *     {@link RejectedStatus38Choice }
     *     
     */
    public RejectedStatus38Choice getRjctd() {
        return rjctd;
    }

    /**
     * Define el valor de la propiedad rjctd.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectedStatus38Choice }
     *     
     */
    public void setRjctd(RejectedStatus38Choice value) {
        this.rjctd = value;
    }

    /**
     * Obtiene el valor de la propiedad pdgCxl.
     * 
     * @return
     *     possible object is
     *     {@link PendingCancellationStatus11Choice }
     *     
     */
    public PendingCancellationStatus11Choice getPdgCxl() {
        return pdgCxl;
    }

    /**
     * Define el valor de la propiedad pdgCxl.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingCancellationStatus11Choice }
     *     
     */
    public void setPdgCxl(PendingCancellationStatus11Choice value) {
        this.pdgCxl = value;
    }

    /**
     * Obtiene el valor de la propiedad prtrySts.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtrySts() {
        return prtrySts;
    }

    /**
     * Define el valor de la propiedad prtrySts.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtrySts(ProprietaryStatusAndReason6 value) {
        this.prtrySts = value;
    }

}
