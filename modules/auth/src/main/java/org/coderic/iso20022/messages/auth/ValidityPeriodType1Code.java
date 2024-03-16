//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:53 PM COT 
//


package org.coderic.iso20022.messages.auth;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ValidityPeriodType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ValidityPeriodType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FOKV"/&gt;
 *     &lt;enumeration value="GADV"/&gt;
 *     &lt;enumeration value="GASV"/&gt;
 *     &lt;enumeration value="GATV"/&gt;
 *     &lt;enumeration value="DAVY"/&gt;
 *     &lt;enumeration value="GTCV"/&gt;
 *     &lt;enumeration value="GTDV"/&gt;
 *     &lt;enumeration value="GTSV"/&gt;
 *     &lt;enumeration value="GTTV"/&gt;
 *     &lt;enumeration value="IOCV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ValidityPeriodType1Code")
@XmlEnum
public enum ValidityPeriodType1Code {

    FOKV,
    GADV,
    GASV,
    GATV,
    DAVY,
    GTCV,
    GTDV,
    GTSV,
    GTTV,
    IOCV;

    public String value() {
        return name();
    }

    public static ValidityPeriodType1Code fromValue(String v) {
        return valueOf(v);
    }

}
