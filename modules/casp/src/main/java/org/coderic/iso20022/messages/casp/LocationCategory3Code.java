//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LocationCategory3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="LocationCategory3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDR"/&gt;
 *     &lt;enumeration value="IPMP"/&gt;
 *     &lt;enumeration value="MPOI"/&gt;
 *     &lt;enumeration value="MPMP"/&gt;
 *     &lt;enumeration value="MSLE"/&gt;
 *     &lt;enumeration value="SSLE"/&gt;
 *     &lt;enumeration value="VNDG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LocationCategory3Code")
@XmlEnum
public enum LocationCategory3Code {

    INDR,
    IPMP,
    MPOI,
    MPMP,
    MSLE,
    SSLE,
    VNDG;

    public String value() {
        return name();
    }

    public static LocationCategory3Code fromValue(String v) {
        return valueOf(v);
    }

}
