//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:15 PM COT 
//


package org.coderic.iso20022.messages.cafc;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TypeOfAmount21Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TypeOfAmount21Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INTC"/&gt;
 *     &lt;enumeration value="FEEP"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="FEEA"/&gt;
 *     &lt;enumeration value="CSIF"/&gt;
 *     &lt;enumeration value="MXIF"/&gt;
 *     &lt;enumeration value="MNIF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfAmount21Code")
@XmlEnum
public enum TypeOfAmount21Code {

    INTC,
    FEEP,
    OTHN,
    OTHP,
    FEEA,
    CSIF,
    MXIF,
    MNIF;

    public String value() {
        return name();
    }

    public static TypeOfAmount21Code fromValue(String v) {
        return valueOf(v);
    }

}
