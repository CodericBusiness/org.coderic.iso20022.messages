//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardPaymentDataSet36 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CardPaymentDataSet36"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}DataSetIdentification5"/&gt;
 *         &lt;element name="DataSetRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}ResponseType10"/&gt;
 *         &lt;element name="RmvDataSet" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TrueFalseIndicator"/&gt;
 *         &lt;element name="DataSetInitr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}GenericIdentification176" minOccurs="0"/&gt;
 *         &lt;element name="TxTtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}TransactionTotals12" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RjctdTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentDataSet35" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SspdTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentDataSet35" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RsmdApprvl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentDataSet35" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RsmdRjctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.027.001.01}CardPaymentDataSet35" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet36", propOrder = {
    "dataSetId",
    "dataSetRslt",
    "rmvDataSet",
    "dataSetInitr",
    "txTtls",
    "rjctdTx",
    "sspdTx",
    "rsmdApprvl",
    "rsmdRjctn"
})
public class CardPaymentDataSet36 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification5 dataSetId;
    @XmlElement(name = "DataSetRslt", required = true)
    protected ResponseType10 dataSetRslt;
    @XmlElement(name = "RmvDataSet")
    protected boolean rmvDataSet;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification176 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "RjctdTx")
    protected List<CardPaymentDataSet35> rjctdTx;
    @XmlElement(name = "SspdTx")
    protected List<CardPaymentDataSet35> sspdTx;
    @XmlElement(name = "RsmdApprvl")
    protected List<CardPaymentDataSet35> rsmdApprvl;
    @XmlElement(name = "RsmdRjctn")
    protected List<CardPaymentDataSet35> rsmdRjctn;

    /**
     * Obtiene el valor de la propiedad dataSetId.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification5 }
     *     
     */
    public DataSetIdentification5 getDataSetId() {
        return dataSetId;
    }

    /**
     * Define el valor de la propiedad dataSetId.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification5 }
     *     
     */
    public void setDataSetId(DataSetIdentification5 value) {
        this.dataSetId = value;
    }

    /**
     * Obtiene el valor de la propiedad dataSetRslt.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getDataSetRslt() {
        return dataSetRslt;
    }

    /**
     * Define el valor de la propiedad dataSetRslt.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public void setDataSetRslt(ResponseType10 value) {
        this.dataSetRslt = value;
    }

    /**
     * Obtiene el valor de la propiedad rmvDataSet.
     * 
     */
    public boolean isRmvDataSet() {
        return rmvDataSet;
    }

    /**
     * Define el valor de la propiedad rmvDataSet.
     * 
     */
    public void setRmvDataSet(boolean value) {
        this.rmvDataSet = value;
    }

    /**
     * Obtiene el valor de la propiedad dataSetInitr.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getDataSetInitr() {
        return dataSetInitr;
    }

    /**
     * Define el valor de la propiedad dataSetInitr.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setDataSetInitr(GenericIdentification176 value) {
        this.dataSetInitr = value;
    }

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals12 }
     * 
     * 
     */
    public List<TransactionTotals12> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<TransactionTotals12>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the rjctdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rjctdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet35 }
     * 
     * 
     */
    public List<CardPaymentDataSet35> getRjctdTx() {
        if (rjctdTx == null) {
            rjctdTx = new ArrayList<CardPaymentDataSet35>();
        }
        return this.rjctdTx;
    }

    /**
     * Gets the value of the sspdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sspdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSspdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet35 }
     * 
     * 
     */
    public List<CardPaymentDataSet35> getSspdTx() {
        if (sspdTx == null) {
            sspdTx = new ArrayList<CardPaymentDataSet35>();
        }
        return this.sspdTx;
    }

    /**
     * Gets the value of the rsmdApprvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rsmdApprvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsmdApprvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet35 }
     * 
     * 
     */
    public List<CardPaymentDataSet35> getRsmdApprvl() {
        if (rsmdApprvl == null) {
            rsmdApprvl = new ArrayList<CardPaymentDataSet35>();
        }
        return this.rsmdApprvl;
    }

    /**
     * Gets the value of the rsmdRjctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rsmdRjctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsmdRjctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet35 }
     * 
     * 
     */
    public List<CardPaymentDataSet35> getRsmdRjctn() {
        if (rsmdRjctn == null) {
            rsmdRjctn = new ArrayList<CardPaymentDataSet35>();
        }
        return this.rsmdRjctn;
    }

}
