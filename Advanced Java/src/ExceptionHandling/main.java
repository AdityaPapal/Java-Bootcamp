package ExceptionHandling;

public class main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int c = a/b;
//        System.out.println(c);
        // to solved this


        try{
            int c  = a/b;
            divided(a,b);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static  void divided(int a,int b) throws Exception {
        if(b==0){
            throw new ArithmeticException("Plz do not divided by zero !");
        }
        System.out.println("Division is :"+ a/b);
    }
}
