public class blocks {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(a);
        System.out.println(b);
        
        {
            a = 10;
            b = 20;
            System.out.println(a);
            System.out.println(b);
        }

        System.out.println(a);
        System.out.println(b);
    }    
}
