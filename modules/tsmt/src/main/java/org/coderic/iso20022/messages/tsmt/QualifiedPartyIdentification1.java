//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:49:02 PM COT 
//


package org.coderic.iso20022.messages.tsmt;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para QualifiedPartyIdentification1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="QualifiedPartyIdentification1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}SingleQualifiedPartyIdentification1" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShrtId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}PartyIdentification2Choice" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}GenericIdentification1" minOccurs="0"/&gt;
 *         &lt;element name="RoleDesc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max256Text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedPartyIdentification1", propOrder = {
    "id",
    "pty",
    "shrtId",
    "role",
    "roleDesc"
})
public class QualifiedPartyIdentification1 {

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Pty", required = true)
    protected List<SingleQualifiedPartyIdentification1> pty;
    @XmlElement(name = "ShrtId")
    protected PartyIdentification2Choice shrtId;
    @XmlElement(name = "Role")
    protected GenericIdentification1 role;
    @XmlElement(name = "RoleDesc")
    protected String roleDesc;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the pty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SingleQualifiedPartyIdentification1 }
     * 
     * 
     */
    public List<SingleQualifiedPartyIdentification1> getPty() {
        if (pty == null) {
            pty = new ArrayList<SingleQualifiedPartyIdentification1>();
        }
        return this.pty;
    }

    /**
     * Obtiene el valor de la propiedad shrtId.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getShrtId() {
        return shrtId;
    }

    /**
     * Define el valor de la propiedad shrtId.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setShrtId(PartyIdentification2Choice value) {
        this.shrtId = value;
    }

    /**
     * Obtiene el valor de la propiedad role.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getRole() {
        return role;
    }

    /**
     * Define el valor de la propiedad role.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public void setRole(GenericIdentification1 value) {
        this.role = value;
    }

    /**
     * Obtiene el valor de la propiedad roleDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * Define el valor de la propiedad roleDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleDesc(String value) {
        this.roleDesc = value;
    }

}
