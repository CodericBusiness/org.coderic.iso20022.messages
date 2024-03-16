//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptionFormat1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="EncryptionFormat1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TR31"/&gt;
 *     &lt;enumeration value="TR34"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptionFormat1Code")
@XmlEnum
public enum EncryptionFormat1Code {

    @XmlEnumValue("TR31")
    TR_31("TR31"),
    @XmlEnumValue("TR34")
    TR_34("TR34");
    private final String value;

    EncryptionFormat1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat1Code fromValue(String v) {
        for (EncryptionFormat1Code c: EncryptionFormat1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
