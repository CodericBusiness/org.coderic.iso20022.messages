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
 * <p>Clase Java para Identification3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="Identification3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DRID"/&gt;
 *     &lt;enumeration value="NTID"/&gt;
 *     &lt;enumeration value="PASS"/&gt;
 *     &lt;enumeration value="SSYN"/&gt;
 *     &lt;enumeration value="ARNB"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="PHNB"/&gt;
 *     &lt;enumeration value="CUID"/&gt;
 *     &lt;enumeration value="TXID"/&gt;
 *     &lt;enumeration value="PRXY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Identification3Code")
@XmlEnum
public enum Identification3Code {

    DRID,
    NTID,
    PASS,
    SSYN,
    ARNB,
    OTHP,
    OTHN,
    EMAL,
    PHNB,
    CUID,
    TXID,
    PRXY;

    public String value() {
        return name();
    }

    public static Identification3Code fromValue(String v) {
        return valueOf(v);
    }

}
