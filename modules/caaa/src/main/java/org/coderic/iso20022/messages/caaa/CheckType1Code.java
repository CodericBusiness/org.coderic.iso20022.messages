//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 08:18:04 PM COT 
//


package org.coderic.iso20022.externalcodes.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CheckType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CheckType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BANK"/&gt;
 *     &lt;enumeration value="BUSI"/&gt;
 *     &lt;enumeration value="GOVC"/&gt;
 *     &lt;enumeration value="PAYR"/&gt;
 *     &lt;enumeration value="PERS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CheckType1Code")
@XmlEnum
public enum CheckType1Code {

    BANK,
    BUSI,
    GOVC,
    PAYR,
    PERS;

    public String value() {
        return name();
    }

    public static CheckType1Code fromValue(String v) {
        return valueOf(v);
    }

}