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
 * <p>Clase Java para AffirmStatus1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AffirmStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATCN"/&gt;
 *     &lt;enumeration value="ATSC"/&gt;
 *     &lt;enumeration value="COMP"/&gt;
 *     &lt;enumeration value="MISM"/&gt;
 *     &lt;enumeration value="MISE"/&gt;
 *     &lt;enumeration value="NOTP"/&gt;
 *     &lt;enumeration value="OUOR"/&gt;
 *     &lt;enumeration value="OUOS"/&gt;
 *     &lt;enumeration value="RECE"/&gt;
 *     &lt;enumeration value="UNRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AffirmStatus1Code")
@XmlEnum
public enum AffirmStatus1Code {

    ATCN,
    ATSC,
    COMP,
    MISM,
    MISE,
    NOTP,
    OUOR,
    OUOS,
    RECE,
    UNRE;

    public String value() {
        return name();
    }

    public static AffirmStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
