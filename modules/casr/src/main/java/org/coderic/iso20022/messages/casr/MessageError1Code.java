//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:58 PM COT 
//


package org.coderic.iso20022.messages.casr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MessageError1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MessageError1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IDEF"/&gt;
 *     &lt;enumeration value="IDEL"/&gt;
 *     &lt;enumeration value="IDEV"/&gt;
 *     &lt;enumeration value="INME"/&gt;
 *     &lt;enumeration value="INMF"/&gt;
 *     &lt;enumeration value="MEPE"/&gt;
 *     &lt;enumeration value="OTHP"/&gt;
 *     &lt;enumeration value="PRVE"/&gt;
 *     &lt;enumeration value="RDEM"/&gt;
 *     &lt;enumeration value="SECU"/&gt;
 *     &lt;enumeration value="UDFD"/&gt;
 *     &lt;enumeration value="OTHN"/&gt;
 *     &lt;enumeration value="ITDE"/&gt;
 *     &lt;enumeration value="DUME"/&gt;
 *     &lt;enumeration value="IDWM"/&gt;
 *     &lt;enumeration value="IDRM"/&gt;
 *     &lt;enumeration value="IBAT"/&gt;
 *     &lt;enumeration value="ICOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageError1Code")
@XmlEnum
public enum MessageError1Code {

    IDEF,
    IDEL,
    IDEV,
    INME,
    INMF,
    MEPE,
    OTHP,
    PRVE,
    RDEM,
    SECU,
    UDFD,
    OTHN,
    ITDE,
    DUME,
    IDWM,
    IDRM,
    IBAT,
    ICOL;

    public String value() {
        return name();
    }

    public static MessageError1Code fromValue(String v) {
        return valueOf(v);
    }

}
