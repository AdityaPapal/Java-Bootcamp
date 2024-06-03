package Polymorphism;

public class main {
    public static void main(String[] args) {
        shape sh = new shape();
        circle c = new circle();
        square sq = new square();

        sh.area();
        c.area();
        sq.area();
    }
}
