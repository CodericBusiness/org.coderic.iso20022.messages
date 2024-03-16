//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:12 PM COT 
//


package org.coderic.iso20022.messages.colr;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TripartyCollateralAllegementNotificationCancellationAdviceV01 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TripartyCollateralAllegementNotificationCancellationAdviceV01"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TxInstrId" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}TransactionIdentifications44"/&gt;
 *         &lt;element name="CollTxTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}CollateralTransactionType1Choice"/&gt;
 *         &lt;element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}ExposureType23Choice"/&gt;
 *         &lt;element name="CollSd" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}CollateralRole1Code"/&gt;
 *         &lt;element name="ElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}GenericIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}CollateralParties8"/&gt;
 *         &lt;element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}AmountAndDirection49" minOccurs="0"/&gt;
 *         &lt;element name="ReqdExctnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}DateAndDateTime2Choice" minOccurs="0"/&gt;
 *         &lt;element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:colr.024.001.01}SupplementaryData1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripartyCollateralAllegementNotificationCancellationAdviceV01", propOrder = {
    "txInstrId",
    "collTxTp",
    "xpsrTp",
    "collSd",
    "elgbltySetPrfl",
    "collPties",
    "txAmt",
    "reqdExctnDt",
    "splmtryData"
})
public class TripartyCollateralAllegementNotificationCancellationAdviceV01 {

    @XmlElement(name = "TxInstrId", required = true)
    protected TransactionIdentifications44 txInstrId;
    @XmlElement(name = "CollTxTp", required = true)
    protected CollateralTransactionType1Choice collTxTp;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "CollSd", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralRole1Code collSd;
    @XmlElement(name = "ElgbltySetPrfl")
    protected GenericIdentification1 elgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties8 collPties;
    @XmlElement(name = "TxAmt")
    protected AmountAndDirection49 txAmt;
    @XmlElement(name = "ReqdExctnDt")
    protected DateAndDateTime2Choice reqdExctnDt;
    @XmlElement(name = "SplmtryData")
    protected SupplementaryData1 splmtryData;

    /**
     * Obtiene el valor de la propiedad txInstrId.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public TransactionIdentifications44 getTxInstrId() {
        return txInstrId;
    }

    /**
     * Define el valor de la propiedad txInstrId.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifications44 }
     *     
     */
    public void setTxInstrId(TransactionIdentifications44 value) {
        this.txInstrId = value;
    }

    /**
     * Obtiene el valor de la propiedad collTxTp.
     * 
     * @return
     *     possible object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public CollateralTransactionType1Choice getCollTxTp() {
        return collTxTp;
    }

    /**
     * Define el valor de la propiedad collTxTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralTransactionType1Choice }
     *     
     */
    public void setCollTxTp(CollateralTransactionType1Choice value) {
        this.collTxTp = value;
    }

    /**
     * Obtiene el valor de la propiedad xpsrTp.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Define el valor de la propiedad xpsrTp.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public void setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Obtiene el valor de la propiedad collSd.
     * 
     * @return
     *     possible object is
     *     {@link CollateralRole1Code }
     *     
     */
    public CollateralRole1Code getCollSd() {
        return collSd;
    }

    /**
     * Define el valor de la propiedad collSd.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralRole1Code }
     *     
     */
    public void setCollSd(CollateralRole1Code value) {
        this.collSd = value;
    }

    /**
     * Obtiene el valor de la propiedad elgbltySetPrfl.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getElgbltySetPrfl() {
        return elgbltySetPrfl;
    }

    /**
     * Define el valor de la propiedad elgbltySetPrfl.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setElgbltySetPrfl(GenericIdentification1 value) {
        this.elgbltySetPrfl = value;
    }

    /**
     * Obtiene el valor de la propiedad collPties.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties8 }
     *     
     */
    public CollateralParties8 getCollPties() {
        return collPties;
    }

    /**
     * Define el valor de la propiedad collPties.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties8 }
     *     
     */
    public void setCollPties(CollateralParties8 value) {
        this.collPties = value;
    }

    /**
     * Obtiene el valor de la propiedad txAmt.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public AmountAndDirection49 getTxAmt() {
        return txAmt;
    }

    /**
     * Define el valor de la propiedad txAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection49 }
     *     
     */
    public void setTxAmt(AmountAndDirection49 value) {
        this.txAmt = value;
    }

    /**
     * Obtiene el valor de la propiedad reqdExctnDt.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getReqdExctnDt() {
        return reqdExctnDt;
    }

    /**
     * Define el valor de la propiedad reqdExctnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setReqdExctnDt(DateAndDateTime2Choice value) {
        this.reqdExctnDt = value;
    }

    /**
     * Obtiene el valor de la propiedad splmtryData.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryData1 }
     *     
     */
    public SupplementaryData1 getSplmtryData() {
        return splmtryData;
    }

    /**
     * Define el valor de la propiedad splmtryData.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryData1 }
     *     
     */
    public void setSplmtryData(SupplementaryData1 value) {
        this.splmtryData = value;
    }

}
