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
 * <p>Clase Java para DocumentType7Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="DocumentType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JNRL"/&gt;
 *     &lt;enumeration value="CRCP"/&gt;
 *     &lt;enumeration value="HRCP"/&gt;
 *     &lt;enumeration value="SRCP"/&gt;
 *     &lt;enumeration value="RPIN"/&gt;
 *     &lt;enumeration value="VCHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType7Code")
@XmlEnum
public enum DocumentType7Code {

    JNRL,
    CRCP,
    HRCP,
    SRCP,
    RPIN,
    VCHR;

    public String value() {
        return name();
    }

    public static DocumentType7Code fromValue(String v) {
        return valueOf(v);
    }

}
