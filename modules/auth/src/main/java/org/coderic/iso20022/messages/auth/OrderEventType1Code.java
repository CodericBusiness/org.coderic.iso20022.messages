//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrderEventType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OrderEventType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAME"/&gt;
 *     &lt;enumeration value="CAMO"/&gt;
 *     &lt;enumeration value="CHME"/&gt;
 *     &lt;enumeration value="CHMO"/&gt;
 *     &lt;enumeration value="EXPI"/&gt;
 *     &lt;enumeration value="FILL"/&gt;
 *     &lt;enumeration value="NEWO"/&gt;
 *     &lt;enumeration value="PARF"/&gt;
 *     &lt;enumeration value="REMA"/&gt;
 *     &lt;enumeration value="REMO"/&gt;
 *     &lt;enumeration value="REMH"/&gt;
 *     &lt;enumeration value="REME"/&gt;
 *     &lt;enumeration value="TRIG"/&gt;
 *     &lt;enumeration value="RFQS"/&gt;
 *     &lt;enumeration value="RFQR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderEventType1Code")
@XmlEnum
public enum OrderEventType1Code {

    CAME,
    CAMO,
    CHME,
    CHMO,
    EXPI,
    FILL,
    NEWO,
    PARF,
    REMA,
    REMO,
    REMH,
    REME,
    TRIG,
    RFQS,
    RFQR;

    public String value() {
        return name();
    }

    public static OrderEventType1Code fromValue(String v) {
        return valueOf(v);
    }

}
