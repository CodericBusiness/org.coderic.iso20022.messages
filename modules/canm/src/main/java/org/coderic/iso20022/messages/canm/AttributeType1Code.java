//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:46 PM COT 
//


package org.coderic.iso20022.messages.canm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AttributeType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="AttributeType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CNAT"/&gt;
 *     &lt;enumeration value="LATT"/&gt;
 *     &lt;enumeration value="OATT"/&gt;
 *     &lt;enumeration value="OUAT"/&gt;
 *     &lt;enumeration value="CATT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttributeType1Code")
@XmlEnum
public enum AttributeType1Code {

    CNAT,
    LATT,
    OATT,
    OUAT,
    CATT;

    public String value() {
        return name();
    }

    public static AttributeType1Code fromValue(String v) {
        return valueOf(v);
    }

}
