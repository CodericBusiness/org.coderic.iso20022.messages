//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:45 PM COT 
//


package org.coderic.iso20022.messages.acmt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SwitchStatus1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="SwitchStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACPT"/&gt;
 *     &lt;enumeration value="BTRQ"/&gt;
 *     &lt;enumeration value="BTRS"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="REDT"/&gt;
 *     &lt;enumeration value="REDE"/&gt;
 *     &lt;enumeration value="REJT"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="TMTN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SwitchStatus1Code")
@XmlEnum
public enum SwitchStatus1Code {

    ACPT,
    BTRQ,
    BTRS,
    COMP,
    REDT,
    REDE,
    REJT,
    REQU,
    TMTN;

    public String value() {
        return name();
    }

    public static SwitchStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
