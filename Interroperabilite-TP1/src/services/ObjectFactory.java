
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
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

    private final static QName _GetMoyResponse_QNAME = new QName("http://services/", "getMoyResponse");
    private final static QName _GetComptes_QNAME = new QName("http://services/", "getComptes");
    private final static QName _GetMoy_QNAME = new QName("http://services/", "getMoy");
    private final static QName _Compte_QNAME = new QName("http://services/", "compte");
    private final static QName _GetComptesResponse_QNAME = new QName("http://services/", "getComptesResponse");
    private final static QName _KmeansResponse_QNAME = new QName("http://services/", "kmeansResponse");
    private final static QName _Kmeans_QNAME = new QName("http://services/", "kmeans");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Kmeans }
     * 
     */
    public Kmeans createKmeans() {
        return new Kmeans();
    }

    /**
     * Create an instance of {@link GetComptes }
     * 
     */
    public GetComptes createGetComptes() {
        return new GetComptes();
    }

    /**
     * Create an instance of {@link GetMoy }
     * 
     */
    public GetMoy createGetMoy() {
        return new GetMoy();
    }

    /**
     * Create an instance of {@link GetMoyResponse }
     * 
     */
    public GetMoyResponse createGetMoyResponse() {
        return new GetMoyResponse();
    }

    /**
     * Create an instance of {@link GetComptesResponse }
     * 
     */
    public GetComptesResponse createGetComptesResponse() {
        return new GetComptesResponse();
    }

    /**
     * Create an instance of {@link KmeansResponse }
     * 
     */
    public KmeansResponse createKmeansResponse() {
        return new KmeansResponse();
    }

    /**
     * Create an instance of {@link CompteDataScience }
     * 
     */
    public CompteDataScience createCompteDataScience() {
        return new CompteDataScience();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getMoyResponse")
    public JAXBElement<GetMoyResponse> createGetMoyResponse(GetMoyResponse value) {
        return new JAXBElement<GetMoyResponse>(_GetMoyResponse_QNAME, GetMoyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getComptes")
    public JAXBElement<GetComptes> createGetComptes(GetComptes value) {
        return new JAXBElement<GetComptes>(_GetComptes_QNAME, GetComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getMoy")
    public JAXBElement<GetMoy> createGetMoy(GetMoy value) {
        return new JAXBElement<GetMoy>(_GetMoy_QNAME, GetMoy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteDataScience }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "compte")
    public JAXBElement<CompteDataScience> createCompte(CompteDataScience value) {
        return new JAXBElement<CompteDataScience>(_Compte_QNAME, CompteDataScience.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "getComptesResponse")
    public JAXBElement<GetComptesResponse> createGetComptesResponse(GetComptesResponse value) {
        return new JAXBElement<GetComptesResponse>(_GetComptesResponse_QNAME, GetComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KmeansResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "kmeansResponse")
    public JAXBElement<KmeansResponse> createKmeansResponse(KmeansResponse value) {
        return new JAXBElement<KmeansResponse>(_KmeansResponse_QNAME, KmeansResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Kmeans }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "kmeans")
    public JAXBElement<Kmeans> createKmeans(Kmeans value) {
        return new JAXBElement<Kmeans>(_Kmeans_QNAME, Kmeans.class, null, value);
    }

}
