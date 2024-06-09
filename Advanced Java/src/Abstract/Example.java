package Abstract;

abstract class Car{
    public abstract void drive();

    public void display(){
        System.out.println("Temp");
    }
}
class astonmartine extends Car{
        public void drive(){
            System.out.println("Driving...........");
        }
}


public class Example {

    public static void main(String[] args) {
            astonmartine dbs = new astonmartine();
            dbs.drive();
    }
}
