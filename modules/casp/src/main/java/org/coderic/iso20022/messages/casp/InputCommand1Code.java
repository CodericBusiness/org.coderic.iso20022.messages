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
 * <p>Clase Java para InputCommand1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InputCommand1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DCSG"/&gt;
 *     &lt;enumeration value="DGSG"/&gt;
 *     &lt;enumeration value="GAKY"/&gt;
 *     &lt;enumeration value="GCNF"/&gt;
 *     &lt;enumeration value="GFKY"/&gt;
 *     &lt;enumeration value="GMNE"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="SITE"/&gt;
 *     &lt;enumeration value="TXSG"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InputCommand1Code")
@XmlEnum
public enum InputCommand1Code {

    DCSG,
    DGSG,
    GAKY,
    GCNF,
    GFKY,
    GMNE,
    PSWD,
    SITE,
    TXSG,
    HTML,
    SIGN;

    public String value() {
        return name();
    }

    public static InputCommand1Code fromValue(String v) {
        return valueOf(v);
    }

}
