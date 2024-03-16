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
 * <p>Clase Java para CorporateActionOption217 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CorporateActionOption217"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}Exact3NumericText"/&gt;
 *         &lt;element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CorporateActionOption30Choice"/&gt;
 *         &lt;element name="SctiesMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}SecuritiesOption76" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CshMvmntDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.02}CashOption91" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOption217", propOrder = {
    "optnNb",
    "optnTp",
    "sctiesMvmntDtls",
    "cshMvmntDtls"
})
public class CorporateActionOption217 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption30Choice optnTp;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOption76> sctiesMvmntDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOption91> cshMvmntDtls;

    /**
     * Obtiene el valor de la propiedad optnNb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Define el valor de la propiedad optnNb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnNb(String value) {
        this.optnNb = value;
    }

    /**
     * Obtiene el valor de la propiedad optnTp.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public CorporateActionOption30Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Define el valor de la propiedad optnTp.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption30Choice }
     *     
     */
    public void setOptnTp(CorporateActionOption30Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOption76 }
     * 
     * 
     */
    public List<SecuritiesOption76> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<SecuritiesOption76>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOption91 }
     * 
     * 
     */
    public List<CashOption91> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CashOption91>();
        }
        return this.cshMvmntDtls;
    }

}
