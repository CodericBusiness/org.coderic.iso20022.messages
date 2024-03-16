//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:46:58 PM COT 
//


package org.coderic.iso20022.messages.caaa;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SaleCapabilities1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="SaleCapabilities1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CHDI"/&gt;
 *     &lt;enumeration value="CHER"/&gt;
 *     &lt;enumeration value="CHIN"/&gt;
 *     &lt;enumeration value="CHST"/&gt;
 *     &lt;enumeration value="CUDI"/&gt;
 *     &lt;enumeration value="CUAS"/&gt;
 *     &lt;enumeration value="CUER"/&gt;
 *     &lt;enumeration value="CUIN"/&gt;
 *     &lt;enumeration value="POIR"/&gt;
 *     &lt;enumeration value="PRDC"/&gt;
 *     &lt;enumeration value="PRRP"/&gt;
 *     &lt;enumeration value="PRVC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaleCapabilities1Code")
@XmlEnum
public enum SaleCapabilities1Code {

    CHDI,
    CHER,
    CHIN,
    CHST,
    CUDI,
    CUAS,
    CUER,
    CUIN,
    POIR,
    PRDC,
    PRRP,
    PRVC;

    public String value() {
        return name();
    }

    public static SaleCapabilities1Code fromValue(String v) {
        return valueOf(v);
    }

}
