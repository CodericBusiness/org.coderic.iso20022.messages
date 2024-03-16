//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FinancingStatusReason1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="FinancingStatusReason1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CA01"/&gt;
 *     &lt;enumeration value="CA02"/&gt;
 *     &lt;enumeration value="AC01"/&gt;
 *     &lt;enumeration value="AC04"/&gt;
 *     &lt;enumeration value="AC06"/&gt;
 *     &lt;enumeration value="BE08"/&gt;
 *     &lt;enumeration value="BE09"/&gt;
 *     &lt;enumeration value="BE10"/&gt;
 *     &lt;enumeration value="BE11"/&gt;
 *     &lt;enumeration value="DT02"/&gt;
 *     &lt;enumeration value="ID01"/&gt;
 *     &lt;enumeration value="ID02"/&gt;
 *     &lt;enumeration value="ID03"/&gt;
 *     &lt;enumeration value="MI01"/&gt;
 *     &lt;enumeration value="NA01"/&gt;
 *     &lt;enumeration value="CA03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FinancingStatusReason1Code")
@XmlEnum
public enum FinancingStatusReason1Code {

    @XmlEnumValue("CA01")
    CA_01("CA01"),
    @XmlEnumValue("CA02")
    CA_02("CA02"),
    @XmlEnumValue("AC01")
    AC_01("AC01"),
    @XmlEnumValue("AC04")
    AC_04("AC04"),
    @XmlEnumValue("AC06")
    AC_06("AC06"),
    @XmlEnumValue("BE08")
    BE_08("BE08"),
    @XmlEnumValue("BE09")
    BE_09("BE09"),
    @XmlEnumValue("BE10")
    BE_10("BE10"),
    @XmlEnumValue("BE11")
    BE_11("BE11"),
    @XmlEnumValue("DT02")
    DT_02("DT02"),
    @XmlEnumValue("ID01")
    ID_01("ID01"),
    @XmlEnumValue("ID02")
    ID_02("ID02"),
    @XmlEnumValue("ID03")
    ID_03("ID03"),
    @XmlEnumValue("MI01")
    MI_01("MI01"),
    @XmlEnumValue("NA01")
    NA_01("NA01"),
    @XmlEnumValue("CA03")
    CA_03("CA03");
    private final String value;

    FinancingStatusReason1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FinancingStatusReason1Code fromValue(String v) {
        for (FinancingStatusReason1Code c: FinancingStatusReason1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
