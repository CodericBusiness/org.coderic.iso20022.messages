//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageFunction11Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MessageFunction11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BALN"/&gt;
 *     &lt;enumeration value="CMPA"/&gt;
 *     &lt;enumeration value="CMPD"/&gt;
 *     &lt;enumeration value="ACMD"/&gt;
 *     &lt;enumeration value="DVCC"/&gt;
 *     &lt;enumeration value="DIAQ"/&gt;
 *     &lt;enumeration value="DIAP"/&gt;
 *     &lt;enumeration value="GSTS"/&gt;
 *     &lt;enumeration value="INQQ"/&gt;
 *     &lt;enumeration value="INQP"/&gt;
 *     &lt;enumeration value="KYAQ"/&gt;
 *     &lt;enumeration value="KYAP"/&gt;
 *     &lt;enumeration value="PINQ"/&gt;
 *     &lt;enumeration value="PINP"/&gt;
 *     &lt;enumeration value="RJAQ"/&gt;
 *     &lt;enumeration value="RJAP"/&gt;
 *     &lt;enumeration value="WITV"/&gt;
 *     &lt;enumeration value="WITK"/&gt;
 *     &lt;enumeration value="WITQ"/&gt;
 *     &lt;enumeration value="WITP"/&gt;
 *     &lt;enumeration value="INQC"/&gt;
 *     &lt;enumeration value="H2AP"/&gt;
 *     &lt;enumeration value="H2AQ"/&gt;
 *     &lt;enumeration value="TMOP"/&gt;
 *     &lt;enumeration value="CSEC"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="SKSC"/&gt;
 *     &lt;enumeration value="SSTS"/&gt;
 *     &lt;enumeration value="DPSK"/&gt;
 *     &lt;enumeration value="DPSV"/&gt;
 *     &lt;enumeration value="DPSQ"/&gt;
 *     &lt;enumeration value="DPSP"/&gt;
 *     &lt;enumeration value="EXPK"/&gt;
 *     &lt;enumeration value="EXPV"/&gt;
 *     &lt;enumeration value="TRFQ"/&gt;
 *     &lt;enumeration value="TRFP"/&gt;
 *     &lt;enumeration value="RPTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction11Code")
@XmlEnum
public enum MessageFunction11Code {

    BALN("BALN"),
    CMPA("CMPA"),
    CMPD("CMPD"),
    ACMD("ACMD"),
    DVCC("DVCC"),
    DIAQ("DIAQ"),
    DIAP("DIAP"),
    GSTS("GSTS"),
    INQQ("INQQ"),
    INQP("INQP"),
    KYAQ("KYAQ"),
    KYAP("KYAP"),
    PINQ("PINQ"),
    PINP("PINP"),
    RJAQ("RJAQ"),
    RJAP("RJAP"),
    WITV("WITV"),
    WITK("WITK"),
    WITQ("WITQ"),
    WITP("WITP"),
    INQC("INQC"),
    @XmlEnumValue("H2AP")
    H_2_AP("H2AP"),
    @XmlEnumValue("H2AQ")
    H_2_AQ("H2AQ"),
    TMOP("TMOP"),
    CSEC("CSEC"),
    DSEC("DSEC"),
    SKSC("SKSC"),
    SSTS("SSTS"),
    DPSK("DPSK"),
    DPSV("DPSV"),
    DPSQ("DPSQ"),
    DPSP("DPSP"),
    EXPK("EXPK"),
    EXPV("EXPV"),
    TRFQ("TRFQ"),
    TRFP("TRFP"),
    RPTC("RPTC");
    private final String value;

    MessageFunction11Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageFunction11Code fromValue(String v) {
        for (MessageFunction11Code c: MessageFunction11Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
