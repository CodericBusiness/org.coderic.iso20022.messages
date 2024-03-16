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
 * <p>Clase Java para CollateralTransactionType1Code.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CollateralTransactionType1Code"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AADJ"/&gt;
 *     &lt;enumeration value="CDTA"/&gt;
 *     &lt;enumeration value="CADJ"/&gt;
 *     &lt;enumeration value="DADJ"/&gt;
 *     &lt;enumeration value="DBVT"/&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="MADJ"/&gt;
 *     &lt;enumeration value="PADJ"/&gt;
 *     &lt;enumeration value="RATA"/&gt;
 *     &lt;enumeration value="TERM"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollateralTransactionType1Code")
@XmlEnum
public enum CollateralTransactionType1Code {

    AADJ,
    CDTA,
    CADJ,
    DADJ,
    DBVT,
    INIT,
    MADJ,
    PADJ,
    RATA,
    TERM;

    public String value() {
        return name();
    }

    public static CollateralTransactionType1Code fromValue(String v) {
        return valueOf(v);
    }

}
