//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UserInterface6Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="UserInterface6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDSP"/&gt;
 *     &lt;enumeration value="CRCP"/&gt;
 *     &lt;enumeration value="MDSP"/&gt;
 *     &lt;enumeration value="MRCP"/&gt;
 *     &lt;enumeration value="CRDO"/&gt;
 *     &lt;enumeration value="FILE"/&gt;
 *     &lt;enumeration value="CHAP"/&gt;
 *     &lt;enumeration value="MRAP"/&gt;
 *     &lt;enumeration value="MRIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserInterface6Code")
@XmlEnum
public enum UserInterface6Code {

    CDSP,
    CRCP,
    MDSP,
    MRCP,
    CRDO,
    FILE,
    CHAP,
    MRAP,
    MRIN;

    public String value() {
        return name();
    }

    public static UserInterface6Code fromValue(String v) {
        return valueOf(v);
    }

}
