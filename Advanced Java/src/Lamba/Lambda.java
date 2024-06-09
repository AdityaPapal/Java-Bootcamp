package Lamba;

interface a{
    public void show();
}

public class Lambda {
    public static void main(String[] args) {
        a obj = () -> System.out.println("hello....");
        obj.show();
    }
}
