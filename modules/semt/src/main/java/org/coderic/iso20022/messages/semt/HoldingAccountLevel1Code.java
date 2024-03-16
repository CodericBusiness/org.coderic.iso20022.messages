//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HoldingAccountLevel1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="HoldingAccountLevel1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="LVL1"/&gt;
 *     &lt;enumeration value="LVL2"/&gt;
 *     &lt;enumeration value="LVL3"/&gt;
 *     &lt;enumeration value="LVL4"/&gt;
 *     &lt;enumeration value="LVL5"/&gt;
 *     &lt;enumeration value="LVL6"/&gt;
 *     &lt;enumeration value="LVL7"/&gt;
 *     &lt;enumeration value="LVL8"/&gt;
 *     &lt;enumeration value="LVL9"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HoldingAccountLevel1Code")
@XmlEnum
public enum HoldingAccountLevel1Code {

    SAFE("SAFE"),
    @XmlEnumValue("LVL1")
    LVL_1("LVL1"),
    @XmlEnumValue("LVL2")
    LVL_2("LVL2"),
    @XmlEnumValue("LVL3")
    LVL_3("LVL3"),
    @XmlEnumValue("LVL4")
    LVL_4("LVL4"),
    @XmlEnumValue("LVL5")
    LVL_5("LVL5"),
    @XmlEnumValue("LVL6")
    LVL_6("LVL6"),
    @XmlEnumValue("LVL7")
    LVL_7("LVL7"),
    @XmlEnumValue("LVL8")
    LVL_8("LVL8"),
    @XmlEnumValue("LVL9")
    LVL_9("LVL9");
    private final String value;

    HoldingAccountLevel1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HoldingAccountLevel1Code fromValue(String v) {
        for (HoldingAccountLevel1Code c: HoldingAccountLevel1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
