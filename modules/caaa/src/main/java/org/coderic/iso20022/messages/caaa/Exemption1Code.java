//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Exemption1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Exemption1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LOWA"/&gt;
 *     &lt;enumeration value="MINT"/&gt;
 *     &lt;enumeration value="RECP"/&gt;
 *     &lt;enumeration value="SCPE"/&gt;
 *     &lt;enumeration value="SCAD"/&gt;
 *     &lt;enumeration value="TRAE"/&gt;
 *     &lt;enumeration value="PKGE"/&gt;
 *     &lt;enumeration value="TMBE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Exemption1Code")
@XmlEnum
public enum Exemption1Code {

    LOWA,
    MINT,
    RECP,
    SCPE,
    SCAD,
    TRAE,
    PKGE,
    TMBE;

    public String value() {
        return name();
    }

    public static Exemption1Code fromValue(String v) {
        return valueOf(v);
    }

}
