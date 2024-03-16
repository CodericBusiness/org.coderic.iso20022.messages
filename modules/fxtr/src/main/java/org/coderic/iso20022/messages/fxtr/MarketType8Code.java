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
 * <p>Clase Java para MarketType8Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MarketType8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COUN"/&gt;
 *     &lt;enumeration value="INBA"/&gt;
 *     &lt;enumeration value="OTCO"/&gt;
 *     &lt;enumeration value="PRIM"/&gt;
 *     &lt;enumeration value="SECM"/&gt;
 *     &lt;enumeration value="EXCH"/&gt;
 *     &lt;enumeration value="VARI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketType8Code")
@XmlEnum
public enum MarketType8Code {

    COUN,
    INBA,
    OTCO,
    PRIM,
    SECM,
    EXCH,
    VARI;

    public String value() {
        return name();
    }

    public static MarketType8Code fromValue(String v) {
        return valueOf(v);
    }

}
