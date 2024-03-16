//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:39 PM COT 
//


package org.coderic.iso20022.messages.camt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InvestigationLocationMethod1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InvestigationLocationMethod1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EDIC"/&gt;
 *     &lt;enumeration value="EMAL"/&gt;
 *     &lt;enumeration value="FAXI"/&gt;
 *     &lt;enumeration value="POST"/&gt;
 *     &lt;enumeration value="SMSM"/&gt;
 *     &lt;enumeration value="URID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InvestigationLocationMethod1Code")
@XmlEnum
public enum InvestigationLocationMethod1Code {

    EDIC,
    EMAL,
    FAXI,
    POST,
    SMSM,
    URID;

    public String value() {
        return name();
    }

    public static InvestigationLocationMethod1Code fromValue(String v) {
        return valueOf(v);
    }

}
