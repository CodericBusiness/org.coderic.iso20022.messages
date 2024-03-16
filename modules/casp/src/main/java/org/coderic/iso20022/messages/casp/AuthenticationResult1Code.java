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
 * <p>Clase Java para AuthenticationResult1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AuthenticationResult1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DENY"/&gt;
 *     &lt;enumeration value="MRCH"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="CRPT"/&gt;
 *     &lt;enumeration value="UCRP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationResult1Code")
@XmlEnum
public enum AuthenticationResult1Code {

    DENY,
    MRCH,
    CARD,
    AUTH,
    CRPT,
    UCRP;

    public String value() {
        return name();
    }

    public static AuthenticationResult1Code fromValue(String v) {
        return valueOf(v);
    }

}
