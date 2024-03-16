//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuthenticationMethod6Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AuthenticationMethod6Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NPIN"/&gt;
 *     &lt;enumeration value="PPSG"/&gt;
 *     &lt;enumeration value="PSWD"/&gt;
 *     &lt;enumeration value="SCRT"/&gt;
 *     &lt;enumeration value="SCNL"/&gt;
 *     &lt;enumeration value="SNCT"/&gt;
 *     &lt;enumeration value="CPSG"/&gt;
 *     &lt;enumeration value="ADDB"/&gt;
 *     &lt;enumeration value="BIOM"/&gt;
 *     &lt;enumeration value="CDHI"/&gt;
 *     &lt;enumeration value="CRYP"/&gt;
 *     &lt;enumeration value="CSCV"/&gt;
 *     &lt;enumeration value="PSVE"/&gt;
 *     &lt;enumeration value="CSEC"/&gt;
 *     &lt;enumeration value="ADDS"/&gt;
 *     &lt;enumeration value="MANU"/&gt;
 *     &lt;enumeration value="FPIN"/&gt;
 *     &lt;enumeration value="TOKP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationMethod6Code")
@XmlEnum
public enum AuthenticationMethod6Code {

    NPIN,
    PPSG,
    PSWD,
    SCRT,
    SCNL,
    SNCT,
    CPSG,
    ADDB,
    BIOM,
    CDHI,
    CRYP,
    CSCV,
    PSVE,
    CSEC,
    ADDS,
    MANU,
    FPIN,
    TOKP;

    public String value() {
        return name();
    }

    public static AuthenticationMethod6Code fromValue(String v) {
        return valueOf(v);
    }

}
