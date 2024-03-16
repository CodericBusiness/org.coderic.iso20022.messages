//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Algorithm12Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm12Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MACC"/&gt;
 *     &lt;enumeration value="MCCS"/&gt;
 *     &lt;enumeration value="CMA1"/&gt;
 *     &lt;enumeration value="MCC1"/&gt;
 *     &lt;enumeration value="CMA9"/&gt;
 *     &lt;enumeration value="CMA5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm12Code")
@XmlEnum
public enum Algorithm12Code {

    MACC("MACC"),
    MCCS("MCCS"),
    @XmlEnumValue("CMA1")
    CMA_1("CMA1"),
    @XmlEnumValue("MCC1")
    MCC_1("MCC1"),
    @XmlEnumValue("CMA9")
    CMA_9("CMA9"),
    @XmlEnumValue("CMA5")
    CMA_5("CMA5");
    private final String value;

    Algorithm12Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm12Code fromValue(String v) {
        for (Algorithm12Code c: Algorithm12Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
