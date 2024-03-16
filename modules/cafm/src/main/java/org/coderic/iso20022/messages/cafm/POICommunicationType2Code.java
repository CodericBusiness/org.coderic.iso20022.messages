//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para POICommunicationType2Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="POICommunicationType2Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BLTH"/&gt;
 *     &lt;enumeration value="ETHR"/&gt;
 *     &lt;enumeration value="GPRS"/&gt;
 *     &lt;enumeration value="GSMF"/&gt;
 *     &lt;enumeration value="PSTN"/&gt;
 *     &lt;enumeration value="RS23"/&gt;
 *     &lt;enumeration value="USBD"/&gt;
 *     &lt;enumeration value="USBH"/&gt;
 *     &lt;enumeration value="WIFI"/&gt;
 *     &lt;enumeration value="WT2G"/&gt;
 *     &lt;enumeration value="WT3G"/&gt;
 *     &lt;enumeration value="WT4G"/&gt;
 *     &lt;enumeration value="WT5G"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POICommunicationType2Code")
@XmlEnum
public enum POICommunicationType2Code {

    BLTH("BLTH"),
    ETHR("ETHR"),
    GPRS("GPRS"),
    GSMF("GSMF"),
    PSTN("PSTN"),
    @XmlEnumValue("RS23")
    RS_23("RS23"),
    USBD("USBD"),
    USBH("USBH"),
    WIFI("WIFI"),
    @XmlEnumValue("WT2G")
    WT_2_G("WT2G"),
    @XmlEnumValue("WT3G")
    WT_3_G("WT3G"),
    @XmlEnumValue("WT4G")
    WT_4_G("WT4G"),
    @XmlEnumValue("WT5G")
    WT_5_G("WT5G");
    private final String value;

    POICommunicationType2Code(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static POICommunicationType2Code fromValue(String v) {
        for (POICommunicationType2Code c: POICommunicationType2Code.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
