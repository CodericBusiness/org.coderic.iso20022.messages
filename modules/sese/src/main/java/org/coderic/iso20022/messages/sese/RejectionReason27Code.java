//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:51 PM COT 
//


package org.coderic.iso20022.messages.sese;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RejectionReason27Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RejectionReason27Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="LATE"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="NRGM"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="INVM"/&gt;
 *     &lt;enumeration value="INVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RejectionReason27Code")
@XmlEnum
public enum RejectionReason27Code {

    ADEA,
    LATE,
    SAFE,
    NRGM,
    NRGN,
    OTHR,
    REFE,
    INVM,
    INVL;

    public String value() {
        return name();
    }

    public static RejectionReason27Code fromValue(String v) {
        return valueOf(v);
    }

}
