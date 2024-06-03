package Inheritance;

public class boxPrice extends boxWeight {
        double price;

        boxPrice(){
           super();
           this.price = 0;
        }

         public boxPrice(double l, double h, double w, double weight, double price) {
            super(l, h, w, weight);
            this.price = price;
        }
}
