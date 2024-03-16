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
 * <p>Clase Java para CardDataReading5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardDataReading5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TAGC"/&gt;
 *     &lt;enumeration value="PHYS"/&gt;
 *     &lt;enumeration value="BRCD"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="CICC"/&gt;
 *     &lt;enumeration value="DFLE"/&gt;
 *     &lt;enumeration value="CTLS"/&gt;
 *     &lt;enumeration value="ECTL"/&gt;
 *     &lt;enumeration value="CDFL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading5Code")
@XmlEnum
public enum CardDataReading5Code {

    TAGC,
    PHYS,
    BRCD,
    MGST,
    CICC,
    DFLE,
    CTLS,
    ECTL,
    CDFL;

    public String value() {
        return name();
    }

    public static CardDataReading5Code fromValue(String v) {
        return valueOf(v);
    }

}
