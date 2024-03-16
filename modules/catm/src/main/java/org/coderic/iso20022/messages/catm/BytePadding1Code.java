//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BytePadding1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="BytePadding1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LNGT"/&gt;
 *     &lt;enumeration value="NUL8"/&gt;
 *     &lt;enumeration value="NULG"/&gt;
 *     &lt;enumeration value="NULL"/&gt;
 *     &lt;enumeration value="RAND"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BytePadding1Code")
@XmlEnum
public enum BytePadding1Code {

    LNGT("LNGT"),
    @XmlEnumValue("NUL8")
    NUL_8("NUL8"),
    NULG("NULG"),
    NULL("NULL"),
    RAND("RAND");
    private final String value;

    BytePadding1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BytePadding1Code fromValue(String v) {
        for (BytePadding1Code c: BytePadding1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
