//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.15 a las 11:48:48 PM COT 
//


package org.coderic.iso20022.messages.semt;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.coderic.iso20022.messages.semt package. 
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

    private final static QName _Document_QNAME = new QName("urn:iso:std:iso:20022:tech:xsd:semt.042.001.01", "Document");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.coderic.iso20022.messages.semt
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
     * Create an instance of {@link DateAndDateTimeChoice }
     * 
     */
    public DateAndDateTimeChoice createDateAndDateTimeChoice() {
        return new DateAndDateTimeChoice();
    }

    /**
     * Create an instance of {@link GenericIdentification30 }
     * 
     */
    public GenericIdentification30 createGenericIdentification30() {
        return new GenericIdentification30();
    }

    /**
     * Create an instance of {@link GenericIdentification36 }
     * 
     */
    public GenericIdentification36 createGenericIdentification36() {
        return new GenericIdentification36();
    }

    /**
     * Create an instance of {@link IdentificationSource3Choice }
     * 
     */
    public IdentificationSource3Choice createIdentificationSource3Choice() {
        return new IdentificationSource3Choice();
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
     * Create an instance of {@link NumberOfItemsPerStatus1 }
     * 
     */
    public NumberOfItemsPerStatus1 createNumberOfItemsPerStatus1() {
        return new NumberOfItemsPerStatus1();
    }

    /**
     * Create an instance of {@link OtherIdentification1 }
     * 
     */
    public OtherIdentification1 createOtherIdentification1() {
        return new OtherIdentification1();
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link PartyIdentification100 }
     * 
     */
    public PartyIdentification100 createPartyIdentification100() {
        return new PartyIdentification100();
    }

    /**
     * Create an instance of {@link PartyIdentification71Choice }
     * 
     */
    public PartyIdentification71Choice createPartyIdentification71Choice() {
        return new PartyIdentification71Choice();
    }

    /**
     * Create an instance of {@link PostalAddress1 }
     * 
     */
    public PostalAddress1 createPostalAddress1() {
        return new PostalAddress1();
    }

    /**
     * Create an instance of {@link ReportItem1 }
     * 
     */
    public ReportItem1 createReportItem1() {
        return new ReportItem1();
    }

    /**
     * Create an instance of {@link ReportItemRejectionReason1Choice }
     * 
     */
    public ReportItemRejectionReason1Choice createReportItemRejectionReason1Choice() {
        return new ReportItemRejectionReason1Choice();
    }

    /**
     * Create an instance of {@link ReportItemStatus1 }
     * 
     */
    public ReportItemStatus1 createReportItemStatus1() {
        return new ReportItemStatus1();
    }

    /**
     * Create an instance of {@link ReportItemStatus1Choice }
     * 
     */
    public ReportItemStatus1Choice createReportItemStatus1Choice() {
        return new ReportItemStatus1Choice();
    }

    /**
     * Create an instance of {@link SecuritiesAccount19 }
     * 
     */
    public SecuritiesAccount19 createSecuritiesAccount19() {
        return new SecuritiesAccount19();
    }

    /**
     * Create an instance of {@link SecuritiesBalanceTransparencyReportStatusAdviceV01 }
     * 
     */
    public SecuritiesBalanceTransparencyReportStatusAdviceV01 createSecuritiesBalanceTransparencyReportStatusAdviceV01() {
        return new SecuritiesBalanceTransparencyReportStatusAdviceV01();
    }

    /**
     * Create an instance of {@link SecurityIdentification19 }
     * 
     */
    public SecurityIdentification19 createSecurityIdentification19() {
        return new SecurityIdentification19();
    }

    /**
     * Create an instance of {@link StatementReference1 }
     * 
     */
    public StatementReference1 createStatementReference1() {
        return new StatementReference1();
    }

    /**
     * Create an instance of {@link SupplementaryData1 }
     * 
     */
    public SupplementaryData1 createSupplementaryData1() {
        return new SupplementaryData1();
    }

    /**
     * Create an instance of {@link SupplementaryDataEnvelope1 }
     * 
     */
    public SupplementaryDataEnvelope1 createSupplementaryDataEnvelope1() {
        return new SupplementaryDataEnvelope1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "urn:iso:std:iso:20022:tech:xsd:semt.042.001.01", name = "Document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

}
