package services;

import Entity.CompteDataScience;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

import Methodes.Kmeans;

@WebService(name="MLWS")
public class MLService {

    @WebMethod(operationName="getComptes")
    public List<CompteDataScience> getComptes(){
        List<CompteDataScience> cptes = new ArrayList<>();
        cptes.add(new CompteDataScience(1, "Nils", "Boby"));
        cptes.add(new CompteDataScience(2, "Doe", "JoHn"));
        return cptes;
    }

    @WebMethod
    public double getMoy( double [] list) {
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum/list.length;
    }

    @WebMethod
    public List<double[]> kmeans(String filePath,int k){
        Kmeans kMeans = new Kmeans(k,  filePath);
        // Run k-means algorithm
        kMeans.run();
        // Print the resulting centroids
        return kMeans.getCentroids();
    }
}
