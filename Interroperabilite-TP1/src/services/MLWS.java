
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import net.java.dev.jaxb.array.DoubleArray;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MLWS", targetNamespace = "http://services/")
@XmlSeeAlso({
    net.java.dev.jaxb.array.ObjectFactory.class,
    services.ObjectFactory.class
})
public interface MLWS {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<net.java.dev.jaxb.array.DoubleArray>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "kmeans", targetNamespace = "http://services/", className = "services.Kmeans")
    @ResponseWrapper(localName = "kmeansResponse", targetNamespace = "http://services/", className = "services.KmeansResponse")
    @Action(input = "http://services/MLWS/kmeansRequest", output = "http://services/MLWS/kmeansResponse")
    public List<DoubleArray> kmeans(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @return
     *     returns java.util.List<services.CompteDataScience>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptes", targetNamespace = "http://services/", className = "services.GetComptes")
    @ResponseWrapper(localName = "getComptesResponse", targetNamespace = "http://services/", className = "services.GetComptesResponse")
    @Action(input = "http://services/MLWS/getComptesRequest", output = "http://services/MLWS/getComptesResponse")
    public List<CompteDataScience> getComptes();

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMoy", targetNamespace = "http://services/", className = "services.GetMoy")
    @ResponseWrapper(localName = "getMoyResponse", targetNamespace = "http://services/", className = "services.GetMoyResponse")
    @Action(input = "http://services/MLWS/getMoyRequest", output = "http://services/MLWS/getMoyResponse")
    public double getMoy(
        @WebParam(name = "arg0", targetNamespace = "")
        List<Double> arg0);

}