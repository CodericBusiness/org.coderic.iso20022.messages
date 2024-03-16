//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:02 PM COT 
//


package org.coderic.iso20022.messages.catm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartyType33Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="PartyType33Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OPOI"/&gt;
 *     &lt;enumeration value="MERC"/&gt;
 *     &lt;enumeration value="ACCP"/&gt;
 *     &lt;enumeration value="ITAG"/&gt;
 *     &lt;enumeration value="ACQR"/&gt;
 *     &lt;enumeration value="CISS"/&gt;
 *     &lt;enumeration value="DLIS"/&gt;
 *     &lt;enumeration value="MTMG"/&gt;
 *     &lt;enumeration value="TAXH"/&gt;
 *     &lt;enumeration value="TMGT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartyType33Code")
@XmlEnum
public enum PartyType33Code {

    OPOI,
    MERC,
    ACCP,
    ITAG,
    ACQR,
    CISS,
    DLIS,
    MTMG,
    TAXH,
    TMGT;

    public String value() {
        return name();
    }

    public static PartyType33Code fromValue(String v) {
        return valueOf(v);
    }

}
