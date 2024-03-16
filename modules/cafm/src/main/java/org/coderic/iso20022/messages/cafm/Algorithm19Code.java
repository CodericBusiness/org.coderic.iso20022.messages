//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Algorithm19Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm19Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERS2"/&gt;
 *     &lt;enumeration value="ERS1"/&gt;
 *     &lt;enumeration value="RPSS"/&gt;
 *     &lt;enumeration value="ECC5"/&gt;
 *     &lt;enumeration value="ECC1"/&gt;
 *     &lt;enumeration value="ECC4"/&gt;
 *     &lt;enumeration value="ECC2"/&gt;
 *     &lt;enumeration value="ECC3"/&gt;
 *     &lt;enumeration value="ERS3"/&gt;
 *     &lt;enumeration value="ECP2"/&gt;
 *     &lt;enumeration value="ECP3"/&gt;
 *     &lt;enumeration value="ECP5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm19Code")
@XmlEnum
public enum Algorithm19Code {

    @XmlEnumValue("ERS2")
    ERS_2("ERS2"),
    @XmlEnumValue("ERS1")
    ERS_1("ERS1"),
    RPSS("RPSS"),
    @XmlEnumValue("ECC5")
    ECC_5("ECC5"),
    @XmlEnumValue("ECC1")
    ECC_1("ECC1"),
    @XmlEnumValue("ECC4")
    ECC_4("ECC4"),
    @XmlEnumValue("ECC2")
    ECC_2("ECC2"),
    @XmlEnumValue("ECC3")
    ECC_3("ECC3"),
    @XmlEnumValue("ERS3")
    ERS_3("ERS3"),
    @XmlEnumValue("ECP2")
    ECP_2("ECP2"),
    @XmlEnumValue("ECP3")
    ECP_3("ECP3"),
    @XmlEnumValue("ECP5")
    ECP_5("ECP5");
    private final String value;

    Algorithm19Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm19Code fromValue(String v) {
        for (Algorithm19Code c: Algorithm19Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
