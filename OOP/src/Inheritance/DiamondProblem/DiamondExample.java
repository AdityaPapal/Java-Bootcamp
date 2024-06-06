package Inheritance.DiamondProblem;

interface A{
    default void display() {
        System.out.println("Display from A");
    }
}

interface  B extends  A{
    default void display() {
        System.out.println("Display from B");
    }
}

interface C extends A {
    default void display() {
        System.out.println("Display from C");
    }
}

class D implements B, C {
    public void display() {
        System.out.print("From class D Print: ");
        B.super.display();
        System.out.println();

        System.out.print("From class D Print: ");
        C.super.display();
        System.out.println();
        // Explicitly choose which interface's method to call
    }
}

public class DiamondExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.display();
    }
}
