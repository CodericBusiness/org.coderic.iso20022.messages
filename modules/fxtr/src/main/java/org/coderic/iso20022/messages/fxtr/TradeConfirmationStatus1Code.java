//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:16 PM COT 
//


package org.coderic.iso20022.messages.fxtr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TradeConfirmationStatus1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="TradeConfirmationStatus1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALST"/&gt;
 *     &lt;enumeration value="CONF"/&gt;
 *     &lt;enumeration value="DISA"/&gt;
 *     &lt;enumeration value="EMCN"/&gt;
 *     &lt;enumeration value="MISM"/&gt;
 *     &lt;enumeration value="SCCN"/&gt;
 *     &lt;enumeration value="SNCC"/&gt;
 *     &lt;enumeration value="SNCN"/&gt;
 *     &lt;enumeration value="UNCN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TradeConfirmationStatus1Code")
@XmlEnum
public enum TradeConfirmationStatus1Code {

    ALST,
    CONF,
    DISA,
    EMCN,
    MISM,
    SCCN,
    SNCC,
    SNCN,
    UNCN;

    public String value() {
        return name();
    }

    public static TradeConfirmationStatus1Code fromValue(String v) {
        return valueOf(v);
    }

}
