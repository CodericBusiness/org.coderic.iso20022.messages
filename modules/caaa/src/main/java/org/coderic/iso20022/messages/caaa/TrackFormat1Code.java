//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TrackFormat1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TrackFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AAMV"/&gt;
 *     &lt;enumeration value="CMC7"/&gt;
 *     &lt;enumeration value="E13B"/&gt;
 *     &lt;enumeration value="ISOF"/&gt;
 *     &lt;enumeration value="JIS1"/&gt;
 *     &lt;enumeration value="JIS2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrackFormat1Code")
@XmlEnum
public enum TrackFormat1Code {

    AAMV("AAMV"),
    @XmlEnumValue("CMC7")
    CMC_7("CMC7"),
    @XmlEnumValue("E13B")
    E_13_B("E13B"),
    ISOF("ISOF"),
    @XmlEnumValue("JIS1")
    JIS_1("JIS1"),
    @XmlEnumValue("JIS2")
    JIS_2("JIS2");
    private final String value;

    TrackFormat1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrackFormat1Code fromValue(String v) {
        for (TrackFormat1Code c: TrackFormat1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
