//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:06 PM COT 
//


package org.coderic.iso20022.messages.catp;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultDetail4Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="ResultDetail4Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACTF"/&gt;
 *     &lt;enumeration value="ACQS"/&gt;
 *     &lt;enumeration value="AMLV"/&gt;
 *     &lt;enumeration value="AMTA"/&gt;
 *     &lt;enumeration value="AUTH"/&gt;
 *     &lt;enumeration value="BANK"/&gt;
 *     &lt;enumeration value="CRDR"/&gt;
 *     &lt;enumeration value="CRDF"/&gt;
 *     &lt;enumeration value="ACTC"/&gt;
 *     &lt;enumeration value="CTVG"/&gt;
 *     &lt;enumeration value="DBER"/&gt;
 *     &lt;enumeration value="FEES"/&gt;
 *     &lt;enumeration value="TXNL"/&gt;
 *     &lt;enumeration value="AMTD"/&gt;
 *     &lt;enumeration value="NMBD"/&gt;
 *     &lt;enumeration value="CRDX"/&gt;
 *     &lt;enumeration value="FDCL"/&gt;
 *     &lt;enumeration value="FMTR"/&gt;
 *     &lt;enumeration value="TXNG"/&gt;
 *     &lt;enumeration value="FNDI"/&gt;
 *     &lt;enumeration value="ACPI"/&gt;
 *     &lt;enumeration value="AMTI"/&gt;
 *     &lt;enumeration value="ADDI"/&gt;
 *     &lt;enumeration value="BRHI"/&gt;
 *     &lt;enumeration value="CHDI"/&gt;
 *     &lt;enumeration value="CRDI"/&gt;
 *     &lt;enumeration value="CTFV"/&gt;
 *     &lt;enumeration value="AMTO"/&gt;
 *     &lt;enumeration value="PINV"/&gt;
 *     &lt;enumeration value="TKKO"/&gt;
 *     &lt;enumeration value="SGNI"/&gt;
 *     &lt;enumeration value="TKID"/&gt;
 *     &lt;enumeration value="TXNV"/&gt;
 *     &lt;enumeration value="DATI"/&gt;
 *     &lt;enumeration value="ISSP"/&gt;
 *     &lt;enumeration value="ISSF"/&gt;
 *     &lt;enumeration value="ISSO"/&gt;
 *     &lt;enumeration value="ISST"/&gt;
 *     &lt;enumeration value="ISSU"/&gt;
 *     &lt;enumeration value="KEYS"/&gt;
 *     &lt;enumeration value="LBLA"/&gt;
 *     &lt;enumeration value="CRDL"/&gt;
 *     &lt;enumeration value="MACR"/&gt;
 *     &lt;enumeration value="MACK"/&gt;
 *     &lt;enumeration value="ICCM"/&gt;
 *     &lt;enumeration value="PINN"/&gt;
 *     &lt;enumeration value="CRDA"/&gt;
 *     &lt;enumeration value="LBLU"/&gt;
 *     &lt;enumeration value="PINA"/&gt;
 *     &lt;enumeration value="NPRA"/&gt;
 *     &lt;enumeration value="OFFL"/&gt;
 *     &lt;enumeration value="ONLP"/&gt;
 *     &lt;enumeration value="NPRC"/&gt;
 *     &lt;enumeration value="TXNM"/&gt;
 *     &lt;enumeration value="OTHR"/&gt;
 *     &lt;enumeration value="BALO"/&gt;
 *     &lt;enumeration value="SEQO"/&gt;
 *     &lt;enumeration value="PINC"/&gt;
 *     &lt;enumeration value="PIND"/&gt;
 *     &lt;enumeration value="PINS"/&gt;
 *     &lt;enumeration value="PINX"/&gt;
 *     &lt;enumeration value="PINE"/&gt;
 *     &lt;enumeration value="QMAX"/&gt;
 *     &lt;enumeration value="RECD"/&gt;
 *     &lt;enumeration value="CRDT"/&gt;
 *     &lt;enumeration value="SECV"/&gt;
 *     &lt;enumeration value="SRVU"/&gt;
 *     &lt;enumeration value="SFWE"/&gt;
 *     &lt;enumeration value="SPCC"/&gt;
 *     &lt;enumeration value="CRDS"/&gt;
 *     &lt;enumeration value="SRCH"/&gt;
 *     &lt;enumeration value="CNTC"/&gt;
 *     &lt;enumeration value="FRDS"/&gt;
 *     &lt;enumeration value="SYSP"/&gt;
 *     &lt;enumeration value="SYSM"/&gt;
 *     &lt;enumeration value="TRMI"/&gt;
 *     &lt;enumeration value="ACTT"/&gt;
 *     &lt;enumeration value="TTLV"/&gt;
 *     &lt;enumeration value="TXNU"/&gt;
 *     &lt;enumeration value="TXND"/&gt;
 *     &lt;enumeration value="ORGF"/&gt;
 *     &lt;enumeration value="UNBO"/&gt;
 *     &lt;enumeration value="UNBP"/&gt;
 *     &lt;enumeration value="UNBC"/&gt;
 *     &lt;enumeration value="CMKY"/&gt;
 *     &lt;enumeration value="CRDU"/&gt;
 *     &lt;enumeration value="SVSU"/&gt;
 *     &lt;enumeration value="VNDR"/&gt;
 *     &lt;enumeration value="VNDF"/&gt;
 *     &lt;enumeration value="AMTW"/&gt;
 *     &lt;enumeration value="NMBW"/&gt;
 *     &lt;enumeration value="CRDW"/&gt;
 *     &lt;enumeration value="MEDI"/&gt;
 *     &lt;enumeration value="SRVI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ResultDetail4Code")
@XmlEnum
public enum ResultDetail4Code {

    ACTF,
    ACQS,
    AMLV,
    AMTA,
    AUTH,
    BANK,
    CRDR,
    CRDF,
    ACTC,
    CTVG,
    DBER,
    FEES,
    TXNL,
    AMTD,
    NMBD,
    CRDX,
    FDCL,
    FMTR,
    TXNG,
    FNDI,
    ACPI,
    AMTI,
    ADDI,
    BRHI,
    CHDI,
    CRDI,
    CTFV,
    AMTO,
    PINV,
    TKKO,
    SGNI,
    TKID,
    TXNV,
    DATI,
    ISSP,
    ISSF,
    ISSO,
    ISST,
    ISSU,
    KEYS,
    LBLA,
    CRDL,
    MACR,
    MACK,
    ICCM,
    PINN,
    CRDA,
    LBLU,
    PINA,
    NPRA,
    OFFL,
    ONLP,
    NPRC,
    TXNM,
    OTHR,
    BALO,
    SEQO,
    PINC,
    PIND,
    PINS,
    PINX,
    PINE,
    QMAX,
    RECD,
    CRDT,
    SECV,
    SRVU,
    SFWE,
    SPCC,
    CRDS,
    SRCH,
    CNTC,
    FRDS,
    SYSP,
    SYSM,
    TRMI,
    ACTT,
    TTLV,
    TXNU,
    TXND,
    ORGF,
    UNBO,
    UNBP,
    UNBC,
    CMKY,
    CRDU,
    SVSU,
    VNDR,
    VNDF,
    AMTW,
    NMBW,
    CRDW,
    MEDI,
    SRVI;

    public String value() {
        return name();
    }

    public static ResultDetail4Code fromValue(String v) {
        return valueOf(v);
    }

}
