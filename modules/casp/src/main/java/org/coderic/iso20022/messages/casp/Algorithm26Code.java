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
 * <p>Clase Java para Algorithm26Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm26Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HS25"/&gt;
 *     &lt;enumeration value="HS38"/&gt;
 *     &lt;enumeration value="HS51"/&gt;
 *     &lt;enumeration value="HS01"/&gt;
 *     &lt;enumeration value="SH31"/&gt;
 *     &lt;enumeration value="SH32"/&gt;
 *     &lt;enumeration value="SH33"/&gt;
 *     &lt;enumeration value="SH35"/&gt;
 *     &lt;enumeration value="SHK1"/&gt;
 *     &lt;enumeration value="SHK2"/&gt;
 *     &lt;enumeration value="SMS3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm26Code")
@XmlEnum
public enum Algorithm26Code {

    @XmlEnumValue("HS25")
    HS_25("HS25"),
    @XmlEnumValue("HS38")
    HS_38("HS38"),
    @XmlEnumValue("HS51")
    HS_51("HS51"),
    @XmlEnumValue("HS01")
    HS_01("HS01"),
    @XmlEnumValue("SH31")
    SH_31("SH31"),
    @XmlEnumValue("SH32")
    SH_32("SH32"),
    @XmlEnumValue("SH33")
    SH_33("SH33"),
    @XmlEnumValue("SH35")
    SH_35("SH35"),
    @XmlEnumValue("SHK1")
    SHK_1("SHK1"),
    @XmlEnumValue("SHK2")
    SHK_2("SHK2"),
    @XmlEnumValue("SMS3")
    SMS_3("SMS3");
    private final String value;

    Algorithm26Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm26Code fromValue(String v) {
        for (Algorithm26Code c: Algorithm26Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
