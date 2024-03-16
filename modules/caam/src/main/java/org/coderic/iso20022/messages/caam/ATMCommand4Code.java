//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMCommand4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ATMCommand4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABAL"/&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="CFGT"/&gt;
 *     &lt;enumeration value="CCNT"/&gt;
 *     &lt;enumeration value="DISC"/&gt;
 *     &lt;enumeration value="SNDM"/&gt;
 *     &lt;enumeration value="RPTC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMCommand4Code")
@XmlEnum
public enum ATMCommand4Code {

    ABAL,
    ASTS,
    CFGT,
    CCNT,
    DISC,
    SNDM,
    RPTC;

    public String value() {
        return name();
    }

    public static ATMCommand4Code fromValue(String v) {
        return valueOf(v);
    }

}
