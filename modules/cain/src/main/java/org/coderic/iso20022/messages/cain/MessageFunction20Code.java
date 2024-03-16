//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:34 PM COT 
//


package org.coderic.iso20022.messages.cain;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageFunction20Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MessageFunction20Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADVC"/&gt;
 *     &lt;enumeration value="NOTI"/&gt;
 *     &lt;enumeration value="REQU"/&gt;
 *     &lt;enumeration value="RVRA"/&gt;
 *     &lt;enumeration value="RVNO"/&gt;
 *     &lt;enumeration value="STAD"/&gt;
 *     &lt;enumeration value="STNO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageFunction20Code")
@XmlEnum
public enum MessageFunction20Code {

    ADVC,
    NOTI,
    REQU,
    RVRA,
    RVNO,
    STAD,
    STNO;

    public String value() {
        return name();
    }

    public static MessageFunction20Code fromValue(String v) {
        return valueOf(v);
    }

}
