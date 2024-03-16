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
 * <p>Clase Java para Algorithm29Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm29Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERS2"/&gt;
 *     &lt;enumeration value="ERS1"/&gt;
 *     &lt;enumeration value="RPSS"/&gt;
 *     &lt;enumeration value="ERS3"/&gt;
 *     &lt;enumeration value="ED32"/&gt;
 *     &lt;enumeration value="ED33"/&gt;
 *     &lt;enumeration value="ED35"/&gt;
 *     &lt;enumeration value="ED23"/&gt;
 *     &lt;enumeration value="ED25"/&gt;
 *     &lt;enumeration value="ES22"/&gt;
 *     &lt;enumeration value="ES32"/&gt;
 *     &lt;enumeration value="ES33"/&gt;
 *     &lt;enumeration value="ES35"/&gt;
 *     &lt;enumeration value="ES23"/&gt;
 *     &lt;enumeration value="ES25"/&gt;
 *     &lt;enumeration value="ED22"/&gt;
 *     &lt;enumeration value="EF32"/&gt;
 *     &lt;enumeration value="EF22"/&gt;
 *     &lt;enumeration value="EF33"/&gt;
 *     &lt;enumeration value="EF35"/&gt;
 *     &lt;enumeration value="EF23"/&gt;
 *     &lt;enumeration value="EO33"/&gt;
 *     &lt;enumeration value="EF25"/&gt;
 *     &lt;enumeration value="EO32"/&gt;
 *     &lt;enumeration value="EO22"/&gt;
 *     &lt;enumeration value="EO35"/&gt;
 *     &lt;enumeration value="EO23"/&gt;
 *     &lt;enumeration value="EO25"/&gt;
 *     &lt;enumeration value="DD22"/&gt;
 *     &lt;enumeration value="DD32"/&gt;
 *     &lt;enumeration value="DD33"/&gt;
 *     &lt;enumeration value="DD35"/&gt;
 *     &lt;enumeration value="DD23"/&gt;
 *     &lt;enumeration value="DD25"/&gt;
 *     &lt;enumeration value="SM22"/&gt;
 *     &lt;enumeration value="SM33"/&gt;
 *     &lt;enumeration value="SM32"/&gt;
 *     &lt;enumeration value="SM35"/&gt;
 *     &lt;enumeration value="SM23"/&gt;
 *     &lt;enumeration value="SM25"/&gt;
 *     &lt;enumeration value="S2S3"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm29Code")
@XmlEnum
public enum Algorithm29Code {

    @XmlEnumValue("ERS2")
    ERS_2("ERS2"),
    @XmlEnumValue("ERS1")
    ERS_1("ERS1"),
    RPSS("RPSS"),
    @XmlEnumValue("ERS3")
    ERS_3("ERS3"),
    @XmlEnumValue("ED32")
    ED_32("ED32"),
    @XmlEnumValue("ED33")
    ED_33("ED33"),
    @XmlEnumValue("ED35")
    ED_35("ED35"),
    @XmlEnumValue("ED23")
    ED_23("ED23"),
    @XmlEnumValue("ED25")
    ED_25("ED25"),
    @XmlEnumValue("ES22")
    ES_22("ES22"),
    @XmlEnumValue("ES32")
    ES_32("ES32"),
    @XmlEnumValue("ES33")
    ES_33("ES33"),
    @XmlEnumValue("ES35")
    ES_35("ES35"),
    @XmlEnumValue("ES23")
    ES_23("ES23"),
    @XmlEnumValue("ES25")
    ES_25("ES25"),
    @XmlEnumValue("ED22")
    ED_22("ED22"),
    @XmlEnumValue("EF32")
    EF_32("EF32"),
    @XmlEnumValue("EF22")
    EF_22("EF22"),
    @XmlEnumValue("EF33")
    EF_33("EF33"),
    @XmlEnumValue("EF35")
    EF_35("EF35"),
    @XmlEnumValue("EF23")
    EF_23("EF23"),
    @XmlEnumValue("EO33")
    EO_33("EO33"),
    @XmlEnumValue("EF25")
    EF_25("EF25"),
    @XmlEnumValue("EO32")
    EO_32("EO32"),
    @XmlEnumValue("EO22")
    EO_22("EO22"),
    @XmlEnumValue("EO35")
    EO_35("EO35"),
    @XmlEnumValue("EO23")
    EO_23("EO23"),
    @XmlEnumValue("EO25")
    EO_25("EO25"),
    @XmlEnumValue("DD22")
    DD_22("DD22"),
    @XmlEnumValue("DD32")
    DD_32("DD32"),
    @XmlEnumValue("DD33")
    DD_33("DD33"),
    @XmlEnumValue("DD35")
    DD_35("DD35"),
    @XmlEnumValue("DD23")
    DD_23("DD23"),
    @XmlEnumValue("DD25")
    DD_25("DD25"),
    @XmlEnumValue("SM22")
    SM_22("SM22"),
    @XmlEnumValue("SM33")
    SM_33("SM33"),
    @XmlEnumValue("SM32")
    SM_32("SM32"),
    @XmlEnumValue("SM35")
    SM_35("SM35"),
    @XmlEnumValue("SM23")
    SM_23("SM23"),
    @XmlEnumValue("SM25")
    SM_25("SM25"),
    @XmlEnumValue("S2S3")
    S_2_S_3("S2S3");
    private final String value;

    Algorithm29Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm29Code fromValue(String v) {
        for (Algorithm29Code c: Algorithm29Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
