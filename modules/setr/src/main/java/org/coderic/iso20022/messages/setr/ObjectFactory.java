//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:54 PM COT 
//


package org.coderic.iso20022.messages.setr;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.coderic.iso20022.messages.setr package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:setr.058.001.02", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.coderic.iso20022.messages.setr
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link AdditionalReference8 }
     * 
     */
    public AdditionalReference8 createAdditionalReference8() {
        return new AdditionalReference8();
    }

    /**
     * Create an instance of {@link AlternateSecurityIdentification7 }
     * 
     */
    public AlternateSecurityIdentification7 createAlternateSecurityIdentification7() {
        return new AlternateSecurityIdentification7();
    }

    /**
     * Create an instance of {@link DateFormat42Choice }
     * 
     */
    public DateFormat42Choice createDateFormat42Choice() {
        return new DateFormat42Choice();
    }

    /**
     * Create an instance of {@link Extension1 }
     * 
     */
    public Extension1 createExtension1() {
        return new Extension1();
    }

    /**
     * Create an instance of {@link FinancialInstrument57 }
     * 
     */
    public FinancialInstrument57 createFinancialInstrument57() {
        return new FinancialInstrument57();
    }

    /**
     * Create an instance of {@link GenericIdentification1 }
     * 
     */
    public GenericIdentification1 createGenericIdentification1() {
        return new GenericIdentification1();
    }

    /**
     * Create an instance of {@link IdentificationSource1Choice }
     * 
     */
    public IdentificationSource1Choice createIdentificationSource1Choice() {
        return new IdentificationSource1Choice();
    }

    /**
     * Create an instance of {@link InvestmentAccount58 }
     * 
     */
    public InvestmentAccount58 createInvestmentAccount58() {
        return new InvestmentAccount58();
    }

    /**
     * Create an instance of {@link InvestmentFundOrder8 }
     * 
     */
    public InvestmentFundOrder8 createInvestmentFundOrder8() {
        return new InvestmentFundOrder8();
    }

    /**
     * Create an instance of {@link MessageAndBusinessReference10 }
     * 
     */
    public MessageAndBusinessReference10 createMessageAndBusinessReference10() {
        return new MessageAndBusinessReference10();
    }

    /**
     * Create an instance of {@link MessageIdentification1 }
     * 
     */
    public MessageIdentification1 createMessageIdentification1() {
        return new MessageIdentification1();
    }

    /**
     * Create an instance of {@link NameAndAddress5 }
     * 
     */
    public NameAndAddress5 createNameAndAddress5() {
        return new NameAndAddress5();
    }

    /**
     * Create an instance of {@link PartyIdentification113 }
     * 
     */
    public PartyIdentification113 createPartyIdentification113() {
        return new PartyIdentification113();
    }

    /**
     * Create an instance of {@link PartyIdentification90Choice }
     * 
     */
    public PartyIdentification90Choice createPartyIdentification90Choice() {
        return new PartyIdentification90Choice();
    }

    /**
     * Create an instance of {@link PostalAddress1 }
     * 
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link References62Choice }
     * 
     */
    public References62Choice createReferences62Choice() {
        return new References62Choice();
    }

    /**
     * Create an instance of {@link RequestForOrderConfirmationStatusReportV02 }
     * 
     */
    public RequestForOrderConfirmationStatusReportV02 createRequestForOrderConfirmationStatusReportV02() {
        return new RequestForOrderConfirmationStatusReportV02();
    }

    /**
     * Create an instance of {@link SecurityIdentification25Choice }
     * 
     */
    public SecurityIdentification25Choice createSecurityIdentification25Choice() {
        return new SecurityIdentification25Choice();
    }

    /**
     * Create an instance of {@link Series1 }
     * 
     */
    public Series1 createSeries1() {
        return new Series1();
    }

    /**
     * Create an instance of {@link SubAccount6 }
     * 
     */
    public SubAccount6 createSubAccount6() {
        return new SubAccount6();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:setr.058.001.02", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
