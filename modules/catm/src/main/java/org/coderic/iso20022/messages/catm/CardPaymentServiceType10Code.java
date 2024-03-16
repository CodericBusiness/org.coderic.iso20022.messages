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
 * <p>Clase Java para CardPaymentServiceType10Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CardPaymentServiceType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CRTC"/&gt;
 *     &lt;enumeration value="CRTR"/&gt;
 *     &lt;enumeration value="CRTK"/&gt;
 *     &lt;enumeration value="WLSR"/&gt;
 *     &lt;enumeration value="WLSA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CardPaymentServiceType10Code")
@XmlEnum
public enum CardPaymentServiceType10Code {

    CRTC,
    CRTR,
    CRTK,
    WLSR,
    WLSA;

    public String value() {
        return name();
    }

    public static CardPaymentServiceType10Code fromValue(String v) {
        return valueOf(v);
    }

}
