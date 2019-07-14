//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.11 at 09:52:14 PM CEST 
//


package com.jaxb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.jaxb package. 
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

    private final static QName _YPhase_QNAME = new QName("", "Y_phase");
    private final static QName _Value_QNAME = new QName("", "Value");
    private final static QName _YAmpl_QNAME = new QName("", "Y_ampl");
    private final static QName _Optional_QNAME = new QName("", "optional");
    private final static QName _YReal_QNAME = new QName("", "Y_real");
    private final static QName _YImag_QNAME = new QName("", "Y_imag");
    private final static QName _Mandatory_QNAME = new QName("", "mandatory");
    private final static QName _InternationalTypeJpJP_QNAME = new QName("", "jp_JP");
    private final static QName _InternationalTypeKrKO_QNAME = new QName("", "kr_KO");
    private final static QName _InternationalTypeZhCN_QNAME = new QName("", "zh_CN");
    private final static QName _NameTypeName_QNAME = new QName("", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.jaxb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link Results.Var }
     * 
     */
    public Results.Var createResultsVar() {
        return new Results.Var();
    }

    /**
     * Create an instance of {@link InternationalType }
     * 
     */
    public InternationalType createInternationalType() {
        return new InternationalType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Y_phase", substitutionHeadNamespace = "", substitutionHeadName = "optional")
    public JAXBElement<String> createYPhase(String value) {
        return new JAXBElement<String>(_YPhase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Value", substitutionHeadNamespace = "", substitutionHeadName = "mandatory")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Y_ampl", substitutionHeadNamespace = "", substitutionHeadName = "mandatory")
    public JAXBElement<String> createYAmpl(String value) {
        return new JAXBElement<String>(_YAmpl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "optional")
    public JAXBElement<Object> createOptional(Object value) {
        return new JAXBElement<Object>(_Optional_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Y_real", substitutionHeadNamespace = "", substitutionHeadName = "mandatory")
    public JAXBElement<String> createYReal(String value) {
        return new JAXBElement<String>(_YReal_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Y_imag", substitutionHeadNamespace = "", substitutionHeadName = "optional")
    public JAXBElement<String> createYImag(String value) {
        return new JAXBElement<String>(_YImag_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "mandatory")
    public JAXBElement<Object> createMandatory(Object value) {
        return new JAXBElement<Object>(_Mandatory_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "jp_JP", scope = InternationalType.class)
    public JAXBElement<String> createInternationalTypeJpJP(String value) {
        return new JAXBElement<String>(_InternationalTypeJpJP_QNAME, String.class, InternationalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "kr_KO", scope = InternationalType.class)
    public JAXBElement<String> createInternationalTypeKrKO(String value) {
        return new JAXBElement<String>(_InternationalTypeKrKO_QNAME, String.class, InternationalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "zh_CN", scope = InternationalType.class)
    public JAXBElement<String> createInternationalTypeZhCN(String value) {
        return new JAXBElement<String>(_InternationalTypeZhCN_QNAME, String.class, InternationalType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name", scope = NameType.class)
    public JAXBElement<NameType> createNameTypeName(NameType value) {
        return new JAXBElement<NameType>(_NameTypeName_QNAME, NameType.class, NameType.class, value);
    }

}