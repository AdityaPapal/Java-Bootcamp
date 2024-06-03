package Static;

public class staticBlock {
    static  int a = 10;
    static  int b = 30;

    static {
        System.out.println("Calling from Static Block");
        b = 3553;
    }

    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(staticBlock.a + " "+ staticBlock.b);
        staticBlock.a *=100;
        System.out.println(staticBlock.a + " "+ staticBlock.b);

    }

}
