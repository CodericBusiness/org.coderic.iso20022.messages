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
 * <p>Clase Java para PriceValueType7Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PriceValueType7Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="PREM"/&gt;
 *     &lt;enumeration value="PARV"/&gt;
 *     &lt;enumeration value="YIEL"/&gt;
 *     &lt;enumeration value="SPRE"/&gt;
 *     &lt;enumeration value="PEUN"/&gt;
 *     &lt;enumeration value="ABSO"/&gt;
 *     &lt;enumeration value="TEDP"/&gt;
 *     &lt;enumeration value="TEDY"/&gt;
 *     &lt;enumeration value="FICT"/&gt;
 *     &lt;enumeration value="VACT"/&gt;
 *     &lt;enumeration value="PRCT"/&gt;
 *     &lt;enumeration value="ACTU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PriceValueType7Code")
@XmlEnum
public enum PriceValueType7Code {

    DISC,
    PREM,
    PARV,
    YIEL,
    SPRE,
    PEUN,
    ABSO,
    TEDP,
    TEDY,
    FICT,
    VACT,
    PRCT,
    ACTU;

    public String value() {
        return name();
    }

    public static PriceValueType7Code fromValue(String v) {
        return valueOf(v);
    }

}
