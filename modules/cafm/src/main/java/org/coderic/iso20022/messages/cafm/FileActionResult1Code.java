//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FileActionResult1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FileActionResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DUPR"/&gt;
 *     &lt;enumeration value="FERD"/&gt;
 *     &lt;enumeration value="INFD"/&gt;
 *     &lt;enumeration value="FLCK"/&gt;
 *     &lt;enumeration value="FTER"/&gt;
 *     &lt;enumeration value="NSUP"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="SUCC"/&gt;
 *     &lt;enumeration value="UTLR"/&gt;
 *     &lt;enumeration value="UNKF"/&gt;
 *     &lt;enumeration value="USUC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FileActionResult1Code")
@XmlEnum
public enum FileActionResult1Code {

    DUPR,
    FERD,
    INFD,
    FLCK,
    FTER,
    NSUP,
    OTHR,
    SUCC,
    UTLR,
    UNKF,
    USUC;

    public String value() {
        return name();
    }

    public static FileActionResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
