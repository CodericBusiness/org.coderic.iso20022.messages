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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para QualifiedDocumentInformation1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QualifiedDocumentInformation1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="Issr" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="ItmListIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="ItmIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max35Text" minOccurs="0"/&gt;
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ISODate" minOccurs="0"/&gt;
 *         &lt;element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max6Text" minOccurs="0"/&gt;
 *         &lt;element name="ElctrncOrgnl" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}YesNoIndicator"/&gt;
 *         &lt;element name="Dgst" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}AlgorithmAndDigest1" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="DocTp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}ExternalDocumentType1Code" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}Max2048Text" minOccurs="0"/&gt;
 *         &lt;element name="AttchdFile" type="{urn:iso:std:iso:20022:tech:xsd:tsin.013.001.01}BinaryFile1" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedDocumentInformation1", propOrder = {
    "id",
    "issr",
    "itmListIdr",
    "itmIdr",
    "dt",
    "vrsn",
    "elctrncOrgnl",
    "dgst",
    "docTp",
    "url",
    "attchdFile"
})
public class QualifiedDocumentInformation1 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Issr")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object issr;
    @XmlElement(name = "ItmListIdr")
    protected String itmListIdr;
    @XmlElement(name = "ItmIdr")
    protected String itmIdr;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ElctrncOrgnl")
    protected boolean elctrncOrgnl;
    @XmlElement(name = "Dgst")
    protected List<AlgorithmAndDigest1> dgst;
    @XmlElement(name = "DocTp")
    protected String docTp;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "AttchdFile")
    protected List<BinaryFile1> attchdFile;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Obtiene el valor de la propiedad itmListIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmListIdr() {
        return itmListIdr;
    }

    /**
     * Define el valor de la propiedad itmListIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmListIdr(String value) {
        this.itmListIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad itmIdr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmIdr() {
        return itmIdr;
    }

    /**
     * Define el valor de la propiedad itmIdr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmIdr(String value) {
        this.itmIdr = value;
    }

    /**
     * Obtiene el valor de la propiedad dt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Define el valor de la propiedad dt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Obtiene el valor de la propiedad vrsn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Define el valor de la propiedad vrsn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Obtiene el valor de la propiedad elctrncOrgnl.
     * 
     */
    public boolean isElctrncOrgnl() {
        return elctrncOrgnl;
    }

    /**
     * Define el valor de la propiedad elctrncOrgnl.
     * 
     */
    public void setElctrncOrgnl(boolean value) {
        this.elctrncOrgnl = value;
    }

    /**
     * Gets the value of the dgst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dgst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmAndDigest1 }
     * 
     * 
     */
    public List<AlgorithmAndDigest1> getDgst() {
        if (dgst == null) {
            dgst = new ArrayList<AlgorithmAndDigest1>();
        }
        return this.dgst;
    }

    /**
     * Obtiene el valor de la propiedad docTp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Define el valor de la propiedad docTp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTp(String value) {
        this.docTp = value;
    }

    /**
     * Obtiene el valor de la propiedad url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Define el valor de la propiedad url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the attchdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attchdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryFile1 }
     * 
     * 
     */
    public List<BinaryFile1> getAttchdFile() {
        if (attchdFile == null) {
            attchdFile = new ArrayList<BinaryFile1>();
        }
        return this.attchdFile;
    }

}
