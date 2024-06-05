package Abstract;

public class Child2 extends  Parent{
        @Override
        void career(String name) {
            System.out.println("Calling from child 2 name is: "+ name);
        }

    @Override
    void partner(int num) {
        System.out.println("Calling from child 2 number is: " + num);
    }
}
