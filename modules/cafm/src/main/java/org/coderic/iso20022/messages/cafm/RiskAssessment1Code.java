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
 * <p>Clase Java para RiskAssessment1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RiskAssessment1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APPC"/&gt;
 *     &lt;enumeration value="APPH"/&gt;
 *     &lt;enumeration value="APPU"/&gt;
 *     &lt;enumeration value="DONT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RiskAssessment1Code")
@XmlEnum
public enum RiskAssessment1Code {

    APPC,
    APPH,
    APPU,
    DONT;

    public String value() {
        return name();
    }

    public static RiskAssessment1Code fromValue(String v) {
        return valueOf(v);
    }

}
