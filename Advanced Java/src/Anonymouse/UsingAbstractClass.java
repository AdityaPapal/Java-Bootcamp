package Anonymouse;

abstract  class ex{
    public abstract  void a();
}
public class UsingAbstractClass {
    public static void main(String[] args) {
        ex obj = new ex(){
            public void a(){
                System.out.println("Calling from new class");
            }
        };

        obj.a();
    }
}
