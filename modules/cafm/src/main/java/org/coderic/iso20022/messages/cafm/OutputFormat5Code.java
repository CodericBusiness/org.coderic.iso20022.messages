//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OutputFormat5Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="OutputFormat5Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="URLI"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="PLIN"/&gt;
 *     &lt;enumeration value="JSON"/&gt;
 *     &lt;enumeration value="XMLF"/&gt;
 *     &lt;enumeration value="EDIF"/&gt;
 *     &lt;enumeration value="CSVF"/&gt;
 *     &lt;enumeration value="JPEG"/&gt;
 *     &lt;enumeration value="PDFF"/&gt;
 *     &lt;enumeration value="PNGF"/&gt;
 *     &lt;enumeration value="SVGF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OutputFormat5Code")
@XmlEnum
public enum OutputFormat5Code {

    OTHN,
    OTHP,
    TEXT,
    URLI,
    HTML,
    PLIN,
    JSON,
    XMLF,
    EDIF,
    CSVF,
    JPEG,
    PDFF,
    PNGF,
    SVGF;

    public String value() {
        return name();
    }

    public static OutputFormat5Code fromValue(String v) {
        return valueOf(v);
    }

}
