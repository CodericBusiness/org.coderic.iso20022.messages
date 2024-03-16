//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para StoredValueAccountType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="StoredValueAccountType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BNKA"/&gt;
 *     &lt;enumeration value="CWVC"/&gt;
 *     &lt;enumeration value="CPYA"/&gt;
 *     &lt;enumeration value="ELMY"/&gt;
 *     &lt;enumeration value="GIFT"/&gt;
 *     &lt;enumeration value="GCER"/&gt;
 *     &lt;enumeration value="MLVC"/&gt;
 *     &lt;enumeration value="OLVC"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="PHON"/&gt;
 *     &lt;enumeration value="CARD"/&gt;
 *     &lt;enumeration value="TRVL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StoredValueAccountType1Code")
@XmlEnum
public enum StoredValueAccountType1Code {

    BNKA,
    CWVC,
    CPYA,
    ELMY,
    GIFT,
    GCER,
    MLVC,
    OLVC,
    MERC,
    OTHR,
    PHON,
    CARD,
    TRVL;

    public String value() {
        return name();
    }

    public static StoredValueAccountType1Code fromValue(String v) {
        return valueOf(v);
    }

}
