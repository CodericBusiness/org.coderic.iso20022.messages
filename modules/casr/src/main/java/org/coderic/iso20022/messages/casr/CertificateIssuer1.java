//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CertificateIssuer1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CertificateIssuer1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RltvDstngshdNm" type="{urn:iso:std:iso:20022:tech:xsd:casr.002.001.02}RelativeDistinguishedName1" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateIssuer1", propOrder = {
    "rltvDstngshdNm"
})
public class CertificateIssuer1 {

    @XmlElement(name = "RltvDstngshdNm", required = true)
    protected List<RelativeDistinguishedName1> rltvDstngshdNm;

    /**
     * Gets the value of the rltvDstngshdNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rltvDstngshdNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltvDstngshdNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelativeDistinguishedName1 }
     * 
     * 
     */
    public List<RelativeDistinguishedName1> getRltvDstngshdNm() {
        if (rltvDstngshdNm == null) {
            rltvDstngshdNm = new ArrayList<RelativeDistinguishedName1>();
        }
        return this.rltvDstngshdNm;
    }

}
