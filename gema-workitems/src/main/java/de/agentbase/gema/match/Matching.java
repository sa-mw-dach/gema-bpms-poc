package de.agentbase.gema.match;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18.redhat-1
 * 2016-08-04T20:32:17.789+02:00
 * Generated source version: 2.7.18.redhat-1
 * 
 */
@WebService(targetNamespace = "http://it4ipm.de/", name = "Matching")
@XmlSeeAlso({ObjectFactory.class})
public interface Matching {

    @WebMethod
    @Action(input = "http://it4ipm.de/Matching/getMatchingsRequest", output = "http://it4ipm.de/Matching/getMatchingsResponse")
    @RequestWrapper(localName = "getMatchings", targetNamespace = "http://it4ipm.de/", className = "de.agentbase.gema.match.GetMatchings")
    @ResponseWrapper(localName = "getMatchingsResponse", targetNamespace = "http://it4ipm.de/", className = "de.agentbase.gema.match.GetMatchingsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<de.agentbase.gema.match.Match> getMatchings(
        @WebParam(name = "Titel", targetNamespace = "")
        java.lang.String titel,
        @WebParam(name = "Autor", targetNamespace = "")
        java.lang.String autor,
        @WebParam(name = "Datum", targetNamespace = "")
        java.lang.String datum,
        @WebParam(name = "Dauer", targetNamespace = "")
        java.lang.String dauer
    );
}
