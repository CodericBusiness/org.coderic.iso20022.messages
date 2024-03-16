//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardDataWriting1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardDataWriting1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICPY"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="ICCY"/&gt;
 *     &lt;enumeration value="MSIP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataWriting1Code")
@XmlEnum
public enum CardDataWriting1Code {

    ICPY,
    MGST,
    ICCY,
    MSIP,
    OTHN,
    UNSP,
    OTHP;

    public String value() {
        return name();
    }

    public static CardDataWriting1Code fromValue(String v) {
        return valueOf(v);
    }

}
