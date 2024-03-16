//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:40 PM COT 
//


package org.coderic.iso20022.messages.secl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MarketType2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MarketType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="OTCO"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketType2Code")
@XmlEnum
public enum MarketType2Code {

    PRIM,
    SECM,
    OTCO,
    VARI,
    EXCH;

    public String value() {
        return name();
    }

    public static MarketType2Code fromValue(String v) {
        return valueOf(v);
    }

}
