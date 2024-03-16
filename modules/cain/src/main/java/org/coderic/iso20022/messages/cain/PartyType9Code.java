//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyType9Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PartyType9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="ACQP"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="CISP"/&gt;
 *     &lt;enumeration value="CSCH"/&gt;
 *     &lt;enumeration value="SCHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType9Code")
@XmlEnum
public enum PartyType9Code {

    ACQR,
    ACQP,
    CISS,
    CISP,
    CSCH,
    SCHP;

    public String value() {
        return name();
    }

    public static PartyType9Code fromValue(String v) {
        return valueOf(v);
    }

}
