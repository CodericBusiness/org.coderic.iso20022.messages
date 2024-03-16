//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CryptographicKeyType3Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CryptographicKeyType3Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AES2"/&gt;
 *     &lt;enumeration value="EDE3"/&gt;
 *     &lt;enumeration value="DKP9"/&gt;
 *     &lt;enumeration value="AES9"/&gt;
 *     &lt;enumeration value="AES5"/&gt;
 *     &lt;enumeration value="EDE4"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CryptographicKeyType3Code")
@XmlEnum
public enum CryptographicKeyType3Code {

    @XmlEnumValue("AES2")
    AES_2("AES2"),
    @XmlEnumValue("EDE3")
    EDE_3("EDE3"),
    @XmlEnumValue("DKP9")
    DKP_9("DKP9"),
    @XmlEnumValue("AES9")
    AES_9("AES9"),
    @XmlEnumValue("AES5")
    AES_5("AES5"),
    @XmlEnumValue("EDE4")
    EDE_4("EDE4");
    private final String value;

    CryptographicKeyType3Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CryptographicKeyType3Code fromValue(String v) {
        for (CryptographicKeyType3Code c: CryptographicKeyType3Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
