package Abstract;

public class Main {
    public static void main(String[] args) {
        Child ch1 = new Child();
        Child2 ch = new Child2();

        ch1.career("aditya");
        ch1.partner(20);

        ch.career("xyz");
        ch.partner(20);

    }
}
