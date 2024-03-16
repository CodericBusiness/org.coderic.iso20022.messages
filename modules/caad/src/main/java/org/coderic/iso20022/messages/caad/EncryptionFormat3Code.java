//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:07 PM COT 
//


package org.coderic.iso20022.messages.caad;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EncryptionFormat3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="EncryptionFormat3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TR34"/&gt;
 *     &lt;enumeration value="TR31"/&gt;
 *     &lt;enumeration value="CTCE"/&gt;
 *     &lt;enumeration value="CBCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EncryptionFormat3Code")
@XmlEnum
public enum EncryptionFormat3Code {

    @XmlEnumValue("TR34")
    TR_34("TR34"),
    @XmlEnumValue("TR31")
    TR_31("TR31"),
    CTCE("CTCE"),
    CBCE("CBCE");
    private final String value;

    EncryptionFormat3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EncryptionFormat3Code fromValue(String v) {
        for (EncryptionFormat3Code c: EncryptionFormat3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
