//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardAccountType3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardAccountType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CTDP"/&gt;
 *     &lt;enumeration value="CHCK"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="CURR"/&gt;
 *     &lt;enumeration value="CDBT"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="EPRS"/&gt;
 *     &lt;enumeration value="HEQL"/&gt;
 *     &lt;enumeration value="ISTL"/&gt;
 *     &lt;enumeration value="INVS"/&gt;
 *     &lt;enumeration value="LCDT"/&gt;
 *     &lt;enumeration value="MBNW"/&gt;
 *     &lt;enumeration value="MNMK"/&gt;
 *     &lt;enumeration value="MNMC"/&gt;
 *     &lt;enumeration value="MTGL"/&gt;
 *     &lt;enumeration value="RTRM"/&gt;
 *     &lt;enumeration value="RVLV"/&gt;
 *     &lt;enumeration value="SVNG"/&gt;
 *     &lt;enumeration value="STBD"/&gt;
 *     &lt;enumeration value="UVRL"/&gt;
 *     &lt;enumeration value="PRPD"/&gt;
 *     &lt;enumeration value="FLTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardAccountType3Code")
@XmlEnum
public enum CardAccountType3Code {

    CTDP,
    CHCK,
    CRDT,
    CURR,
    CDBT,
    DFLT,
    EPRS,
    HEQL,
    ISTL,
    INVS,
    LCDT,
    MBNW,
    MNMK,
    MNMC,
    MTGL,
    RTRM,
    RVLV,
    SVNG,
    STBD,
    UVRL,
    PRPD,
    FLTC;

    public String value() {
        return name();
    }

    public static CardAccountType3Code fromValue(String v) {
        return valueOf(v);
    }

}
