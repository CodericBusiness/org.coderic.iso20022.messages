//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PINFormat3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PINFormat3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISO0"/&gt;
 *     &lt;enumeration value="ISO1"/&gt;
 *     &lt;enumeration value="ISO2"/&gt;
 *     &lt;enumeration value="ISO3"/&gt;
 *     &lt;enumeration value="ISO4"/&gt;
 *     &lt;enumeration value="ISO5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PINFormat3Code")
@XmlEnum
public enum PINFormat3Code {

    @XmlEnumValue("ISO0")
    ISO_0("ISO0"),
    @XmlEnumValue("ISO1")
    ISO_1("ISO1"),
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),
    @XmlEnumValue("ISO3")
    ISO_3("ISO3"),
    @XmlEnumValue("ISO4")
    ISO_4("ISO4"),
    @XmlEnumValue("ISO5")
    ISO_5("ISO5");
    private final String value;

    PINFormat3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PINFormat3Code fromValue(String v) {
        for (PINFormat3Code c: PINFormat3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
