package InnerCalss;
class A{
    public void a(){
        System.out.println("Calling from a");
    }
    class B {
            public void b(){
                System.out.println("Calling from b");

            }
    }
}
public class main {
    public static void main(String[] args) {
            A obj1 = new A();
            A.B obj2 = obj1.new B();
            obj1.a();
            obj2.b();
    }
}
