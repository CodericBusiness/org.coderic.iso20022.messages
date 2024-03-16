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
 * <p>Clase Java para KeyUsage1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="KeyUsage1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ENCR"/&gt;
 *     &lt;enumeration value="DCPT"/&gt;
 *     &lt;enumeration value="DENC"/&gt;
 *     &lt;enumeration value="DDEC"/&gt;
 *     &lt;enumeration value="TRNI"/&gt;
 *     &lt;enumeration value="TRNX"/&gt;
 *     &lt;enumeration value="MACG"/&gt;
 *     &lt;enumeration value="MACV"/&gt;
 *     &lt;enumeration value="SIGG"/&gt;
 *     &lt;enumeration value="SUGV"/&gt;
 *     &lt;enumeration value="PINE"/&gt;
 *     &lt;enumeration value="PIND"/&gt;
 *     &lt;enumeration value="PINV"/&gt;
 *     &lt;enumeration value="KEYG"/&gt;
 *     &lt;enumeration value="KEYI"/&gt;
 *     &lt;enumeration value="KEYX"/&gt;
 *     &lt;enumeration value="KEYD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "KeyUsage1Code")
@XmlEnum
public enum KeyUsage1Code {

    ENCR,
    DCPT,
    DENC,
    DDEC,
    TRNI,
    TRNX,
    MACG,
    MACV,
    SIGG,
    SUGV,
    PINE,
    PIND,
    PINV,
    KEYG,
    KEYI,
    KEYX,
    KEYD;

    public String value() {
        return name();
    }

    public static KeyUsage1Code fromValue(String v) {
        return valueOf(v);
    }

}
