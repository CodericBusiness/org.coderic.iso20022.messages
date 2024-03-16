//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:16 PM COT 
//


package org.coderic.iso20022.messages.fxtr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TradingModeType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TradingModeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="QUDR"/&gt;
 *     &lt;enumeration value="ORDR"/&gt;
 *     &lt;enumeration value="NETR"/&gt;
 *     &lt;enumeration value="AUCT"/&gt;
 *     &lt;enumeration value="MARC"/&gt;
 *     &lt;enumeration value="BILA"/&gt;
 *     &lt;enumeration value="ANON"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradingModeType1Code")
@XmlEnum
public enum TradingModeType1Code {

    QUDR,
    ORDR,
    NETR,
    AUCT,
    MARC,
    BILA,
    ANON;

    public String value() {
        return name();
    }

    public static TradingModeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
