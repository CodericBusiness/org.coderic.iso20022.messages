//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:33 PM COT 
//


package org.coderic.iso20022.messages.reda;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TypeOfIdentification1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TypeOfIdentification1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ARNU"/&gt;
 *     &lt;enumeration value="CCPT"/&gt;
 *     &lt;enumeration value="CHTY"/&gt;
 *     &lt;enumeration value="CORP"/&gt;
 *     &lt;enumeration value="DRLC"/&gt;
 *     &lt;enumeration value="FIIN"/&gt;
 *     &lt;enumeration value="TXID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfIdentification1Code")
@XmlEnum
public enum TypeOfIdentification1Code {

    ARNU,
    CCPT,
    CHTY,
    CORP,
    DRLC,
    FIIN,
    TXID;

    public String value() {
        return name();
    }

    public static TypeOfIdentification1Code fromValue(String v) {
        return valueOf(v);
    }

}
