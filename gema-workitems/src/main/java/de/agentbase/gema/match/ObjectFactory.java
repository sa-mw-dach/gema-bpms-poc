
package de.agentbase.gema.match;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.agentbase.gema.match package. 
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

    private final static QName _GetMatchingsResponse_QNAME = new QName("http://it4ipm.de/", "getMatchingsResponse");
    private final static QName _GetMatchings_QNAME = new QName("http://it4ipm.de/", "getMatchings");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.agentbase.gema.match
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMatchings }
     * 
     */
    public GetMatchings createGetMatchings() {
        return new GetMatchings();
    }

    /**
     * Create an instance of {@link GetMatchingsResponse }
     * 
     */
    public GetMatchingsResponse createGetMatchingsResponse() {
        return new GetMatchingsResponse();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatchingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it4ipm.de/", name = "getMatchingsResponse")
    public JAXBElement<GetMatchingsResponse> createGetMatchingsResponse(GetMatchingsResponse value) {
        return new JAXBElement<GetMatchingsResponse>(_GetMatchingsResponse_QNAME, GetMatchingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatchings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://it4ipm.de/", name = "getMatchings")
    public JAXBElement<GetMatchings> createGetMatchings(GetMatchings value) {
        return new JAXBElement<GetMatchings>(_GetMatchings_QNAME, GetMatchings.class, null, value);
    }

}
