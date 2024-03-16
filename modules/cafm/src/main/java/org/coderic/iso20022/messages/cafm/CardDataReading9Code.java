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
 * <p>Clase Java para CardDataReading9Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardDataReading9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKW"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="CAMR"/&gt;
 *     &lt;enumeration value="KEEN"/&gt;
 *     &lt;enumeration value="ICPY"/&gt;
 *     &lt;enumeration value="OPTC"/&gt;
 *     &lt;enumeration value="CDFL"/&gt;
 *     &lt;enumeration value="MBNK"/&gt;
 *     &lt;enumeration value="TOKN"/&gt;
 *     &lt;enumeration value="ICCY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading9Code")
@XmlEnum
public enum CardDataReading9Code {

    UNKW,
    OTHN,
    OTHP,
    CAMR,
    KEEN,
    ICPY,
    OPTC,
    CDFL,
    MBNK,
    TOKN,
    ICCY;

    public String value() {
        return name();
    }

    public static CardDataReading9Code fromValue(String v) {
        return valueOf(v);
    }

}
