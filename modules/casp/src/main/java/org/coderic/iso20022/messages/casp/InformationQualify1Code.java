//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:51 PM COT 
//


package org.coderic.iso20022.messages.casp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para InformationQualify1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="InformationQualify1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSA"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="DOCT"/&gt;
 *     &lt;enumeration value="ERRO"/&gt;
 *     &lt;enumeration value="INPT"/&gt;
 *     &lt;enumeration value="POIR"/&gt;
 *     &lt;enumeration value="RCPT"/&gt;
 *     &lt;enumeration value="SOND"/&gt;
 *     &lt;enumeration value="STAT"/&gt;
 *     &lt;enumeration value="VCHR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InformationQualify1Code")
@XmlEnum
public enum InformationQualify1Code {

    CUSA,
    DISP,
    DOCT,
    ERRO,
    INPT,
    POIR,
    RCPT,
    SOND,
    STAT,
    VCHR;

    public String value() {
        return name();
    }

    public static InformationQualify1Code fromValue(String v) {
        return valueOf(v);
    }

}
