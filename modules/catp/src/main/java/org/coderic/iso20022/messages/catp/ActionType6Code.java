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
 * <p>Clase Java para ActionType6Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ActionType6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DCCQ"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="HAMT"/&gt;
 *     &lt;enumeration value="LAMT"/&gt;
 *     &lt;enumeration value="BUSY"/&gt;
 *     &lt;enumeration value="CPTR"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="CPNS"/&gt;
 *     &lt;enumeration value="RQST"/&gt;
 *     &lt;enumeration value="PINL"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="TRCK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType6Code")
@XmlEnum
public enum ActionType6Code {

    DCCQ,
    FEES,
    HAMT,
    LAMT,
    BUSY,
    CPTR,
    DISP,
    CPNS,
    RQST,
    PINL,
    PINR,
    TRCK;

    public String value() {
        return name();
    }

    public static ActionType6Code fromValue(String v) {
        return valueOf(v);
    }

}
