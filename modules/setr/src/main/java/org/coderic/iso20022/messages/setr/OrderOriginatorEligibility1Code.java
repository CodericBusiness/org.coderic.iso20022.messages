//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderOriginatorEligibility1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OrderOriginatorEligibility1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="RETL"/&gt;
 *     &lt;enumeration value="PROF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderOriginatorEligibility1Code")
@XmlEnum
public enum OrderOriginatorEligibility1Code {

    ELIG,
    RETL,
    PROF;

    public String value() {
        return name();
    }

    public static OrderOriginatorEligibility1Code fromValue(String v) {
        return valueOf(v);
    }

}
