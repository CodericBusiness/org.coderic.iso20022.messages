//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.2 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.01.16 a las 03:52:50 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardDataReading10Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardDataReading10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ICPY"/&gt;
 *     &lt;enumeration value="MGST"/&gt;
 *     &lt;enumeration value="ICCY"/&gt;
 *     &lt;enumeration value="MICR"/&gt;
 *     &lt;enumeration value="MLEY"/&gt;
 *     &lt;enumeration value="OCRR"/&gt;
 *     &lt;enumeration value="MSIP"/&gt;
 *     &lt;enumeration value="OPTC"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="RFID"/&gt;
 *     &lt;enumeration value="UNSP"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="KEEN"/&gt;
 *     &lt;enumeration value="DFLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading10Code")
@XmlEnum
public enum CardDataReading10Code {

    ICPY,
    MGST,
    ICCY,
    MICR,
    MLEY,
    OCRR,
    MSIP,
    OPTC,
    OTHN,
    RFID,
    UNSP,
    OTHP,
    KEEN,
    DFLE;

    public String value() {
        return name();
    }

    public static CardDataReading10Code fromValue(String v) {
        return valueOf(v);
    }

}
