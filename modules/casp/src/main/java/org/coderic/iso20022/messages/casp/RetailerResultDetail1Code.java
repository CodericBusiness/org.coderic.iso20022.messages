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
 * <p>Clase Java para RetailerResultDetail1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="RetailerResultDetail1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABRT"/&gt;
 *     &lt;enumeration value="BUSY"/&gt;
 *     &lt;enumeration value="CANC"/&gt;
 *     &lt;enumeration value="DEVO"/&gt;
 *     &lt;enumeration value="WPIN"/&gt;
 *     &lt;enumeration value="NHOS"/&gt;
 *     &lt;enumeration value="UNVS"/&gt;
 *     &lt;enumeration value="UNVD"/&gt;
 *     &lt;enumeration value="REFU"/&gt;
 *     &lt;enumeration value="PAYR"/&gt;
 *     &lt;enumeration value="TNFD"/&gt;
 *     &lt;enumeration value="NALW"/&gt;
 *     &lt;enumeration value="LOUT"/&gt;
 *     &lt;enumeration value="IVCA"/&gt;
 *     &lt;enumeration value="ICAR"/&gt;
 *     &lt;enumeration value="WIPG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RetailerResultDetail1Code")
@XmlEnum
public enum RetailerResultDetail1Code {

    ABRT,
    BUSY,
    CANC,
    DEVO,
    WPIN,
    NHOS,
    UNVS,
    UNVD,
    REFU,
    PAYR,
    TNFD,
    NALW,
    LOUT,
    IVCA,
    ICAR,
    WIPG;

    public String value() {
        return name();
    }

    public static RetailerResultDetail1Code fromValue(String v) {
        return valueOf(v);
    }

}
