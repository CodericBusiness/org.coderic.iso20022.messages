//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para HoldingRejectionReason41Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="HoldingRejectionReason41Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INPR"/&gt;
 *     &lt;enumeration value="INID"/&gt;
 *     &lt;enumeration value="AGIN"/&gt;
 *     &lt;enumeration value="INTE"/&gt;
 *     &lt;enumeration value="CERT"/&gt;
 *     &lt;enumeration value="BPAR"/&gt;
 *     &lt;enumeration value="BREF"/&gt;
 *     &lt;enumeration value="DADR"/&gt;
 *     &lt;enumeration value="DCUS"/&gt;
 *     &lt;enumeration value="IACT"/&gt;
 *     &lt;enumeration value="INVA"/&gt;
 *     &lt;enumeration value="INDT"/&gt;
 *     &lt;enumeration value="OPTI"/&gt;
 *     &lt;enumeration value="OPTY"/&gt;
 *     &lt;enumeration value="INMO"/&gt;
 *     &lt;enumeration value="INVM"/&gt;
 *     &lt;enumeration value="INUS"/&gt;
 *     &lt;enumeration value="DSEC"/&gt;
 *     &lt;enumeration value="ENDP"/&gt;
 *     &lt;enumeration value="STAR"/&gt;
 *     &lt;enumeration value="SECO"/&gt;
 *     &lt;enumeration value="NOHO"/&gt;
 *     &lt;enumeration value="NINS"/&gt;
 *     &lt;enumeration value="NOAP"/&gt;
 *     &lt;enumeration value="NAUT"/&gt;
 *     &lt;enumeration value="AGID"/&gt;
 *     &lt;enumeration value="DISP"/&gt;
 *     &lt;enumeration value="CORR"/&gt;
 *     &lt;enumeration value="INPS"/&gt;
 *     &lt;enumeration value="PLCE"/&gt;
 *     &lt;enumeration value="PRIC"/&gt;
 *     &lt;enumeration value="IVAG"/&gt;
 *     &lt;enumeration value="QUNP"/&gt;
 *     &lt;enumeration value="DQUA"/&gt;
 *     &lt;enumeration value="EQTY"/&gt;
 *     &lt;enumeration value="DEPT"/&gt;
 *     &lt;enumeration value="RCUS"/&gt;
 *     &lt;enumeration value="SAFE"/&gt;
 *     &lt;enumeration value="DMON"/&gt;
 *     &lt;enumeration value="NCRR"/&gt;
 *     &lt;enumeration value="TQNP"/&gt;
 *     &lt;enumeration value="SETR"/&gt;
 *     &lt;enumeration value="UKWN"/&gt;
 *     &lt;enumeration value="DDEA"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *     &lt;enumeration value="ULNK"/&gt;
 *     &lt;enumeration value="NARR"/&gt;
 *     &lt;enumeration value="NRGN"/&gt;
 *     &lt;enumeration value="INVB"/&gt;
 *     &lt;enumeration value="ADEA"/&gt;
 *     &lt;enumeration value="CASH"/&gt;
 *     &lt;enumeration value="COMC"/&gt;
 *     &lt;enumeration value="CONL"/&gt;
 *     &lt;enumeration value="INHO"/&gt;
 *     &lt;enumeration value="ICOL"/&gt;
 *     &lt;enumeration value="INVE"/&gt;
 *     &lt;enumeration value="INVN"/&gt;
 *     &lt;enumeration value="INVL"/&gt;
 *     &lt;enumeration value="VALR"/&gt;
 *     &lt;enumeration value="INUK"/&gt;
 *     &lt;enumeration value="LATT"/&gt;
 *     &lt;enumeration value="MINO"/&gt;
 *     &lt;enumeration value="BOIS"/&gt;
 *     &lt;enumeration value="MCER"/&gt;
 *     &lt;enumeration value="IPOA"/&gt;
 *     &lt;enumeration value="MUNO"/&gt;
 *     &lt;enumeration value="INNA"/&gt;
 *     &lt;enumeration value="NINV"/&gt;
 *     &lt;enumeration value="ELIG"/&gt;
 *     &lt;enumeration value="PERI"/&gt;
 *     &lt;enumeration value="REFE"/&gt;
 *     &lt;enumeration value="SAID"/&gt;
 *     &lt;enumeration value="OWNT"/&gt;
 *     &lt;enumeration value="NTAV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "HoldingRejectionReason41Code")
@XmlEnum
public enum HoldingRejectionReason41Code {

    INPR,
    INID,
    AGIN,
    INTE,
    CERT,
    BPAR,
    BREF,
    DADR,
    DCUS,
    IACT,
    INVA,
    INDT,
    OPTI,
    OPTY,
    INMO,
    INVM,
    INUS,
    DSEC,
    ENDP,
    STAR,
    SECO,
    NOHO,
    NINS,
    NOAP,
    NAUT,
    AGID,
    DISP,
    CORR,
    INPS,
    PLCE,
    PRIC,
    IVAG,
    QUNP,
    DQUA,
    EQTY,
    DEPT,
    RCUS,
    SAFE,
    DMON,
    NCRR,
    TQNP,
    SETR,
    UKWN,
    DDEA,
    TERM,
    ULNK,
    NARR,
    NRGN,
    INVB,
    ADEA,
    CASH,
    COMC,
    CONL,
    INHO,
    ICOL,
    INVE,
    INVN,
    INVL,
    VALR,
    INUK,
    LATT,
    MINO,
    BOIS,
    MCER,
    IPOA,
    MUNO,
    INNA,
    NINV,
    ELIG,
    PERI,
    REFE,
    SAID,
    OWNT,
    NTAV;

    public String value() {
        return name();
    }

    public static HoldingRejectionReason41Code fromValue(String v) {
        return valueOf(v);
    }

}
