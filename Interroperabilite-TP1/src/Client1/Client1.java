package Client1;

import services.MLServiceService;
import services.MLWS;
import java.util.Arrays;
import java.util.List;

public class Client1 {
    public static void main(String[] args) {
        MLWS mlws = new MLServiceService().getMLWSPort();
        List<Double> list = Arrays.asList(1.5,2.6,3.3);
        double res = mlws.getMoy(list);
        System.out.println(res);
    }
}