public class BmiService {
    public double calculate(double height,double weight){
        double heightm = height/100;
        double height2 = heightm * heightm;
        double cost = weight/height2;
        return cost;

    }

}


