//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 07:25:23 PM COT 
//


package org.coderic.iso20022.externalcodes.camt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SettlementMethod1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="SettlementMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDA"/&gt;
 *     &lt;enumeration value="INGA"/&gt;
 *     &lt;enumeration value="COVE"/&gt;
 *     &lt;enumeration value="CLRG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SettlementMethod1Code")
@XmlEnum
public enum SettlementMethod1Code {

    INDA,
    INGA,
    COVE,
    CLRG;

    public String value() {
        return name();
    }

    public static SettlementMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}