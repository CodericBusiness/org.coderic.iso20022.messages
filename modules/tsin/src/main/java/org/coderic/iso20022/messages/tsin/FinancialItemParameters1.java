//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:57 PM COT 
//


package org.coderic.iso20022.messages.tsin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancialItemParameters1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FinancialItemParameters1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max35Text"/&gt;
 *         &lt;element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate"/&gt;
 *         &lt;element name="RltdItm" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DocPurp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ExternalDocumentPurpose1Code" minOccurs="0"/&gt;
 *         &lt;element name="LangCd" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}LanguageCode" minOccurs="0"/&gt;
 *         &lt;element name="Issr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Rcpt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Buyr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Sellr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="SellrFinAgt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="BuyrFinAgt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="GovngCtrct" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LglCntxt" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element name="DbtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}AccountIdentification4Choice" minOccurs="0"/&gt;
 *         &lt;element name="CdtAcct" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}AccountIdentification4Choice" minOccurs="0"/&gt;
 *         &lt;element name="TradMkt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}TradeMarket1Choice" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialItemParameters1", propOrder = {
    "idr",
    "isseDt",
    "rltdItm",
    "docPurp",
    "langCd",
    "issr",
    "rcpt",
    "buyr",
    "sellr",
    "sellrFinAgt",
    "buyrFinAgt",
    "govngCtrct",
    "lglCntxt",
    "ccy",
    "dbtAcct",
    "cdtAcct",
    "tradMkt"
})
public class FinancialItemParameters1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElementRef(name = "RltdItm", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdItm;
    @XmlElement(name = "DocPurp")
    protected String docPurp;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "Rcpt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Buyr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object buyr;
    @XmlElement(name = "Sellr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sellr;
    @XmlElement(name = "SellrFinAgt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object sellrFinAgt;
    @XmlElement(name = "BuyrFinAgt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object buyrFinAgt;
    @XmlElementRef(name = "GovngCtrct", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> govngCtrct;
    @XmlElement(name = "LglCntxt")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object lglCntxt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "DbtAcct")
    protected AccountIdentification4Choice dbtAcct;
    @XmlElement(name = "CdtAcct")
    protected AccountIdentification4Choice cdtAcct;
    @XmlElement(name = "TradMkt")
    protected TradeMarket1Choice tradMkt;

    /**
     * Obtiene el valor de la propiedad idr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Define el valor de la propiedad idr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

    /**
     * Obtiene el valor de la propiedad isseDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Define el valor de la propiedad isseDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the rltdItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltdItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRltdItm() {
        if (rltdItm == null) {
            rltdItm = new ArrayList<JAXBElement<Object>>();
        }
        return this.rltdItm;
    }

    /**
     * Obtiene el valor de la propiedad docPurp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPurp() {
        return docPurp;
    }

    /**
     * Define el valor de la propiedad docPurp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPurp(String value) {
        this.docPurp = value;
    }

    /**
     * Obtiene el valor de la propiedad langCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Define el valor de la propiedad langCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

    /**
     * Obtiene el valor de la propiedad issr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIssr() {
        return issr;
    }

    /**
     * Define el valor de la propiedad issr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIssr(Object value) {
        this.issr = value;
    }

    /**
     * Obtiene el valor de la propiedad rcpt.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Define el valor de la propiedad rcpt.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRcpt(Object value) {
        this.rcpt = value;
    }

    /**
     * Obtiene el valor de la propiedad buyr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyr() {
        return buyr;
    }

    /**
     * Define el valor de la propiedad buyr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuyr(Object value) {
        this.buyr = value;
    }

    /**
     * Obtiene el valor de la propiedad sellr.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSellr() {
        return sellr;
    }

    /**
     * Define el valor de la propiedad sellr.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSellr(Object value) {
        this.sellr = value;
    }

    /**
     * Obtiene el valor de la propiedad sellrFinAgt.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSellrFinAgt() {
        return sellrFinAgt;
    }

    /**
     * Define el valor de la propiedad sellrFinAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSellrFinAgt(Object value) {
        this.sellrFinAgt = value;
    }

    /**
     * Obtiene el valor de la propiedad buyrFinAgt.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBuyrFinAgt() {
        return buyrFinAgt;
    }

    /**
     * Define el valor de la propiedad buyrFinAgt.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBuyrFinAgt(Object value) {
        this.buyrFinAgt = value;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<JAXBElement<Object>>();
        }
        return this.govngCtrct;
    }

    /**
     * Obtiene el valor de la propiedad lglCntxt.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLglCntxt() {
        return lglCntxt;
    }

    /**
     * Define el valor de la propiedad lglCntxt.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLglCntxt(Object value) {
        this.lglCntxt = value;
    }

    /**
     * Obtiene el valor de la propiedad ccy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Define el valor de la propiedad ccy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Obtiene el valor de la propiedad dbtAcct.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getDbtAcct() {
        return dbtAcct;
    }

    /**
     * Define el valor de la propiedad dbtAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setDbtAcct(AccountIdentification4Choice value) {
        this.dbtAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad cdtAcct.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCdtAcct() {
        return cdtAcct;
    }

    /**
     * Define el valor de la propiedad cdtAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setCdtAcct(AccountIdentification4Choice value) {
        this.cdtAcct = value;
    }

    /**
     * Obtiene el valor de la propiedad tradMkt.
     * 
     * @return
     *     possible object is
     *     {@link TradeMarket1Choice }
     *     
     */
    public TradeMarket1Choice getTradMkt() {
        return tradMkt;
    }

    /**
     * Define el valor de la propiedad tradMkt.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeMarket1Choice }
     *     
     */
    public void setTradMkt(TradeMarket1Choice value) {
        this.tradMkt = value;
    }

}
