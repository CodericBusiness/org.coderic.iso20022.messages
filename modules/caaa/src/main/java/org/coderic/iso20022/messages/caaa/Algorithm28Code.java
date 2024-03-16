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
 * <p>Clase Java para Algorithm28Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm28Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EA2C"/&gt;
 *     &lt;enumeration value="E3DC"/&gt;
 *     &lt;enumeration value="DKP9"/&gt;
 *     &lt;enumeration value="UKPT"/&gt;
 *     &lt;enumeration value="UKA2"/&gt;
 *     &lt;enumeration value="EA9C"/&gt;
 *     &lt;enumeration value="EA5C"/&gt;
 *     &lt;enumeration value="DA12"/&gt;
 *     &lt;enumeration value="DA19"/&gt;
 *     &lt;enumeration value="DA25"/&gt;
 *     &lt;enumeration value="N108"/&gt;
 *     &lt;enumeration value="EA5R"/&gt;
 *     &lt;enumeration value="EA9R"/&gt;
 *     &lt;enumeration value="EA2R"/&gt;
 *     &lt;enumeration value="E3DR"/&gt;
 *     &lt;enumeration value="E36C"/&gt;
 *     &lt;enumeration value="E36R"/&gt;
 *     &lt;enumeration value="SD5C"/&gt;
 *     &lt;enumeration value="UKA1"/&gt;
 *     &lt;enumeration value="UKA3"/&gt;
 *     &lt;enumeration value="SM4C"/&gt;
 *     &lt;enumeration value="SM4R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm28Code")
@XmlEnum
public enum Algorithm28Code {

    @XmlEnumValue("EA2C")
    EA_2_C("EA2C"),
    @XmlEnumValue("E3DC")
    E_3_DC("E3DC"),
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),
    UKPT("UKPT"),
    @XmlEnumValue("UKA2")
    UKA_2("UKA2"),
    @XmlEnumValue("EA9C")
    EA_9_C("EA9C"),
    @XmlEnumValue("EA5C")
    EA_5_C("EA5C"),
    @XmlEnumValue("DA12")
    DA_12("DA12"),
    @XmlEnumValue("DA19")
    DA_19("DA19"),
    @XmlEnumValue("DA25")
    DA_25("DA25"),
    @XmlEnumValue("N108")
    N_108("N108"),
    @XmlEnumValue("EA5R")
    EA_5_R("EA5R"),
    @XmlEnumValue("EA9R")
    EA_9_R("EA9R"),
    @XmlEnumValue("EA2R")
    EA_2_R("EA2R"),
    @XmlEnumValue("E3DR")
    E_3_DR("E3DR"),
    @XmlEnumValue("E36C")
    E_36_C("E36C"),
    @XmlEnumValue("E36R")
    E_36_R("E36R"),
    @XmlEnumValue("SD5C")
    SD_5_C("SD5C"),
    @XmlEnumValue("UKA1")
    UKA_1("UKA1"),
    @XmlEnumValue("UKA3")
    UKA_3("UKA3"),
    @XmlEnumValue("SM4C")
    SM_4_C("SM4C"),
    @XmlEnumValue("SM4R")
    SM_4_R("SM4R");
    private final String value;

    Algorithm28Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm28Code fromValue(String v) {
        for (Algorithm28Code c: Algorithm28Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
