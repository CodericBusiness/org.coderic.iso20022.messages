//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:53:44 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyType16Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PartyType16Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="OTRM"/&gt;
 *     &lt;enumeration value="BKAF"/&gt;
 *     &lt;enumeration value="BKAT"/&gt;
 *     &lt;enumeration value="ATMG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType16Code")
@XmlEnum
public enum PartyType16Code {

    ACQR,
    CISS,
    DLIS,
    ITAG,
    OTRM,
    BKAF,
    BKAT,
    ATMG;

    public String value() {
        return name();
    }

    public static PartyType16Code fromValue(String v) {
        return valueOf(v);
    }

}
