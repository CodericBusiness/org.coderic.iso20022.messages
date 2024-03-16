//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:07 PM COT 
//


package org.coderic.iso20022.messages.tsrv;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UndertakingStatus3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="UndertakingStatus3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="NCON"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="WTHD"/&gt;
 *     &lt;enumeration value="AMTC"/&gt;
 *     &lt;enumeration value="AMTU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UndertakingStatus3Code")
@XmlEnum
public enum UndertakingStatus3Code {

    ACCP,
    NCON,
    REJT,
    WTHD,
    AMTC,
    AMTU;

    public String value() {
        return name();
    }

    public static UndertakingStatus3Code fromValue(String v) {
        return valueOf(v);
    }

}
