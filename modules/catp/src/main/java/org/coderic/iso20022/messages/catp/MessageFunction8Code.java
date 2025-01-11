//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.11 a las 06:39:29 AM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageFunction8Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MessageFunction8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BALN"/&gt;
 *     &lt;enumeration value="GSTS"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="INQC"/&gt;
 *     &lt;enumeration value="KEYQ"/&gt;
 *     &lt;enumeration value="SSTS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction8Code")
@XmlEnum
public enum MessageFunction8Code {

    BALN,
    GSTS,
    DSEC,
    INQC,
    KEYQ,
    SSTS;

    public String value() {
        return name();
    }

    public static MessageFunction8Code fromValue(String v) {
        return valueOf(v);
    }

}
