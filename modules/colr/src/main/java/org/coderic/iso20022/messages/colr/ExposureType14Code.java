//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:12 PM COT 
//


package org.coderic.iso20022.messages.colr;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExposureType14Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ExposureType14Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BFWD"/&gt;
 *     &lt;enumeration value="PAYM"/&gt;
 *     &lt;enumeration value="CBCO"/&gt;
 *     &lt;enumeration value="COMM"/&gt;
 *     &lt;enumeration value="CRDS"/&gt;
 *     &lt;enumeration value="CRTL"/&gt;
 *     &lt;enumeration value="CRSP"/&gt;
 *     &lt;enumeration value="CCIR"/&gt;
 *     &lt;enumeration value="CRPR"/&gt;
 *     &lt;enumeration value="EQPT"/&gt;
 *     &lt;enumeration value="EQUS"/&gt;
 *     &lt;enumeration value="EXTD"/&gt;
 *     &lt;enumeration value="EXPT"/&gt;
 *     &lt;enumeration value="FIXI"/&gt;
 *     &lt;enumeration value="FORX"/&gt;
 *     &lt;enumeration value="FORW"/&gt;
 *     &lt;enumeration value="FUTR"/&gt;
 *     &lt;enumeration value="OPTN"/&gt;
 *     &lt;enumeration value="LIQU"/&gt;
 *     &lt;enumeration value="OTCD"/&gt;
 *     &lt;enumeration value="RVPO"/&gt;
 *     &lt;enumeration value="SLOA"/&gt;
 *     &lt;enumeration value="SBSC"/&gt;
 *     &lt;enumeration value="SCRP"/&gt;
 *     &lt;enumeration value="SLEB"/&gt;
 *     &lt;enumeration value="SCIR"/&gt;
 *     &lt;enumeration value="SCIE"/&gt;
 *     &lt;enumeration value="SWPT"/&gt;
 *     &lt;enumeration value="TBAS"/&gt;
 *     &lt;enumeration value="TRCP"/&gt;
 *     &lt;enumeration value="UDMS"/&gt;
 *     &lt;enumeration value="CCPC"/&gt;
 *     &lt;enumeration value="EQUI"/&gt;
 *     &lt;enumeration value="TRBD"/&gt;
 *     &lt;enumeration value="REPO"/&gt;
 *     &lt;enumeration value="SHSL"/&gt;
 *     &lt;enumeration value="MGLD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExposureType14Code")
@XmlEnum
public enum ExposureType14Code {

    BFWD,
    PAYM,
    CBCO,
    COMM,
    CRDS,
    CRTL,
    CRSP,
    CCIR,
    CRPR,
    EQPT,
    EQUS,
    EXTD,
    EXPT,
    FIXI,
    FORX,
    FORW,
    FUTR,
    OPTN,
    LIQU,
    OTCD,
    RVPO,
    SLOA,
    SBSC,
    SCRP,
    SLEB,
    SCIR,
    SCIE,
    SWPT,
    TBAS,
    TRCP,
    UDMS,
    CCPC,
    EQUI,
    TRBD,
    REPO,
    SHSL,
    MGLD;

    public String value() {
        return name();
    }

    public static ExposureType14Code fromValue(String v) {
        return valueOf(v);
    }

}
