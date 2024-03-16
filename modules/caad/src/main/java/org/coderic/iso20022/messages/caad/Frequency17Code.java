//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Frequency17Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Frequency17Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="YEAR"/&gt;
 *     &lt;enumeration value="DAIL"/&gt;
 *     &lt;enumeration value="FRTN"/&gt;
 *     &lt;enumeration value="MNTH"/&gt;
 *     &lt;enumeration value="QURT"/&gt;
 *     &lt;enumeration value="MIAN"/&gt;
 *     &lt;enumeration value="TEND"/&gt;
 *     &lt;enumeration value="WEEK"/&gt;
 *     &lt;enumeration value="ADHO"/&gt;
 *     &lt;enumeration value="SHFT"/&gt;
 *     &lt;enumeration value="ODMD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Frequency17Code")
@XmlEnum
public enum Frequency17Code {

    YEAR,
    DAIL,
    FRTN,
    MNTH,
    QURT,
    MIAN,
    TEND,
    WEEK,
    ADHO,
    SHFT,
    ODMD;

    public String value() {
        return name();
    }

    public static Frequency17Code fromValue(String v) {
        return valueOf(v);
    }

}
