//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:54:02 PM COT 
//


package org.coderic.iso20022.messages.pain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Frequency10Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Frequency10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NEVR"/&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="RATE"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency10Code")
@XmlEnum
public enum Frequency10Code {

    NEVR,
    YEAR,
    RATE,
    MIAN,
    QURT;

    public String value() {
        return name();
    }

    public static Frequency10Code fromValue(String v) {
        return valueOf(v);
    }

}
