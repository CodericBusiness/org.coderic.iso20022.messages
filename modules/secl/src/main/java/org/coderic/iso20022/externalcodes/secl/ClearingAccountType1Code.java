//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 08:18:25 PM COT 
//


package org.coderic.iso20022.externalcodes.secl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClearingAccountType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ClearingAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HOUS"/&gt;
 *     &lt;enumeration value="CLIE"/&gt;
 *     &lt;enumeration value="LIPR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ClearingAccountType1Code")
@XmlEnum
public enum ClearingAccountType1Code {

    HOUS,
    CLIE,
    LIPR;

    public String value() {
        return name();
    }

    public static ClearingAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
