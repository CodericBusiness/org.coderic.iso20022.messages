//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 07:25:24 PM COT 
//


package org.coderic.iso20022.externalcodes.canm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptedDataFormat1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="EncryptedDataFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ASCI"/&gt;
 *     &lt;enumeration value="BINF"/&gt;
 *     &lt;enumeration value="EBCD"/&gt;
 *     &lt;enumeration value="HEXF"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptedDataFormat1Code")
@XmlEnum
public enum EncryptedDataFormat1Code {

    ASCI,
    BINF,
    EBCD,
    HEXF,
    OTHN,
    OTHP;

    public String value() {
        return name();
    }

    public static EncryptedDataFormat1Code fromValue(String v) {
        return valueOf(v);
    }

}