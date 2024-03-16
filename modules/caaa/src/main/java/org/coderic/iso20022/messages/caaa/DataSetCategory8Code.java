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
 * <p>Clase Java para DataSetCategory8Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="DataSetCategory8Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SWPK"/&gt;
 *     &lt;enumeration value="VDPR"/&gt;
 *     &lt;enumeration value="AQPR"/&gt;
 *     &lt;enumeration value="MRPR"/&gt;
 *     &lt;enumeration value="TXCP"/&gt;
 *     &lt;enumeration value="AKCP"/&gt;
 *     &lt;enumeration value="STRP"/&gt;
 *     &lt;enumeration value="DLGT"/&gt;
 *     &lt;enumeration value="MGTP"/&gt;
 *     &lt;enumeration value="RCLE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataSetCategory8Code")
@XmlEnum
public enum DataSetCategory8Code {

    SWPK,
    VDPR,
    AQPR,
    MRPR,
    TXCP,
    AKCP,
    STRP,
    DLGT,
    MGTP,
    RCLE;

    public String value() {
        return name();
    }

    public static DataSetCategory8Code fromValue(String v) {
        return valueOf(v);
    }

}
