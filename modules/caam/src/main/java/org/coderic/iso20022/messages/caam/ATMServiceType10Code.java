//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:11 PM COT 
//


package org.coderic.iso20022.messages.caam;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ATMServiceType10Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ATMServiceType10Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRFC"/&gt;
 *     &lt;enumeration value="TRFI"/&gt;
 *     &lt;enumeration value="TRFP"/&gt;
 *     &lt;enumeration value="ASTS"/&gt;
 *     &lt;enumeration value="BLCQ"/&gt;
 *     &lt;enumeration value="CDVF"/&gt;
 *     &lt;enumeration value="CHSN"/&gt;
 *     &lt;enumeration value="CMPF"/&gt;
 *     &lt;enumeration value="DCCS"/&gt;
 *     &lt;enumeration value="XRTD"/&gt;
 *     &lt;enumeration value="XRTW"/&gt;
 *     &lt;enumeration value="MCHG"/&gt;
 *     &lt;enumeration value="DPSN"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="PINR"/&gt;
 *     &lt;enumeration value="PINU"/&gt;
 *     &lt;enumeration value="PATH"/&gt;
 *     &lt;enumeration value="PRFL"/&gt;
 *     &lt;enumeration value="EMVS"/&gt;
 *     &lt;enumeration value="STDR"/&gt;
 *     &lt;enumeration value="SPRV"/&gt;
 *     &lt;enumeration value="DPSV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ATMServiceType10Code")
@XmlEnum
public enum ATMServiceType10Code {

    TRFC,
    TRFI,
    TRFP,
    ASTS,
    BLCQ,
    CDVF,
    CHSN,
    CMPF,
    DCCS,
    XRTD,
    XRTW,
    MCHG,
    DPSN,
    PINC,
    PINR,
    PINU,
    PATH,
    PRFL,
    EMVS,
    STDR,
    SPRV,
    DPSV;

    public String value() {
        return name();
    }

    public static ATMServiceType10Code fromValue(String v) {
        return valueOf(v);
    }

}
