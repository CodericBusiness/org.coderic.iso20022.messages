//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RetailerMessage1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RetailerMessage1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SSAB"/&gt;
 *     &lt;enumeration value="SAAQ"/&gt;
 *     &lt;enumeration value="SAAP"/&gt;
 *     &lt;enumeration value="SDDR"/&gt;
 *     &lt;enumeration value="SDDP"/&gt;
 *     &lt;enumeration value="SSEN"/&gt;
 *     &lt;enumeration value="SSMQ"/&gt;
 *     &lt;enumeration value="SSMR"/&gt;
 *     &lt;enumeration value="SSRJ"/&gt;
 *     &lt;enumeration value="SARQ"/&gt;
 *     &lt;enumeration value="SARP"/&gt;
 *     &lt;enumeration value="SFRP"/&gt;
 *     &lt;enumeration value="SFRQ"/&gt;
 *     &lt;enumeration value="SFSQ"/&gt;
 *     &lt;enumeration value="SFSP"/&gt;
 *     &lt;enumeration value="SASQ"/&gt;
 *     &lt;enumeration value="SASP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerMessage1Code")
@XmlEnum
public enum RetailerMessage1Code {

    SSAB,
    SAAQ,
    SAAP,
    SDDR,
    SDDP,
    SSEN,
    SSMQ,
    SSMR,
    SSRJ,
    SARQ,
    SARP,
    SFRP,
    SFRQ,
    SFSQ,
    SFSP,
    SASQ,
    SASP;

    public String value() {
        return name();
    }

    public static RetailerMessage1Code fromValue(String v) {
        return valueOf(v);
    }

}
