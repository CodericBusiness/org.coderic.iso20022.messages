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
 * <p>Clase Java para RetailerService9Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RetailerService9Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DDYP"/&gt;
 *     &lt;enumeration value="DINP"/&gt;
 *     &lt;enumeration value="DPRP"/&gt;
 *     &lt;enumeration value="DSOP"/&gt;
 *     &lt;enumeration value="DSIP"/&gt;
 *     &lt;enumeration value="DCIP"/&gt;
 *     &lt;enumeration value="DCAP"/&gt;
 *     &lt;enumeration value="DCPP"/&gt;
 *     &lt;enumeration value="DCOP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerService9Code")
@XmlEnum
public enum RetailerService9Code {

    DDYP,
    DINP,
    DPRP,
    DSOP,
    DSIP,
    DCIP,
    DCAP,
    DCPP,
    DCOP;

    public String value() {
        return name();
    }

    public static RetailerService9Code fromValue(String v) {
        return valueOf(v);
    }

}
