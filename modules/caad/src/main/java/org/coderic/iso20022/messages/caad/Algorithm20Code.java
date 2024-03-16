//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Algorithm20Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm20Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HS25"/&gt;
 *     &lt;enumeration value="HS38"/&gt;
 *     &lt;enumeration value="HS51"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm20Code")
@XmlEnum
public enum Algorithm20Code {

    @XmlEnumValue("HS25")
    HS_25("HS25"),
    @XmlEnumValue("HS38")
    HS_38("HS38"),
    @XmlEnumValue("HS51")
    HS_51("HS51");
    private final String value;

    Algorithm20Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm20Code fromValue(String v) {
        for (Algorithm20Code c: Algorithm20Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
