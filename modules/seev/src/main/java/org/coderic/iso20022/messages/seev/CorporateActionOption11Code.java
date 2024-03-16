//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:44 PM COT 
//


package org.coderic.iso20022.messages.seev;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CorporateActionOption11Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CorporateActionOption11Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABST"/&gt;
 *     &lt;enumeration value="BSPL"/&gt;
 *     &lt;enumeration value="BUYA"/&gt;
 *     &lt;enumeration value="CASE"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="CEXC"/&gt;
 *     &lt;enumeration value="CONN"/&gt;
 *     &lt;enumeration value="CONY"/&gt;
 *     &lt;enumeration value="CTEN"/&gt;
 *     &lt;enumeration value="EXER"/&gt;
 *     &lt;enumeration value="LAPS"/&gt;
 *     &lt;enumeration value="MPUT"/&gt;
 *     &lt;enumeration value="NOAC"/&gt;
 *     &lt;enumeration value="NOQU"/&gt;
 *     &lt;enumeration value="OFFR"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="OVER"/&gt;
 *     &lt;enumeration value="QINV"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="SLLE"/&gt;
 *     &lt;enumeration value="PRUN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CorporateActionOption11Code")
@XmlEnum
public enum CorporateActionOption11Code {

    ABST,
    BSPL,
    BUYA,
    CASE,
    CASH,
    CEXC,
    CONN,
    CONY,
    CTEN,
    EXER,
    LAPS,
    MPUT,
    NOAC,
    NOQU,
    OFFR,
    OTHR,
    OVER,
    QINV,
    SECU,
    SLLE,
    PRUN;

    public String value() {
        return name();
    }

    public static CorporateActionOption11Code fromValue(String v) {
        return valueOf(v);
    }

}
