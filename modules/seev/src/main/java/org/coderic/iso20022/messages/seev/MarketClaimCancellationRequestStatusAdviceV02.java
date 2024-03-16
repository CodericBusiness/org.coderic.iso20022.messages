//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MarketClaimCancellationRequestStatusAdviceV02 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MarketClaimCancellationRequestStatusAdviceV02"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MktClmCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}DocumentIdentification9"/&gt;
 *         &lt;element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}References26"/&gt;
 *         &lt;element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CorporateActionGeneralInformation157"/&gt;
 *         &lt;element name="MktClmCxlReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}MarketClaimCancellationRequestStatus1Choice"/&gt;
 *         &lt;element name="MktClmDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CorporateActionOption217" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketClaimCancellationRequestStatusAdviceV02", propOrder = {
    "mktClmCxlReqId",
    "txRef",
    "corpActnGnlInf",
    "mktClmCxlReqSts",
    "mktClmDtls",
    "splmtryData"
})
public class MarketClaimCancellationRequestStatusAdviceV02 {

    @XmlElement(name = "MktClmCxlReqId", required = true)
    protected DocumentIdentification9 mktClmCxlReqId;
    @XmlElement(name = "TxRef", required = true)
    protected References26 txRef;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionGeneralInformation157 corpActnGnlInf;
    @XmlElement(name = "MktClmCxlReqSts", required = true)
    protected MarketClaimCancellationRequestStatus1Choice mktClmCxlReqSts;
    @XmlElement(name = "MktClmDtls")
    protected CorporateActionOption217 mktClmDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Obtiene el valor de la propiedad mktClmCxlReqId.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public DocumentIdentification9 getMktClmCxlReqId() {
        return mktClmCxlReqId;
    }

    /**
     * Define el valor de la propiedad mktClmCxlReqId.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification9 }
     *     
     */
    public void setMktClmCxlReqId(DocumentIdentification9 value) {
        this.mktClmCxlReqId = value;
    }

    /**
     * Obtiene el valor de la propiedad txRef.
     * 
     * @return
     *     possible object is
     *     {@link References26 }
     *     
     */
    public References26 getTxRef() {
        return txRef;
    }

    /**
     * Define el valor de la propiedad txRef.
     * 
     * @param value
     *     allowed object is
     *     {@link References26 }
     *     
     */
    public void setTxRef(References26 value) {
        this.txRef = value;
    }

    /**
     * Obtiene el valor de la propiedad corpActnGnlInf.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformation157 }
     *     
     */
    public CorporateActionGeneralInformation157 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Define el valor de la propiedad corpActnGnlInf.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformation157 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionGeneralInformation157 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Obtiene el valor de la propiedad mktClmCxlReqSts.
     * 
     * @return
     *     possible object is
     *     {@link MarketClaimCancellationRequestStatus1Choice }
     *     
     */
    public MarketClaimCancellationRequestStatus1Choice getMktClmCxlReqSts() {
        return mktClmCxlReqSts;
    }

    /**
     * Define el valor de la propiedad mktClmCxlReqSts.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketClaimCancellationRequestStatus1Choice }
     *     
     */
    public void setMktClmCxlReqSts(MarketClaimCancellationRequestStatus1Choice value) {
        this.mktClmCxlReqSts = value;
    }

    /**
     * Obtiene el valor de la propiedad mktClmDtls.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption217 }
     *     
     */
    public CorporateActionOption217 getMktClmDtls() {
        return mktClmDtls;
    }

    /**
     * Define el valor de la propiedad mktClmDtls.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption217 }
     *     
     */
    public void setMktClmDtls(CorporateActionOption217 value) {
        this.mktClmDtls = value;
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
