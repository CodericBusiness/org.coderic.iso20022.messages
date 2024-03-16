//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageClass1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MessageClass1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADDE"/&gt;
 *     &lt;enumeration value="AMDT"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="CMGT"/&gt;
 *     &lt;enumeration value="CBCK"/&gt;
 *     &lt;enumeration value="FEEC"/&gt;
 *     &lt;enumeration value="FINL"/&gt;
 *     &lt;enumeration value="INQY"/&gt;
 *     &lt;enumeration value="VERI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageClass1Code")
@XmlEnum
public enum MessageClass1Code {

    ADDE,
    AMDT,
    AUTH,
    CMGT,
    CBCK,
    FEEC,
    FINL,
    INQY,
    VERI;

    public String value() {
        return name();
    }

    public static MessageClass1Code fromValue(String v) {
        return valueOf(v);
    }

}
