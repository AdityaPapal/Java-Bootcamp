package Abstract;

public class Child extends  Parent{

    @Override
    void career(String name) {
        System.out.println("I'm "+name+" calling from child career");
    }

    @Override
    void partner( int num) {
        System.out.println("Im calling from child partner with number: "+num);
    }
}
