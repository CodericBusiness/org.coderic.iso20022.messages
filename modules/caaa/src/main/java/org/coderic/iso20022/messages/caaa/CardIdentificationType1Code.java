//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CardIdentificationType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardIdentificationType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACCT"/&gt;
 *     &lt;enumeration value="BARC"/&gt;
 *     &lt;enumeration value="ISO2"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="CPAN"/&gt;
 *     &lt;enumeration value="PRIV"/&gt;
 *     &lt;enumeration value="UUID"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardIdentificationType1Code")
@XmlEnum
public enum CardIdentificationType1Code {

    ACCT("ACCT"),
    BARC("BARC"),
    @XmlEnumValue("ISO2")
    ISO_2("ISO2"),
    PHON("PHON"),
    CPAN("CPAN"),
    PRIV("PRIV"),
    UUID("UUID");
    private final String value;

    CardIdentificationType1Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardIdentificationType1Code fromValue(String v) {
        for (CardIdentificationType1Code c: CardIdentificationType1Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
