//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:47:20 PM COT 
//


package org.coderic.iso20022.messages.cafm;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Document complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileActnRspn" type="{urn:iso:std:iso:20022:tech:xsd:cafm.002.001.02}FileActionResponseV02"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "fileActnRspn"
})
public class Document {

    @XmlElement(name = "FileActnRspn", required = true)
    protected FileActionResponseV02 fileActnRspn;

    /**
     * Obtiene el valor de la propiedad fileActnRspn.
     * 
     * @return
     *     possible object is
     *     {@link FileActionResponseV02 }
     *     
     */
    public FileActionResponseV02 getFileActnRspn() {
        return fileActnRspn;
    }

    /**
     * Define el valor de la propiedad fileActnRspn.
     * 
     * @param value
     *     allowed object is
     *     {@link FileActionResponseV02 }
     *     
     */
    public void setFileActnRspn(FileActionResponseV02 value) {
        this.fileActnRspn = value;
    }

}
