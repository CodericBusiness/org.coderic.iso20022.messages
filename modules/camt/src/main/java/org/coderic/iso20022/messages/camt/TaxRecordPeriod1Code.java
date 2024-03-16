//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 08:18:14 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TaxRecordPeriod1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TaxRecordPeriod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MM01"/&gt;
 *     &lt;enumeration value="MM02"/&gt;
 *     &lt;enumeration value="MM03"/&gt;
 *     &lt;enumeration value="MM04"/&gt;
 *     &lt;enumeration value="MM05"/&gt;
 *     &lt;enumeration value="MM06"/&gt;
 *     &lt;enumeration value="MM07"/&gt;
 *     &lt;enumeration value="MM08"/&gt;
 *     &lt;enumeration value="MM09"/&gt;
 *     &lt;enumeration value="MM10"/&gt;
 *     &lt;enumeration value="MM11"/&gt;
 *     &lt;enumeration value="MM12"/&gt;
 *     &lt;enumeration value="QTR1"/&gt;
 *     &lt;enumeration value="QTR2"/&gt;
 *     &lt;enumeration value="QTR3"/&gt;
 *     &lt;enumeration value="QTR4"/&gt;
 *     &lt;enumeration value="HLF1"/&gt;
 *     &lt;enumeration value="HLF2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxRecordPeriod1Code")
@XmlEnum
public enum TaxRecordPeriod1Code {

    @XmlEnumValue("MM01")
    MM_01("MM01"),
    @XmlEnumValue("MM02")
    MM_02("MM02"),
    @XmlEnumValue("MM03")
    MM_03("MM03"),
    @XmlEnumValue("MM04")
    MM_04("MM04"),
    @XmlEnumValue("MM05")
    MM_05("MM05"),
    @XmlEnumValue("MM06")
    MM_06("MM06"),
    @XmlEnumValue("MM07")
    MM_07("MM07"),
    @XmlEnumValue("MM08")
    MM_08("MM08"),
    @XmlEnumValue("MM09")
    MM_09("MM09"),
    @XmlEnumValue("MM10")
    MM_10("MM10"),
    @XmlEnumValue("MM11")
    MM_11("MM11"),
    @XmlEnumValue("MM12")
    MM_12("MM12"),
    @XmlEnumValue("QTR1")
    QTR_1("QTR1"),
    @XmlEnumValue("QTR2")
    QTR_2("QTR2"),
    @XmlEnumValue("QTR3")
    QTR_3("QTR3"),
    @XmlEnumValue("QTR4")
    QTR_4("QTR4"),
    @XmlEnumValue("HLF1")
    HLF_1("HLF1"),
    @XmlEnumValue("HLF2")
    HLF_2("HLF2");
    private final String value;

    TaxRecordPeriod1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxRecordPeriod1Code fromValue(String v) {
        for (TaxRecordPeriod1Code c: TaxRecordPeriod1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
