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
 * <p>Clase Java para Algorithm27Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Algorithm27Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MACC"/&gt;
 *     &lt;enumeration value="MCCS"/&gt;
 *     &lt;enumeration value="CMA1"/&gt;
 *     &lt;enumeration value="MCC1"/&gt;
 *     &lt;enumeration value="CMA9"/&gt;
 *     &lt;enumeration value="CMA5"/&gt;
 *     &lt;enumeration value="CMA2"/&gt;
 *     &lt;enumeration value="CM31"/&gt;
 *     &lt;enumeration value="CM32"/&gt;
 *     &lt;enumeration value="CM33"/&gt;
 *     &lt;enumeration value="MCS3"/&gt;
 *     &lt;enumeration value="CCA1"/&gt;
 *     &lt;enumeration value="CCA2"/&gt;
 *     &lt;enumeration value="CCA3"/&gt;
 *     &lt;enumeration value="S34C"/&gt;
 *     &lt;enumeration value="S34R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Algorithm27Code")
@XmlEnum
public enum Algorithm27Code {

    MACC("MACC"),
    MCCS("MCCS"),
    @XmlEnumValue("CMA1")
    CMA_1("CMA1"),
    @XmlEnumValue("MCC1")
    MCC_1("MCC1"),
    @XmlEnumValue("CMA9")
    CMA_9("CMA9"),
    @XmlEnumValue("CMA5")
    CMA_5("CMA5"),
    @XmlEnumValue("CMA2")
    CMA_2("CMA2"),
    @XmlEnumValue("CM31")
    CM_31("CM31"),
    @XmlEnumValue("CM32")
    CM_32("CM32"),
    @XmlEnumValue("CM33")
    CM_33("CM33"),
    @XmlEnumValue("MCS3")
    MCS_3("MCS3"),
    @XmlEnumValue("CCA1")
    CCA_1("CCA1"),
    @XmlEnumValue("CCA2")
    CCA_2("CCA2"),
    @XmlEnumValue("CCA3")
    CCA_3("CCA3"),
    @XmlEnumValue("S34C")
    S_34_C("S34C"),
    @XmlEnumValue("S34R")
    S_34_R("S34R");
    private final String value;

    Algorithm27Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Algorithm27Code fromValue(String v) {
        for (Algorithm27Code c: Algorithm27Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
