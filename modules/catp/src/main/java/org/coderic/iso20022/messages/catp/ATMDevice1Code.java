//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMDevice1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ATMDevice1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CDIS"/&gt;
 *     &lt;enumeration value="DPRN"/&gt;
 *     &lt;enumeration value="JRNL"/&gt;
 *     &lt;enumeration value="JPRN"/&gt;
 *     &lt;enumeration value="RPRN"/&gt;
 *     &lt;enumeration value="RWDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMDevice1Code")
@XmlEnum
public enum ATMDevice1Code {

    CDIS,
    DPRN,
    JRNL,
    JPRN,
    RPRN,
    RWDR;

    public String value() {
        return name();
    }

    public static ATMDevice1Code fromValue(String v) {
        return valueOf(v);
    }

}
