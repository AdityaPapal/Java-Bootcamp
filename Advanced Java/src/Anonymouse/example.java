package Anonymouse;

class A{
    public void a(){
        System.out.println("Calling from A");
    }
}
public class example {
    public static void main(String[] args) {
            A obj = new A(){
                public void a(){
                    System.out.println("Calling from new class");
                }
            };

            obj.a();
    }
}
