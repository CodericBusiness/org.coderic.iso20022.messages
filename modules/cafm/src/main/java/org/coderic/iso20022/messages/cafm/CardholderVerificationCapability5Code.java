//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardholderVerificationCapability5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardholderVerificationCapability5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APKI"/&gt;
 *     &lt;enumeration value="NOVF"/&gt;
 *     &lt;enumeration value="FBIG"/&gt;
 *     &lt;enumeration value="FBIO"/&gt;
 *     &lt;enumeration value="FDSG"/&gt;
 *     &lt;enumeration value="FCPN"/&gt;
 *     &lt;enumeration value="FEPN"/&gt;
 *     &lt;enumeration value="NBIO"/&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="VORN"/&gt;
 *     &lt;enumeration value="PKIS"/&gt;
 *     &lt;enumeration value="NOPN"/&gt;
 *     &lt;enumeration value="NOOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardholderVerificationCapability5Code")
@XmlEnum
public enum CardholderVerificationCapability5Code {

    APKI,
    NOVF,
    FBIG,
    FBIO,
    FDSG,
    FCPN,
    FEPN,
    NBIO,
    NPIN,
    OTHN,
    OTHP,
    SIGN,
    UNSP,
    VORN,
    PKIS,
    NOPN,
    NOOP;

    public String value() {
        return name();
    }

    public static CardholderVerificationCapability5Code fromValue(String v) {
        return valueOf(v);
    }

}
