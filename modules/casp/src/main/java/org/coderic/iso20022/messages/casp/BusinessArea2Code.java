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
 * <p>Clase Java para BusinessArea2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="BusinessArea2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AIBD"/&gt;
 *     &lt;enumeration value="PPAY"/&gt;
 *     &lt;enumeration value="TKNF"/&gt;
 *     &lt;enumeration value="EOPT"/&gt;
 *     &lt;enumeration value="TOPT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BusinessArea2Code")
@XmlEnum
public enum BusinessArea2Code {

    AIBD,
    PPAY,
    TKNF,
    EOPT,
    TOPT;

    public String value() {
        return name();
    }

    public static BusinessArea2Code fromValue(String v) {
        return valueOf(v);
    }

}
