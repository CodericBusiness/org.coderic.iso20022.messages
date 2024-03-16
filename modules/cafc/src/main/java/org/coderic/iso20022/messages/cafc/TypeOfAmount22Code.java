//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TypeOfAmount22Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TypeOfAmount22Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTL"/&gt;
 *     &lt;enumeration value="DFLT"/&gt;
 *     &lt;enumeration value="DPST"/&gt;
 *     &lt;enumeration value="ESTM"/&gt;
 *     &lt;enumeration value="MAXI"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *     &lt;enumeration value="RESD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount22Code")
@XmlEnum
public enum TypeOfAmount22Code {

    ACTL,
    DFLT,
    DPST,
    ESTM,
    MAXI,
    PRXY,
    RESD;

    public String value() {
        return name();
    }

    public static TypeOfAmount22Code fromValue(String v) {
        return valueOf(v);
    }

}
