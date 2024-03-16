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
 * <p>Clase Java para CustomerDeviceType2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CustomerDeviceType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MOBL"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PECR"/&gt;
 *     &lt;enumeration value="TBLT"/&gt;
 *     &lt;enumeration value="NSCR"/&gt;
 *     &lt;enumeration value="SECR"/&gt;
 *     &lt;enumeration value="EMBD"/&gt;
 *     &lt;enumeration value="VHCL"/&gt;
 *     &lt;enumeration value="WRBL"/&gt;
 *     &lt;enumeration value="WATC"/&gt;
 *     &lt;enumeration value="GAMB"/&gt;
 *     &lt;enumeration value="JEWL"/&gt;
 *     &lt;enumeration value="KFOB"/&gt;
 *     &lt;enumeration value="STIC"/&gt;
 *     &lt;enumeration value="UNKW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CustomerDeviceType2Code")
@XmlEnum
public enum CustomerDeviceType2Code {

    MOBL,
    OTHN,
    OTHP,
    PECR,
    TBLT,
    NSCR,
    SECR,
    EMBD,
    VHCL,
    WRBL,
    WATC,
    GAMB,
    JEWL,
    KFOB,
    STIC,
    UNKW;

    public String value() {
        return name();
    }

    public static CustomerDeviceType2Code fromValue(String v) {
        return valueOf(v);
    }

}
