//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SecuritiesTransactionPrice4Choice complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritiesTransactionPrice4Choice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice2Choice"/&gt;
 *         &lt;element name="NoPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.113.001.01}SecuritiesTransactionPrice1"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice4Choice", propOrder = {
    "pric",
    "noPric"
})
public class SecuritiesTransactionPrice4Choice {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice2Choice pric;
    @XmlElement(name = "NoPric")
    protected SecuritiesTransactionPrice1 noPric;

    /**
     * Obtiene el valor de la propiedad pric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPric() {
        return pric;
    }

    /**
     * Define el valor de la propiedad pric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice2Choice value) {
        this.pric = value;
    }

    /**
     * Obtiene el valor de la propiedad noPric.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice1 }
     *     
     */
    public SecuritiesTransactionPrice1 getNoPric() {
        return noPric;
    }

    /**
     * Define el valor de la propiedad noPric.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice1 }
     *     
     */
    public void setNoPric(SecuritiesTransactionPrice1 value) {
        this.noPric = value;
    }

}
