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
 * <p>Clase Java para MemoryUnit1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MemoryUnit1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BYTE"/&gt;
 *     &lt;enumeration value="EXAB"/&gt;
 *     &lt;enumeration value="GIGA"/&gt;
 *     &lt;enumeration value="KILO"/&gt;
 *     &lt;enumeration value="MEGA"/&gt;
 *     &lt;enumeration value="PETA"/&gt;
 *     &lt;enumeration value="TERA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MemoryUnit1Code")
@XmlEnum
public enum MemoryUnit1Code {

    BYTE,
    EXAB,
    GIGA,
    KILO,
    MEGA,
    PETA,
    TERA;

    public String value() {
        return name();
    }

    public static MemoryUnit1Code fromValue(String v) {
        return valueOf(v);
    }

}
