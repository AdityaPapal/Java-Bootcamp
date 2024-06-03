package Inheritance;

public class boxWeight extends box{
        double weight;

        boxWeight(){
            this.weight =-1;
        }

    public boxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
